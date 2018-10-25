<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
   String state= "",state_li="";
   try{
	   state = (String)request.getAttribute("panel_number");
	   state_li = (String)request.getAttribute("panel_li_number");
	   }catch(Exception e){}
%>
<%!
    //获取一级状态
	public String getState(String panel_num, String curr_panel_num) {
		String stateClass = "";
		if (panel_num.equals(curr_panel_num)){
			stateClass = " nav-up-selected-inpage ";
		}
		return stateClass;
	}
   //获取第二级状态
	public String getState_li(String panel_num_li, String curr_panel_num) {
		String stateClass = "";
		if (panel_num_li.equals(curr_panel_num)) {
			stateClass = " class='active' ";
		}
		return stateClass;
		}
%>
<div class="head-v3">
	<div class="navigation-up">
		<div class="navigation-inner">
			<div class="navigation-v3">
				<ul>
					<li class="<%out.print(getState("panel_1", state));%>"_t_nav="product">
						<h2>
							<a href="javacode.do">Code</a>
						</h2>
					</li>
					<li class="<%out.print(getState("panel_2", state));%>" _t_nav="wechat">
						<h2>
							<a href="jsoncheck.do">Json校验</a>
						</h2>
					</li>
					<li class="<%out.print(getState("panel_3", state));%>" _t_nav="solution">
						<h2>
							<a href="regular.do">正则校验</a>
						</h2>
					</li>
					<li class="<%out.print(getState("panel_4", state));%>" _t_nav="cooperate">
						<h2>
							<a href="timestamp.do">时间戳</a>
						</h2>
					</li>
					<li class="<%out.print(getState("panel_5", state));%>" _t_nav="home">
						<h2>
							<a href="index.do">文本编辑</a>
						</h2>
					</li>
					<li class="<%out.print(getState("panel_6", state));%>" _t_nav="support">
						<h2>
							<a href="helpandsupport.do">帮助与支持</a>
						</h2>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="navigation-down">
		<div id="product" class="nav-down-menu menu-1" style="display: none;" _t_nav="product">
			<div class="navigation-down-inner">
				<dl style="margin-left:100px;">
					<dd>
						<a <%out.print(getState_li("panel_1_1", state_li)); %> hotrep="hp.header.product.compute1" href="javacode.do">Java</a>
					</dd>
				</dl>
				<dl>
					<dd>
						<a <%out.print(getState_li("panel_1_2", state_li)); %> hotrep="hp.header.product.service1" href="htmlcode.do">Html5</a>
					</dd>
				</dl>
				<dl>
					<dd>
						<a <%out.print(getState_li("panel_1_3", state_li)); %> hotrep="hp.header.product.service1" href="csscode.do">Css3</a>
					</dd>
				</dl>
				<dl>
					<dd>
						<a <%out.print(getState_li("panel_1_4", state_li)); %> hotrep="hp.header.product.service1" href="javascriptcode.do">Javascript</a>
					</dd>
				</dl>
				<dl>
					<dd>
						<a <%out.print(getState_li("panel_1_5", state_li)); %> hotrep="hp.header.product.service1" href="xmlcode.do">Xml</a>
					</dd>
				</dl>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript" src="../static/js/jscode/common.js"></script>