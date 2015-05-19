package com.yami.action.product;

import com.yami.action.BaseDto;

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
}
