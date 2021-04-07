package com.misnz.lyc.service;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.misnz.lyc.dao.RecruitCategoryEntityMapper;
import com.misnz.lyc.dao.RecruitCnEntityMapper;
import com.misnz.lyc.dao.RecruitEnEntityMapper;
import com.misnz.lyc.model.*;
import com.misnz.util.StringUtils;
import com.misnz.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 2015/3/1.
 */
@Service("recruitCategoryService")
public class RecruitCategoryService {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private RecruitCategoryEntityMapper recruitCategoryMapper;
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private RecruitCnEntityMapper recruitCnMapper;

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private RecruitEnEntityMapper recruitEnMapper;

    public PagesListVo getRecruitCategoryListByPaginator(Integer pageNumber, Integer pageSize) throws Exception {
        PageHelper.startPage(pageNumber, pageSize);
        RecruitCategoryEntityExample recruitCategoryEntityExample = new RecruitCategoryEntityExample();
        recruitCategoryEntityExample.setOrderByClause("title_en");
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(recruitCategoryMapper.selectByExample(recruitCategoryEntityExample)), pageNumber);

        return jsonObject;

    }



    public void addRecruitCategory(RecruitCategoryEntity recruitCategoryEntity) throws Exception {
        if (recruitCategoryEntity.getId() == null || "".equals(recruitCategoryEntity.getId())) {
            recruitCategoryEntity.setId(StringUtils.getUUID());
            recruitCategoryMapper.insertSelective(recruitCategoryEntity);
        } else {
            recruitCategoryMapper.updateByPrimaryKeySelective(recruitCategoryEntity);
        }


    }

    public void delRecruitCategory(String delStr) throws Exception {
        JSONArray jsonArray = JSONArray.parseArray(delStr);
        List<String> delIdList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            delIdList.add(jsonObj.getString("id"));
        }

        RecruitCnEntityExample recruitCnEntityExample = new RecruitCnEntityExample();
        recruitCnEntityExample.createCriteria().andCategoryIdIn(delIdList);
        recruitCnMapper.deleteByExample(recruitCnEntityExample);

        RecruitEnEntityExample recruitEnEntityExample = new RecruitEnEntityExample();
        recruitEnEntityExample.createCriteria().andCategoryIdIn(delIdList);
        recruitEnMapper.deleteByExample(recruitEnEntityExample);

        RecruitCategoryEntityExample recruitCategoryEntityExample = new RecruitCategoryEntityExample();
        recruitCategoryEntityExample.createCriteria().andIdIn(delIdList);
        recruitCategoryMapper.deleteByExample(recruitCategoryEntityExample);
    }



    public List getRecruitCategoryListForAll() throws Exception {

        RecruitCategoryEntityExample example = new RecruitCategoryEntityExample();
        example.createCriteria().andDelTagEqualTo(0);
        example.setOrderByClause("order_tag,title_en");
        return recruitCategoryMapper.selectByExample(example);


    }



}
