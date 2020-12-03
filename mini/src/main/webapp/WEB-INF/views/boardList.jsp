<%@page import="com.mini.board.dto.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%
	User user = (User)session.getAttribute("loginUser");
%>  
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.css">
	
</head>
<body>
<h1 class="text-center">게시판 목록</h1>
<br>
<div class="container">
<h3 class="pull-right"><%=user.getId() %>님 환영합니다</h3>
<br>
	<table class="table table-striped table-hover">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자 ID</th>
				<th>작성자</th>
				<th>날짜</th>
				<th>조회수</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="board" items="${boardlist }">
				<tr>
					<td>${board.boardCode }</td>
					<td><a href="${pageContext.request.contextPath }/view_${board.boardCode }?writerId=<%=user.getId()%>">${board.boardTitle }</a></td>
					<td class="${board.writerId }">${board.writerId }</td>
					<td>${board.writer }</td>
					<td>${board.writeDate }</td>
					<td>${board.countView }</td>
				
				</tr>
			
			</c:forEach>
		</tbody>
	</table>
	
	<hr>
	<a href="${pageContext.request.contextPath }/board" class="btn btn-default pull-right" id="btn">글쓰기</a>
	
	<div class="text-center">
			<ul class="pagination">
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
			</ul>
		</div>
	</div>
	
	<script src="${pageContext.request.contextPath }/js/jquery-2.1.1.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
</body>
</html>
