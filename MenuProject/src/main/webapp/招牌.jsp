<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="CSS/SignBoard.css">
<title>招牌頁面</title>
<style>
* {
	padding: 0;
	margin: 0;
}

.title {
	font-size: 100px;
	color: red;
	margin: 20px 0px;
}

.container {
	width: 1000px;
	margin: auto;
	display: flex;
}

.container .item {
	width: 100%;
	text-align: center;
	margin: 50px 0px 0px;
}

.item button {
	border: none;
}
</style>
</head>
<body>
	<%@include file="header.jsp"%>
	<div class="title">
		<p align="center">招牌菜單</p>
	</div>
	<div class="container">
		<div class="item">
			<button type="button" onclick="location.href=''">
				<img src="IMG/食材圖片/麻辣鴨血.jpeg" width="450" height="300" alt="4568">
			</button>
			<h1>麻辣鴨血：40$</h1>
		</div>
		<div class="item">
			<button type="button" onclick="location.href=''">
				<img src="IMG/食材圖片/麻辣臭豆腐.jpeg" width="450" height="300" alt="4568">
			</button>
			<h1>麻辣臭豆腐：40$</h1>
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>