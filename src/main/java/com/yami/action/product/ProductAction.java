package com.yami.action.product;

import com.yami.action.BaseAction;
import com.yami.action.PageResult;
import com.yami.domain.merchant.Merchant;
import com.yami.domain.merchant.Product;
import com.yami.service.MerchantService;
import com.yami.service.ProductService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by hackcoder on 2015/5/11.
 */
public class ProductAction extends BaseAction<ProductDto> {
    private PageResult<Product> results ;

    public PageResult<Product> getResults() {
        return results;
    }

    public void setResults(PageResult<Product> results) {
        this.results = results;
    }

    @Autowired
    private ProductService productService;

    public String unCheckedProducts(){
        List<Product> products = productService.getProductsByVerifyStatus(0, (model.getPage() - 1) * model.getRows(), model.getRows());
        long amount =  productService.countProductsByVerifyStatus(0);
        results = new PageResult<Product>(products,amount);
        return SUCCESS;
    }

    /**
     * 更新产品类并审核通过
     * @return
     */
    public String saveAndPass() throws InvocationTargetException, IllegalAccessException {
        Product product = new Product();
        BeanUtils.copyProperties(product,model);
        productService.updateBaseInformation(product);//更新基本信息
       // productService.passProduct(model.getId());//审核通过
        return SUCCESS;
    }
    public String pass(){
        productService.passProduct(model.getId());
        return SUCCESS;
    }

    public String reject(){
        productService.rejectProduct(model.getId());
        return SUCCESS;
    }

}
