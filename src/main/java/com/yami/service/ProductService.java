package com.yami.service;

import com.yami.action.product.ProductDto;
import com.yami.domain.merchant.Product;

import java.util.List;

public interface ProductService {
	public List<Product> getProductsByVerifyStatus(int status, int from, int size);
	public long countProductsByVerifyStatus(int status);
	public void passProduct(long id);
	public void rejectProduct(long id);
	public void saveAndPass(Product product);
	public void update(Product product);
	public long countProducts(ProductDto productDto);
	public List<Product> getProducts(ProductDto productDto);
}
