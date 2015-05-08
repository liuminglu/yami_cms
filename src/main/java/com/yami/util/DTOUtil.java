package com.yami.util;

import java.lang.reflect.Field;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Assert;

import com.yami.annotation.PrimaryKey;

public class DTOUtil {

	/**
	 * 根据注解寻找Entity主键并通过反射赋值一个随机生成的32位的字符串
	 * 
	 * @param entity
	 * @author Liuminglu
	 * @Date 2015年5月7日 下午2:43:42
	 */
	public static void primaryKeyValueGenerator(Object entity) {
		Assert.notNull(entity, "The param(entity) can't be null");
		// 获取entity的所有属性
		Field[] fields = entity.getClass().getDeclaredFields();
		for (Field field : fields) {
			// 判断属性是否有“@PrimaryKey”的注解
			boolean isPrimaryKey = field.isAnnotationPresent(PrimaryKey.class);
			if (isPrimaryKey) {
				try {
					// 放开字段的读写权限，默认是只能对public的属性进行读写
					field.setAccessible(true);
					Object fieldValue = field.get(entity);
					if (fieldValue == null || StringUtils.isBlank(fieldValue.toString())) {
						field.set(entity, UUIDGenerator.getUUID());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}
}
