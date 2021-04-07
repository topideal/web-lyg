package com.misnz.lyc.dao;

import com.misnz.lyc.model.TLycInfoFile;
import com.misnz.lyc.model.TLycInfoFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLycInfoFileMapper {
    int deleteByExample(TLycInfoFileExample example);

    int deleteByPrimaryKey(String infoFileId);

    int insert(TLycInfoFile record);

    int insertSelective(TLycInfoFile record);

    List<TLycInfoFile> selectByExample(TLycInfoFileExample example);

    TLycInfoFile selectByPrimaryKey(String infoFileId);

    int updateByExampleSelective(@Param("record") TLycInfoFile record, @Param("example") TLycInfoFileExample example);

    int updateByExample(@Param("record") TLycInfoFile record, @Param("example") TLycInfoFileExample example);

    int updateByPrimaryKeySelective(TLycInfoFile record);

    int updateByPrimaryKey(TLycInfoFile record);
}