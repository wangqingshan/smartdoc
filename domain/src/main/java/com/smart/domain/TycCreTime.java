package com.smart.domain;

import java.util.Date;

public class TycCreTime {
    private Integer id;

    private Date time;

    private Integer countNow;

    private Integer countFix;

    private Integer countFixOper;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getCountNow() {
        return countNow;
    }

    public void setCountNow(Integer countNow) {
        this.countNow = countNow;
    }

    public Integer getCountFix() {
        return countFix;
    }

    public void setCountFix(Integer countFix) {
        this.countFix = countFix;
    }

    public Integer getCountFixOper() {
        return countFixOper;
    }

    public void setCountFixOper(Integer countFixOper) {
        this.countFixOper = countFixOper;
    }
}