package com.yami.domain.merchant;

import java.io.Serializable;

/**
 * Created by Johnson on 2015/4/22.
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 5001979457200046819L;
    private Long id;
    private Long merchantId;
    private String name;
    private Long price;
    private String summary;
    private String pictures;
    private String availableTime;
    private Long restCount = 0l;
    private String tags;
    private Long soldCount = 0l;
    private Integer supplyPerDay;
    private Long commentCount = 0l;
    private Long favoriteCount = 0l;
    private Boolean available = true;
    private Boolean isDelete = false;
    private Boolean main = false;
    private Integer verifyStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

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

    public String getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
    }

    public Long getRestCount() {
        return restCount;
    }

    public void setRestCount(Long restCount) {
        this.restCount = restCount;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Long getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(Long soldCount) {
        this.soldCount = soldCount;
    }

    public Integer getSupplyPerDay() {
        return supplyPerDay;
    }

    public void setSupplyPerDay(Integer supplyPerDay) {
        this.supplyPerDay = supplyPerDay;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public Long getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
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
}
