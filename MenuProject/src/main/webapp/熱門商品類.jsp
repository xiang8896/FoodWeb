<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="CSS/HotProducts.css">
    <title>熱門商品類</title>
</head>

<body>
	<%@include file="header.jsp" %>
	<div class="title">
		<p align="center">熱門商品菜單</p>
	</div>
	
    <div class="hotType">
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/牛肉片.jpg" width="600" height="300" alt="牛肉片"></button>
            <h1>牛肉片：40$</h1>
        </div>
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/豬肉片.jpeg" width="600" height="300" alt="豬肉片"></button>
            <h1>豬肉片：40$</h1>
        </div>
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/老油條.jpeg" width="600" height="300" alt="老油條"></button>
            <h1>老油條：40$</h1>
        </div>
    </div>
    <div class="hotType">
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/百頁豆腐.jpeg" width="600" height="300" alt="百頁豆腐"></button>
            <h1>百頁豆腐：20$</h1>
        </div>
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/米血糕.jpeg" width="600" height="300" alt="米血糕"></button>
            <h1>米血糕：20$</h1>
        </div>
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/豆皮.jpeg" width="600" height="300" alt="豆皮"></button>
            <h1>豆皮：20$</h1>
        </div>
    </div>

    <div class="hotType">
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/手工芥末丸.jpeg" width="450" height="300" alt="手工芥末丸"></button>
            <h1>手工芥末丸：10$</h1>
        </div>
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/特製甜不辣.jpeg" width="450" height="300" alt="特製甜不辣"></button>
            <h1>特製甜不辣：10$</h1>
        </div>
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/日本起司球.jpeg" width="450" height="300" alt="日本起司球"></button>
            <h1>日本起司球：10$</h1>
        </div>
        <div class="item">
            <button type="button"><img src="IMG/食材圖片/手工芋頭丸.jpeg" width="450" height="300" alt="手工芋頭丸"></button>
            <h1>手工芋頭丸：10$</h1>
        </div>
    </div>
    <%@include file="footer.jsp" %>
</body>

</html>