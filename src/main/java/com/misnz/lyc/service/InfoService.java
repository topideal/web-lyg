package com.misnz.lyc.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.misnz.lyc.dao.*;
import com.misnz.lyc.model.*;
import com.misnz.util.DateUtils;
import com.misnz.util.StringUtils;
import com.misnz.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("infoService")
public class InfoService {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TLycClassifiedMapper classifiedMapper;
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TLycInfoMapper infoMapper;

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TLycInfoFileMapper infoFileMapper;

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TLycBrandsMapper brandsMapper;

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TLycCountryMapper countryMapper;

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TLycTagsMapper tagsMapper;
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TLycInfoTagsMapper infoTagsMapper;

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TLycYearsMapper yearsMapper;
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TLycTradesMapper tradesMapper;

    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TLycInfoClassifiedMapper infoClassifiedMapper;
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private CountMapper countMapper;

    public PagesListVo getInfoListByPaginator(Integer pageNumber, Integer pageSize) throws Exception {

        PageHelper.startPage(pageNumber, pageSize);
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(infoMapper.getInfoListByPaginator(null, null)), pageNumber);

        return jsonObject;

    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackForClassName = "Exception")
    public void addInfo(InputInfoVo infoVo) throws Exception {
        if (infoVo.getInfoResName().equals("")) {
            infoVo.setInfoResName(null);
        }
        if (infoVo.getInfoId() == null || "".equals(infoVo.getInfoId())) {
            infoVo.setInfoId(StringUtils.getUUID());
            infoVo.setInfoType(0);
            infoVo.setCreateDate(DateUtils.getCurrentDataByShort());
            infoVo.setOptDate(DateUtils.getCurrentDataByShort());
            infoMapper.insertSelective(infoVo);

        } else {
            delInfoMinus(infoVo.getInfoId());
            infoVo.setOptDate(DateUtils.getCurrentDataByShort());
            infoMapper.updateByPrimaryKeySelective(infoVo);

        }
        if (infoVo.getClassifiedId() instanceof String) {
            List<String> classifiedIdList = new ArrayList<>();
            classifiedIdList.add(infoVo.getClassifiedId().toString());
            insertInfoClassified(infoVo.getInfoId(), classifiedIdList);
        } else if (infoVo.getClassifiedId() instanceof List) {
            insertInfoClassified(infoVo.getInfoId(), (ArrayList) infoVo.getClassifiedId());
        }
        if (infoVo.getTagsId() instanceof String) {
            List<String> tagsIdList = new ArrayList<>();
            tagsIdList.add(infoVo.getTagsId().toString());
            insertInfoTags(infoVo.getInfoId(), tagsIdList);
        } else if (infoVo.getTagsId() instanceof List) {
            insertInfoTags(infoVo.getInfoId(), (ArrayList) infoVo.getTagsId());
        }
        // 城市/行业/品牌+1
        if (infoVo.getCountryId() != null && !"".equals(infoVo.getCountryId())) {
            countMapper.countryCountAdd(infoVo.getCountryId());
        }
        if (infoVo.getTradeId() != null && !"".equals(infoVo.getTradeId())) {
            countMapper.tradesCountAdd(infoVo.getTradeId());
        }
        if (infoVo.getBrandsId() != null && !"".equals(infoVo.getBrandsId())) {
            countMapper.brandsCountAdd(infoVo.getBrandsId());
        }


    }


    private void insertInfoClassified(String infoId, List<String> classifiedIdList) throws Exception {
        for (int i = 0; i < classifiedIdList.size(); i++) {
            String classifiedId = classifiedIdList.get(i);
            TLycInfoClassified infoClassified = new TLycInfoClassified();
            infoClassified.setClassifiedId(classifiedId);
            infoClassified.setInfoId(infoId);
            infoClassifiedMapper.insert(infoClassified);
            // 分类+1
            countMapper.classifiedCountAdd(classifiedId);
        }

    }

    private void insertInfoTags(String infoId, List<String> tagsIdList) throws Exception {
        for (int i = 0; i < tagsIdList.size(); i++) {
            String tagId = tagsIdList.get(i);
            TLycInfoTags infoTags = new TLycInfoTags();
            infoTags.setTagsId(tagId);
            infoTags.setInfoId(infoId);
            infoTagsMapper.insert(infoTags);
            // 标签+1
            countMapper.tagsCountAdd(tagId);
        }

    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackForClassName = "Exception")
    public void delInfo(String delStr) throws Exception {
        JSONArray jsonArray = JSONArray.parseArray(delStr);

        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            String infoId = jsonObj.getString("infoId");
            delInfoMinus(infoId);
            TLycInfoFileExample infoFileExample = new TLycInfoFileExample();
            infoFileExample.createCriteria().andInfoIdEqualTo(infoId);
            infoFileMapper.deleteByExample(infoFileExample);

            infoMapper.deleteByPrimaryKey(infoId);
        }


    }

    private void delInfoMinus(String infoId) {
        TLycInfo info = infoMapper.selectByPrimaryKey(infoId);


        if (info.getCountryId() != null && !"".equals(info.getCountryId())) {
            countMapper.countryCountMinus(info.getCountryId());
        }
        if (info.getTradeId() != null && !"".equals(info.getTradeId())) {
            countMapper.tradesCountMinus(info.getTradeId());
        }
        if (info.getBrandsId() != null && !"".equals(info.getBrandsId())) {
            countMapper.brandsCountMinus(info.getBrandsId());
        }

        countMapper.batchClassifiedCountMinus(info.getInfoId());
        countMapper.batchTagsCountMinus(info.getInfoId());

        TLycInfoClassifiedExample infoClassifiedExample = new TLycInfoClassifiedExample();
        infoClassifiedExample.createCriteria().andInfoIdEqualTo(info.getInfoId());
        infoClassifiedMapper.deleteByExample(infoClassifiedExample);

        TLycInfoTagsExample infoTagsExample = new TLycInfoTagsExample();
        infoTagsExample.createCriteria().andInfoIdEqualTo(info.getInfoId());
        infoTagsMapper.deleteByExample(infoTagsExample);
    }


    public PagesListVo getInfoList(String searchType, String searchKey, Integer pageSize, Integer pageNumber) throws Exception {
        if (searchType != null && searchType.equals("")) {
            searchType = null;
        }
        if (searchKey != null && searchKey.equals("")) {
            searchKey = null;
        }
        PageHelper.startPage(pageNumber, pageSize);
        PagesListVo jsonObject = null;
        if(searchType!=null && "all".equalsIgnoreCase(searchType)){
            jsonObject =Utils.getPagesAndResult(new PageInfo(infoMapper.getSearchInfoListByPaginator(searchKey)), pageNumber);
        }else {
            jsonObject =Utils.getPagesAndResult(new PageInfo(infoMapper.getInfoListByPaginator(searchType, searchKey)), pageNumber);
        }

        jsonObject.setCurrentPage(pageNumber);
        /*List<OutPutClassifiedInfoVo> classifiedInfoVoList = (List) jsonObject.getData();
        for (int i = 0; i < classifiedInfoVoList.size(); i++) {
            OutPutClassifiedInfoVo outPutClassifiedInfoVo = classifiedInfoVoList.get(i);
            if (outPutClassifiedInfoVo.getInfoMonth() != null && !"".equals(outPutClassifiedInfoVo.getInfoMonth())) {
                if (Integer.parseInt(outPutClassifiedInfoVo.getInfoMonth()) > Integer.parseInt(jsonObject.getMaxMonth())) {
                    jsonObject.setMaxMonth(outPutClassifiedInfoVo.getInfoMonth());
                }
                if (Integer.parseInt(outPutClassifiedInfoVo.getInfoMonth()) < Integer.parseInt(jsonObject.getMinMonth())) {
                    jsonObject.setMinMonth(outPutClassifiedInfoVo.getInfoMonth());
                }
            }
        }*/
        //   jsonObject.setMaxMonth(getInfoPages(classifiedId, pageNumber - 1, pageSize));
        //   jsonObject.setMinMonth(getInfoPages(classifiedId, pageNumber + 1, pageSize));
        return jsonObject;

    }

    private String getInfoPages(String classifiedId, Integer pageNumber, Integer pageSize) throws Exception {
        if (classifiedId != null && classifiedId.equals("")) {
            classifiedId = null;
        }
        if (pageNumber > 0) {
            PageHelper.startPage(pageNumber, pageSize);
            PagesListVo jsonObject = null;//Utils.getPagesAndResult(new PageInfo(classifiedInfoMapper.getClassifiedInfoListByPaginator(classifiedId)), pageNumber);
            Object data = jsonObject.getData();
            if (data == null) {
                return "";
            }
            List<OutPutInfoVo> classifiedInfoVoList = (List) data;
            for (int i = 0; i < classifiedInfoVoList.size(); i++) {
                OutPutInfoVo outPutClassifiedInfoVo = classifiedInfoVoList.get(i);
                if (outPutClassifiedInfoVo.getInfoMonth() != null && !"".equals(outPutClassifiedInfoVo.getInfoMonth())) {
                    if (Integer.parseInt(outPutClassifiedInfoVo.getInfoMonth()) > Integer.parseInt(jsonObject.getMaxMonth())) {
                        jsonObject.setMaxMonth(outPutClassifiedInfoVo.getInfoMonth());
                    }
                    if (Integer.parseInt(outPutClassifiedInfoVo.getInfoMonth()) < Integer.parseInt(jsonObject.getMinMonth())) {
                        jsonObject.setMinMonth(outPutClassifiedInfoVo.getInfoMonth());
                    }
                }
            }
            if ("00000000".equals(jsonObject.getMaxMonth())) {
                return "";
            }
            return "[" + jsonObject.getMaxMonth() + "_" + jsonObject.getMinMonth() + "]";
        } else {
            return "";
        }

    }


    public PagesListVo getInfoFileListByPaginator(String infoId, Integer pageNumber, Integer pageSize) throws Exception {

        TLycInfoFileExample infoFileExample = new TLycInfoFileExample();
        infoFileExample.createCriteria().andInfoIdEqualTo(infoId);
        infoFileExample.setOrderByClause("sort_filed,opt_date desc");
        PageHelper.startPage(pageNumber, pageSize);
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(infoFileMapper.selectByExample(infoFileExample)), pageNumber);

        return jsonObject;

    }

    public void addInfoFile(TLycInfoFile infoFile) throws Exception {
        if (infoFile.getFileName().equals("")) {
            infoFile.setFileName(null);
        }
        if (infoFile.getInfoFileId() == null || "".equals(infoFile.getInfoFileId())) {
            infoFile.setInfoFileId(StringUtils.getUUID());
            infoFile.setOptDate(DateUtils.getCurrentDataByShort());
            infoFileMapper.insertSelective(infoFile);
        } else {
            infoFile.setOptDate(DateUtils.getCurrentDataByShort());
            infoFileMapper.updateByPrimaryKeySelective(infoFile);
        }


    }

    public void delInfoFile(String delStr) throws Exception {
        JSONArray jsonArray = JSONArray.parseArray(delStr);
        List<String> delIdList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            delIdList.add(jsonObj.getString("infoFileId"));
        }

        TLycInfoFileExample infoExample = new TLycInfoFileExample();
        infoExample.createCriteria().andInfoFileIdIn(delIdList);
        infoFileMapper.deleteByExample(infoExample);


    }


    public PagesListVo getInfoDetailList(String infoId, Integer pageNumber, Integer pageSize) throws Exception {

        PageHelper.startPage(pageNumber, pageSize);

        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(infoMapper.getInfoDetailByInfoId(infoId)), pageNumber);

        return jsonObject;

    }

    public HashMap<String, TLycInfo> getPrevNextInfoDetail(String infoId) throws Exception {
        HashMap<String, TLycInfo> retMap = new HashMap<>();
        TLycInfo info = infoMapper.selectByPrimaryKey(infoId);
        TLycInfoExample infoExample = new TLycInfoExample();
        infoExample.createCriteria().andInfoTypeEqualTo(0).andSortFiledGreaterThan(info.getSortFiled());
        infoExample.setOrderByClause("sort_filed");
        List<TLycInfo> nextList = infoMapper.selectByExample(infoExample);
        infoExample.clear();
        infoExample.createCriteria().andInfoTypeEqualTo(0).andSortFiledLessThan(info.getSortFiled());
        infoExample.setOrderByClause("sort_filed desc");
        List<TLycInfo> prevList = infoMapper.selectByExample(infoExample);
        if (prevList != null && !prevList.isEmpty()) {
            retMap.put("prev", prevList.get(0));
        } else {
            retMap.put("prev", null);
        }
        if (nextList != null && !nextList.isEmpty()) {
            retMap.put("next", nextList.get(0));
        } else {
            retMap.put("next", null);
        }
        return retMap;
    }
    public HashMap<String, TLycInfo> getPrevNextNewsDetail(String infoId) throws Exception {
        HashMap<String, TLycInfo> retMap = new HashMap<>();
        TLycInfo info = infoMapper.selectByPrimaryKey(infoId);
        TLycInfoExample infoExample = new TLycInfoExample();
        infoExample.createCriteria().andInfoTypeEqualTo(1).andSortFiledGreaterThan(info.getSortFiled());
        infoExample.setOrderByClause("sort_filed");
        List<TLycInfo> nextList = infoMapper.selectByExample(infoExample);
        infoExample.clear();
        infoExample.createCriteria().andInfoTypeEqualTo(1).andSortFiledLessThan(info.getSortFiled());
        infoExample.setOrderByClause("sort_filed desc");
        List<TLycInfo> prevList = infoMapper.selectByExample(infoExample);
        if (prevList != null && !prevList.isEmpty()) {
            retMap.put("prev", prevList.get(0));
        } else {
            retMap.put("prev", null);
        }
        if (nextList != null && !nextList.isEmpty()) {
            retMap.put("next", nextList.get(0));
        } else {
            retMap.put("next", null);
        }
        return retMap;
    }

    public void setHis(String infoId) throws Exception {

        TLycInfo info = infoMapper.selectByPrimaryKey(infoId);
        info.setHits(info.getHits()+1);
        infoMapper.updateByPrimaryKeySelective(info);

    }
    public void setBrowser(String infoId) throws Exception {

        TLycInfo info = infoMapper.selectByPrimaryKey(infoId);
        info.setBrowser(info.getBrowser()+1);
        infoMapper.updateByPrimaryKeySelective(info);

    }


    /**
     * 新闻动态
     * **/


    public PagesListVo getNewsListByPaginator(Integer pageNumber, Integer pageSize) throws Exception {

        PageHelper.startPage(pageNumber, pageSize);
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(infoMapper.getNewsListByPaginator(null, null)), pageNumber);

        return jsonObject;

    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackForClassName = "Exception")
    public void addNews(InputInfoVo infoVo) throws Exception {
        if (infoVo.getInfoResName().equals("")) {
            infoVo.setInfoResName(null);
        }
        if (infoVo.getInfoId() == null || "".equals(infoVo.getInfoId())) {
            infoVo.setInfoId(StringUtils.getUUID());
            infoVo.setInfoType(1);
            infoVo.setCreateDate(DateUtils.getCurrentDataByShort());
            infoVo.setOptDate(DateUtils.getCurrentDataByShort());
            infoMapper.insertSelective(infoVo);

        } else {
            infoVo.setOptDate(DateUtils.getCurrentDataByShort());
            infoMapper.updateByPrimaryKeySelective(infoVo);

        }



    }



    @Transactional(propagation = Propagation.REQUIRED, rollbackForClassName = "Exception")
    public void delNews(String delStr) throws Exception {
        JSONArray jsonArray = JSONArray.parseArray(delStr);

        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            String infoId = jsonObj.getString("infoId");

            TLycInfoFileExample infoFileExample = new TLycInfoFileExample();
            infoFileExample.createCriteria().andInfoIdEqualTo(infoId);
            infoFileMapper.deleteByExample(infoFileExample);

            infoMapper.deleteByPrimaryKey(infoId);
        }


    }




    public PagesListVo getNewsList(String searchType, String searchKey, Integer pageSize, Integer pageNumber) throws Exception {
        if (searchType != null && searchType.equals("")) {
            searchType = null;
        }
        if (searchKey != null && searchKey.equals("")) {
            searchKey = null;
        }
        PageHelper.startPage(pageNumber, pageSize);
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(infoMapper.getNewsListByPaginator(searchType, searchKey)), pageNumber);
        jsonObject.setCurrentPage(pageNumber);
        return jsonObject;

    }
    public PagesListVo getNewsDetailList(String infoId, Integer pageNumber, Integer pageSize) throws Exception {

        PageHelper.startPage(pageNumber, pageSize);

        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(infoMapper.getNewsDetailList(infoId)), pageNumber);

        return jsonObject;

    }
}
