/**
 * crreate 2018-1-16
 * describe 初始化xml编辑界面
 */
var editor=CodeMirror.fromTextArea(document.getElementById("code"),{
    mode:"application/xml",
    lineNumbers:true,
    theme:"xq-light",
    //绑定Vim
    //keyMap:"vim",
    //代码折叠
    lineWrapping:true,
    foldGutter: true,
    gutters:["CodeMirror-linenumbers", "CodeMirror-foldgutter"],
    //全屏模式
    fullScreen:false,
    //括号匹配
    matchBrackets:true,
    //智能提示 
    extraKeys:{
        "Ctrl-Space":"autocomplete",
        "Shift-Alt-Enter": function (cm) {
             cm.setOption("fullScreen", !cm.getOption("fullScreen"));
            }
    },
});
editor.setSize('auto',$(window).height()-115);//设置高度
function clear_editor(){ //清空内容
	editor.setValue("");
};
function demo_code(){ //xml示例
	var javacode = "//xml示例\n" +
			       "<?xml version='1.0' encoding='UTF-8'?>\n"+
                   "<web-app xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xmlns='http://java.sun.com/xml/ns/javaee' xsi:schemaLocation='http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd' version='3.0'>\n"+
				   "<display-name>WordOnlineEditing</display-name>\n"+
				   "<context-param>\n"+
				   "<param-name>contextConfigLocation</param-name>\n"+
				   "<param-value>classpath*:spring-mybatis.xml</param-value>\n"+
				   "</context-param>\n"+
				   "<context-param>\n"+
				   "<param-name>log4jConfigLocation</param-name>\n"+
				   "<param-value>classpath:log4j.properties</param-value>\n"+
				   "</context-param>\n"+
				   "<context-param>\n" +
				   "<param-name>size</param-name>\n" +
				   "<param-value>5</param-value>\n"+
				   "</context-param>\n" +
				   "<listener>\n" +
				   "<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>\n"+
				   "</listener>\n"+
				   "<listener>\n"+
				   "<listener-class>org.springframework.web.util.Log4jConfigListener</listener-class>\n"+
				   "</listener>\n"+
				   "<filter>\n" +
				   "<filter-name>encodingFilter</filter-name>\n"+
				   "<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>\n"+
				   "<async-supported>true</async-supported>\n"+
				   "<init-param>\n"+
				   "<param-name>encoding</param-name>\n"+
				   "<param-value>UTF-8</param-value>\n" +
				   "</init-param>\n" +
				   "</filter>\n" +
				   "<filter-mapping>\n" +
				   "<filter-name>encodingFilter</filter-name>\n" +
				   "<url-pattern>/*</url-pattern>\n" +
				   "</filter-mapping>\n"+
				   "<listener>\n"+
				   "<listener-class>org.springframework.web.util.IntrospectorCleanupListener</listener-class>\n"+
				   "</listener>\n"+
				   "<servlet>\n"+
				   "<servlet-name>SpringMVC</servlet-name>\n"+
				   "<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>\n"+
				   "<init-param>\n"+
				   "<param-name>contextConfigLocation</param-name>\n"+
				   "<param-value>classpath:spring-mvc.xml</param-value>\n"+
				   "</init-param>\n"+
				   "<load-on-startup>1</load-on-startup>\n"+
				   "<async-supported>true</async-supported>\n"+
				   "</servlet>\n"+
				   "<servlet-mapping>\n"+
				   "<servlet-name>SpringMVC</servlet-name>\n"+
				   "<url-pattern>*.do</url-pattern>\n"+
				   "</servlet-mapping>\n"+
				   "<welcome-file-list>\n"+
				   "<welcome-file>login.jsp</welcome-file>\n"+
				   "</welcome-file-list>\n"+
				   "</web-app>";
	editor.setValue(javacode);
};
function setformatType(Val){
	$("#indenttype").val(Val);
};
function format_code(){ //格式化代码
	var formatVal = $("#code").val();
	var indenttype = $("#indenttype").val();
	$.post("beautyxml.do",{
		code:editor.getValue(),tabtype:indenttype
	},function(val){
		editor.setValue(val);
	});
};