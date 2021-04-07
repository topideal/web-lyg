package com.misnz.lyc.model;

import java.io.Serializable;

public class TLycInfoFile implements Serializable {
    private String infoFileId;

    private String infoId;

    private String fileName;

    private Integer isVideo;

    private Integer sortFiled;

    private Long optDate;

    public String getInfoFileId() {
        return infoFileId;
    }

    public void setInfoFileId(String infoFileId) {
        this.infoFileId = infoFileId == null ? null : infoFileId.trim();
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(Integer isVideo) {
        this.isVideo = isVideo;
    }

    public Integer getSortFiled() {
        return sortFiled;
    }

    public void setSortFiled(Integer sortFiled) {
        this.sortFiled = sortFiled;
    }

    public Long getOptDate() {
        return optDate;
    }

    public void setOptDate(Long optDate) {
        this.optDate = optDate;
    }
}