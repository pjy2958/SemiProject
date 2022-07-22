<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>회원가입</title>
	<%--	다음 주소찾기 api --%>
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<%@include file="/JSP/include/link.jsp" %>

	<script>
        function checkForm() {
            let form = document.registerForm;
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
            if (form.name.value == '') {
                form.name.focus();
                alert("이름을 입력하세요.")
                return false;
            }
            if (form.emailID.value == '') {
                form.emailID.focus();
                alert("이메일주소를 입력하세요.")
                return false;
            }
            if (form.phoneNumber.value == '') {
                form.phoneNumber.focus();
                alert("전화번호를 입력하세요.")
                return false;
            }
            if (form.phoneNumber.value.length != 11) {
                form.phoneNumber.focus();
                alert("전화번호를 입력하세요.")
                return false;
            }
            if (form.postNumber.value == '') {
                form.postNumber.focus();
                alert("우편번호를 입력하세요.")
                return false;
            }
            if (form.basicAddr.value == '') {
                form.basicAddr.focus();
                alert("주소를 입력하세요.")
                return false;
            }
            if (form.detailAddr.value == '') {
                form.detailAddr.focus();
                alert("상세주소를 입력하세요.")
                return false;
            }
            form.onsubmit;
        }

        function sample6_execDaumPostcode() {
            new daum.Postcode({
                oncomplete: function (data) {
                    // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                    // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                    // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                    var addr = ''; // 주소 변수
                    var extraAddr = ''; // 참고항목 변수

                    //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                    if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                        addr = data.roadAddress;
                    } else { // 사용자가 지번 주소를 선택했을 경우(J)
                        addr = data.jibunAddress;
                    }

                    // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                    if (data.userSelectedType === 'R') {
                        // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                        // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                        if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
                            extraAddr += data.bname;
                        }
                        // 건물명이 있고, 공동주택일 경우 추가한다.
                        if (data.buildingName !== '' && data.apartment === 'Y') {
                            extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                        }
                        // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                        if (extraAddr !== '') {
                            extraAddr = ' (' + extraAddr + ')';
                        }
                        // 조합된 참고항목을 해당 필드에 넣는다.
                        document.getElementById("sample6_extraAddress").value = extraAddr;

                    } else {
                        document.getElementById("sample6_extraAddress").value = '';
                    }

                    // 우편번호와 주소 정보를 해당 필드에 넣는다.
                    document.getElementById('sample6_postcode').value = data.zonecode;
                    document.getElementById("sample6_address").value = addr;
                    // 커서를 상세주소 필드로 이동한다.
                    document.getElementById("sample6_detailAddress").focus();
                }
            }).open();
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
					<h1 class="mb-4">회원가입</h1>
					<form action="${pageContext.request.contextPath}/registerProcess.do" method="post" name="registerForm"
					      onsubmit="return checkForm()">
						<div class="row g-3">
							<div class="col-12">
								<div class="form-floating">
									<input type="text" name="id" class="form-control" id="memberID"
									       placeholder="계좌별칭을 입력하세요.">
									<label for="memberID">아이디</label>
								</div>
							</div>
							<div class="col-12">
								<div class="form-floating">
									<input type="text" name="password" class="form-control" id="memberPassword"
									       placeholder="password를 입력하세요.">
									<label for="memberPassword">비밀번호</label>
								</div>
							</div>
							<div class="col-12">
								<div class="form-floating">
									<input type="text" class="form-control" id="memberPassword2"
									       placeholder="password를 입력하세요.">
									<label for="memberPassword2">비밀번호확인</label>
								</div>
							</div>
							<div class="col-12">
								<div class="form-floating">
									<input type="text" name="name" class="form-control" id="memberName"
									       placeholder="password를 입력하세요.">
									<label for="memberName">이름</label>
								</div>
							</div>
							<div class="col-12">
								<div class="row">
									<div class="form-floating col-6">
										<input type="text" name="emailID" class="form-control" id="emailID"
										       placeholder="password를 입력하세요.">
										<label for="emailID">&nbsp;&nbsp;이메일주소</label>
									</div>
									<div class="form-floating col-6">
										<select name="emailDomain" class="form-select" id="emailDomain">
											<option value="naver.com">naver.com</option>
											<option value="google.com">google.com</option>
										</select>
										<label for="emailDomain">&nbsp;&nbsp;이메일도메인</label>
									</div>
								</div>
							</div>
							<div class="col-12">
								<div class="form-floating">
									<input type="text" name="phoneNumber" class="form-control" id="phoneNumber"
									       placeholder="전화번호를 입력하세요." maxlength="11">
									<label for="phoneNumber">전화번호(숫자만)</label>
								</div>
							</div>
							<div class="col-12">
								<div class="row">
									<div class="form-floating col-8">
										<input type="text" name="postNumber" class="form-control"
										       id="sample6_postcode"
										       placeholder="우편번호를 입력하세요.">
										<label for="sample6_postcode">&nbsp;&nbsp;우편번호</label>
									</div>
									<div class=" col-4">
										<button type="button" class="btn btn-lg btn-primary w-100 h-100"
										        onclick="sample6_execDaumPostcode()">우편번호 찾기
										</button>
									</div>
								</div>
							</div>
							<div class="col-12">
								<div class="form-floating">
									<input type="text" name="basicAddr" class="form-control" id="sample6_address"
									       placeholder="우편번호를 입력하세요.">
									<label for="sample6_address">주소</label>
								</div>
							</div>
							<div class="col-12">
								<div class="form-floating">
									<input type="text" name="detailAddr" class="form-control" id="sample6_detailAddress"
									       placeholder="상세주소를 입력하세요.">
									<label for="sample6_detailAddress">상세주소</label>
								</div>
							</div>
							<div class="col-12">
								<div class="form-floating">
									<input type="text" class="form-control" id="sample6_extraAddress"
									       placeholder="참고항목을 입력하세요.">
									<label for="sample6_address">참고항목</label>
								</div>
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
