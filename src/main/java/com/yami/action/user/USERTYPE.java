package com.yami.action.user;

/**
 * Created by hackcoder on 2015/5/22.
 */
public enum  USERTYPE {
    ORIDINARY_USER(0),//普通用户
    MERCHANT_USER(1);//商户
    private int type;
    private USERTYPE(int type){
        this.type = type;
    }

    public int value(){
        return this.type;
    }

    @Override
    public String toString() {
        return "USERTYPE{" +
                "type=" + type +
                '}';
    }
}
