<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>내 통장 목록</title>
	<%@include file="/JSP/include/link.jsp" %>
</head>
<body>
<%@include file="/JSP/include/topMenu.jsp" %>
<div class="container-fluid mt-4 mb-5">
	<div class="container-lg">
		<h3 class="h3 text-success mb-5">조회계좌선택</h3>
		<div class="row">
			<c:forEach items="${accountList}" var="account">
				<div class="col-sm-3">
					<div class="card" style="min-height: 200px; border: 0px">
						<div class="card-body">
							<c:choose>
								<c:when test="${account.productCode == '01'}">
									<a href="accountHistory.do?accountNo=${account.accountNo}" class="text-secondary"
									   methods="post">
										<img src="/icon/card1.png" class="card-img-top">
									</a>
									<p class="card-text text-center mt-2 fs-5">${account.accountNo}
										[${account.accountName}]</p>
								</c:when>
								<c:when test="${account.productCode == '02'}">
									<a href="accountHistory.do?accountNo=${account.accountNo}" class="text-secondary"
									   methods="post">
										<img src="/icon/card2.png" class="card-img-top">
									</a>
									<p class="card-text text-center mt-2 fs-5">${account.accountNo}
										[${account.accountName}]</p>
								</c:when>
								<c:when test="${account.productCode == '03'}">
									<a href="accountHistory.do?accountNo=${account.accountNo}" class="text-secondary"
									   methods="post">
										<img src="/icon/card3.png" class="card-img-top">
									</a>
									<p class="card-text text-center mt-2 fs-5">${account.accountNo}
										[${account.accountName}]</p>
								</c:when>
								<c:when test="${account.productCode == '04'}">
									<a href="accountHistory.do?accountNo=${account.accountNo}" class="text-secondary"
									   methods="post">
										<img src="/icon/card4.png" class="card-img-top">
									</a>
									<p class="card-text text-center mt-2 fs-5">${account.accountNo}
										[${account.accountName}]</p>
								</c:when>
							</c:choose>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</div>
<%@include file="/JSP/include/footer.jsp" %>
<%@include file="/JSP/include/script.jsp" %>
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
</body>
</html>