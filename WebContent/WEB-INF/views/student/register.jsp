<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 등록</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<div>
		<h1>학생가입</h1>
		<form id="join_form" action="<%=request.getContextPath()%>/student.do">
			입학연도<input type="text" name="year" /> <br />
			주민번호<input type="text" name="ssn" /> <br />
			이름<input type="text" name="name" /> <br />
			<input type="hidden" name="action" value="join" />
			<input type="submit" value="전송" />
		</form>
	</div>
	<script>
	$('#join_form').submit(function(){
		
	});
	</script>
</body>

</html>