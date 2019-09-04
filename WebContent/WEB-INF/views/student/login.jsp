<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<div>
		<h1>로그인</h1>
		<form id="join_form" action="<%=request.getContextPath()%>/student.do">
			입학연도<input type="text" name="year" /> <br />
			이름<input type="text" name="name" /> <br />
			<input type="hidden" name="action" value="login" />
			<input type="submit" value="전송" />
		</form>
	</div>
	<script>
	$('#join_form').submit(function(){
		
	});
	</script>
</body>
</html>