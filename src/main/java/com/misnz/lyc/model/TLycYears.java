package com.misnz.lyc.model;

import java.io.Serializable;

public class TLycYears implements Serializable {
    private String yearsCode;

    private Integer caseCount;

    public String getYearsCode() {
        return yearsCode;
    }

    public void setYearsCode(String yearsCode) {
        this.yearsCode = yearsCode == null ? null : yearsCode.trim();
    }

    public Integer getCaseCount() {
        return caseCount;
    }

    public void setCaseCount(Integer caseCount) {
        this.caseCount = caseCount;
    }
}