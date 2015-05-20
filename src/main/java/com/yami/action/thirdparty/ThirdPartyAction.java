package com.yami.action.thirdparty;


import com.opensymphony.xwork2.ActionSupport;
import com.qiniu.api.auth.digest.Mac;
import com.qiniu.api.rs.PutPolicy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hackcoder on 2015/5/17.
 */
@Controller
public class ThirdPartyAction extends ActionSupport {
    @Value("#{configProperties['qiniu.access.key']}")
    private String accessKey;
    @Value("#{configProperties['qiniu.secret.key']}")
    private String secretKey;

    Map<String,Object> results = new HashMap<String, Object>();

    public Map<String, Object> getResults() {
        return results;
    }

    public void setResults(Map<String, Object> results) {
        this.results = results;
    }

    public String getQiniuToken() throws Exception{
        Mac mac = new Mac(accessKey, secretKey);
        PutPolicy putPolicy = new PutPolicy("yamichu");
        results.put("uptoken", putPolicy.token(mac));
        return SUCCESS;
    }
}
