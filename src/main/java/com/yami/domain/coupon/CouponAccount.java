package com.yami.domain.coupon;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by johnson1 on 5/4/15.
 */
public class CouponAccount implements Serializable {
    private static final long serialVersionUID = 7551158425529385813L;
    private Long id;
    private String mobile;
    private Long uid;
    private boolean available;
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
