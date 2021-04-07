package com.misnz.lyc.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.misnz.lyc.dao.*;
import com.misnz.lyc.model.*;
import com.misnz.util.StringUtils;
import com.misnz.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("classifiedService")
public class ClassifiedService {
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


    public PagesListVo getClassifiedListByPaginator(Integer pageNumber, Integer pageSize) throws Exception {
        PageHelper.startPage(pageNumber, pageSize);
        TLycClassifiedExample classifiedExample = new TLycClassifiedExample();
        classifiedExample.setOrderByClause("title_en");
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(classifiedMapper.selectByExample(classifiedExample)), pageNumber);

        return jsonObject;

    }



    public void addClassified(TLycClassified classified) throws Exception {
        if (classified.getClassifiedId() == null || "".equals(classified.getClassifiedId())) {
            classified.setClassifiedId(StringUtils.getUUID());
            classifiedMapper.insertSelective(classified);
        } else {
            classifiedMapper.updateByPrimaryKeySelective(classified);
        }


    }

    public void delClassified(String delStr) throws Exception {
        JSONArray jsonArray = JSONArray.parseArray(delStr);
        List<String> delIdList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            delIdList.add(jsonObj.getString("classifiedId"));
        }

        TLycInfoClassifiedExample infoClassifiedExample = new TLycInfoClassifiedExample();
        infoClassifiedExample.createCriteria().andClassifiedIdIn(delIdList);
        infoClassifiedMapper.deleteByExample(infoClassifiedExample);

        TLycClassifiedExample classifiedExample = new TLycClassifiedExample();
        classifiedExample.createCriteria().andClassifiedIdIn(delIdList);
        classifiedMapper.deleteByExample(classifiedExample);
    }


    public PagesListVo getTagsListByPaginator(Integer pageNumber, Integer pageSize) throws Exception {
        PageHelper.startPage(pageNumber, pageSize);
        TLycTagsExample tagsExample = new TLycTagsExample();
        tagsExample.setOrderByClause("title_en");
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(tagsMapper.selectByExample(tagsExample)), pageNumber);

        return jsonObject;

    }
    public void addTags(TLycTags tags) throws Exception {

        if (tags.getTagsId() == null || "".equals(tags.getTagsId())) {
            tags.setTagsId(StringUtils.getUUID());
            tagsMapper.insertSelective(tags);
        } else {
            tagsMapper.updateByPrimaryKeySelective(tags);
        }


    }
    public void delTags(String delStr) throws Exception {
        JSONArray jsonArray = JSONArray.parseArray(delStr);
        List<String> delIdList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            delIdList.add(jsonObj.getString("tagsId"));
        }

        TLycInfoTagsExample tLycInfoTagsExample = new TLycInfoTagsExample();
        tLycInfoTagsExample.createCriteria().andTagsIdIn(delIdList);
        infoTagsMapper.deleteByExample(tLycInfoTagsExample);

        TLycTagsExample tagsExample = new TLycTagsExample();
        tagsExample.createCriteria().andTagsIdIn(delIdList);
        tagsMapper.deleteByExample(tagsExample);
    }


    public PagesListVo getCountryListByPaginator(Integer pageNumber, Integer pageSize) throws Exception {
        PageHelper.startPage(pageNumber, pageSize);
        TLycCountryExample countryExample = new TLycCountryExample();
        countryExample.setOrderByClause("title_en");
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(countryMapper.selectByExample(countryExample)), pageNumber);

        return jsonObject;

    }
    public void addCountry(TLycCountry country) throws Exception {

        if (country.getCountryId() == null || "".equals(country.getCountryId())) {
            country.setCountryId(StringUtils.getUUID());
            countryMapper.insertSelective(country);
        } else {
            countryMapper.updateByPrimaryKeySelective(country);
        }


    }

    public void delCountry(String delStr) throws Exception {
        JSONArray jsonArray = JSONArray.parseArray(delStr);
        List<String> delIdList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            delIdList.add(jsonObj.getString("countryId"));
        }

        //todo 清空信息表的countryId

        TLycCountryExample countryExample = new TLycCountryExample();
        countryExample.createCriteria().andCountryIdIn(delIdList);
        countryMapper.deleteByExample(countryExample);
    }

    public PagesListVo getBrandsListByPaginator(Integer pageNumber, Integer pageSize) throws Exception {
        PageHelper.startPage(pageNumber, pageSize);
        TLycBrandsExample brandsExample = new TLycBrandsExample();
        brandsExample.setOrderByClause("title_en");
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(brandsMapper.selectByExample(brandsExample)), pageNumber);

        return jsonObject;

    }
    public void addBrands(TLycBrands brands) throws Exception {

        if (brands.getBrandsId() == null || "".equals(brands.getBrandsId())) {
            brands.setBrandsId(StringUtils.getUUID());
            brandsMapper.insertSelective(brands);
        } else {
            brandsMapper.updateByPrimaryKeySelective(brands);
        }


    }

    public void delBrands(String delStr) throws Exception {
        JSONArray jsonArray = JSONArray.parseArray(delStr);
        List<String> delIdList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            delIdList.add(jsonObj.getString("brandsId"));
        }

        //todo 清空信息表的countryId

        TLycBrandsExample brandsExample = new TLycBrandsExample();
        brandsExample.createCriteria().andBrandsIdIn(delIdList);
        brandsMapper.deleteByExample(brandsExample);
    }



    public PagesListVo getYearsListByPaginator(Integer pageNumber, Integer pageSize) throws Exception {
        PageHelper.startPage(pageNumber, pageSize);
        TLycYearsExample yearsExample = new TLycYearsExample();
        yearsExample.setOrderByClause("years_code");
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(yearsMapper.selectByExample(yearsExample)), pageNumber);

        return jsonObject;

    }
    public void addYears(TLycYears years) throws Exception {


            yearsMapper.insertSelective(years);



    }

    public void delYears(String delStr) throws Exception {
        JSONArray jsonArray = JSONArray.parseArray(delStr);
        List<String> delIdList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            delIdList.add(jsonObj.getString("yearsCode"));
        }

        //todo 清空信息表的countryId

        TLycYearsExample yearsExample = new TLycYearsExample();
        yearsExample.createCriteria().andYearsCodeIn(delIdList);
        yearsMapper.deleteByExample(yearsExample);
    }



    public PagesListVo getTradesListByPaginator(Integer pageNumber, Integer pageSize) throws Exception {
        PageHelper.startPage(pageNumber, pageSize);
        TLycTradesExample tradesExample = new TLycTradesExample();
        tradesExample.setOrderByClause("title_en");
        PagesListVo jsonObject = Utils.getPagesAndResult(new PageInfo(tradesMapper.selectByExample(tradesExample)), pageNumber);

        return jsonObject;

    }
    public void addTrades(TLycTrades trades) throws Exception {

        if (trades.getTradesId() == null || "".equals(trades.getTradesId())) {
            trades.setTradesId(StringUtils.getUUID());
            tradesMapper.insertSelective(trades);
        } else {
            tradesMapper.updateByPrimaryKeySelective(trades);
        }


    }

    public void delTrades(String delStr) throws Exception {
        JSONArray jsonArray = JSONArray.parseArray(delStr);
        List<String> delIdList = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            delIdList.add(jsonObj.getString("tradesId"));
        }

        //todo 清空信息表的countryId

        TLycTradesExample tradesExample = new TLycTradesExample();
        tradesExample.createCriteria().andTradesIdIn(delIdList);
        tradesMapper.deleteByExample(tradesExample);
    }




    public List getClassifiedListForAll() throws Exception {

        TLycClassifiedExample classifiedExample = new TLycClassifiedExample();
        classifiedExample.setOrderByClause("title_en");
        return classifiedMapper.selectByExample(classifiedExample);


    }

    public List getTagsListForAll() throws Exception {

        TLycTagsExample tagsExample = new TLycTagsExample();
        tagsExample.setOrderByClause("title_en");
        return tagsMapper.selectByExample(tagsExample);


    }
    public List getCountryListForAll() throws Exception {

        TLycCountryExample countryExample = new TLycCountryExample();
        countryExample.setOrderByClause("title_en");
        return countryMapper.selectByExample(countryExample);


    }
    public List getBrandListForAll() throws Exception {

        TLycBrandsExample brandsExample = new TLycBrandsExample();
        brandsExample.setOrderByClause("title_en");
        return brandsMapper.selectByExample(brandsExample);


    }
    public List getTradeListForAll() throws Exception {

        TLycTradesExample tradesExample = new TLycTradesExample();
        tradesExample.setOrderByClause("title_en");
        return tradesMapper.selectByExample(tradesExample);


    }


    public List getYearsForAll() throws Exception {

        return infoMapper.getYearsForAll();


    }


}
