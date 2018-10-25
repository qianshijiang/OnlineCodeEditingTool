<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
request.setAttribute("panel_number", "panel_4");
request.setAttribute("panel_li_number", "panel_4_1");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>代码在线编辑工具</title>
<link media="screen" rel="stylesheet" href="../static/css/common.css"/>
<link media="screen" rel="stylesheet" href="../static/css/timestamp/timestamp.css"/>
<script type="text/javascript" src="../static/js/event/jquery.js"></script>
</head>
<body>
<c:import url="../common/common.jsp"></c:import>
<div class="wrap">
    <div class="wrap_top">
       <div class="wrap_top_div">
         <span>现在的Unix时间戳(Unix timestamp)是：</span>
         <input style="height:30px;" type="text" id="unixtimestamp" class="input_style" readonly="readonly"/>
         <input type="button" id="start" style="color:#0474c8;height:30px;width:40px;cursor: pointer;" value="开始"/>
         <input type="button" id="shutdown" style="color:#0474c8;height:30px;width:40px;cursor: pointer;" value="停止"/>
         <input type="button" id="fresh" style="color:#0474c8;height:30px;width:40px;cursor: pointer;" value="刷新"/>
       </div>
       <div class="wrap_footer">
         <div class="wrap_footer_one">
	         <span>Unix时间戳（Unix timestamp）</span>
	         <input type="text" id="inputValue" style="height:30px;"/>
	         <select id="timeunit" style="color:#0474c8;height:30px;cursor:pointer;margin-right: 5px;">
	           <option selected="selected" value="1">秒</option>
	           <option value="2">毫秒</option>
	         </select>
	         <input type="button" onclick="unixtoChange();" value="转换成北京时间" style="color:#0474c8;height:30px;width:106px;cursor: pointer;"/>
	         <input type="text" id="resultValue" readonly="readonly" style="height:30px;"/>
         </div>
         <div class="wrap_footer_two">
             <span>北京时间（年-月-日 时:分:秒）</span>
             <input type="text" id="beijingtime" style="height:30px;"/>
             <input type="button" onclick="beijingtimetotimes();" value="转换成Unix时间戳" style="color:#0474c8;height:30px;width:116px;cursor: pointer;"/>
             <input type="text" id="beijingresult" style="height:30px;"/>
             <select id="timeunittwo" style="color:#0474c8;height:30px;cursor:pointer;margin-right: 5px;">
	           <option selected="selected" value="1">秒</option>
	           <option value="2">毫秒</option>
	         </select>
         </div>
         <div class="wrap_footer_three">
             <span>北京时间</span>
             <input type="text" id="yearValue" style="height:30px;width:40px;"/><span>年</span>
             <input type="text" id="monthValue" style="height:30px;width:40px;"/><span>月</span>
             <input type="text" id="dayValue" style="height:30px;width:40px;"/><span>日</span>
             <input type="text" id="hoursValue" style="height:30px;width:40px;"/><span>时</span>
             <input type="text" id="minuteValue" style="height:30px;width:40px;"/><span>分</span>
             <input type="text" id="secondValue" style="height:30px;width:40px;"/><span>秒</span>
             <input type="button" onclick="timetotimestimeto();" value="转换成Unix时间戳" style="color:#0474c8;height:30px;width:116px;cursor:pointer;"/>
             <input type="text" id="allunit" style="height:30px;"/>
             <select id="timeunitthree" style="color:#0474c8;height:30px;cursor:pointer;margin-right: 5px;">
	           <option selected="selected" value="1">秒</option>
	           <option value="2">毫秒</option>
	         </select>
         </div>
       </div>
    </div>
</div>
<div class="footer">
  <p>© 2018-2019 版权所有</p>
  <p>滇<a href="javacode.do">www.itblogger.cn</a></p>
</div>
<script type="text/javascript" src="../static/js/jscode/code/timestamp.js"></script>
</body>