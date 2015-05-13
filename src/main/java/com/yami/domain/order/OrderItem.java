package com.yami.domain.order;

import com.yami.domain.merchant.Product;

import java.io.Serializable;

/**
 * Created by Johnson on 2015/4/22.
 */
public class OrderItem implements Serializable {
    private static final long serialVersionUID = -1970139687740352118L;
    private Long id;
    private String orderNo;
    private Long productId;
    private String name;
    private Long price;
    private Integer quantity;
    private Long amount;

    public OrderItem() {
    }

    public OrderItem(Product product, Integer quantity) {
        this();
        this.productId = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public Long getAmount() {
        return price * quantity;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
