package com.misnz.lyc.dao;

import com.misnz.lyc.model.TLycInfoTags;
import com.misnz.lyc.model.TLycInfoTagsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLycInfoTagsMapper {
    int deleteByExample(TLycInfoTagsExample example);

    int deleteByPrimaryKey(@Param("infoId") String infoId, @Param("tagsId") String tagsId);

    int insert(TLycInfoTags record);

    int insertSelective(TLycInfoTags record);

    List<TLycInfoTags> selectByExample(TLycInfoTagsExample example);

    int updateByExampleSelective(@Param("record") TLycInfoTags record, @Param("example") TLycInfoTagsExample example);

    int updateByExample(@Param("record") TLycInfoTags record, @Param("example") TLycInfoTagsExample example);
}