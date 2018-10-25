/**
 * crreate 2018-1-20
 * describe 初始化css3编辑界面
 */
var editor=CodeMirror.fromTextArea(document.getElementById("code"),{
    mode:"text/css",
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
function demo_code(){ //css示例
	var htmlcode = "//css示例\n" +
			       ".CodeMirror{\n"+
	               "font-size:14px;\n"+
                   "}\n"+
                   ".editormessage_info{\n"+
	               "border-bottom:1px solid #FBC2C4;\n"+
	               "border-top:1px solid #FBC2C4;\n"+
	               "display: none;\n"+
                   "}\n"+
                   ".codeerror{\n"+
	               "background-color:#FBE3E4;\n"+
	               "color:#D12F19;\n"+
	               "font-size:14px;\n"+
	               "padding:0.8em;\n"+
                   "}\n"+
                   ".codefooter{\n"+
	               "width:100%;\n"+
                   "height:5px;\n"+
                   "background-color: #F5F5F5;\n"+
                   "overflow: hidden;\n"+
                   "}\n"+
                   ".footer{\n"+
	               "width:100%;\n"+
	               "overflow: hidden;\n"+
	               "margin: 0 auto;\n"+ 
                   "}";
	editor.setValue(htmlcode);
};
function setformatType(Val){
	$("#indenttype").val(Val);
};
function format_code(){ //格式化代码
	var formatVal = $("#code").val();
	var indenttype = $("#indenttype").val();
	$.post("beautycss.do",{
		code:editor.getValue(),tabtype:indenttype
	},function(val){
		editor.setValue(val);
	});
};
