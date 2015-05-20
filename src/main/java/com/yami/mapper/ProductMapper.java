package com.yami.mapper;

import com.yami.domain.merchant.Product;

import java.util.List;

public interface ProductMapper {
    public List<Product> getProductsByVerifyStatus(int verifyStatus,int from,int pageSize);
    public long countProductsByVerifyStatus(int verifyStatus);
    public void passProduct(long id);
    public void rejectProduct(long id);
    public void saveAndPass(Product product);
}
