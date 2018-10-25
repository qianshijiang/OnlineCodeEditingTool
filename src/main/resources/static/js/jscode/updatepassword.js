/*
 * create 2018-1-15
 * describe 修改密码提交方法与校验
 */
function doSubmit(formid){
	var pwdone = $("#pwdone").val(); //新密码
	var pwdtwo = $("#pwdtwo").val();//确认新密码
	if(!(/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,18}$/.test(pwdone))){
		
		$("#messageinfo").html("新密码格式错误,密码为6-18位的字母和数字的组合,不能为纯数字或字母");
		
	}else if(!(/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,18}$/.test(pwdtwo))){
		
		$("#messageinfo").html("确认新密码格式错误,密码为6-18位的字母和数字的组合,不能为纯数字或字母");
	
	
	}else if(pwdone!=pwdtwo){
		
		$("#messageinfo").html("新密码和确认新密码不同");
		
	}else{
		$.ajax({
			type:'post',
			dataType:'json',
			data:$("#"+formid).serialize(),
			url:$("#"+formid).attr("action"),
			success:function(data){
				if(data){
					$(".layui-regist-text-error").css("color","#53c6b0");
					$("#messageinfo").html(data);
				}
			},
			error:function(){
				$(".layui-regist-text-error").css("color","#53c6b0");
				$("#messageinfo").html("系统繁忙,请稍后重试");
			}
		});
	}
};