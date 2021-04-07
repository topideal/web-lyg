package com.misnz.lyc.dao;

import com.misnz.lyc.model.TLycTags;
import com.misnz.lyc.model.TLycTagsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLycTagsMapper {
    int deleteByExample(TLycTagsExample example);

    int deleteByPrimaryKey(String tagsId);

    int insert(TLycTags record);

    int insertSelective(TLycTags record);

    List<TLycTags> selectByExample(TLycTagsExample example);

    TLycTags selectByPrimaryKey(String tagsId);

    int updateByExampleSelective(@Param("record") TLycTags record, @Param("example") TLycTagsExample example);

    int updateByExample(@Param("record") TLycTags record, @Param("example") TLycTagsExample example);

    int updateByPrimaryKeySelective(TLycTags record);

    int updateByPrimaryKey(TLycTags record);
}