<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>로그인</title>
	<%@include file="/JSP/include/link.jsp" %>
	<script>
        function checkForm() {
            let form = document.loginForm;
            if (form.id.value == '') {
                form.id.focus();
                alert("아이디를 입력하세요.")
                return false;
            }
            if (form.password.value == '') {
                form.password.focus();
                alert("비밀번호를 입력하세요.")
                return false;
            }
            form.onsubmit;
        }
	</script>
</head>
<body>
<%@include file="/JSP/include/topMenu.jsp" %>
<div class="container-fluid bg-light overflow-hidden px-lg-0">
	<div class="container contact px-lg-0">
		<div class="row g-0 mx-lg-0">
			<div class="col-lg-6 contact-text py-5 wow fadeIn" data-wow-delay="0.5s" style="margin: 0 auto">
				<div class="p-lg-5 ps-lg-0">
					<h1 class="mb-4">로그인</h1>
					<form action="${pageContext.request.contextPath}/loginProcess.do" name="loginForm" method="post"
					      onsubmit="return checkForm()">
						<div class="row g-3">
							<div class="col-12">
								<div class="form-floating">
									<input type="text" name="id" class="form-control" id="userID"
									       placeholder="아이디를 입력하세요.">
									<label for="userID">아이디</label>
								</div>
							</div>
							<div class="col-12">
								<div class="form-floating">
									<input type="text" name="password" class="form-control" id="userPassword"
									       placeholder="비밀번호를 입력하세요.">
									<label for="userPassword">비밀번호</label>
								</div>
							</div>
							<div class="col col-12 row mt-3">
								<div class="col-6">
									<a href="#">
										<img class="w-100" src="icon/kakaoLogin.png" style="height: 50px">
									</a>
								</div>
								<div class="col-6">
									<a href="#">
										<img class="w-100" src="icon/naverLogin.png" style="height: 50px">
									</a>
								</div>
							</div>
							<p class="mb-2">아직 회원이 아니세요? <a href="register.do">회원가입</a>.</p>
							<div class="col-12">
								<button class="btn btn-primary w-100 py-3 px-5" type="submit">로그인</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="/JSP/include/footer.jsp" %>
<%@include file="/JSP/include/script.jsp" %>
</body>
</html>
