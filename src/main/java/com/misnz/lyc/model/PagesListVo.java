package com.misnz.lyc.model;

import java.io.Serializable;


public class PagesListVo<T> implements Serializable {

    private Integer pages=1;

    private T data;

    private long records=0;
    private  Integer currentPage=1;
    private  String minMonth="99999999";
    private  String maxMonth="00000000";


    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getRecords() {
        return records;
    }

    public void setRecords(long records) {
        this.records = records;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getMinMonth() {
        return minMonth;
    }

    public void setMinMonth(String minMonth) {
        this.minMonth = minMonth;
    }

    public String getMaxMonth() {
        return maxMonth;
    }

    public void setMaxMonth(String maxMonth) {
        this.maxMonth = maxMonth;
    }
}
