<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>이체</title>
	<%@include file="/JSP/include/link.jsp" %>
	<script>
        // 계좌잔액 변경
        function changeBallance() {
            var selectAccountBalance = $("#selectAccountForm > option:selected").attr("value2");
            $("#balance").val(selectAccountBalance + "원");
        }
        function checkForm() {
            let form = document.transferForm;
            var selectAccountBalance = $("#selectAccountForm > option:selected").attr("value2");
            if (form.withdrawAccountNo.value == '') {
                form.withdrawAccountNo.focus();
                alert("출금계좌를 선택하세요.")
                return false;
            }
            if (form.password.value == '') {
                form.password.focus();
                alert("출금 비밀번호를 입력하세요.")
                return false;
            }
            if (form.depositBankCode.value == '') {
                form.depositBankCode.focus();
                alert("입금 은행을 선택하세요.")
                return false;
            }
            if (form.depositAccountNo.value == '') {
                form.depositAccountNo.focus();
                alert("입금 계좌번호를 입력하세요.")
                return false;
            }
            if (form.transAmount.value == '') {
                form.transAmount.focus();
                alert("이체 금액을 입력하세요.")
                return false;
            }
            // if (form.transAmount.value > selectAccountBalance) {
            //     form.transAmount.focus();
            //     alert("입력금액이 계좌잔액을 초과했습니다.")
            //     return false;
            // }
            form.onsubmit;
        }
	</script>
</head>
<body>
<%@include file="/JSP/include/topMenu.jsp" %>
<div class="container-fluid mt-4 mb-5">
	<div class="container-lg">
		<h3 class="h3 text-success mb-5">계좌이체</h3>
		<form action="${pageContext.request.contextPath}/transferProcess.do" method="post" name="transferForm" onsubmit="return checkForm()">
			<table class="table table-hover mb-5">
				<thead>
				<tr>
					<th scope="col" class="h5" style="width: 15%">출금정보</th>
					<th class="h5"></th>
				</tr>
				</thead>
				<tbody>
				<tr class="text">
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;계좌선택</th>
					<td>
						<select class="form-select border-1 w-50" name="withdrawAccountNo" id="selectAccountForm"
						        onchange="changeBallance()" style="height: 55px;">
							<option value="" selected disabled>계좌를 선택하세요.</option>
							<c:forEach items="${accountList}" var="account">
								<option value="${account.accountNo}" value2="${account.balance}">${account.accountNo}
									[${account.accountName}]
								</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;계좌잔액</th>
					<td>
						<input type="text" id="balance" class="form-control w-25" readonly>
					</td>
				</tr>
				<tr>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;출금 비밀번호</th>
					<td><input type="text" name="password" class="form-control w-25" maxlength="4" minlength="4" placeholder="4자리비밀번호"></td>
				</tr>
				</tbody>
			</table>

			<table class="table table-hover">
				<thead>
				<tr>
					<th scope="col" class="h5" style="width: 15%">입금정보</th>
					<th class="h5"></th>
				</tr>
				</thead>
				<tbody>
				<tr>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;은행선택</th>
					<td>
						<select class="form-select border-1 w-50" name="depositBankCode" style="height: 55px;">
							<option value="" selected disabled>은행을 선택하세요.</option>
							<c:forEach items="${bankList}" var="bank">
								<option value="${bank.bankCode}">${bank.bankName}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;계좌번호</th>
					<td><input type="text" name="depositAccountNo" class="form-floating form-control w-50"></td>
				</tr>
				<tr>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;이체금액</th>
					<td><input type="number" name="transAmount" class="form-control w-25"></td>
				</tr>
				<tr>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;받는 분 통장 표시</th>
					<td><input type="text" name="depositTransMemo" class="form-control w-50"
					           value="${loginMember.name}"></td>
				</tr>
				<tr>
					<th scope="row" class="text-center align-middle">&nbsp;&nbsp;내 통장 표시</th>
					<td><input type="text" name="withdrawTransMemo" class="form-control w-50"
					           value="${loginMember.name}"></td>
				</tr>
				</tbody>
			</table>
			<button type="submit" class="btn btn-primary w-100 py-3 px-5 mt-3">이체하기</button>
		</form>
	</div>
</div>
<%@include file="/JSP/include/footer.jsp" %>
<%@include file="/JSP/include/script.jsp" %>
</body>
</html>
