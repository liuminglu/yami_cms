package com.yami.service.impl;

import com.yami.action.merchant.MerchantDto;
import com.yami.action.user.USERTYPE;
import com.yami.domain.User;
import com.yami.domain.merchant.Merchant;
import com.yami.mapper.MerchantMapper;
import com.yami.mapper.UserMapper;
import com.yami.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service("merchantService")
public class MerchantServiceImpl implements MerchantService {

	@Autowired
	private MerchantMapper merchantMapper;
	@Autowired
	private UserMapper userMapper;

	public List<Merchant> getMerchantsByVerifyStatus(int status, int page, int size) {
		return merchantMapper.getMerchantsByVerifyStatus(status, page, size);
	}

	public long countMerchantsByVerifyStatus(int status) {
		return merchantMapper.countMerchantsByVerifyStatus(status);
	}

	public void passMerchant(long id) {
		merchantMapper.passMerchant(id);
		updateUserType(merchantMapper.getMerchantById(id), USERTYPE.MERCHANT_USER);
	}

	public void rejectMerchant(long id) {
		merchantMapper.rejectMerchant(id);
		updateUserType(merchantMapper.getMerchantById(id), USERTYPE.ORIDINARY_USER);
	}

	@Override
	public void saveAndPass(Merchant merchant) {
		merchantMapper.saveAndPass(merchant);
		updateUserType(merchant, USERTYPE.MERCHANT_USER);
	}

	@Override
	public List<Merchant> getMerchants(MerchantDto dto) {
		return merchantMapper.getMerchants(dto);
	}

	@Override
	public long countMerchants(MerchantDto dto) {
		return merchantMapper.countMerchants(dto);
	}

	@Override
	public void update(Merchant merchant) {
		merchantMapper.update(merchant);
	}

	@Override
	public void comfirmAutoOpenMerchants(String ids, String isAutoOpens, String isRest) {
		String[] idArrays = ids.split(",");
		String[] isAutoOpenArrays = isAutoOpens.split(",");
		String[] isRestArrays= isRest.split(",");
		for(int i=0;i<idArrays.length;i++){
			merchantMapper.autoOpenMerchant(Integer.parseInt(idArrays[i]),Boolean.parseBoolean(isAutoOpenArrays[i]),Boolean.parseBoolean(isRestArrays[i]));
		}
	}

	private void updateUserType(Merchant merchant,USERTYPE type){
		User user = userMapper.getUserById(merchant.getCreator());
		userMapper.updateUserType(user.getId(),type.value());
	}
}
