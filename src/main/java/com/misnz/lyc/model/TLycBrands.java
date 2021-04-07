package com.misnz.lyc.model;

import java.io.Serializable;

public class TLycBrands implements Serializable {
    private String brandsId;

    private String titleCn;

    private String remark;

    private Integer caseCount;

    private String parentId;

    private String titleEn;

    public String getBrandsId() {
        return brandsId;
    }

    public void setBrandsId(String brandsId) {
        this.brandsId = brandsId == null ? null : brandsId.trim();
    }

    public String getTitleCn() {
        return titleCn;
    }

    public void setTitleCn(String titleCn) {
        this.titleCn = titleCn == null ? null : titleCn.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getCaseCount() {
        return caseCount;
    }

    public void setCaseCount(Integer caseCount) {
        this.caseCount = caseCount;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn == null ? null : titleEn.trim();
    }
}