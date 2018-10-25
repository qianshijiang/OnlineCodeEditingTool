/**********************************时间戳操作页面******************************/
var dataValue;//定义全局变量存储时间
var flag; //定时器标志
$(function(){
	flag= setInterval(start,1000);
	$("#inputValue").val(Math.round(new Date().getTime()/1000));//界面加载完成就初始化
	$("#shutdown").click(function(){ //停止
		clearInterval(flag);
	});
	$("#start").click(function(){ //点击开始时,清除原来的定时器，重新创建
		clearInterval(flag);
		flag= setInterval(start,1000);
	});
	$("#fresh").click(function(){//刷新
		clearInterval(flag);
		refresh();
	});
});
//开始
function start(){
	dataValue = Math.round(new Date().getTime()/1000);
	$("#unixtimestamp").val(dataValue);
};
//刷新
function refresh(){
	start();
};

//unix时间戳转北京时间
function unixtoChange(){
	var type = $("#timeunit").val();
	var value = $("#inputValue").val();
	if(/^\d*$/.test(value)){
		$.ajax({
			type:"post",
		    dataType:"json",
		    data:{"type":type,"value":value},
		    url:"timestamptotime.do",
		    success:function(data){
		    	if(data){
		    		$("#resultValue").val(data['message']);
		    	}
		    },
		    error:function(){
		    	
		    }
		});
	} else {
		return;
	}
};

//北京时间转时间戳
function beijingtimetotimes(){
	var value = $("#beijingtime").val();
	var type = $("#timeunittwo").val();
	if(/^\d{4}\-\d{2}\-\d{2}$/.test(value) || /^\d{4}\-\d{2}\-\d{2} \d{2}:\d{2}:\d{2}$/.test(value)){
		var month,day,hour,minute,second;
		var array = value.split("-",-1);
		var arrays = value.split(":",-1);
		if(array[1]<0 || array[1]>12){
			return;
		}else if(array[2]<0 || array[2]>31){
			return;
		}else if(arrays[0]<0 || arrays[0].substring(arrays[0].length-2,arrays[0].length)>24){
			return;
		}else if(arrays[1]<0 || arrays[1]>60){
			return;
		}else if(arrays[2]<0 || arrays[2]>60){
			return;
		}else{
			$.ajax({
				type:'post',
				dataType:'json',
				data:{"type":type,"value":value},
				url:"timetotimestamp.do",
				success:function(data){
					if(data){
						$("#beijingresult").val(data['message']);
					}
				},
				error:function(){
					
				}
			});
		}
	} else {
		return;
	}
};

//输入框形式将输入的时间转换成时间戳
function timetotimestimeto(){
	var yearValue = $("#yearValue").val(); //年
	var monthValue = $("#monthValue").val(); //月
	var dayValue = $("#dayValue").val(); //日
	var hoursValue = $("#hoursValue").val(); //时
	var minuteValue = $("#minuteValue").val();//分
	var secondValue = $("#secondValue").val();//秒
	var type = $("#timeunitthree").val();//类型
	var result;
	if(/^\d{4}$/.test(yearValue)){
		result = yearValue;
		if(/^\d{2}$/.test(monthValue) && monthValue >0 && monthValue <= 12){
			result = result + "-" +  monthValue;
			if(/^\d{2}$/.test(dayValue) && dayValue >0 && dayValue <= 31){
				result = result + "-" + dayValue;
				if(/^\d{2}$/.test(hoursValue) && hoursValue >= 0 && hoursValue <= 24){
					result = " " + result + hoursValue;
					if(/^\d{2}$/.test(minuteValue) && minuteValue >= 0 && minuteValue <= 60){
						result =":" + result + minuteValue;
						if(/^\d{2}$/.test(secondValue) && secondValue >= 0 && secondValue <= 60){
							result =":" + result + secondValue;
						}
					}
				}
			}
		}
		//发送请求
		$.ajax({
			type:'post',
			dataType:'json',
			data:{"value":result,"type":type},
			url:"timetoTimestampChange.do",
			success:function(data){
				if(data){
					$("#allunit").val(data['message']);
				}
			},
			error:function(){
				
			}
		});
	} else {
		return;
	}
};

