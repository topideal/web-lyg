package com.misnz.lyc.model;

import java.io.Serializable;

public class RecruitCategoryEntity implements Serializable {
    private String id;

    private String titleCn;

    private Integer delTag;

    private Integer orderTag;

    private String titleEn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitleCn() {
        return titleCn;
    }

    public void setTitleCn(String titleCn) {
        this.titleCn = titleCn == null ? null : titleCn.trim();
    }

    public Integer getDelTag() {
        return delTag;
    }

    public void setDelTag(Integer delTag) {
        this.delTag = delTag;
    }

    public Integer getOrderTag() {
        return orderTag;
    }

    public void setOrderTag(Integer orderTag) {
        this.orderTag = orderTag;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn == null ? null : titleEn.trim();
    }
}