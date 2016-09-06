<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>登录</title>
<%@include file="../common/head.jsp"%>
<%@include file="../common/tag.jsp"%>
<link href="./resource/css/login.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="form-signin">
			<h2 class="form-signin-heading">后台登陆</h2>
			<input type="text" id="username" class="form-control" placeholder="username"> <input type="password" id="password" class="form-control" placeholder="Password">
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me"> 记住我
				</label>&nbsp;&nbsp;&nbsp;<span id="message"></span>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="button" id="loginBtn">登陆</button>
		</div>
	</div>
</body>
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="./resource/js/common.js" charset="GBK"></script>
<script src="./resource/js/login.js" charset="GBK"></script>
<script>
	$(function(){
		login.dologin.init();
	})
</script>
</html>