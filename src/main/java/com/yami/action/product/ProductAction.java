package com.yami.action.product;

import com.yami.action.BaseAction;
import com.yami.action.PageResult;
import com.yami.annotation.ISLOGIN;
import com.yami.annotation.UserAccessAnnotation;
import com.yami.domain.merchant.Product;
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

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String unCheckedProducts(){
        List<Product> products = productService.getProductsByVerifyStatus(0, (model.getPage() - 1) * model.getRows(), model.getRows());
        long total =  productService.countProductsByVerifyStatus(0);
        results = new PageResult<Product>(products,total);
        return SUCCESS;
    }

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String getProducts(){
        long total = productService.countProducts(model);
        results = new PageResult<Product>(productService.getProducts(model), total);
        return SUCCESS;
    }

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String saveAndPass() throws InvocationTargetException, IllegalAccessException {
        Product product = new Product();
        BeanUtils.copyProperties(product,model);
        productService.saveAndPass(product);
        return SUCCESS;
    }

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String update() throws InvocationTargetException, IllegalAccessException {
        Product product = new Product();
        BeanUtils.copyProperties(product,model);
        productService.update(product);
        return SUCCESS;
    }

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String pass(){
        productService.passProduct(model.getId());
        return SUCCESS;
    }

    @UserAccessAnnotation(isLogin = ISLOGIN.YES)
    public String reject(){
        productService.rejectProduct(model.getId());
        return SUCCESS;
    }

}
