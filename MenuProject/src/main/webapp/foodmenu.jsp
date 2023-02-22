<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="CSS/SignBoard.css" type="text/css">
	<title>菜單頁面</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="foodKind">
        <div class="type">
            <button type="button" onclick="location.href='招牌.jsp'"><img src="IMG/食材圖片/招牌.jpeg" width="400" height="400"></button>
            <h1>招牌</h1>
        </div>
        <div class="type">
            <button type="button" onclick="location.href='熱門商品類.jsp'"><img src="IMG/index/石材.jpeg" width="400" height="400"></button>
            <h1>熱門商品類</h1>
            
        </div>
        <div class="type">
            <button type="button" onclick="location.href='麵類.jsp'"><img src="IMG/食材圖片/麵類.jpeg" width="400" height="400"></button>
            <h1>麵類</h1>
        </div>
    </div>

    <div class="foodKind">
        <div class="type">
            <button type="button" onclick="location.href='蔬菜菇類.jsp'"><img src="IMG/食材圖片/蔬菜菇類.jpeg" width="600" height="400"></button>
            <h1>蔬菜(菇類)</h1>
        </div>
        <div class="type">
            <button type="button"  onclick="location.href='火鍋滷料類.jsp'"><img src="IMG/食材圖片/火鍋滷料類.jpeg" width="600" height="400"></button>
            <h1>火鍋滷料類</h1>
        </div>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>