package com.misnz.lyc.dao;

import com.misnz.lyc.model.TConstant;
import com.misnz.lyc.model.TConstantExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TConstantMapper {
    int deleteByExample(TConstantExample example);

    int deleteByPrimaryKey(String code);

    int insert(TConstant record);

    int insertSelective(TConstant record);

    List<TConstant> selectByExample(TConstantExample example);

    TConstant selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") TConstant record, @Param("example") TConstantExample example);

    int updateByExample(@Param("record") TConstant record, @Param("example") TConstantExample example);

    int updateByPrimaryKeySelective(TConstant record);

    int updateByPrimaryKey(TConstant record);
}