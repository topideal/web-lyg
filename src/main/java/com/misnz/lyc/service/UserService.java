package com.misnz.lyc.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.misnz.lyc.dao.TUserMapper;
import com.misnz.lyc.model.TUser;
import com.misnz.lyc.model.TUserExample;
import com.misnz.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TUserMapper userMapper;



    public TUser processUserLogin(String loginId, String pwd) throws Exception {
        TUserExample userExample=new TUserExample();
        userExample.createCriteria().andLoginIdEqualTo(loginId).andPwdEqualTo(Md5Util.toMD5(loginId + pwd));
        List<TUser> userList=userMapper.selectByExample(userExample);
        if(userList!=null && !userList.isEmpty()){
            return  userList.get(0);
        }
        return null;
    }


    public PageInfo<TUser> getUsersListByPaginator(Integer pageNumber, Integer pageSize) throws Exception {
        PageHelper.startPage(pageNumber, pageSize);
        TUserExample userExample = new TUserExample();
        userExample.setOrderByClause("login_id");
        return new PageInfo(userMapper.selectByExample(userExample));
    }

    public void delUsers(String userId) throws Exception {
        userMapper.deleteByPrimaryKey(userId);
    }


}
