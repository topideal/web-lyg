package com.misnz.lyc.dao;

import com.misnz.lyc.model.RecruitEnEntity;
import com.misnz.lyc.model.RecruitEnEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitEnEntityMapper {
    int deleteByExample(RecruitEnEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(RecruitEnEntity record);

    int insertSelective(RecruitEnEntity record);

    List<RecruitEnEntity> selectByExampleWithBLOBs(RecruitEnEntityExample example);

    List<RecruitEnEntity> selectByExample(RecruitEnEntityExample example);

    RecruitEnEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RecruitEnEntity record, @Param("example") RecruitEnEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") RecruitEnEntity record, @Param("example") RecruitEnEntityExample example);

    int updateByExample(@Param("record") RecruitEnEntity record, @Param("example") RecruitEnEntityExample example);

    int updateByPrimaryKeySelective(RecruitEnEntity record);

    int updateByPrimaryKeyWithBLOBs(RecruitEnEntity record);

    int updateByPrimaryKey(RecruitEnEntity record);
}