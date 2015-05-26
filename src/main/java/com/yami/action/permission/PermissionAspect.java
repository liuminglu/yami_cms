package com.yami.action.permission;

import com.yami.action.BaseAction;
import com.yami.action.user.UserDto;
import com.yami.annotation.ISLOGIN;
import com.yami.annotation.UserAccessAnnotation;
import com.yami.exception.NoPermissionException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


/**
 * Created by hackcoder on 2015/5/24.
 */
@Aspect
public class PermissionAspect extends BaseAction<UserDto> {

    @Before(value = "@annotation(userAccessAnnotation)", argNames = "userAccessAnnotation")
    public void checkPermission(UserAccessAnnotation userAccessAnnotation)
            throws Exception {

        ISLOGIN isLogin = userAccessAnnotation.isLogin();
        boolean login = false;
        if(session!=null){
            login = session.getAttribute("login")==null?false: (boolean) session.getAttribute("login");
        }
        if (isLogin.equals(ISLOGIN.YES) && login == false) {
            throw new NoPermissionException("user_no_permission_error");
        }
    }


}
