package com.misnz.lyc.model;

import java.io.Serializable;

public class TLycInfo implements Serializable {
    private String infoId;

    private Integer infoType;

    private String infoTitleEn;

    private String infoTitleCn;

    private String infoResName;

    private Long createDate;

    private Long optDate;

    private Integer sortFiled;

    private String infoMonth;

    private String countryId;

    private String brandsId;

    private String yearsCode;

    private String tradeId;

    private Integer browser;

    private Integer hits;

    private String infoRemarkEn;

    private String infoRemarkCn;

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
    }

    public Integer getInfoType() {
        return infoType;
    }

    public void setInfoType(Integer infoType) {
        this.infoType = infoType;
    }

    public String getInfoTitleEn() {
        return infoTitleEn;
    }

    public void setInfoTitleEn(String infoTitleEn) {
        this.infoTitleEn = infoTitleEn == null ? null : infoTitleEn.trim();
    }

    public String getInfoTitleCn() {
        return infoTitleCn;
    }

    public void setInfoTitleCn(String infoTitleCn) {
        this.infoTitleCn = infoTitleCn == null ? null : infoTitleCn.trim();
    }

    public String getInfoResName() {
        return infoResName;
    }

    public void setInfoResName(String infoResName) {
        this.infoResName = infoResName == null ? null : infoResName.trim();
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getOptDate() {
        return optDate;
    }

    public void setOptDate(Long optDate) {
        this.optDate = optDate;
    }

    public Integer getSortFiled() {
        return sortFiled;
    }

    public void setSortFiled(Integer sortFiled) {
        this.sortFiled = sortFiled;
    }

    public String getInfoMonth() {
        return infoMonth;
    }

    public void setInfoMonth(String infoMonth) {
        this.infoMonth = infoMonth == null ? null : infoMonth.trim();
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId == null ? null : countryId.trim();
    }

    public String getBrandsId() {
        return brandsId;
    }

    public void setBrandsId(String brandsId) {
        this.brandsId = brandsId == null ? null : brandsId.trim();
    }

    public String getYearsCode() {
        return yearsCode;
    }

    public void setYearsCode(String yearsCode) {
        this.yearsCode = yearsCode == null ? null : yearsCode.trim();
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId == null ? null : tradeId.trim();
    }

    public Integer getBrowser() {
        return browser;
    }

    public void setBrowser(Integer browser) {
        this.browser = browser;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public String getInfoRemarkEn() {
        return infoRemarkEn;
    }

    public void setInfoRemarkEn(String infoRemarkEn) {
        this.infoRemarkEn = infoRemarkEn == null ? null : infoRemarkEn.trim();
    }

    public String getInfoRemarkCn() {
        return infoRemarkCn;
    }

    public void setInfoRemarkCn(String infoRemarkCn) {
        this.infoRemarkCn = infoRemarkCn == null ? null : infoRemarkCn.trim();
    }
}