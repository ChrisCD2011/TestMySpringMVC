<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@include file="common/load.jsp"%>
<html>
<head>
	<script type="text/javascript" src="${basePath}/myScripts/jquery.js"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>测试主页</title>
	<script type="text/javascript">
		$(function(){
			$("#btn").click(function(){
				$.post("/getPerson",{name:$("#name").val()},function(data){
					alert(data);
				})
			})
		})
	</script>
</head>
<body>
	<h1>${message}</h1>
	<input type="text" id="name">
	<input type="button" id="btn" value="点击">
</body>
</html>