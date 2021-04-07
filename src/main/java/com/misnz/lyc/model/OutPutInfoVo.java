package com.misnz.lyc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OutPutInfoVo extends TLycInfo implements Serializable {

    private String brandsTitleEn;
    private String brandsTitleCn;
    private String countryTitleCn;
    private String countryTitleEn;
    private String tradesTitleCn;
    private String tradesTitleEn;
    private String classifiedTitleCn;
    private String classifiedTitleEn;
    private String tagsTitleCn;
    private String tagsTitleEn;

    private String classifiedId;
    private String tagsId;


    private List<TLycInfoFile> infoFileList=new ArrayList<>();

    public String getBrandsTitleEn() {
        return brandsTitleEn;
    }

    public void setBrandsTitleEn(String brandsTitleEn) {
        this.brandsTitleEn = brandsTitleEn;
    }

    public String getBrandsTitleCn() {
        return brandsTitleCn;
    }

    public void setBrandsTitleCn(String brandsTitleCn) {
        this.brandsTitleCn = brandsTitleCn;
    }

    public String getCountryTitleCn() {
        return countryTitleCn;
    }

    public void setCountryTitleCn(String countryTitleCn) {
        this.countryTitleCn = countryTitleCn;
    }

    public String getCountryTitleEn() {
        return countryTitleEn;
    }

    public void setCountryTitleEn(String countryTitleEn) {
        this.countryTitleEn = countryTitleEn;
    }

    public String getTradesTitleCn() {
        return tradesTitleCn;
    }

    public void setTradesTitleCn(String tradesTitleCn) {
        this.tradesTitleCn = tradesTitleCn;
    }

    public String getTradesTitleEn() {
        return tradesTitleEn;
    }

    public void setTradesTitleEn(String tradesTitleEn) {
        this.tradesTitleEn = tradesTitleEn;
    }

    public String getClassifiedTitleCn() {
        return classifiedTitleCn;
    }

    public void setClassifiedTitleCn(String classifiedTitleCn) {
        this.classifiedTitleCn = classifiedTitleCn;
    }

    public String getClassifiedTitleEn() {
        return classifiedTitleEn;
    }

    public void setClassifiedTitleEn(String classifiedTitleEn) {
        this.classifiedTitleEn = classifiedTitleEn;
    }

    public String getTagsTitleCn() {
        return tagsTitleCn;
    }

    public void setTagsTitleCn(String tagsTitleCn) {
        this.tagsTitleCn = tagsTitleCn;
    }

    public String getTagsTitleEn() {
        return tagsTitleEn;
    }

    public void setTagsTitleEn(String tagsTitleEn) {
        this.tagsTitleEn = tagsTitleEn;
    }

    public String getClassifiedId() {
        return classifiedId;
    }

    public void setClassifiedId(String classifiedId) {
        this.classifiedId = classifiedId;
    }

    public String getTagsId() {
        return tagsId;
    }

    public void setTagsId(String tagsId) {
        this.tagsId = tagsId;
    }

    public List<TLycInfoFile> getInfoFileList() {
        return infoFileList;
    }

    public void setInfoFileList(List<TLycInfoFile> infoFileList) {
        this.infoFileList = infoFileList;
    }
}