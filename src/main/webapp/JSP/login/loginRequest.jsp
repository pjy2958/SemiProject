<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
	var result = confirm("로그인시 이용이 가능합니다.\n로그인하시겠습니까?");
    if(result)
		location.href = "${pageContext.request.contextPath}/login.do";
	else
        location.href = "/";
</script>
