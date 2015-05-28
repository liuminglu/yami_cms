package com.yami.action.permission;

import com.opensymphony.xwork2.ActionContext;
import com.yami.action.BaseAction;
import com.yami.action.user.UserDto;
import com.yami.annotation.ISLOGIN;
import com.yami.annotation.UserAccessAnnotation;
import com.yami.exception.NoPermissionException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import javax.servlet.http.HttpSession;
import java.util.Map;


/**
 * Created by hackcoder on 2015/5/24.
 */
@Aspect
public class PermissionAspect extends BaseAction<UserDto> {

    @Before(value = "@annotation(userAccessAnnotation)", argNames = "userAccessAnnotation")
    public void checkPermission(UserAccessAnnotation userAccessAnnotation)
            throws Exception {

        ISLOGIN isLogin = userAccessAnnotation.isLogin();
        ActionContext actionContext = ActionContext.getContext();
        Map session = actionContext.getSession();
        boolean login = session.get("login")==null?false: (boolean) session.get("login");
        if (isLogin.equals(ISLOGIN.YES) && login == false) {
            throw new NoPermissionException("user_no_permission_error");
        }
    }


}
