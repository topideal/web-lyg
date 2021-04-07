package com.misnz.lyc.dao;

import com.misnz.lyc.model.TLycInfo;
import com.misnz.lyc.model.TLycInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLycInfoMapper extends TLycInfoExtMapper {
    int deleteByExample(TLycInfoExample example);

    int deleteByPrimaryKey(String infoId);

    int insert(TLycInfo record);

    int insertSelective(TLycInfo record);

    List<TLycInfo> selectByExampleWithBLOBs(TLycInfoExample example);

    List<TLycInfo> selectByExample(TLycInfoExample example);

    TLycInfo selectByPrimaryKey(String infoId);

    int updateByExampleSelective(@Param("record") TLycInfo record, @Param("example") TLycInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TLycInfo record, @Param("example") TLycInfoExample example);

    int updateByExample(@Param("record") TLycInfo record, @Param("example") TLycInfoExample example);

    int updateByPrimaryKeySelective(TLycInfo record);

    int updateByPrimaryKeyWithBLOBs(TLycInfo record);

    int updateByPrimaryKey(TLycInfo record);
}