<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>파일 하나</h1>
<form method="post" action="upload" 
	enctype="multipart/form-data" accept-charset="utf-8">

	제목: <input type="text" name="title"><br>
	내용: <textarea name="content" cols=30 rows=10></textarea><br>
	파일첨부: <input type="file" name="file"><br>
	<br>
	<input type="submit" value="등록">
</form>
<hr>
<h1>파일 여러개</h1>
<form method="post" action="uploads" 
	enctype="multipart/form-data" accept-charset="utf-8">

	제목: <input type="text" name="title"><br>
	내용: <textarea name="content" cols=30 rows=10></textarea><br>
	파일첨부: <input type="file" name="file" multiple="multiple"><br>
	<br>
	<input type="submit" value="등록">
</form>


<select multiple>
	<option>1</option>
	<option>2</option>
	<option>3</option>
	<option>4</option>
	<option>5</option>
	<option>6</option>
	<option>7</option>
</select>

</body>
</html>