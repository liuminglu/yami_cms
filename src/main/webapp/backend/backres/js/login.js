/**
 * Created by hackcoder on 2015/5/24.
 */


function login(){
    console.log('login');
    $.post(
        '../user.login.do',
        {
            username:$('#username').val(),
            password:$('#password').val()
        },
        function(result){
            if(result.login==true){
                window.location = 'index.jsp';
            }else{
                alert("用户名或密码错误！");
            }
        }
    );
    return false;
}