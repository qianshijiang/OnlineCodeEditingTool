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
<script type="text/javascript" src="../static/js/jparticle.jquery.js"></script>
</head>
<body>
  <div class="layui-canvs"></div>
<div class="layui-layout layui-layout-login">
  <form action="tologins.do" method="post">
	<h1>
		 <strong>代码在线编辑工具</strong>
		 <em>Online Code Editing Tool</em>
	</h1>
	<div class="layui-user-icon larry-login">
		 <input type="text" placeholder="用户名" class="login_txtbx" name="username" value="${username}"/>
	</div>
	<div class="layui-pwd-icon larry-login">
		 <input type="password" placeholder="密码" class="login_txtbx" name="pwd" value="${pwd}"/>
	</div>
    <div class="layui-val-icon larry-login">
    	<div class="layui-code-box">
    		<input type="text" id="code" name="code" placeholder="验证码" maxlength="4" class="login_txtbx" value="${code}">
            <img src="../createImage.do" alt="点击更换" title="点击更换" class="verifyImg" id="verifyImg" onClick="javascript:this.src='../createImage.do?x='+Math.random();">
    	</div>
    </div>
    <div class="layui-submit larry-login">
    	<input type="submit" value="立即登陆" class="submit_btn"/>
    </div>
    <div class="layui-login-text">
    	<p class="layui-login-text_pone"><a href="toupdatepas.do">忘记密码?</a></p>
        <p class="layui-login-text_ptwo">没有账号?&nbsp;<a href="toregist.do">立即注册</a></p>
    </div>
    <div class="layui-login-text-error"><p>${message}</p></div>
    <div class="layui-login-text">
    	<p>© 2018-2019  版权所有</p>
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
</script>
</body>
</html>