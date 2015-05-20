package com.yami.service.impl;

import com.yami.domain.merchant.Product;
import com.yami.mapper.MerchantMapper;
import com.yami.mapper.ProductMapper;
import com.yami.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;


	public List<Product> getProductsByVerifyStatus(int status, int from, int size) {
		return productMapper.getProductsByVerifyStatus(status,from,size);
	}

	public long countProductsByVerifyStatus(int status) {
		return productMapper.countProductsByVerifyStatus(status);
	}

	public void passProduct(long id) {
		productMapper.passProduct(id);
	}

	public void rejectProduct(long id) {
		productMapper.rejectProduct(id);
	}

	public void saveAndPass(Product product) {
		productMapper.saveAndPass(product);
	}
}
