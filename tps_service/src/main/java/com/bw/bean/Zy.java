package com.bw.bean;

import java.util.Date;

public class Zy {

       private  Integer wid;
       private String wname;
       private Date wcreated;
       private String xc;
       private String name;
       private String tel;
       private String pic;
       private String  bz;
       private Integer zid;

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public void setWcreated(Date wcreated) {
        this.wcreated = wcreated;
    }

    public void setXc(String xc) {
        this.xc = xc;
    }

    @Override
    public String toString() {
        return "Zy{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", wcreated=" + wcreated +
                ", xc='" + xc + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", pic='" + pic + '\'' +
                ", bz='" + bz + '\'' +
                ", zid=" + zid +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public Integer getWid() {
        return wid;
    }

    public String getWname() {
        return wname;
    }

    public Date getWcreated() {
        return wcreated;
    }

    public String getXc() {
        return xc;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getPic() {
        return pic;
    }

    public String getBz() {
        return bz;
    }

    public Integer getZid() {
        return zid;
    }
}
