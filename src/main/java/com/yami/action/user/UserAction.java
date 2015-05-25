package com.yami.action.user;

import com.yami.action.BaseAction;
import com.yami.annotation.ISLOGIN;
import com.yami.annotation.UserAccessAnnotation;
import com.yami.domain.member.Manager;
import com.yami.service.UserService;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class UserAction extends BaseAction<UserDto> {

	private static final long serialVersionUID = 1L;
	private Map<String,Object> results = new HashMap<String, Object>();

	public Map<String, Object> getResults() {
		return results;
	}

	public void setResults(Map<String, Object> results) {
		this.results = results;
	}

	@Autowired
	private UserService userService ;

	@UserAccessAnnotation(isLogin = ISLOGIN.NO)
	public String register() throws InvocationTargetException, IllegalAccessException {
		Manager manager = new Manager();
		BeanUtils.copyProperties(manager,model);
		if(userService.getManagerByName(manager.getUsername())==null){
			manager.setPassword(new Md5PasswordEncoder().encodePassword(manager.getPassword(), "yami"));
			userService.registerManager(manager);
		}
		return SUCCESS;
	}
	@UserAccessAnnotation(isLogin = ISLOGIN.NO)
	public String login() throws InvocationTargetException, IllegalAccessException {
		Manager manager = new Manager();
		BeanUtils.copyProperties(manager, model);
		Manager managerdb = userService.getManagerByName(manager.getUsername());
		if(managerdb!=null&&managerdb.getPassword().equals((new Md5PasswordEncoder().encodePassword(manager.getPassword(),"yami")))){
			session.setAttribute("login",true);
			session.setAttribute("username",manager.getUsername());
			results.put("login",true);
		}else{
			results.put("login",false);
			session.invalidate();
		}
		return SUCCESS;
	}
	

}
