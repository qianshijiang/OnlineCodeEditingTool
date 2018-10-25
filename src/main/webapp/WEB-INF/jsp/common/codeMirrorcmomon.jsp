<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!-- 引入Code Mirror所需要的文件 -->
<link media="screen" rel="stylesheet" href="../static/css/codemirror/codemirror.css"/>
<script type="text/javascript" src="../static/js/codemirror/codemirror.js"></script>
<!--Java代码高亮必须引入-->
<script type="text/javascript" src="../static/js/codemirror/clike.js"></script>

<!--引入js,绑定Vim-->
<link media="screen" rel="stylesheet" href="../static/js/codemirror/addon/dialog/dialog.css"/>
<!--改善vim输入命令时的样式-->
<script type="text/javascript" src="../static/js/codemirror/addon/dialog/dialog.js"></script>
<script type="text/javascript" src="../static/js/codemirror/keymap/vim.js"></script>
<script type="text/javascript" src="../static/js/codemirror/addon/search/search.js"></script>
<link media="screen" href="../static/js/codemirror/addon/search/matchesonscrollbar.css"/>
<script type="text/javascript" src="../static/js/codemirror/addon/search/matchesonscrollbar.js"></script>

<!--支持代码折叠-->
<link media="screen" rel="stylesheet" href="../static/js/codemirror/addon/fold/foldgutter.css"/>
<script type="text/javascript" src="../static/js/codemirror/addon/fold/brace-fold.js"></script>
<script type="text/javascript" src="../static/js/codemirror/addon/fold/comment-fold.js"></script>
<script type="text/javascript" src="../static/js/codemirror/addon/fold/foldcode.js"></script>
<script type="text/javascript" src="../static/js/codemirror/addon/fold/foldgutter.js"></script>
<script type="text/javascript" src="../static/js/codemirror/addon/fold/indent-fold.js"></script>
<script type="text/javascript" src="../static/js/codemirror/addon/fold/markdown-fold.js"></script>
<script type="text/javascript" src="../static/js/codemirror/addon/fold/xml-fold.js"></script>

<!--全屏模式-->
<link media="screen" rel="stylesheet" href="../static/js/codemirror/addon/display/fullscreen.css"/>
<script type="text/javascript" src="../static/js/codemirror/addon/display/fullscreen.js"></script>
<script type="text/javascript" src="../static/js/codemirror/addon/display/panel.js"></script>
<script type="text/javascript" src="../static/js/codemirror/addon/display/placeholder.js"></script>
<script type="text/javascript" src="../static/js/codemirror/addon/display/rulers.js"></script>

<!--括号匹配-->
<script type="text/javascript" src="../static/js/codemirror/addon/edit/matchbrackets.js"></script>

<!--自动补全-->
<link media="screen" rel="stylesheet" href="../static/js/codemirror/addon/hint/show-hint.css"/>
<script type="text/javscript" src="../static/js/codemirror/addon/hint/anyword-hint.js"></script>
<script type="text/javscript" src="../static/js/codemirror/addon/hint/css-hint.js"></script>
<script type="text/javscript" src="../static/js/codemirror/addon/hint/html-hint.js"></script>
<script type="text/javscript" src="../static/js/codemirror/addon/hint/javascript-hint.js"></script>
<script type="text/javscript" src="../static/js/codemirror/addon/hint/show-hint.js"></script>
<script type="text/javscript" src="../static/js/codemirror/addon/hint/sql-hint.js"></script>
<script type="text/javscript" src="../static/js/codemirror/addon/hint/xml-hint.js"></script>

<!--代码检查错误-->
<link media="screen" rel="stylesheet" href="../static/js/codemirror/addon/lint/lint.css"/>
<script type="text/javascript" src="../static/js/codemirror/addon/lint/lint.js"></script>

<script type="text/javascript" src="../static/js/jquery-1.7.1.min.js"></script>