<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>이체</title>
	<%@include file="/JSP/include/link.jsp" %>
</head>
<body>
<%@include file="/JSP/include/topMenu.jsp" %>
<div class="container-fluid mt-4 mb-5" style="min-height: 700px">
	<div class="container-lg">
		<h3 class="h3 text-success mb-5">Q&A게시판</h3>
		<table class="table">
			<thead>
			<tr>
				<th scope="col" width="10%" class="text-center text-secondary">글번호</th>
				<th scope="col" width="50%" class="text-center text-secondary">제목</th>
				<th scope="col" width="15%" class="text-center text-secondary">작성자</th>
				<th scope="col" width="15%" class="text-center text-secondary">작성일</th>
				<th scope="col" width="10%" class="text-center text-secondary">조회수</th>
			</tr>
			</thead>
			<tbody class="table-group-divider">
			<tr>
				<th scope="row" class="text-center text-secondary">1</th>
				<td><a href="#" class="text-secondary">예시용 글제목 1</a></td>
				<td class="text-center text-secondary">홍길동</td>
				<td class="text-center text-secondary">2022/06/07 22:08</td>
				<td class="text-center text-secondary">100000</td>
			</tr>
			<tr>
				<th scope="row" class="text-center">2</th>
				<td>예시용 글제목 2</td>
				<td class="text-center">박길동</td>
				<td class="text-center">2022/06/07 23:08</td>
				<td class="text-center">10000</td>
			</tr>
			</tbody>
		</table>
	</div>
</div>
<%@include file="/JSP/include/footer.jsp" %>
<%@include file="/JSP/include/script.jsp" %>
</body>
</html>
