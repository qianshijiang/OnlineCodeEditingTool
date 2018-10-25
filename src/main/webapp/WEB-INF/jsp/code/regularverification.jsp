<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
request.setAttribute("panel_number", "panel_3");
request.setAttribute("panel_li_number", "panel_3_1");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>代码在线编辑工具</title>
<link media="screen" rel="stylesheet" href="../static/css/common.css"/>
<link media="screen" rel="stylesheet" href="../static/css/checkbox-redio/reset.css"/>
<link media="screen" rel="stylesheet" href="../static/css/checkbox-redio/style.css"/>
<script type="text/javascript" src="../static/js/event/jquery.js"></script>
<script type="text/ajvascript" src="../static/js/checkbox-redio/index.js"></script>
<script type="text/ajvascript" src="../static/js/checkbox-redio/prefixfree.min.js"></script>
</head>
<body>
<c:import url="../common/common.jsp"></c:import>
<div class="wrapper">
    <ul>
        <li>
            <input type="checkbox" id="Indiscriminatecase" checked="checked" name="check-box"/> <span>忽略大小写</span>
        </li>
        <li>
            <input type="checkbox" id="Matchednewline" name="check-box"/> <span>匹配换行符</span>
        </li>
        <li>
            <input type="checkbox" id="Mismatchall" checked="checked" name="check-box"/> <span>匹配所有</span>
        </li>
    </ul>
    <div class="check_and_test" id="checktest">
        <span>校验测试</span>
    </div>
</div>
<div class="regular">
     <textarea id="code" placeholder="在这里写下你的正则表达式...." onfocus="this.placeholder=''" onblur="this.placeholder='在这里写下你的正则表达式....'"></textarea>
</div>
<div class="regular_data">
     <textarea id="code_data" placeholder="在这里写测试数据...." onfocus="this.placeholder=''" onblur="this.placeholder='在这里写测试数据....'"></textarea>
</div>
<div class="result_info">
     <p>测试结果:</p>
     <textarea id="result_info_data" placeholder="测试结果...." readonly="readonly"></textarea>
</div>
<div class="footer">
  <p>© 2018-2019 版权所有</p>
  <p>滇<a href="javacode.do">www.itblogger.cn</a></p>
</div>
<script type="text/javascript" src="../static/js/jscode/code/regular.js"></script>
</body>