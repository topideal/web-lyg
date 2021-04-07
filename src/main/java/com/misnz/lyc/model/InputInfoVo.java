package com.misnz.lyc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InputInfoVo extends TLycInfo implements Serializable {

    private Object classifiedId;
    private Object tagsId;
    private List<TLycInfoFile> infoFileList=new ArrayList<>();

    public Object getClassifiedId() {
        return classifiedId;
    }

    public void setClassifiedId(Object classifiedId) {
        this.classifiedId = classifiedId;
    }

    public Object getTagsId() {
        return tagsId;
    }

    public void setTagsId(Object tagsId) {
        this.tagsId = tagsId;
    }

    public List<TLycInfoFile> getInfoFileList() {
        return infoFileList;
    }

    public void setInfoFileList(List<TLycInfoFile> infoFileList) {
        this.infoFileList = infoFileList;
    }
}