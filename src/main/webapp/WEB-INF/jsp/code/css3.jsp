<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
request.setAttribute("panel_number", "panel_1");
request.setAttribute("panel_li_number", "panel_1_3");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>代码在线编辑工具</title>
<link media="screen" rel="stylesheet" href="../static/css/common.css"/>
<!-- 引用主题 -->
<link media="screen" rel="stylesheet" href="../static/css/codemirror/theme/eclipse.css"/>
<c:import url="../common/codeMirrorcmomon.jsp"></c:import>
<link media="screen" rel="stylesheet" href="../static/css/codeMirrorCommon.css"/>
<link media="screen" rel="stylesheet" href="../static/css/buttons.css"/>
<link media="screen" rel="stylesheet" href="../static/css/font-awesome.min.css"/>
<script type="text/javascript" src="../static/js/buttons.js"></script>
<script type="text/javascript" src="../static/js/codemirror/mode/css/css.js"></script>
<script type="text/javascript" src="../static/js/codemirror/addon/lint/css-lint.js"></script>
</head>
<body>
<c:import url="../common/common.jsp"></c:import>
<div>
<textarea id="code"></textarea>
 <p class="codefooter"></p>
</div> 
<div class="codeeditor_button">
    <button type="button" class="button button-primary" onclick="format_code();">美化</button>
    <button type="button" class="button button-primary" onclick="demo_code();">示例</button>
    <button type="button" class="button button-primary" onclick="clear_editor();">清空</button>
    <span class="button-dropdown button-dropdown-action" data-buttons="dropdown">
	   <button class="button button-action">
	               缩进格式&nbsp;&nbsp;<i class="fa fa-caret-up"></i>
	   </button>
	    <ul class="button-dropdown-list is-above">
	      <li class="button-dropdown-divider" onclick="setformatType(1)"><a href="##">Tab缩进</a></li>
	      <li class="button-dropdown-divider" onclick="setformatType(2)"><a href="##">2空格缩进</a></li>
	      <li class="button-dropdown-divider" onclick="setformatType(4)"><a href="##">4空格缩进</a></li>
	      <li class="button-dropdown-divider" onclick="setformatType(8)"><a href="##">8空格缩进</a></li>
	    </ul>
	    <input type="hidden" value="1" id="indenttype"/>
  </span>
</div>
<script type="text/javascript" src="../static/js/jscode/code/css3code.js"></script>
</body>
