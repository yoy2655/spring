<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var='root' value='${pageContext.request.contextPath }/' />
<!-- 조회작업  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>우리반 화이팅</title>
<!-- Bootstrap CDN -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>

	<c:import url="/WEB-INF/views/include/topmenu.jsp" />

	<div class="container" style="margin-top: 100px">
		<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm-6">
				<div class="card shadow">
					<div class="card-body">
						<div class="form-group">
							<label for="board_writer_name">작성자</label> <input type="text"
								id="board_writer_name" name="board_writer_name"
								class="form-control" value="${readBean.content_writer_name}" disabled="disabled" />
						</div>
						<div class="form-group">
							<label for="board_date">작성날짜</label> <input type="text"
								id="board_date" name="board_date" class="form-control"
								value="${readBean.content_date}" disabled="disabled" />
						</div>
						<div class="form-group">
							<label for="board_subject">제목</label> <input type="text"
								id="board_subject" name="board_subject" class="form-control"
								value="${readBean.content_subject}" disabled="disabled" />
						</div>
						<div class="form-group">
							<label for="board_content">내용</label>
							<textarea id="board_content" name="board_content"
								class="form-control" rows="10" style="resize: none"
								disabled="disabled">${readBean.content_text}</textarea>
						</div>



						<div class="form-group">
							<div class="text-right">
								<a href="${root }board/main?board_info_idx=${board_info_idx}&page=${page}" class="btn btn-primary">목록보기</a>
								<!--로그인되어있는 사람이 작성자라면(일치) 목록보기, 수정하기, 삭제하기 다보이고 일치하지 않으면 목록보기만 보임 --> 
								<c:if test="${loginBean.user_idx==readBean.content_writer_idx }">
								<a href="${root }board/modify?board_info_idx=${board_info_idx}&content_idx=${content_idx}&page=${page}" class="btn btn-info">수정하기</a> 
								<a href="${root }board/delete?board_info_idx=${board_info_idx}&content_idx=${content_idx}&page=${page}" class="btn btn-danger">삭제하기</a>
								</c:if>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-3"></div>
		</div>
	</div>



	<c:import url="/WEB-INF/views/include/bottom.jsp" />

</body>
</html>
