/***
 * 正则校验
 */
$(function(){
	$("#code_data").css("height",$(window).height()-466); //设置高度
	$("#result_info_data").css("height",$(window).height()-466); //设置高度
	/**
     * @param {String}  errorMessage   错误信息
     * @param {String}  scriptURI      出错的文件
     * @param {Long}    lineNumber     出错代码的行号
     * @param {Long}    columnNumber   出错代码的列号
     * @param {Object}  errorObj       错误的详细信息，Anything
     */
	window.onerror = function (errorMessage, scriptURI, lineNumber, columnNumber, errorObj) {
	    var info = "错误信息  : " + errorMessage + "\n" +
	            "出错文件 : " + scriptURI + "\n" +
	            "出错行号 : " + lineNumber + "\n" +
	            "出错列号 : " + columnNumber + "\n" +
	            "错误详情 : " + errorObj + "\n";
	    $("#result_info_data").val(info);
	    return true;
	};
});

/************正则校验***************/
function factory(){
	debugger;
		var Regx = $("#code").val(); //获取正则
		var RegularData = $("#code_data").val();//获取测试数据
		var regx,result,number;
			if(Regx===null || Regx===""){
				$("#result_info_data").val("请输入正则表达式....");
			}else if(RegularData===null || RegularData===""){
				$("#result_info_data").val("请输入测试数据....");
			}else{
				if($("#Indiscriminatecase").attr("checked") && $("#Matchednewline").attr("checked") && $("#Mismatchall").attr("checked")){
					regx = new RegExp(Regx,"img");
					if(RegularData.match(regx)){
						number = RegularData.match(regx);
						result = "测试结果 : true \n" +
						         "共有"+number.length+"处匹配项 :\n";
						        for(var i = 0;i<number.length;i++){
						        	result += number[i]+"\n";
						        }
					}else{
						result = "无匹配项";
					}
				}else if($("#Indiscriminatecase").attr("checked") && $("#Matchednewline").attr("checked")){
					regx = new RegExp(Regx,"im");
					if(regx.exec(RegularData)){
						number = regx.exec(RegularData);
						result = "测试结果 : true \n" +
				                 "共有"+number.length+"处匹配项 :\n";
				                 for(var i = 0;i<number.length;i++){
							        	result += number[i]+"\n";
							        }
					}
				}else if($("#Indiscriminatecase").attr("checked") && $("#Mismatchall").attr("checked")){
					regx = new RegExp(Regx,"ig");
					if(RegularData.match(regx)){
						number = RegularData.match(regx);
						result = "测试结果 : true \n" +
						         "共有"+number.length+"处匹配项 :\n";
						         for(var i = 0;i<number.length;i++){
							        	result += number[i]+"\n";
							        }
					}else{
						result = "无匹配项";
					}
				}else if($("#Matchednewline").attr("checked") && $("#Mismatchall").attr("checked")){
					regx = new RegExp(Regx,"mg");
					if(RegularData.match(regx)){
						number = RegularData.match(regx);
						result = "测试结果 : true \n" +
						         "共有"+number.length+"处匹配项 :\n";
						         for(var i = 0;i<number.length;i++){
							        	result += number[i]+"\n";
							        }
					}else{
						result = "无匹配项";
					}
				}else if($("#Indiscriminatecase").attr("checked")){
					regx = new RegExp(Regx,"i");
					if(regx.exec(RegularData)){
						number = regx.exec(RegularData);
						result = "测试结果 : true \n" +
				                 "共有"+number.length+"处匹配项 :\n";
				                 for(var i = 0;i<number.length;i++){
							        	result += number[i]+"\n";
							        }
					}
				}else if($("#Matchednewline").attr("checked")){
					regx = new RegExp(Regx,"m");
					if(regx.exec(RegularData)){
						number = regx.exec(RegularData);
						result = "测试结果 : true \n" +
				                 "共有"+number.length+"处匹配项 :\n";
				                 for(var i = 0;i<number.length;i++){
							        	result += number[i]+"\n";
							        }
					}
				}else if($("#Mismatchall").attr("checked")){
					regx = new RegExp(Regx,"g");
					if(RegularData.match(regx)){
						number = RegularData.match(regx);
						result = "测试结果 : true \n" +
						         "共有"+number.length+"处匹配项 :\n";
						         for(var i = 0;i<number.length;i++){
							        	result += number[i]+"\n";
							        }
					}else{
						result = "无匹配项";
					}
				}else{
					regx = new RegExp(Regx);
				    if(regx.test(RegularData)){
					       result = "测试结果 : true \n";
					      
				    }else{
				    	   result = "无匹配项";
				    }
			   }
		   $("#result_info_data").val(result);
		};
};
$("#checktest").click(function(){
	factory();
});