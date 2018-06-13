<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
.musical_box {
	background-color: gray;
	width: 80%;
	margin: 0 auto;
	text-align: center;
	display: flex;
	flex-wrap: wrap;
}

.musical_box>div {
	background-color: #f1f1f1;
	width: 200px;
	margin: 10px;
	text-align: center;
	line-height: 75px;
	font-size: 30px;
}

</style>

<body>
	<div class="musical_box">
		<div>1</div>
		<div>2</div>
		<div>3</div>
		<div>4</div>
		<div>5</div>
		<div>6</div>
		<div>7</div>
		<div>8</div>
		<div>9</div>
		<div>10</div>
		<div>11</div>
		<div>12</div>
		<div>12</div>
		<div>2</div>
		<div>3</div>
		<div>4</div>
		<div>5</div>
		<div>6</div>
		<div>7</div>
		<div>8</div>
		<div>9</div>
		<div>10</div>
		<div>11</div>
	</div>

	<jsp:include page="scroll.jsp"></jsp:include><!-- 스크롤 -->
</body>
</html>