<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<c:set var="basePath" value="<%=basePath%>>"/>

<html>
<head>
	<script type="text/javascript" src="${basePath}/myScripts/jquery.js"/>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>测试主页</title>
</head>
<body>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			$.post("/getPerson",{name:$("#name").val()},function(date){
				alert(date);
			})
		})
	})
</script>
	<h1>${message}</h1>
	<input type="text" id="name">
	<input type="button" id="btn" value="点击">
</body>
</html>