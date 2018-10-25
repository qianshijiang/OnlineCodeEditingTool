<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
   request.setAttribute("panel_number","panel_5");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>代码在线编辑工具</title>
<link media="screen" rel="stylesheet" href="../static/css/common.css"/>
<script type="text/javascript" src="../static/js/jquery-1.7.1.min.js" ></script>
<script type="text/javascript" charset="utf-8" src="../static/ueditor/myueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="../static/ueditor/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="../static/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
<body>
<c:import url="../common/common.jsp"></c:import>
<div id="editor"></div>
<script type="text/javascript" src="../static/js/jscode/index.js"></script>
</body>
</html>