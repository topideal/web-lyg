package com.misnz.lyc.dao;

import com.misnz.lyc.model.RecruitCategoryEntity;
import com.misnz.lyc.model.RecruitCategoryEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitCategoryEntityMapper {
    int deleteByExample(RecruitCategoryEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(RecruitCategoryEntity record);

    int insertSelective(RecruitCategoryEntity record);

    List<RecruitCategoryEntity> selectByExample(RecruitCategoryEntityExample example);

    RecruitCategoryEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RecruitCategoryEntity record, @Param("example") RecruitCategoryEntityExample example);

    int updateByExample(@Param("record") RecruitCategoryEntity record, @Param("example") RecruitCategoryEntityExample example);

    int updateByPrimaryKeySelective(RecruitCategoryEntity record);

    int updateByPrimaryKey(RecruitCategoryEntity record);
}