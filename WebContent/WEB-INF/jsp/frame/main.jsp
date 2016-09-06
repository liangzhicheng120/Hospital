<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="zh-CN">
<head>
<title>首页</title>
<%@include file="../common/head.jsp"%>
<%@include file="../common/tag.jsp"%>
<link href="./resource/css/index.css" rel="stylesheet">
</head>
<body>
	<%@include file="../common/header.jsp"%>
	<%@include file="../common/left.jsp"%>
	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main" id="main">
		<span class="text-center" id="message"></span>
	</div>
	
</body>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="./resource/js/common.js" charset="GBK"></script>
<script src="./resource/js/main.js" charset="GBK"></script>
<script>
	$(function()
	{
		main.main.init();
	});
</script>
</html>