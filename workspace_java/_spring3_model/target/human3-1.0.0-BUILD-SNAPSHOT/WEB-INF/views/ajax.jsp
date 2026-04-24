<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>ajax.jsp</h1>

<button type="button" id="btn">ajax1 실행</button><br>
<button type="button" id="btn2">ajax2 실행</button><br>
<button type="button" id="btn3">ajax3 실행</button><br>

<script>

document.querySelector("#btn").addEventListener("click", function(){
	console.log("click!")
	
	let url = 'ajax1?id=1234'
	fetch(url, {
		method: 'get'
	}).then(function(response){
		return response.text()
	}).then(function(data){
		console.log(data)
	}).catch(function(error){
		console.error(error)
	})
	
})
document.querySelector("#btn2").addEventListener("click", function(){
	console.log("btn2 click!")
	
	// const form = new FormData()
	// form.append('id', 1234)
	
	let url = 'ajax1'
	fetch(url, {
		method: 'post',
		headers:{
			'Content-Type': 'application/x-www-form-urlencoded'
		},
//		body: form
		body: 'id=1234'
	}).then(function(response){
		return response.text()
	}).then(function(data){
		console.log(data)
	}).catch(function(error){
		console.error(error)
	})
	
})
document.querySelector("#btn3").addEventListener("click", function(){
	console.log("btn3 click!")
	
	let param = {
		id: 1234,
		age: 20
	}
	
	const url = 'ajax1'
	fetch(url, {
		method: 'post',
		headers:{
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(param)
	}).then(function(response){
		return response.text()
	}).then(function(data){
		console.log(data)
	}).catch(function(error){
		console.error(error)
	})
	
})

</script>
</body>
</html>
















