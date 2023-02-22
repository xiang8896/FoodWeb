<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>註冊頁面</title>
<style>
table {
	margin: auto;
}

td {
	font-size:25px;
	align: center;
}
</style>
<script type="text/javascript">
	function check() {
		if (document.form.rUserName.value.length == 0) {
			alert("「帳號」一定要填寫哦...");
			return false;
		}
		if (document.form.rUserPass.value.length == 0) {
			alert("「密碼」一定要填寫哦...")
		}
		if (document.form.rUserPass2.value.length == 0) {
			alert("「確認密碼」一定要填寫哦...")
		}
		if (document.form.realName.value.length == 0){
			alert("「姓名」一定要填寫哦...")
		}
		if (document.form.sex.value.length == 0) {
			alert("「性別」一定要勾選哦...")
		}
		if (document.form.rUserEmail.value.length == 0) {
			alert("「電子信箱」一定要填寫哦...")
		}
		if (document.form.phone.value.length == 0) {
			alert("「電話」一定要填寫哦...")
		}
		form.submit();
	}
</script>
	<title>註冊會員</title>
</head>
<body style="background-color:#ffffe0">
	<%@include file="header.jsp"%>
    <p align="center"><img src="IMG/account/加入會員.png"></p>
	<c:if test="${requestScope.errorMessages != null}">
		<ol style='color:red;' align="center">
			<c:forEach var="error" items="${requestScope.errorMessages}">
				<li>${error}</li>
			</c:forEach>
		</ol>
	</c:if>
	
	<c:if test="${requestScope.existUser != null}">
		<ol style='color:red;' align="center">
			<c:forEach var="exist" items="${requestScope.existUser}">
				<li>${exist}</li>
			</c:forEach>
		</ol>
	</c:if>
	
	
	<form action="bbb" method="post" name="form">
		<table border="0" style="border:8px #FFD382 groove;padding='50px'">
			<tr>
				<td>帳　　號：<input type="text" name="rUserName" id="rUserName"
					size="30" maxlength="25" placeholder="請輸入帳號(最少8字元最大16字元)" ></td>
			</tr>
			<tr>
				<td>密　　碼：<input type="password" name="rUserPass" size="30"
					maxlength="25" placeholder="請輸入密碼(最少8字元最大16字元)"></td>
			</tr>
			<tr>
				<td>確認密碼：<input type="password" name="rUserPass2" size="30"
					maxlength="25" placeholder="請輸入確認密碼(最少8字元最大16字元)"></td>
			</tr>
			<tr>
				<td>
					姓　　名：<input type="text" name="realName" size="30" maxlength="25" placeholder="請輸入姓名">
				</td>
			</tr>
			<tr>
				<td>性　　別：<input type="radio" name="sex" value="男">男 <input
					type="radio" name="sex" value="女">女
				</td>
			</tr>
			<tr>
				<td>電子信箱：<input type="email" name="rUserEmail" size="30"
					maxlength="50" placeholder="請輸入電子信箱(ex:12345@gmail.com)">
			</tr>
			<tr>
				<td>手機號碼：<input type="text" name="phone" size="30"
					maxlength="10" placeholder="請輸入10碼手機號碼(ex:0912222555)"></td>
			</tr>
			<tr>
				<td align=center>
					<input type="button" value="註冊" onclick="check()"> 
					<input type="reset" value="重填">
					<input type="button" value="返回登入畫面" onclick="location.href='login.jsp'">
				</td>
			</tr>
		</table>
	</form>
	<%@include file="footer.jsp" %>
</body>
</html>