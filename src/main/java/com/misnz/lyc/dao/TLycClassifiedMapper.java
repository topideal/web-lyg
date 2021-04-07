package com.misnz.lyc.dao;

import com.misnz.lyc.model.TLycClassified;
import com.misnz.lyc.model.TLycClassifiedExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLycClassifiedMapper {
    int deleteByExample(TLycClassifiedExample example);

    int deleteByPrimaryKey(String classifiedId);

    int insert(TLycClassified record);

    int insertSelective(TLycClassified record);

    List<TLycClassified> selectByExample(TLycClassifiedExample example);

    TLycClassified selectByPrimaryKey(String classifiedId);

    int updateByExampleSelective(@Param("record") TLycClassified record, @Param("example") TLycClassifiedExample example);

    int updateByExample(@Param("record") TLycClassified record, @Param("example") TLycClassifiedExample example);

    int updateByPrimaryKeySelective(TLycClassified record);

    int updateByPrimaryKey(TLycClassified record);
}