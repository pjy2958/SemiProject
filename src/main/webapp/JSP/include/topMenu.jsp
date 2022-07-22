<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg bg-white navbar-light sticky-top p-0 border-bottom">
	<a href="/" class="navbar-brand d-flex align-items-center border-end px-4 px-lg-5">
		<h2 class="m-0 text-primary me-3">JYP Bank</h2>
		<img src="icon/bear.png" style="width: 50px; height: 50px"/>
	</a>
	<button type="button" class="navbar-toggler me-4" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarCollapse">
		<div class="navbar-nav ms-auto p-4 p-lg-0">
			<a href="/" class="nav-item nav-link active">Home</a>
			<a href="transfer.do" class="nav-item nav-link">이체</a>
			<a href="myAccount.do" class="nav-item nav-link">계좌조회</a>
			<a href="openAccount.do" class="nav-item nav-link">계좌개설</a>
			<a href="board.do" class="nav-item nav-link">Q&A</a>
			<c:if test="${loginMember eq null}">
				<a href="login.do" class="nav-item nav-link">로그인</a>
			</c:if>
			<c:if test="${loginMember != null}">
				<a href="logout.do" class="nav-item nav-link">로그아웃</a>
			</c:if>
			<c:if test="${loginMember != null}">
				<div class="nav-item dropdown">
					<a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">마이페이지</a>
					<div class="dropdown-menu bg-light m-0 border border-1 border-light">
						<a href="#" class="dropdown-item">개인정보수정</a>
						<a href="#" class="dropdown-item">통장관리</a>
					</div>
				</div>
			</c:if>
		</div>
		<a href="" class="btn btn-primary rounded-0 py-4 px-lg-5 d-none d-lg-block">API 설명서<i
				class="fa fa-arrow-right ms-3"></i></a>
	</div>
</nav>