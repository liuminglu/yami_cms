package com.yami.domain.merchant;

import java.io.Serializable;

/**
 * Created by Johnson on 2015/4/22.
 */
public class Merchant implements Serializable {
    private static final long serialVersionUID = 6502202745663309545L;
    private Long id;
    private String name;
    private Integer type;
    private String voiceIntroduction;
    private Double longitude;
    private Double latitude;
    private String address;
    private String headPic;
    private String phone;
    private String pictures;
    private Boolean messHall;
    private Integer countOfMessHall;
    private Boolean selfPickup;
    private Boolean supportDelivery;
    private Boolean isRest = false;
    private String restMark;
    private Integer mLevel = 1;
    private Boolean hasOrder = false;
    private Integer soldCount = 0;
    private Integer monthlySoldCount = 0;
    private String comment;
    private String description;
    private String tags;
    private Long favoriteCount ;
    private Long commentCount = 0l;
    private String distance;
    private Long creator;
    private String businessHours;//8:00-10:00,14:00-18:00
    private String goodCuisine;
    private String businessDayPerWeek;
    private Long deliverFee;
    private String deliverComment;
    private Boolean isDelete = false;
    private Integer verifyStatus = 0;//0  Î´ÉóºË£¬1 ÉóºËÍ¨¹ý 2£¬ÉóºË¾Ü¾ø

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getVoiceIntroduction() {
        return voiceIntroduction;
    }

    public void setVoiceIntroduction(String voiceIntroduction) {
        this.voiceIntroduction = voiceIntroduction;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
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

    public Boolean getIsRest() {
        return isRest;
    }

    public void setIsRest(Boolean isRest) {
        this.isRest = isRest;
    }

    public String getRestMark() {
        return restMark;
    }

    public void setRestMark(String restMark) {
        this.restMark = restMark;
    }

    public Integer getmLevel() {
        return mLevel;
    }

    public void setmLevel(Integer mLevel) {
        this.mLevel = mLevel;
    }

    public Boolean getHasOrder() {
        return hasOrder;
    }

    public void setHasOrder(Boolean hasOrder) {
        this.hasOrder = hasOrder;
    }

    public Integer getSoldCount() {
        return soldCount;
    }

    public void setSoldCount(Integer soldCount) {
        this.soldCount = soldCount;
    }

    public Integer getMonthlySoldCount() {
        return monthlySoldCount;
    }

    public void setMonthlySoldCount(Integer monthlySoldCount) {
        this.monthlySoldCount = monthlySoldCount;
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

    public Long getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(Long favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
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

    public Long getDeliverFee() {
        return deliverFee;
    }

    public void setDeliverFee(Long deliverFee) {
        this.deliverFee = deliverFee;
    }

    public String getDeliverComment() {
        return deliverComment;
    }

    public void setDeliverComment(String deliverComment) {
        this.deliverComment = deliverComment;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }
}
