/**
 * crreate 2018-1-20
 * describe 初始化html5编辑界面
 */
var editor=CodeMirror.fromTextArea(document.getElementById("code"),{
    mode:"text/html",
    lineNumbers:true,
    theme:"eclipse",
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
function demo_code(){ //html示例
	var htmlcode = "<!--html示例-->\n" +
			       "<!DOCTYPE html>\n"+
                   "<html>\n"+
	               "<head>\n"+
		           "<meta charset='utf-8'>\n"+
		           "<title>代码在线编辑工具</title>\n"+
	               "</head>\n"+
	               "<body>\n"+
		           "<h2>欢迎来到www.itblogger.cn</h2>\n"+
		           "<h3>感谢你的使用,祝你使用愉快!</h3>\n"+
	               "</body>\n"+
                   "</html>\n";
	editor.setValue(htmlcode);
};
function setformatType(Val){
	$("#indenttype").val(Val);
};
function format_code(){ //格式化代码
	var formatVal = $("#code").val();
	var indenttype = $("#indenttype").val();
	$.post("beautyhtml.do",{
		code:editor.getValue(),tabtype:indenttype
	},function(val){
    var msg = jQuery.parseJSON(val);
    editor.setValue(msg['dataSource']);
	});
};
