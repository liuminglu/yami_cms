package com.yami.mapper;

import com.yami.action.merchant.MerchantDto;
import com.yami.domain.merchant.Merchant;

import java.util.List;

public interface MerchantMapper {
	public Merchant getMerchantById(long id);
	public List<Merchant> getMerchantsByVerifyStatus(int verifyStatus,int from,int pageSize);
	public long countMerchantsByVerifyStatus(int verifyStatus);
	public void passMerchant(long id);
	public void rejectMerchant(long id);
	public void saveAndPass(Merchant merchant);
	public List<Merchant> getMerchants(MerchantDto merchantDto);
	public long countMerchants(MerchantDto dto);
	public void update(Merchant merchant);
	public void autoOpenMerchant(int id,boolean isAutoOpen,boolean isRest);
}
