package com.misnz.lyc.dao;

import com.misnz.lyc.model.TLycTrades;
import com.misnz.lyc.model.TLycTradesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLycTradesMapper {
    int deleteByExample(TLycTradesExample example);

    int deleteByPrimaryKey(String tradesId);

    int insert(TLycTrades record);

    int insertSelective(TLycTrades record);

    List<TLycTrades> selectByExample(TLycTradesExample example);

    TLycTrades selectByPrimaryKey(String tradesId);

    int updateByExampleSelective(@Param("record") TLycTrades record, @Param("example") TLycTradesExample example);

    int updateByExample(@Param("record") TLycTrades record, @Param("example") TLycTradesExample example);

    int updateByPrimaryKeySelective(TLycTrades record);

    int updateByPrimaryKey(TLycTrades record);
}