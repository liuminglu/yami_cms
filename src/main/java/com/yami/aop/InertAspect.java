package com.yami.aop;

import org.aspectj.lang.JoinPoint;

import com.yami.util.DomainUtil;

public class InertAspect {
	
	/**
	 * 执行insert之前为存储对象生成主键
	 * @param joinPoint
	 * @author Liuminglu
	 * @Date 2015年5月8日 上午11:44:58
	 */
	public void beforeInsert(JoinPoint joinPoint) {
		// 得到被拦截方法参数
		Object[] args = joinPoint.getArgs();
		if (args != null && args.length > 0) {
			DomainUtil.primaryKeyValueGenerator(args[0]);
		}
		// 得到被拦截方法名
		// System.out.println(joinPoint.getSignature().getName());
	}

}
