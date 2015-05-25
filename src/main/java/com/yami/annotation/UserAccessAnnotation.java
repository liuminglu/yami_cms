package com.yami.annotation;

/**
 * Created by hackcoder on 2015/5/24.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UserAccessAnnotation {
    public ISLOGIN isLogin();
}
