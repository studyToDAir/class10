<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String msg = request.getParameter("msg");
	System.out.println("msg : "+ msg);
%>

<script>
	let m = '<%= msg %>'
	let m2 = '${param.msg}'
	let m3 = "아이디를 입력하세요";
	
	let a = d.qs("#name").value
	<%int abc =%> a 
	
	<% if(msg != null){ %>
	
			alert('<%= msg %>')
	
	<% } %>
// 	<c:if test=""
</script>

</body>
</html>