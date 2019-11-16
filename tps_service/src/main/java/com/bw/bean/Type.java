package com.bw.bean;

public class Type {

    private Integer  zid;
    private String zname;

    @Override
    public String toString() {
        return "Type{" +
                "zid=" + zid +
                ", zname='" + zname + '\'' +
                '}';
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public Integer getZid() {
        return zid;
    }

    public String getZname() {
        return zname;
    }
}
