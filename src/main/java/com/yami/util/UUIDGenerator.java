package com.yami.util;

import java.util.UUID;

public class UUIDGenerator {
	/**
	 * 获取一个不带"-"的纯32位的UUID
	 * @return
	 * @author Liuminglu
	 * @Date 2014年12月19日 下午6:29:04
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
