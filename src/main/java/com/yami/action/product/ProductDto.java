package com.yami.action.product;

import com.yami.action.BaseDto;

import java.util.Date;

/**
 * Created by hackcoder on 2015/5/11.
 */
public class ProductDto extends BaseDto{

    private String name;
    private Long price;
    private String summary;
    private String pictures;
    private String tags;
    private Integer supplyPerDay;
    private Boolean main = false;

    private Integer verifyStatus;
    //前端查询条件
    private Date createFrom;
    private Date createTo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getSupplyPerDay() {
        return supplyPerDay;
    }

    public void setSupplyPerDay(Integer supplyPerDay) {
        this.supplyPerDay = supplyPerDay;
    }

    public Boolean getMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Date getCreateFrom() {
        return createFrom;
    }

    public void setCreateFrom(Date createFrom) {
        this.createFrom = createFrom;
    }

    public Date getCreateTo() {
        return createTo;
    }

    public void setCreateTo(Date createTo) {
        this.createTo = createTo;
    }
}
