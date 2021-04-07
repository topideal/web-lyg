package com.misnz.lyc.service;


import com.misnz.framework.cache.Cache;
import com.misnz.lyc.dao.TConstantMapper;
import com.misnz.lyc.model.TConstant;
import com.misnz.util.DateUtils;
import com.misnz.util.Md5Util;
import com.misnz.util.VarUtil;
import com.qiniu.util.StringMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by david on 2015/3/1.
 */
@Service("commonService")
public class CommonService {



    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TConstantMapper constantMapper;



    public Long getServerTime() throws Exception {
        return DateUtils.getCurrentDataByShort();
    }

    public com.qiniu.util.Auth getAuth() throws Exception {
        return com.qiniu.util.Auth.create(Cache.get("accesskey").toString(), Cache.get("secretkey").toString());
    }

    public Object getUploadTokenByQN() throws Exception {
        if (Cache.get("qiniuUploadToken") == null) {
            com.qiniu.util.Auth auth = getAuth();
            Cache.add("qiniuUploadToken", auth.uploadToken(Cache.get("space_name").toString()), DateUtils.getMillisBySecond(55));
        }
        return Cache.get("qiniuUploadToken");
    }

    public Object getMp4UploadTokenByQN() throws Exception {
        if (Cache.get("qiniuMp4UploadToken") == null) {
            com.qiniu.util.Auth auth = getAuth();
            StringMap policy = new StringMap();
            policy.putNotEmpty("returnBody",
                    "{\"key\":\"$(key)\","
                            + "\"avinfo\":$(avinfo),"
                            + "\"fsize\":$(fsize),"
                            + "\"fname\":\"$(fname)\","
                            + "\"mimeType\":\"$(mimeType)\","
                            + "\"exif\":$(exif),"
                            + "\"imageInfo\":$(imageInfo)"
                            + "}");
            Cache.add("qiniuMp4UploadToken", auth.uploadToken(Cache.get("space_name").toString(),null,3600L,policy), DateUtils.getMillisBySecond(55));
        }
        return Cache.get("qiniuMp4UploadToken");

    }
    public String getSysConstant(Integer id) throws Exception {
        String code = "";
        if (id == 1) {
            code = "res_url";
        } else if (id == 2) {

        } else if (id == 3) {

        } else if (id == 4) {

        } else if (id == 5) {

        } else if (id == 6) {

        }
        TConstant constant = constantMapper.selectByPrimaryKey(code);
        if (constant != null) {
            return constant.getSysValue();
        }
        throw new Exception("无效代码.");

    }
    public String getEncryptUrl(Object id) throws Exception {
        if (id != null && !"".equals(id)) {
            return Md5Util.encrypt(id.toString(), VarUtil.ENCRYPT_URL_KEY);
        }
        return "";
    }
}