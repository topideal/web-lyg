package com.misnz.lyc.dao;

import com.misnz.lyc.model.TLycCountry;
import com.misnz.lyc.model.TLycCountryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLycCountryMapper {
    int deleteByExample(TLycCountryExample example);

    int deleteByPrimaryKey(String countryId);

    int insert(TLycCountry record);

    int insertSelective(TLycCountry record);

    List<TLycCountry> selectByExample(TLycCountryExample example);

    TLycCountry selectByPrimaryKey(String countryId);

    int updateByExampleSelective(@Param("record") TLycCountry record, @Param("example") TLycCountryExample example);

    int updateByExample(@Param("record") TLycCountry record, @Param("example") TLycCountryExample example);

    int updateByPrimaryKeySelective(TLycCountry record);

    int updateByPrimaryKey(TLycCountry record);
}