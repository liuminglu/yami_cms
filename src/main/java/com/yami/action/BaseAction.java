package com.yami.action;

import java.lang.reflect.ParameterizedType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * @param <M>
 * 
 * @author LiuMinglu
 */
public class BaseAction<M> extends ActionSupport implements ModelDriven<M> {
	private static final long serialVersionUID = 1L;

	/**
	 * request对象
	 */
	protected HttpServletRequest request = ServletActionContext.getRequest();

	/**
	 * response对象
	 */
	protected HttpServletResponse response = ServletActionContext.getResponse();

	protected M model;

	/**
	 * 构造方法，根据泛型指向的类名实例化该类
	 */
	@SuppressWarnings("unchecked")
	public BaseAction() {
		try {
			Class<M> m = (Class<M>) 
					((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
			this.model = m.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public M getModel() {
		return model;
	}

}
