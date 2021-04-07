package com.misnz.lyc.model;

import java.io.Serializable;

public class TLycInfoTags implements Serializable {
    private String infoId;

    private String tagsId;

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
    }

    public String getTagsId() {
        return tagsId;
    }

    public void setTagsId(String tagsId) {
        this.tagsId = tagsId == null ? null : tagsId.trim();
    }
}