package com.yami.service;

import com.yami.action.merchant.MerchantDto;
import com.yami.domain.merchant.Merchant;

import java.util.List;

public interface MerchantService {
	public List<Merchant> getMerchantsByVerifyStatus(int status, int from, int size);
	public long countMerchantsByVerifyStatus(int status);
	public void passMerchant(long id);
	public void rejectMerchant(long id);
	public void saveAndPass(Merchant merchant);
	public List<Merchant> getMerchants(MerchantDto dto);
	public long countMerchants(MerchantDto dto);
	public  void update(Merchant merchant);
	public void comfirmAutoOpenMerchants(String ids,String isAutoOpens,String isRest);
}
