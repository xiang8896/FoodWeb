<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="CSS/Noodle.css" type="text/css">
    <title>麵類菜單</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="title">
		<p align="center">麵類菜單</p>
	</div>
    <div class="noodleType">
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/韓國拉麵.jpeg" width="1240" height="500"></button>
            <h1>韓國拉麵：40$</h1>
        </div>
    </div>

    <div class="noodleType">
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/王子麵.jpeg" width="400" height="300"></button>
            <h1>王子麵：20$</h1>
        </div>

        <div class="item">
            <button type="button"><img src="IMG/食材圖片/蒸煮麵.jpeg" width="400" height="300"></button>
            <h1>蒸煮麵：20$</h1>
        </div>

        <div class="item">
            <button type="button"><img src="IMG/食材圖片/雞絲麵.jpeg" width="400" height="300"></button>
            <h1>雞絲麵：20$</h1>
        </div>
    </div>

    <div class="noodleType">
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/寬冬粉.jpeg" width="610" height="300"></button>
            <h1>寬冬粉：20$</h1>
        </div>

        <div class="item">
            <button type="button"><img src="IMG/食材圖片/冬粉.jpeg" width="610" height="300"></button>
            <h1>冬粉：20$</h1>
        </div>
    </div>

    <div class="noodleType">
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/鍋燒意麵.jpeg" width="610" height="300"></button>
            <h1>鍋燒意麵：20$</h1>
        </div>

        <div class="item">
            <button type="button"><img src="IMG/食材圖片/讚岐烏龍麵.jpeg" width="610" height="300"></button>
            <h1>讚岐烏龍麵：20$</h1>
        </div>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>