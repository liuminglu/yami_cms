package com.yami.action.merchant;

import com.yami.action.BaseDto;
import com.yami.domain.merchant.Merchant;

import java.util.Date;
import java.util.List;

/**
 * Created by hackcoder on 2015/5/11.
 */
public class MerchantDto extends BaseDto{
    private String name;
    private String address;
    private String phone;
    private String pictures;
    private Boolean messHall;
    private Integer countOfMessHall;
    private Boolean selfPickup;
    private Boolean supportDelivery;
    private String comment;
    private String description;
    private String tags;
    private String businessHours;//8:00-10:00,14:00-18:00
    private String goodCuisine;
    private String businessDayPerWeek;
    private Integer verifyStatus;
    private Boolean isRest;
    //前端查询条件
    private Date createFrom;
    private Date createTo;
    private String ids;
    private String isAutoOpens;//逗号分割数组
    private String isRests;//逗号分割数组

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public Boolean getMessHall() {
        return messHall;
    }

    public void setMessHall(Boolean messHall) {
        this.messHall = messHall;
    }

    public Integer getCountOfMessHall() {
        return countOfMessHall;
    }

    public void setCountOfMessHall(Integer countOfMessHall) {
        this.countOfMessHall = countOfMessHall;
    }

    public Boolean getSelfPickup() {
        return selfPickup;
    }

    public void setSelfPickup(Boolean selfPickup) {
        this.selfPickup = selfPickup;
    }

    public Boolean getSupportDelivery() {
        return supportDelivery;
    }

    public void setSupportDelivery(Boolean supportDelivery) {
        this.supportDelivery = supportDelivery;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }

    public String getGoodCuisine() {
        return goodCuisine;
    }

    public void setGoodCuisine(String goodCuisine) {
        this.goodCuisine = goodCuisine;
    }

    public String getBusinessDayPerWeek() {
        return businessDayPerWeek;
    }

    public void setBusinessDayPerWeek(String businessDayPerWeek) {
        this.businessDayPerWeek = businessDayPerWeek;
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

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getIsAutoOpens() {
        return isAutoOpens;
    }

    public void setIsAutoOpens(String isAutoOpens) {
        this.isAutoOpens = isAutoOpens;
    }

    public String getIsRests() {
        return isRests;
    }

    public void setIsRests(String isRests) {
        this.isRests = isRests;
    }

    public Boolean getIsRest() {
        return isRest;
    }

    public void setIsRest(Boolean isRest) {
        this.isRest = isRest;
    }
}
