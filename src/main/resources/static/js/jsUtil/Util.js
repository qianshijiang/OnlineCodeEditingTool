/**
 * 发送ajax请求
 */
function dosubmit(formid){
	$.ajax({
		type:'post',
		dataType:'json',
		data:$("#"+formid).serialize(),
		url:$("#"+formid).attr("action"),
		success:function(data){
			if(data){
				
			}
		},
		error:function(){
			
		}
	});
};