package com.yami.action.merchant;

import com.yami.action.BaseAction;
import com.yami.action.PageResult;
import com.yami.annotation.ISLOGIN;
import com.yami.annotation.UserAccessAnnotation;
import com.yami.domain.merchant.Merchant;
import com.yami.service.MerchantService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by hackcoder on 2015/5/11.
 */
public class MerchantAction extends BaseAction<MerchantDto> {
    private PageResult<Merchant> results;

    @Autowired
    private MerchantService merchantService;

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String unCheckedMerchants() {
        List<Merchant> merchants = merchantService.getMerchantsByVerifyStatus(0, (model.getPage() - 1) * model.getRows(), model.getRows());
        long total = merchantService.countMerchantsByVerifyStatus(0);
        results = new PageResult<Merchant>(merchants, total);
        return SUCCESS;
    }

    /**
     * 审核通过的商户，自由开店管理
     * @return
     */
    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String autoOpenMerchants(){
        List<Merchant> merchants = merchantService.getMerchantsByVerifyStatus(1, (model.getPage() - 1) * model.getRows(), model.getRows());
        long total = merchantService.countMerchantsByVerifyStatus(1);
        results = new PageResult<Merchant>(merchants, total);
        return SUCCESS;
    }

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String getMerchants() {
        long total = merchantService.countMerchants(model);
        results = new PageResult<Merchant>(merchantService.getMerchants(model), total);
        return SUCCESS;
    }

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String saveAndPass() throws InvocationTargetException, IllegalAccessException {
        Merchant merchant = new Merchant();
        BeanUtils.copyProperties(merchant, model);
        merchantService.saveAndPass(merchant);
        return SUCCESS;
    }

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String confirmAutoOpenMerchants(){
        merchantService.comfirmAutoOpenMerchants(model.getIds(),model.getIsAutoOpens(),model.getIsRests());
        return SUCCESS;
    }

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String update() throws InvocationTargetException, IllegalAccessException {
        Merchant merchant = new Merchant();
        BeanUtils.copyProperties(merchant, model);
        merchantService.update(merchant);
        return SUCCESS;
    }

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String pass() {
        merchantService.passMerchant(model.getId());
        return SUCCESS;
    }

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String reject() {
        merchantService.rejectMerchant(model.getId());
        return SUCCESS;
    }

    public PageResult<Merchant> getResults() {
        return results;
    }

    public void setResults(PageResult<Merchant> results) {
        this.results = results;
    }

}
