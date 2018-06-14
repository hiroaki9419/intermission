<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/musical.css">
<body>
	<div class="musical_box">
		<div class="poster">
			<img src="img/test1.jpg" class="img" >
			<div class="overlay">
				<div class="contents">브라더스 카라마조프ddddddddd</div>
			</div>
		</div>
		<div class="poster">
			<img src="img/test2.jpg" class="img">
			<div class="overlay">뮤지컬이름</div>
		</div>
		<div class="poster">
			<img src="img/test3.jpg" class="img">
			<div class="overlay">뮤지컬이름</div>
		</div>
		<div class="poster">
			<img src="img/test4.jpg" class="img">
			<div class="overlay">뮤지컬이름</div>
		</div>
		<div class="poster">
			<img src="img/test5.jpg" class="img">
			<div class="overlay">뮤지컬이름</div>
		</div>
		<div class="poster">
			<img src="img/test6.jpg" class="img">
			<div class="overlay">뮤지컬이름</div>
		</div>
	</div>

	<jsp:include page="scroll.jsp"></jsp:include><!-- 스크롤 -->
	
</body>
</html>