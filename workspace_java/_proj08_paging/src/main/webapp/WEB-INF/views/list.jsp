<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>emp 목록</h1>
<%-- 	${list } --%>
	
	<table border=1>
		<thead>
			<tr>
				<th>사원번호 (empno)</th>
				<th>이름 (ename)</th>
				<th>직책 (job)</th>
				<th>관리자번호 (mgr)</th>
				<th>입사일 (hiredate)</th>
				<th>급여 (sal)</th>
				<th>커미션 (comm)</th>
				<th>부서번호 (deptno)</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${list }">
				<tr>
					<td>${dto.empno}</td>
		            <td>${dto.ename}</td>
		            <td>${dto.job}</td>
		            <td>${dto.mgr}</td>
		            <td>${dto.hiredate}</td>
		            <td>${dto.sal}</td>
		            <td>${dto.comm}</td>
		            <td>${dto.deptno}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	이전 
	 
	<a href="list?page=1&size=10">1</a>
	<a href="list?page=2&size=10">2</a>
	3 4 다음
</body>
</html>


















