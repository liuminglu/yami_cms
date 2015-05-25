package com.yami.aop.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by hackcoder on 2015/5/24.
 */
@Aspect
public class SystemArchitecture {
    @Pointcut("@annotation(com.yami.annotation.UserAccessAnnotation)")
    public void userAccess() {}
}
