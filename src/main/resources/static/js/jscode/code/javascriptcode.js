/**
 * crreate 2018-1-16
 * describe 初始化javascript编辑界面
 */
var editor=CodeMirror.fromTextArea(document.getElementById("code"),{
    mode:"text/javascript",
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
function demo_code(){ //javascript示例
	var javacode = "//javascript示例\n" +
			       "function StringStream(string) {\n"+
                   "this.pos = 0;\n"+
                   "this.string = string;\n"+
                   "}\n"+
                   "StringStream.prototype = {\n"+
				   "done: function() {return this.pos >= this.string.length;},\n"+
				   "peek: function() {return this.string.charAt(this.pos);},\n"+
				   "next: function() {\n"+
				   "if (this.pos &lt; this.string.length)\n"+
                   "return this.string.charAt(this.pos++);\n"+
                   "},\n"+
                   "eat: function(match) {\n"+
                   "var ch = this.string.charAt(this.pos);\n"+
                   "if (typeof match == 'string') var ok = ch == match;\n"+
                   "else var ok = ch &amp;&amp; match.test ? match.test(ch) : match(ch);\n"+
                   "if (ok) {this.pos++; return ch;}\n"+
                   "},\n"+
				   "eatWhile: function(match) {\n"+
				   "var start = this.pos;\n"+
				   "while (this.eat(match));\n"+
				   "if (this.pos > start) return this.string.slice(start, this.pos);\n"+
				   "},\n"+
				   "backUp: function(n) {this.pos -= n;},\n"+
				   "column: function() {return this.pos;},\n"+
				   "eatSpace: function() {\n"+
				   "var start = this.pos;\n"+
				   "while (/\s/.test(this.string.charAt(this.pos))) this.pos++;\n"+
				   "return this.pos - start;\n"+
				   "},\n"+
				   "match: function(pattern, consume, caseInsensitive) {\n"+
				   "if (typeof pattern == 'string') {\n"+
				   "function cased(str) {return caseInsensitive ? str.toLowerCase() : str;}\n"+
				   "if (cased(this.string).indexOf(cased(pattern), this.pos) == this.pos) {\n"+
				   "if (consume !== false) this.pos += str.length;\n"+
				   "return true;\n"+
				   "}\n"+
				   "}\n"+
				   "else {\n"+
				   "var match = this.string.slice(this.pos).match(pattern);\n"+
				   "if (match &amp;&amp; consume !== false) this.pos += match[0].length;\n"+
				   "return match;\n"+
				   "}\n"+
				   "}\n"+
				   "};";
	editor.setValue(javacode);
};
function setformatType(Val){
	$("#indenttype").val(Val);
};
function format_code(){ //格式化代码
	var formatVal = $("#code").val();
	var indenttype = $("#indenttype").val();
	$.post("beautyjavascript.do",{
		code:editor.getValue(),tabtype:indenttype
	},function(val){
		editor.setValue(val);
	});
};