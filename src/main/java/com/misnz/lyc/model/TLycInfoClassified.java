package com.misnz.lyc.model;

import java.io.Serializable;

public class TLycInfoClassified implements Serializable {
    private String infoId;

    private String classifiedId;

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
    }

    public String getClassifiedId() {
        return classifiedId;
    }

    public void setClassifiedId(String classifiedId) {
        this.classifiedId = classifiedId == null ? null : classifiedId.trim();
    }
}