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
<script type="text/javascript" src="../static/js/jscode/updatepas.js"></script>
<script type="text/javascript" src="../static/js/jparticle.jquery.js"></script>
</head>
<body>
 <div class="layui-canvs"></div>
<div class="layui-layout layui-layout-login">
  <form action="findpwd.do" method="post" id="toupdatepassInfo" onkeydown="if(event.keyCode==13)return false;" >
	<h1>
		 <strong>代码在线编辑工具</strong>
		 <em>Online Code Editing Tool</em>
	</h1>
	<div class="layui-phone-icon larry-login">
   		<input type="text" placeholder="QQ邮箱" class="login_txtbx" name="email" id="email"/>
    </div> 
	
    <div class="layui-submit larry-login">
    	<input type="button" value="立即提交" class="submit_btn" onclick="doformSub();"/>
    </div>
    <div class="layui-login-text">
    	<p class="layui-login-text_pone">返回登录?<a href="login.do">立即登录</a></p>
    	<p class="layui-regist-text-error" id="messageinfo">${message}</p>
    </div>
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
//提交请求
function doformSub(){
	 var formid = "toupdatepassInfo";
	 doSubmit(formid);
};
</script>
</body>
</html>