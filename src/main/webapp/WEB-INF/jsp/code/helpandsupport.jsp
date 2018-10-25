<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
request.setAttribute("panel_number", "panel_6");
request.setAttribute("panel_li_number", "panel_6_1");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>代码在线编辑工具</title>
<link media="screen" rel="stylesheet" href="../static/css/common.css"/>
<link media="screen" rel="stylesheet" href="../static/css/event/eventhome.css"/>
<link media="screen" rel="stylesheet" href="../static/css/codeMirrorCommon.css"/>
<script type="text/javascript" src="../static/js/event/jquery.js"></script>
<script type="text/javascript" src="../static/js/event/history.js"></script>
<script type="text/javascript" src="../static/js/event/jquery.easing.js"></script>
<script type="text/javascript" src="../static/js/event/jquery.mousewheel.js"></script>
</head>
<body>
<c:import url="../common/common.jsp"></c:import>
<div id="arrow">
	<ul>
		<li class="arrowup"></li>
		<li class="arrowdown"></li>
	</ul>
</div>

<div id="history">
	<div class="title">
		<h2>站长成长史</h2>
		<div id="circle">
			<div class="cmsk"></div>
			<div class="circlecontent">
				<div thisyear="2016" class="timeblock">
					<span class="numf"></span>
					<span class="nums"></span>
					<span class="numt"></span>
					<span class="numfo"></span>
					<div class="clear"></div>
				</div>
				<div class="timeyear">YEAR</div>
			</div>
			<a href="helpandsupport.do" class="clock"></a>
		</div>
	</div>
	
	<div id="content">
		<ul class="list">
			<li style="margin-top:-110px;">
				<div class="liwrap">
					<div class="lileft">
						<div class="date">
							<span class="year">2015</span>
							<span class="md">08-15</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">使用HTML5+CSS3+JavaScript完成静态网页</a></div>
						<div class="hisct">那是我的第一个静态网页是模仿NBA官网做的,完成时别提有多高兴。</div>
					</div>
				</div>
			</li>
			<li>
				<div class="liwrap">
					<div class="lileft">
						<div class="date">
							<span class="year">2015</span>
							<span class="md">10-17</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">开始着手我的第一个网站</a></div>
						<div class="hisct">是一个工具类型的网站<a href="javascript:;">www.itblogger.cn</a></div>
					</div>
				</div>
			</li>
			<li>
				<div class="liwrap">
					<div class="lileft">
						<div class="date">
							<span class="year">2015</span>
							<span class="md">12-28</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">www.itblogger.cn发布</a></div>
						<div class="hisct">第一个网站完成了,希望大家喜欢。</div>
					</div>
				</div>
			</li>
			<li>
				<div class="liwrap">
				
					<div class="lileft">
						<div class="date">
							<span class="year">2016</span>
							<span class="md">05-20</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">EC教育网站开始开发</a></div>
						<div class="hisct">负责完成老师模块功能,实现老师站上授课,实时与学生互动的业务功能。</div>
					</div>
				</div>
			</li>
			<li>
				<div class="liwrap">
					<div class="lileft">
						<div class="date">
							<span class="year">2016</span>
							<span class="md">07-01</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">EC教育网站开发完成</a></div>
						<div class="hisct">团队一起给领导演示网站功能,这次演示得非常完美。</div>
					</div>
				</div>
			</li>
			<li>
				<div class="liwrap">
					<div class="lileft">
						<div class="date">
							<span class="year">2016</span>
							<span class="md">07-14</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">到深圳华龙讯达进行实习</a></div>
						<div class="hisct">这也是我的第一家公司,工资低,晚上加班到22:00,周六正常上班,典型的干了活不给钱那种。</div>
					</div>
				</div>
			</li>
			<li>
				<div class="liwrap">
				
					<div class="lileft">
						<div class="date">
							<span class="year">2016</span>
							<span class="md">10-15</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">开始为云南烟草烟叶公司开发烟叶醇化生成管理系统</a></div>
						<div class="hisct">我所负责的是客户模块（独立完成）,也就是外部客户使用的系统,系统包括:货位预定,业务请求,信息查询,异常管理,意见反馈,星级评定,合同信息,档案信息八个功能模块。还包括公司内部使用系统部分表的设计,以及基础信息管理模块也是由我负责。</div>
					</div>
				</div>
			</li>
			<li>
				<div class="liwrap">
					<div class="lileft">
						<div class="date">
							<span class="year">2017</span>
							<span class="md">03-15</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">离职华龙</a></div>
						<div class="hisct">在华龙这几个月来,学到了不少,接触了很多新的技术及框架,不过作为一个有想法的我,我还是选择离开他,原因有很多,最主要的原因还是项目经理太菜。</div>
					</div>
				</div>
			</li>
			<li>
				<div class="liwrap">
					<div class="lileft">
						<div class="date">
							<span class="year">2017</span>
							<span class="md">04-20</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">完成家电卖场货物管理系统</a></div>
						<div class="hisct">实现小型家电卖场货物进销存的管理,使用JPA框架,Cas单点登录控制,Shiro权限控制等。</div>
					</div>
				</div>
			</li>
			<li>
				<div class="liwrap">
					<div class="lileft">
						<div class="date">
							<span class="year">2017</span>
							<span class="md">05-08</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">入职云南汇众</a></div>
						<div class="hisct">当初不太了解这家公司,只知道是做医疗His系统的,1997年成立的,本想成立这么多年,应该挺大的,果不其然,这只是一家分公司,总公司位于福建省厦门市,名叫厦门智业软件。</div>
					</div>
				</div>
			</li>
			<li>
				<div class="liwrap">
					<div class="lileft">
						<div class="date">
							<span class="year">2017</span>
							<span class="md">09-08</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">申请去总公司参与开发</a></div>
						<div class="hisct">峰分公司确实不怎么样,开发团队有不起,就他妈的一个实施公司,c没有自己的产品,产品都是总部开发好了用了好久了,稳定了,才拿过来。</div>
					</div>
				</div>
			</li>
			<li>
				<div class="liwrap">
					<div class="lileft">
						<div class="date">
							<span class="year">2017</span>
							<span class="md">10-11</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">前往总部参与His5.0开发</a></div>
						<div class="hisct">很希望遇到一些厉害的程序员,向他们学习学习,提示自己身技能。</div>
					</div>
				</div>
			</li>
			<li>
				<div class="liwrap">
					<div class="lileft">
						<div class="date">
							<span class="year">2018</span>
							<span class="md">01-25</span>
						</div>
					</div>
					
					<div class="point"><b></b></div>
					
					<div class="liright">
						<div class="histt"><a href="helpandsupport.do">暂时回昆明分公司,因为要过年的缘故,暂时回来</a></div>
						<div class="hisct">
						his5.0开发:
						①、临床路径维护模块。负责该模块下豁免变异药品、豁免变异诊疗、住院流程维护以及路劲预览这些模块的前端页面的开发以及数据交互,住院流程维护模块嵌入文本编辑器ueditor。
                        ②、医嘱方案维护模块。负责该模块前端页面的开发以及数据交互。
                        ③、手术信息管理模块。负责该模块中手术导航、麻醉导航模块后端接口的开发，迭代手术模块中手术申请单新增的后端代码。
                        ④、语音叫号模块。实现医院门诊排队语音叫号服务。
						</div>
					</div>
				</div>
			</li>
		</ul>
	</div>
</div>
<div class="footer">
    <p>© 2018-2019 版权所有</p>
	<p>滇<a href="javacode.do">www.itblogger.cn</a></p>
</div>
</body>
