package com.misnz.lyc.dao;

import com.misnz.lyc.model.InfoSearchEntity;
import com.misnz.lyc.model.InfoSearchEntityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoSearchEntityMapper {
    int deleteByExample(InfoSearchEntityExample example);

    int insert(InfoSearchEntity record);

    int insertSelective(InfoSearchEntity record);

    List<InfoSearchEntity> selectByExampleWithBLOBs(InfoSearchEntityExample example);

    List<InfoSearchEntity> selectByExample(InfoSearchEntityExample example);

    int updateByExampleSelective(@Param("record") InfoSearchEntity record, @Param("example") InfoSearchEntityExample example);

    int updateByExampleWithBLOBs(@Param("record") InfoSearchEntity record, @Param("example") InfoSearchEntityExample example);

    int updateByExample(@Param("record") InfoSearchEntity record, @Param("example") InfoSearchEntityExample example);
}