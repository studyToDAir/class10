<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="a" value="10"></c:set>
\${a} : ${a}<br>
<%
	String name = "민수";
%>
\${name } : ${name }<br>
<input value="<%= name %>">

<c:set var="name2" value="<%= name %>" />
\${name2 } : ${name2 }<br>

<%
		int i2 = 10;
		pageContext.setAttribute("p", 10);
%>
<c:set var="a1" value="10" />
<c:set var="a2" value="<%= i2 %>" />
<c:set var="a3" value="${ p }" />

scope : page > request > session > application<br>
<c:set var="name3" value="<%= name %>" scope="page" />
scope 생략하면 page<br>

<c:set var="wish" value="데이트" scope="page" />
<c:set var="wish" value="여행" scope="request" />
<c:set var="wish" value="게임" scope="session" />
<c:set var="wish" value="잠자기" scope="application" />
\${wish } : ${wish }<br>

pageScope : ${pageScope.wish }<br>
requestScope : ${requestScope.wish }<br>
sessionScope : ${sessionScope.wish }<br>
applicationScope : ${applicationScope.wish }<br>

<%-- <jsp:forward page="jstl_5_1_scope.jsp" /> --%>

<hr>

<c:if test="true">
	항상 참<br>
</c:if>

<c:set var="b" value="100"></c:set>
<c:if test="${ b > 10}">
	b는 10보다 큽니다<br>
</c:if>

<c:if test="${ b eq 100}">
	b는 100입니다<br>
</c:if>

<c:if test="${ not (b eq 100) }">
	b는 100이 아닙니다<br>
</c:if>
<%
	int a = 10;
	int b = 20;
	if( a > 5 && b < 100 ){}

	if( !(a > 5 && b < 100) ){}
	
	if( a <=  5 || b >= 100 ){}

%>
<c:choose>
	<c:when test="${b eq 99 }">
		b는 99입니다<br>
	</c:when>
	<c:when test="${b eq 101 }">
		b는 101입니다<br>
	</c:when>
	<c:otherwise>
		b는 99와 101이 아닙니다<br>
	</c:otherwise>
</c:choose>

<hr>
<%
	List list = new ArrayList();
	for(int i=15; i<20; i++){
		Map map = new HashMap();
		map.put("정신연령", i);
		map.put("실제나이", 10+i);
		
		list.add(map);
	}
%>
<c:set var="list2" value="<%= list %>" scope="page" />
첫번째 목록의 "실제나이" 값 출력 : ${ list2[0].실제나이 }<br>

<br>
items<br>
향상된 for문과 비슷하다<br>
<%-- <c:forEach var="m" items="<%= list %>"> --%>
<c:forEach var="m" items="${list2 }">
	정신연령 : ${m.정신연령 }<br>
	실제나이 : ${m.실제나이 }<br>
	<br>
</c:forEach>

<hr>
begin, end<br>
<c:forEach var="i" begin="0" end="3">
	${i}, ${list2[i].정신연령 }<br>
</c:forEach>

<hr>
step<br>
<%-- <c:forEach var="i" begin="0" end="30" step="2"> --%>
<c:forEach var="i" begin="0" end="3" step="2">
	${i}, ${list2[i].정신연령 }<br>
</c:forEach>

<hr>
varStatus<br>
<c:forEach var="i" begin="0" end="4" step="2" varStatus="loop">
	${i}
	<c:if test="${ not loop.last }">
	,
	</c:if>
	<br>
	loop.index : ${loop.index }<br>
	loop.count : ${loop.count}<br>
	loop.first : ${loop.first}<br>
	loop.last : ${loop.last}<br>
	<br>
</c:forEach>

<hr>
items, begin등 같이 사용<br>
<c:forEach var="m" items="${list2}" begin="1" end="3" varStatus="loop">
	${loop.index }, ${m.실제나이 }<br>
</c:forEach>

<hr>
2~9단 출력. 단, 3단 7단은 출력하지 않음<br>
<hr>

c:url 사용 이유<br>
1. context path를 자동으로 추가한다<br>
2. 영어나 숫자 외 문자를 url encoding 해줌<br>
3. 쿠키 금지일 때 ";jsessionid=어쩌고"를 자동으로 붙여줌
<%-- <c:url var="url1" value="el_4.jsp"> --%>
<c:url var="url1" value="/el_4.jsp">
</c:url>
<a href="${url1 }" target="_blank">el_4.jsp</a><br>

<c:url var="url2" value="https://search.naver.com/search.naver">
	<c:param name="query" value="한 글" />
</c:url>
<a href="${url2 }" target="_blank">네이버 검색</a><br>

<hr>
c:out<br>
param.html : ${param.html }<br> : innerHTML
c:out : <c:out value="${param.html }" /> : innerText <br>
<!-- 
	< : &lt;
	> : &gt;
	공백 : &nbsp;
	& : &amp;
 -->
</body>
</html>







