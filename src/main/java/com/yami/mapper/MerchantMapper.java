package com.yami.mapper;

import com.yami.domain.merchant.Merchant;

import java.util.List;

public interface MerchantMapper {
	public List<Merchant> getMerchantsByVerifyStatus(int verifyStatus,int from,int pageSize);
	public long countMerchantsByVerifyStatus(int verifyStatus);
	public void passMerchant(long id);
	public void rejectMerchant(long id);
	public void saveAndPass(Merchant merchant);
}
