<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>丫米厨房</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="lib/jquery.min.js"></script>
    <link href="backres/css/login2.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<h1>丫米厨房后台管理<sup>V2015</sup></h1>

<div class="login" style="margin-top:50px;">

    <div class="header">
        <div class="switch" id="switch"><a class="switch_btn_focus" id="switch_qlogin" href="javascript:void(0);"
                                           tabindex="7">快速登录</a>
            <!--<a class="switch_btn" id="switch_login" href="javascript:void(0);" tabindex="8">快速注册</a><div class="switch_bottom" id="switch_bottom" style="position: absolute; width: 64px; left: 0px;"></div>-->
        </div>
    </div>


    <div class="web_qr_login" id="web_qr_login" style="display: block; height: 235px;">

        <!--登录-->
        <div class="web_login" id="web_login">


            <div class="login-box">


                <div class="login_form">
                    <form action="#" onsubmit="login()" name="loginform" accept-charset="utf-8" id="login_form"
                          class="loginForm" method="post"><input type="hidden" name="did" value="0"/>
                        <input type="hidden" name="to" value="log"/>

                        <div class="uinArea" id="uinArea">
                            <label class="input-tips" for="username">帐号：</label>

                            <div class="inputOuter" id="uArea">

                                <input type="text" id="username" name="username" class="inputstyle"/>
                            </div>
                        </div>
                        <div class="pwdArea" id="pwdArea">
                            <label class="input-tips" for="password">密码：</label>

                            <div class="inputOuter" id="pArea">

                                <input type="password" id="password" name="password" class="inputstyle"/>
                            </div>
                        </div>

                        <div style="padding-left:50px;margin-top:20px;"><input type="submit" onclick="return login()" value="登 录"
                                                                               style="width:150px;"
                                                                               class="button_blue"/></div>
                    </form>
                </div>

            </div>

        </div>
        <!--登录end-->
    </div>


</div>
<!--注册end-->
</div>


<div class="jianyi">*推荐使用ie8或以上版本ie浏览器或Chrome内核浏览器访问本站</div>
<script type="application/javascript" src="backres/js/login.js"></script>
</body>
</html>