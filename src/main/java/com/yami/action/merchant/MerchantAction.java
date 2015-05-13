package com.yami.action.merchant;

import com.yami.action.BaseAction;
import com.yami.action.PageResult;
import com.yami.domain.merchant.Merchant;
import com.yami.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hackcoder on 2015/5/11.
 */
public class MerchantAction extends BaseAction<MerchantDto> {
    private PageResult<Merchant> results ;

    public PageResult<Merchant> getResults() {
        return results;
    }

    public void setResults(PageResult<Merchant> results) {
        this.results = results;
    }

    @Autowired
    private MerchantService merchantService;

    public String unCheckedMerchants(){
        List<Merchant> merchants = merchantService.getMerchantByVerifyStatus(0, (model.getPage()-1)*model.getRows(), model.getRows());
        long amount =  merchantService.countMerchantByVerifyStatus(0);
        results = new PageResult<Merchant>(merchants,amount);
        return SUCCESS;
    }

    public String pass(){
        merchantService.passMerchant(model.getId());
        return SUCCESS;
    }

    public String reject(){
        merchantService.rejectMerchant(model.getId());
        return SUCCESS;
    }

}
