package com.yami.service.impl;

import com.yami.domain.merchant.Merchant;
import com.yami.mapper.MerchantMapper;
import com.yami.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("merchantService")
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	private MerchantMapper merchantMapper;

	public List<Merchant> getMerchantByVerifyStatus(int status, int page, int size) {
		return merchantMapper.getMerchantsByVerifyStatus(status,page,size);
	}

	public long countMerchantByVerifyStatus(int status) {
		return merchantMapper.countMerchantsByVerifyStatus(status);
	}

	public void passMerchant(long id) {
		merchantMapper.passMerchant(id);
	}

	public void rejectMerchant(long id) {
		merchantMapper.rejectMerchant(id);
	}
}
