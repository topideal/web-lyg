package com.misnz.lyc.dao;

import com.misnz.lyc.model.OutPutInfoVo;
import com.misnz.lyc.model.TLycYears;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLycInfoExtMapper {

    List<OutPutInfoVo> getInfoDetailByInfoId(@Param("infoId")String infoId);
    List<OutPutInfoVo> getInfoListByPaginator(@Param("searchType")String searchType, @Param("searchKey")String searchKey);
    List<OutPutInfoVo> getSearchInfoListByPaginator(@Param("searchKey")String searchKey);
    List<OutPutInfoVo> getNewsDetailList(@Param("infoId")String infoId);
    List<OutPutInfoVo> getNewsListByPaginator(@Param("searchType")String searchType, @Param("searchKey")String searchKey);
    List<TLycYears> getYearsForAll();

}