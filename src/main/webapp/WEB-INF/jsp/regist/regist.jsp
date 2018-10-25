<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>代码在线编辑工具</title>
<link rel="stylesheet" type="text/css" href="../static/css/layui.css" media="all">
<link rel="stylesheet" type="text/css" href="../static/css/login.css" media="all">
<script type="text/javascript" src="../static/js/layui.all.js"></script>
<script type="text/javascript" src="../static/js/login.js"></script>
<script type="text/javascript" src="../static/js/jscode/regist.js"></script>
<script type="text/javascript" src="../static/js/jparticle.jquery.js"></script>
</head>
<body>
  <div class="layui-canvs"></div>
<div class="layui-layout layui-layout-login">
  <form action="regist.do" method="post" id="registuserInfo">
	<h1>
		 <strong>代码在线编辑工具</strong>
		 <em>Online Code Editing Tool</em>
	</h1>
	<div class="layui-user-icon larry-login">
		 <input type="text" placeholder="用户名" class="login_txtbx" name="username" id="username" value="${username}"/>
	</div>
	<div class="layui-pwd-icon larry-login">
		 <input type="password" placeholder="密码" class="login_txtbx" name="pwd" id="pwd" value="${pwd}"/>
	</div>
	<div class="layui-pwd-icon larry-login">
		 <input type="password" placeholder="确认密码" class="login_txtbx" name="pwds" id="pwds" value="${pwds}"/>
	</div>
	<%-- <div class="layui-phone-icon larry-login">
   		<input type="text" placeholder="电话号码" class="login_txtbx" name="telephone" id="telephone" value="${telephone}"/>
    </div> --%>
    <div class="layui-phone-icon larry-login">
   		<input type="text" placeholder="QQ邮箱" class="login_txtbx" name="qqemail" id="qqemail" value="${email}"/>
    </div>
    <div class="layui-submit larry-login">
    	<input type="button" value="立即注册" class="submit_btn" onclick="doformSub();"/>
    </div>
    <div class="layui-login-text">
    	<p class="layui-login-text_pone">已有账号?<a href="login.do">立即登录</a></p>
    	<p class="layui-regist-text-error" id="messageinfo">${message}</p>
    </div>
    <div class="layui-login-text">
    	<p>© 2016-2017  版权所有</p>
        <p>滇www.itblogger.cn</p>
    </div>
    </form>
</div>
<script type="text/javascript">
$(function(){
	$(".layui-canvs").jParticle({
		background: "#141414",
		color: "#E6E6E6",
	});
});
//提交请求
 function doformSub(){
	 var formid = "registuserInfo";
	 doSubmit(formid);
 };
</script>
</body>
</html>