<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="UTF-8">
<title>登入頁面</title>
<style>
table {
	margin: auto;
}

h1 {
	text-align: center;
}

p {
	margin-top: 50px;
}
</style>
<script type="text/javascript">
	function checkNull(){
		if(document.lForm.lUserName.value.length == 0){
			alert("「帳號」一定要填寫哦...");
			return false;
		}
		if(document.lForm.lUserPass.value.length == 0){
			alert("「密碼」一定要填寫哦...");
			return false;
		}
	}
	lForm.submit();
	
</script>
</head>
<body>
	<%@include file="header.jsp"%>
	<p align="center">
		<img src="IMG/account/login.png">
	</p>
	<h1 style="color:red;">歡迎光臨!!!甲赫滷味的會員。還沒有會員的朋友們請點選下方註冊按鈕幫我們註冊會員感謝您。</h1>
	
	<c:if test="${requestScope.errors != null}">
		<ul style='color:red;' align="center">
		<c:forEach var="error" items="${requestScope.errors}">
			<li>${error}</li>
		</c:forEach>
		</ul>
	</c:if>
	
	<div class="container">
		<div class="row">
			<div class="col"></div>
			<div class="col"></div>
		</div>
		<div class="row">
			<div class="col"></div>
			<div class="col">
				<form action="al" method="post" name="lForm">
					<div class="mb-3" align="center">
						<label for="exampleInputName" class="form-label" ><strong>帳號</strong></label> <input
							type="text" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="請輸入您的帳號" name="lUserName">
						<div id="emailHelp" class="form-text"></div>
					</div>

					<div class="mb-3" align="center">
						<label for="exampleInputPassword1" class="form-label" align="center"><strong>密碼</strong></label> <input
							type="password" class="form-control" id="exampleInputPassword1"
							name="lUserPass" placeholder="請輸入您的密碼">
					</div>

					<div class="mb-3 form-check">
						<input type="checkbox" class="form-check-input" id="exampleCheck1">
						<label class="form-check-label" for="exampleCheck1" name="autoLogin">自動登入</label>
					</div>
					<div class="mb-3 form-check"
						style="text-align: center; padding: 10px">
						<input type="submit" class="btn btn-primary" onclick="checkNull()" value="登入">
						<button type="reset" class="btn btn-warning">清除</button>
						<button type="button" class="btn btn-primary" onclick="location.href='register.jsp'">註冊</button>
					</div>
				</form>
			</div>
			<div class="col"></div>
		</div>
	</div>
	<%@include file="footer.jsp" %>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>