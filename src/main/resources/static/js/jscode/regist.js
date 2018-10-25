/**
 * create 2018-1-15
 * describe 注册账户时提供发送请求方法,对数据进行校验
 */
function doSubmit(formid){
	var username = $("#username").val();
	var pwd = $("#pwd").val();
	var pwds = $("#pwds").val();
	//var telephone = $("#telephone").val();
	var qqemail = $("#qqemail").val();
	if(!(/^[a-zA-Z0-9_-]{4,16}$/.test(username))){
		
		$("#messageinfo").html("用户名为4-16位的字母、数字");
		
	}else if(!(/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,18}$/.test(pwd))){
		
		$("#messageinfo").html("密码为6-18位的字母和数字的组合,不能为纯数字或字母");
		
	}else if(!(/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,18}$/.test(pwds))){
		
		$("#messageinfo").html("密码为6-18位的字母和数字的组合,不能为纯数字或字母");
		
	}else if(pwd!=pwds){
		
		$("#messageinfo").html("密码和确认密码不同");
		
	}else if(!(/^\d{5,12}@([q]{2}|[Q]{2})\.com$/.test(qqemail))){
		
		$("#messageinfo").html("QQ邮箱地址有误");
		
	}/*else if(!(/^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\d{8}$/.test(telephone))){
		
		$("#messageinfo").html("电话号码输入有误");
		
	}*/else{
		$.ajax({
			type:'post',
			dataType:'json',
			data:$("#"+formid).serialize(),
			url:$("#"+formid).attr("action"),
			success:function(data){
				if(data){
					$(".layui-regist-text-error").css("color","#53c6b0");
					$("#username").val(data["worduser"].name);
					$("#telephone").val(data["worduser"].telephone);
					$("#qqemail").val(data["worduser"].email);
					$("#messageinfo").html(data["message"]);
				}
			},
			error:function(){
				$(".layui-regist-text-error").css("color","#53c6b0");
				$("#messageinfo").html("系统繁忙,请稍后重试");
			}
		});
	}
};