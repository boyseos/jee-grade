<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적관리시스템</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
	<h1>성적입력</h1>
	<form action="<%=request.getContextPath()%>/grade.do" id="grades">
		입학년도 : <input type="text" name="year"/><br />
		민번 : <input type="text" name="ssn" /><br />
		이름 : <input type="text" name="name" /><br />
		국어 : <input type="text" name="kor" /><br />
		영어 : <input type="text" name="eng" /><br />
		수학 : <input type="text" name="math" /><br />
		사회 : <input type="text" name="social" /><br />
		<input type="submit" value="전송" />
	</form>
</body>
<script>
$('#grades').submit(function(){
	alert('전송완료')
});
</script>
</html>