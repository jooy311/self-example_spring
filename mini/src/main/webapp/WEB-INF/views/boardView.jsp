<%@page import="com.mini.board.dto.User"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	SimpleDateFormat pattern = new SimpleDateFormat("yyyy-MM-dd hh:mm");
	Date now = new Date();
	String now_time = pattern.format(now);
	
	User user = (User)session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
	<h1 class="text-center">글쓰기</h1>
	<br>
	<div class="container">
	<h3 class="pull-right"><%=user.getId() %>님 환영합니다</h3>
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title text-center">글을 작성해주세요</h3>
						<div class="actions pull-right">
							<i class="fa fa-expand"></i> <i class="fa fa-chevron-down"></i> <i
								class="fa fa-times"></i>
						</div>
					</div>
					<div class="panel-body">
					
						<form class="form-horizontal form-border">
						
						<div class="form-group">
								<label class="col-sm-3 control-label">글 제목</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" readonly="readonly" name="boardTitle" value="${detailView.boardTitle}">
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">작성자</label>
								<div class="col-sm-6">
									<input type="text" readonly="readonly" class="form-control"
										value="${detailView.writer }" name="writer">
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">작성일자</label>
								<div class="col-sm-6">
									<input type="text" readonly="readonly" class="form-control"
										value="${detailView.writeDate}" name="writeDate">
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">내용</label>
								<div class="col-sm-6">
									<textarea class="form-control" readonly="readonly" name="boardContents">${detailView.boardContents}</textarea>
								</div>
							</div>
							<c:if test="${detailView.writerId == writerId }">
								<a href="${pageContext.request.contextPath }/updateView_${detailView.boardCode}" class="btn btn-default pull-right" id="updateBtn">수정</a>
								<a href="${pageContext.request.contextPath }/delete_${detailView.boardCode}" class="btn btn-default pull-right" id="deleteBtn">삭제</a>
							</c:if>
							
							<a href="${pageContext.request.contextPath }/board/list" class="btn btn-default pull-right" id="btn">뒤로가기</a>
						</form>

					</div>
				</div>
			</div>
		</div>

	</div>
	<script src="js/jquery-2.1.1.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>
