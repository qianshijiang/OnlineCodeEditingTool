/**
 * create 2018-1-15
 * describe 忘记密码时发送ajax请求
 * 对地址邮箱进行校验
 */
function doSubmit(formid){
	var email = $("#email").val();
	if(!(/^\d{5,12}@([q]{2}|[Q]{2})\.com$/.test(email))){
		$("#messageinfo").html("QQ邮箱地址有误");
	}else{
		$.ajax({
			type:'post',
			dataType:'json',
			data:$("#"+formid).serialize(),
			url:$("#"+formid).attr("action"),
			success:function(data){
				if(data){
					$(".layui-regist-text-error").css("color","#53c6b0");
					$("#email").val(data["worduser"].email);
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