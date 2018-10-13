package com.smart.domain;

import java.util.Date;

public class TycDoc {
    private Integer id;

    private String docTitle;

    private String xyDm;

    private String registerNo;

    private String zzjgDm;

    private String gpDm;

    private String province;

    private String city;

    private String comType;

    private String hy;

    private String fdDbr;

    private String zczb;

    private Date zcTime;

    private String jyfw;

    private String addr;

    private String phone;

    private String tel;

    private String email;

    private String comNet;

    private String comStat;

    private Date creTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocTitle() {
        return docTitle;
    }

    public void setDocTitle(String docTitle) {
        this.docTitle = docTitle == null ? null : docTitle.trim();
    }

    public String getXyDm() {
        return xyDm;
    }

    public void setXyDm(String xyDm) {
        this.xyDm = xyDm == null ? null : xyDm.trim();
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo == null ? null : registerNo.trim();
    }

    public String getZzjgDm() {
        return zzjgDm;
    }

    public void setZzjgDm(String zzjgDm) {
        this.zzjgDm = zzjgDm == null ? null : zzjgDm.trim();
    }

    public String getGpDm() {
        return gpDm;
    }

    public void setGpDm(String gpDm) {
        this.gpDm = gpDm == null ? null : gpDm.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getComType() {
        return comType;
    }

    public void setComType(String comType) {
        this.comType = comType == null ? null : comType.trim();
    }

    public String getHy() {
        return hy;
    }

    public void setHy(String hy) {
        this.hy = hy == null ? null : hy.trim();
    }

    public String getFdDbr() {
        return fdDbr;
    }

    public void setFdDbr(String fdDbr) {
        this.fdDbr = fdDbr == null ? null : fdDbr.trim();
    }

    public String getZczb() {
        return zczb;
    }

    public void setZczb(String zczb) {
        this.zczb = zczb == null ? null : zczb.trim();
    }

    public Date getZcTime() {
        return zcTime;
    }

    public void setZcTime(Date zcTime) {
        this.zcTime = zcTime;
    }

    public String getJyfw() {
        return jyfw;
    }

    public void setJyfw(String jyfw) {
        this.jyfw = jyfw == null ? null : jyfw.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getComNet() {
        return comNet;
    }

    public void setComNet(String comNet) {
        this.comNet = comNet == null ? null : comNet.trim();
    }

    public String getComStat() {
        return comStat;
    }

    public void setComStat(String comStat) {
        this.comStat = comStat == null ? null : comStat.trim();
    }

    public Date getCreTime() {
        return creTime;
    }

    public void setCreTime(Date creTime) {
        this.creTime = creTime;
    }
}