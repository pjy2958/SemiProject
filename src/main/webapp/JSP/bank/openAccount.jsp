<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>계좌개설</title>
	<%@include file="/JSP/include/link.jsp" %>
	<script>
        function checkForm() {
            let form = document.openAccountForm;
            if (form.accountName.value == '') {
                form.accountName.focus();
                alert("계좌별칭을 입력하세요.")
                return false;
            }
            if (form.password.value == '') {
                form.password.focus();
                alert("비밀번호를 입력하세요.")
                return false;
            }
            if (form.password.value.length != 4) {
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
					<h1 class="mb-4">계좌개설</h1>
					<form action="${pageContext.request.contextPath}/openAccountProcess.do" method="post" name="openAccountForm"
					      onsubmit="return checkForm()">
						<div class="row g-3">
							<div class="col-12">
								<div class="form-floating">
									<input type="text" name="accountName" class="form-control" id="accountName"
									       placeholder="계좌별칭을 입력하세요.">
									<label for="accountName">계좌별칭</label>
								</div>
							</div>
							<div class="col-12">
								<div class="form-floating">
									<input type="text" name="password" class="form-control" id="accountPassword"
									       placeholder="password를 입력하세요." maxlength="4">
									<label for="accountPassword">출금비밀번호(4자리)</label>
								</div>
							</div>
							<div class="col-12">
								<div class="form-floating">
									<input type="text" class="form-control" id="accountPassword2"
									       placeholder="password를 입력하세요." maxlength="4">
									<label for="accountPassword2">출금비밀번호확인(4자리)</label>
								</div>
							</div>
							<div class="col-12 col-sm-6">
								<select class="form-select border-0" name="productCode" style="height: 55px;">
									<c:forEach items="${productList}" var="product">
										<option value="${product.productCode}">${product.productName}</option>
									</c:forEach>
								</select>
							</div>
							<div class="col-12">
								<button class="btn btn-primary w-100 py-3 px-5" type="submit">계좌개설</button>
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
