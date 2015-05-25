package com.yami.mapper;

import com.yami.action.product.ProductDto;
import com.yami.domain.merchant.Product;

import java.util.List;

public interface ProductMapper {
    public Product getProductById(long id);
    public List<Product> getProductsByVerifyStatus(int verifyStatus,int from,int pageSize);
    public long countProductsByVerifyStatus(int verifyStatus);
    public void passProduct(long id);
    public void rejectProduct(long id);
    public void saveAndPass(Product product);
    public void update(Product product);
    public long countProducts(ProductDto productDto);
    public List<Product> getProducts(ProductDto productDto);
}
