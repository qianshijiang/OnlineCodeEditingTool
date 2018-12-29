/**
 * create 2018-1-16
 * describe 初始化java编辑界面
 */
var editor=CodeMirror.fromTextArea(document.getElementById("code"),{
    mode:"text/x-java",
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
function demo_code(){ //java示例
	var javacode = "/**java快速排序**/\n" +
			       "public static void quickSort(int[] numbers, int start, int end) {\n" +  
                   "if (start < end) {\n"+  
                   "int base = numbers[start]; // 选定的基准值（第一个数值作为基准值\n" +
                   "int temp; // 记录临时中间值 \n" + 
                   "int i = start, j = end; \n" +   
                   "do {\n" +   
                   "while ((numbers[i] < base) && (i < end))\n" +   
                   "i++;\n" +   
                   "while ((numbers[j] > base) && (j > start))\n" +   
                   "j--;\n" +  
                   "if (i <= j) {\n" +   
                   "temp = numbers[i];\n" +   
                   "numbers[i] = numbers[j];\n" +  
                   "numbers[j] = temp;\n" +   
                   "i++;\n" + 
                   "j--;\n" +  
                   "}\n" +   
                   "} while (i <= j);\n" +   
                   "if (start < j) \n" +
                   "quickSort(numbers, start, j);\n" + 
                   "if (end > i)\n" +   
                   "quickSort(numbers, i, end);\n" +   
                   "}\n" +   
                   "}\n" +
                   "public static void main(String[] args){\n" +
                   "int []arrays={8,9,7,3,25,65,48,25,78};\n" +
                   "quickSort(arrays,0,arrays.length-1);\n" +
                   "for(int i=0;i<arrays.length;i++)\n" +
                   "{System.out.println(arrays[i]);}\n"+
                   "}";
	editor.setValue(javacode);
};
function setformatType(Val){
	$("#indenttype").val(Val);
};
function format_code(){ //格式化代码
	var formatVal = $("#code").val();
	var indenttype = $("#indenttype").val();
	$.post("beautyjava.do",{
		code:editor.getValue(),tabtype:indenttype
	},function(val){
		var msg = jQuery.parseJSON(val);
		editor.setValue(msg['dataSource']);
	});
};
