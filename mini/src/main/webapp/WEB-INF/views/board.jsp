<%@page import="com.mini.board.dto.User"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
					
						<form action="" method="post" class="form-horizontal form-border">
						
						<div class="form-group">
								<label class="col-sm-3 control-label">글 제목</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" name="boardTitle">
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">작성자</label>
								<div class="col-sm-6">
									<input type="text" readonly="readonly" class="form-control"
										value="<%=user.getName()%>" name="writer">
								</div>
							</div>
							
							<input type="hidden" value="<%=user.getId()%>" name="writerId">

							<div class="form-group">
								<label class="col-sm-3 control-label">작성일자</label>
								<div class="col-sm-6">
									<input type="text" readonly="readonly" class="form-control"
										value="<%=now_time%>" name="writeDate">
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-3 control-label">내용</label>
								<div class="col-sm-6">
									<textarea class="form-control" name="boardContents"></textarea>
								</div>
							</div>

						<button type="submit" class="btn btn-primary pull-right">Submit</button>
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
