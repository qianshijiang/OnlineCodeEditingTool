/**
 * create 2018-1-28
 * describe json界面的初始化
 * 针对json界面的数据交互做处理
 */
var editor = CodeMirror.fromTextArea(document.getElementById("code"),{
	mode:"application/json",
    lineNumbers:true,
    smartIndent : true,  // 是否智能缩进
    theme:"eclipse",
    //绑定Vim
    //keyMap:"vim",
    //代码折叠
    lineWrapping:true,
    foldGutter: true,
    gutters:["CodeMirror-linenumbers", "CodeMirror-foldgutter"],
    //CodeMirror-lint-markers是实现语法报错功能
    //全屏模式
    fullScreen:false,
    //lint: true,
    //括号匹配
    matchBrackets:true,
    //智能提示 
    extraKeys:{
        "Alt-Space": "autocomplete",//ctrl-space唤起智能提示
        "F11": function(cm) {
            cm.setOption("fullScreen", !cm.getOption("fullScreen"));
        },
       "Esc": function(cm) {
           if (cm.getOption("fullScreen")) cm.setOption("fullScreen", false);
        },
        "Ctrl-/": "toggleComment",
        "Ctrl-Z":function (editor) {
            editor.undo();
        },//undo
        "F8":function (editor) {
            editor.redo();
        },//Redo
        "F7": function autoFormat(cm) {
            var totalLines = cm.lineCount();
            cm.autoFormatRange({line:0, ch:0}, {line:totalLines});
        }//代码格式化
    }
});
editor.setSize('auto',$(window).height()-115);//设置高度
function clear_editor(){ //清空内容
	editor.setValue("");
};
function demo_code(){ //json示例
	var javacode = "//json示例\n" +
			       "{\n" +
                   "'employees': [\n"+
                   "{'firstName':'Bill' , 'lastName':'Gates' },\n"+
                   "{'firstName':'George' , 'lastName':'Bush' },\n"+
                   "{'firstName':'Thomas' , 'lastName':'Carter' }\n"+
                   "]\n"+
                   "}";
	editor.setValue(javacode);
};
function setformatType(Val){
	$("#indenttype").val(Val);
};
function format_code(){ //格式化代码
	var formatVal = $("#code").val();
	var indenttype = $("#indenttype").val();
	$.ajax({
		type:'post',
		dataType:'json',
		data:{code:editor.getValue(),tabtype:indenttype},
		url:"beautyjson.do",
		success:function(data){
			if(data){
				
			}
		},
		error:function(){
			
		}
	});
};