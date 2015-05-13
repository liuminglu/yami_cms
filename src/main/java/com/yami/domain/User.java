package com.yami.domain;

import java.util.Date;

/**
 * Created by Johnson on 2015/4/22.
 */
public class User extends BaseDomain {
    private static final long serialVersionUID = -3383759896372171236L;
    private Long id;
    private String username;
    private Integer type = 0;//0 客户端用户 ,1 商户
    private boolean firstPay;
    private String headPic;
    private String nickName;
    private Integer gender;
    private String password;
    private String payPassword;
    private String description;
    private Date registerDate;
    private Integer status;
    private String city;
    private String region;
    private String bindingPhone;

    public User() {
    }

    public User(String userName, String password) {
        this.username = userName;
        this.password = password;
    }

    public User(String username, String headPic, Integer gender, String region, String description){
        this.username = username;
        this.headPic = headPic;
        this.gender = gender;
        this.region = region;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public boolean isFirstPay() {
        return firstPay;
    }

    public void setFirstPay(boolean firstPay) {
        this.firstPay = firstPay;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getBindingPhone() {
        return bindingPhone;
    }

    public void setBindingPhone(String bindingPhone) {
        this.bindingPhone = bindingPhone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
