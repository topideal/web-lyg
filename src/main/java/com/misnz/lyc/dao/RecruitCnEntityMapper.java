package com.misnz.lyc.dao;

import com.misnz.lyc.model.RecruitCnEntity;
import com.misnz.lyc.model.RecruitCnEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecruitCnEntityMapper {
    int deleteByExample(RecruitCnEntityExample example);

    int deleteByPrimaryKey(String id);

    int insert(RecruitCnEntity record);

    int insertSelective(RecruitCnEntity record);

    List<RecruitCnEntity> selectByExampleWithBLOBs(RecruitCnEntityExample example);

    List<RecruitCnEntity> selectByExample(RecruitCnEntityExample example);

    RecruitCnEntity selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RecruitCnEntity record, @Param("example") RecruitCnEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") RecruitCnEntity record, @Param("example") RecruitCnEntityExample example);

    int updateByExample(@Param("record") RecruitCnEntity record, @Param("example") RecruitCnEntityExample example);

    int updateByPrimaryKeySelective(RecruitCnEntity record);

    int updateByPrimaryKeyWithBLOBs(RecruitCnEntity record);

    int updateByPrimaryKey(RecruitCnEntity record);
}