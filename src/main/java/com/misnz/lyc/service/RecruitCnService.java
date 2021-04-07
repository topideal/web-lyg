package com.misnz.lyc.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.misnz.lyc.dao.RecruitCnEntityMapper;
import com.misnz.lyc.model.PagesListVo;
import com.misnz.lyc.model.RecruitCnEntity;
import com.misnz.lyc.model.RecruitCnEntityExample;
import com.misnz.util.DateUtils;
import com.misnz.util.StringUtils;
import com.misnz.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 2015/3/1.
 */
@Service("recruitCnService")
public class RecruitCnService {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private RecruitCnEntityMapper cnMapper;


    public PagesListVo getRecruitListByPaginator(Integer pageNumber, Integer pageSize) throws Exception {
        RecruitCnEntityExample example = new RecruitCnEntityExample();
/*        example.createCriteria().andLongCureEqualTo(1);
        RecruitCnEntityExample example1 = new RecruitCnEntityExample();
        RecruitCnEntityExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andLongCureEqualTo(0).andStartDateGreaterThanOrEqualTo(DateUtils.getCurrentDate()).andEndDateLessThanOrEqualTo(DateUtils.getCurrentDate());
        example.or(criteria1);*/

        example.setOrderByClause("create_date desc");
        PageHelper.startPage(pageNumber, pageSize);
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(cnMapper.selectByExampleWithBLOBs(example)), pageNumber);

        return jsonObject;

    }


    public void addRecruit(RecruitCnEntity recruitCnEntity) throws Exception {

        if (recruitCnEntity.getId() == null || "".equals(recruitCnEntity.getId())) {
            recruitCnEntity.setId(StringUtils.getUUID());
            recruitCnEntity.setCreateDate(DateUtils.getCurrentDate());
            cnMapper.insertSelective(recruitCnEntity);
        } else {
            recruitCnEntity.setCreateDate(DateUtils.getCurrentDate());
            cnMapper.updateByPrimaryKeySelective(recruitCnEntity);
        }


    }

    public void delRecruit(String delStr) throws Exception {
        JSONArray jsonArray = JSONArray.parseArray(delStr);
        List<String> delIdList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            delIdList.add(jsonObj.getString("id"));
        }

        RecruitCnEntityExample RecruitCnEntityExample = new RecruitCnEntityExample();
        RecruitCnEntityExample.createCriteria().andIdIn(delIdList);
        cnMapper.deleteByExample(RecruitCnEntityExample);


    }

}
