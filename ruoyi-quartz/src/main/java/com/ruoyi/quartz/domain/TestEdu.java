package com.ruoyi.quartz.domain;

import java.io.Serializable;

public class TestEdu implements Serializable {

    private static final long serialVersionUID = 1L;

    private String reqInfo;
    private String resultInfo;


    public String getReqInfo() {
        return reqInfo;
    }

    public void setReqInfo(String reqInfo) {
        this.reqInfo = reqInfo;
    }

    public String getResultInfo() {
        return resultInfo;
    }

    public void setResultInfo(String resultInfo) {
        this.resultInfo = resultInfo;
    }
}
