package com.misnz.lyc.model;

import java.io.Serializable;

public class TLycClassified implements Serializable {
    private String classifiedId;

    private String titleCn;

    private String classifiedRemark;

    private String classifiedResName;

    private Integer caseCount;

    private String titleEn;

    public String getClassifiedId() {
        return classifiedId;
    }

    public void setClassifiedId(String classifiedId) {
        this.classifiedId = classifiedId == null ? null : classifiedId.trim();
    }

    public String getTitleCn() {
        return titleCn;
    }

    public void setTitleCn(String titleCn) {
        this.titleCn = titleCn == null ? null : titleCn.trim();
    }

    public String getClassifiedRemark() {
        return classifiedRemark;
    }

    public void setClassifiedRemark(String classifiedRemark) {
        this.classifiedRemark = classifiedRemark == null ? null : classifiedRemark.trim();
    }

    public String getClassifiedResName() {
        return classifiedResName;
    }

    public void setClassifiedResName(String classifiedResName) {
        this.classifiedResName = classifiedResName == null ? null : classifiedResName.trim();
    }

    public Integer getCaseCount() {
        return caseCount;
    }

    public void setCaseCount(Integer caseCount) {
        this.caseCount = caseCount;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn == null ? null : titleEn.trim();
    }
}