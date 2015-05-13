package com.yami.domain.account;

import java.io.Serializable;

/**
 * Created by Johnson on 2015/4/22.
 */
public class Account implements Serializable {
    private static final long serialVersionUID = 1613210083709671526L;
    private Long id;
    private Double balance;
    private Double availableBalance;
    private Double cashLimit;
    private Integer methodOfCashFee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Double getCashLimit() {
        return cashLimit;
    }

    public void setCashLimit(Double cashLimit) {
        this.cashLimit = cashLimit;
    }

    public Integer getMethodOfCashFee() {
        return methodOfCashFee;
    }

    public void setMethodOfCashFee(Integer methodOfCashFee) {
        this.methodOfCashFee = methodOfCashFee;
    }
}
