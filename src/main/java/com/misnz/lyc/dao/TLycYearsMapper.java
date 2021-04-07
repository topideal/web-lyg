package com.misnz.lyc.dao;

import com.misnz.lyc.model.TLycYears;
import com.misnz.lyc.model.TLycYearsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLycYearsMapper {
    int deleteByExample(TLycYearsExample example);

    int deleteByPrimaryKey(String yearsCode);

    int insert(TLycYears record);

    int insertSelective(TLycYears record);

    List<TLycYears> selectByExample(TLycYearsExample example);

    TLycYears selectByPrimaryKey(String yearsCode);

    int updateByExampleSelective(@Param("record") TLycYears record, @Param("example") TLycYearsExample example);

    int updateByExample(@Param("record") TLycYears record, @Param("example") TLycYearsExample example);

    int updateByPrimaryKeySelective(TLycYears record);

    int updateByPrimaryKey(TLycYears record);
}