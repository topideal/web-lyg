package com.misnz.lyc.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.misnz.lyc.dao.RecruitEnEntityMapper;
import com.misnz.lyc.model.PagesListVo;
import com.misnz.lyc.model.RecruitEnEntity;
import com.misnz.lyc.model.RecruitEnEntityExample;
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
@Service("recruitEnService")
public class RecruitEnService {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private RecruitEnEntityMapper enMapper;


    public PagesListVo getRecruitListByPaginator(Integer pageNumber, Integer pageSize) throws Exception {
        RecruitEnEntityExample example = new RecruitEnEntityExample();
/*        example.createCriteria().andLongCureEqualTo(1);
        RecruitEnEntityExample example1 = new RecruitEnEntityExample();
        RecruitEnEntityExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andLongCureEqualTo(0).andStartDateGreaterThanOrEqualTo(DateUtils.getCurrentDate()).andEndDateLessThanOrEqualTo(DateUtils.getCurrentDate());
        example.or(criteria1);*/

        example.setOrderByClause("create_date desc");
        PageHelper.startPage(pageNumber, pageSize);
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(enMapper.selectByExampleWithBLOBs(example)), pageNumber);

        return jsonObject;

    }


    public void addRecruit(RecruitEnEntity recruitEnEntity) throws Exception {

        if (recruitEnEntity.getId() == null || "".equals(recruitEnEntity.getId())) {
            recruitEnEntity.setId(StringUtils.getUUID());
            recruitEnEntity.setCreateDate(DateUtils.getCurrentDate());
            enMapper.insertSelective(recruitEnEntity);
        } else {
            recruitEnEntity.setCreateDate(DateUtils.getCurrentDate());
            enMapper.updateByPrimaryKeySelective(recruitEnEntity);
        }


    }

    public void delRecruit(String delStr) throws Exception {
        JSONArray jsonArray = JSONArray.parseArray(delStr);
        List<String> delIdList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            delIdList.add(jsonObj.getString("id"));
        }

        RecruitEnEntityExample recruitEnEntityExample = new RecruitEnEntityExample();
        recruitEnEntityExample.createCriteria().andIdIn(delIdList);
        enMapper.deleteByExample(recruitEnEntityExample);


    }



    public PagesListVo getRecruitList(String searchType,String searchKey,Integer pageSize,Integer pageNumber) throws Exception {
        if (searchType != null && searchType.equals("")) {
            searchType = null;
        }
        if (searchKey != null && searchKey.equals("")) {
            searchKey = null;
        }
        RecruitEnEntityExample recruitEnEntityExample=new RecruitEnEntityExample();
        recruitEnEntityExample.setOrderByClause("create_date desc");
        PageHelper.startPage(pageNumber, pageSize);
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(enMapper.selectByExampleWithBLOBs(recruitEnEntityExample)), pageNumber);
        jsonObject.setCurrentPage(pageNumber);

        return jsonObject;

    }
    public PagesListVo getRecruitById(String id) throws Exception {

        RecruitEnEntityExample recruitEnEntityExample=new RecruitEnEntityExample();
        recruitEnEntityExample.createCriteria().andIdEqualTo(id);
        recruitEnEntityExample.setOrderByClause("create_date desc");
        PageHelper.startPage(0, 0);
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(enMapper.selectByExampleWithBLOBs(recruitEnEntityExample)), 0);
        jsonObject.setCurrentPage(1);

        return jsonObject;

    }
}
