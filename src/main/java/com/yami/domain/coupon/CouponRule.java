package com.yami.domain.coupon;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Johnson on 2015/4/22.
 */
public class CouponRule implements Serializable {
    private static final long serialVersionUID = -461378934511020093L;
    private Long id;
    private String name;
    private Double amount;
    private Integer usageCondition;
    private Integer expiredDays;
    private Integer quantity;
    private Date createDate;
    private boolean hasUsed = false;
    private boolean hasExpired = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getUsageCondition() {
        return usageCondition;
    }

    public void setUsageCondition(Integer usageCondition) {
        this.usageCondition = usageCondition;
    }

    public Integer getExpiredDays() {
        return expiredDays;
    }

    public void setExpiredDays(Integer expiredDays) {
        this.expiredDays = expiredDays;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isHasUsed() {
        return hasUsed;
    }

    public void setHasUsed(boolean hasUsed) {
        this.hasUsed = hasUsed;
    }

    public boolean isHasExpired() {
        return hasExpired;
    }

    public void setHasExpired(boolean hasExpired) {
        this.hasExpired = hasExpired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
