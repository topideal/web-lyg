package com.misnz.lyc.dao;

import com.misnz.lyc.model.TLycBrands;
import com.misnz.lyc.model.TLycBrandsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLycBrandsMapper {
    int deleteByExample(TLycBrandsExample example);

    int deleteByPrimaryKey(String brandsId);

    int insert(TLycBrands record);

    int insertSelective(TLycBrands record);

    List<TLycBrands> selectByExample(TLycBrandsExample example);

    TLycBrands selectByPrimaryKey(String brandsId);

    int updateByExampleSelective(@Param("record") TLycBrands record, @Param("example") TLycBrandsExample example);

    int updateByExample(@Param("record") TLycBrands record, @Param("example") TLycBrandsExample example);

    int updateByPrimaryKeySelective(TLycBrands record);

    int updateByPrimaryKey(TLycBrands record);
}