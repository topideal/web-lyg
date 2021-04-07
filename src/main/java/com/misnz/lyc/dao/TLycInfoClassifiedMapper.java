package com.misnz.lyc.dao;

import com.misnz.lyc.model.TLycInfoClassified;
import com.misnz.lyc.model.TLycInfoClassifiedExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLycInfoClassifiedMapper {
    int deleteByExample(TLycInfoClassifiedExample example);

    int deleteByPrimaryKey(@Param("infoId") String infoId, @Param("classifiedId") String classifiedId);

    int insert(TLycInfoClassified record);

    int insertSelective(TLycInfoClassified record);

    List<TLycInfoClassified> selectByExample(TLycInfoClassifiedExample example);

    int updateByExampleSelective(@Param("record") TLycInfoClassified record, @Param("example") TLycInfoClassifiedExample example);

    int updateByExample(@Param("record") TLycInfoClassified record, @Param("example") TLycInfoClassifiedExample example);
}