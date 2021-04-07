package com.misnz.lyc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OutPutInfoFileVo extends OutPutInfoVo implements Serializable {


    private List<TLycInfoFile> infoFileList=new ArrayList<>();



    public List<TLycInfoFile> getInfoFileList() {
        return infoFileList;
    }

    public void setInfoFileList(List<TLycInfoFile> infoFileList) {
        this.infoFileList = infoFileList;
    }
}