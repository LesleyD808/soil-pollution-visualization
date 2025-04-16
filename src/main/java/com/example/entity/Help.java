package com.example.entity;

import java.io.Serializable;

/**
 * 土壤评价信息
 */
public class Help implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;
    /** 研究事项 */
    private String name;
    /** 研究内容 */
    private String content;
    /** 取样图片 */
    private String img;
    /** 取样地点 */
    private String location;
    /** 经度 */
    private String longitude;
    /** 纬度 */
    private String latitude;
    /** 取样时间 */
    private String time;
    /** 综合污染评级 */
    private String type;
    private String userName;
    /** 研究员名称 */
    private Integer userId;
    /** 联系方式 */
    private String phone;
    /** 镉单因子指数 */
    private Double indesCd;
    /** 汞单因子指数 */
    private Double indesHg;
    /** 砷单因子指数 */
    private Double indesAs;
    /** 铅单因子指数 */
    private Double indesPb;
    /** 铬单因子指数 */
    private Double indesCr;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getIndesHg() {
        return indesHg;
    }

    public void setIndesHg(Double indesHg) {
        this.indesHg = indesHg;
    }

    public Double getIndesCd() {
        return indesCd;
    }

    public void setIndesCd(Double indesCd) {
        this.indesCd = indesCd;
    }

    public Double getIndesAs() {
        return indesAs;
    }

    public void setIndesAs(Double indesAs) {
        this.indesAs = indesAs;
    }

    public Double getIndesPb() {
        return indesPb;
    }

    public void setIndesPb(Double indesPb) {
        this.indesPb = indesPb;
    }

    public Double getIndesCr() {
        return indesCr;
    }

    public void setIndesCr(Double indesCr) {
        this.indesCr = indesCr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}