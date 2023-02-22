<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="model.MessageBoardEntity"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>留言板</title>
<style>
	
	table,tr,td{
		margin:auto;
	}
</style>
</head>
<body>
	<img src="IMG/talk.jpg">
	<h1 style="color: red;" align='center'>歡迎${sessionScope.login}會員登入，如有問題或建議請在下方留言給我們呦。</h1>
	<div style="text-align:center;vertical-align:middel;">
	<form action="ms" method="post">
		<textarea cols="100" rows="10" name="speech">${param.speech}</textarea>
		<br> <input type="submit" value="送出">
		<button type="button" onclick="location.href='AccountLogout'">登出</button>
	</form>
	</div>
	<c:choose>
		<c:when test="${empty requestScope.messages}">
			<p align="center"><img src="IMG/fig1.jpg"></p>
		</c:when>
		<c:otherwise>
			<table border="1">
				<tbody>
					<c:forEach var="message" items="${requestScope.messages}">
						<tr>
							<td>${message.username}<br> ${message.speech}<br>
								${message.time}
								<form method="post" action="delspeech">
									<input type="hidden" name="time" value="${message.time}">
									<input type="submit" value="刪除">
								</form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:otherwise>
	</c:choose>
</body>
</html>