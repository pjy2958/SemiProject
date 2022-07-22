<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>계좌조회</title>
	<%@include file="/JSP/include/link.jsp" %>
</head>
<body>
<%@include file="/JSP/include/topMenu.jsp" %>
<div class="container-fluid mt-4 mb-5">
	<div class="container-lg">
		<h3 class="h4 text-success mb-2">출금내역</h3>
		<table class="table table-hover mb-5">
			<thead>
			<tr>
				<th scope="col" class="h5 text-center" style="width: 20%">거래일시</th>
				<th scope="col" class="h5 text-center" style="width: 20%">출금액</th>
				<th scope="col" class="h5 text-center" style="width: 15%">받는 계좌</th>
				<th scope="col" class="h5 text-center" style="width: 15%">메모</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${withdrawTransList}" var="withdraw">
				<tr class="text">
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;${withdraw.transDate}</th>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;${withdraw.transAmount}</th>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;${withdraw.depositAccountNo}</th>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;${withdraw.withdrawTransMemo}</th>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>

	<div class="container-lg">
		<h3 class="h4 text-success mb-2">입금내역</h3>
		<table class="table table-hover mb-5">
			<thead>
			<tr>
				<th scope="col" class="h5 text-center" style="width: 20%">거래일시</th>
				<th scope="col" class="h5 text-center" style="width: 20%">입금액</th>
				<th scope="col" class="h5 text-center" style="width: 15%">보낸 계좌</th>
				<th scope="col" class="h5 text-center" style="width: 15%">메모</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${depositTransList}" var="deposit">
				<tr class="text">
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;${deposit.transDate}</th>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;${deposit.transAmount}</th>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;${deposit.withdrawAccountNo}</th>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;${deposit.depositTransMemo}</th>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</div>
<%@include file="/JSP/include/footer.jsp" %>
<%@include file="/JSP/include/script.jsp" %>
</body>
</html>
