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
<button type="button" id="btn4">ajax4 실행</button><br>
<button type="button" id="btn5">ajax5 실행</button><br>
<button type="button" id="btn6">ajax6 실행</button><br>

<div id="keyword">
	<input type="text">
</div>

<table border="1">
	<thead>
		<tr>
			<th>id</th>
			<th>pw</th>
			<th>email</th>
		</tr>
	</thead>
	<tbody id="tbody"></tbody>
</table>

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
	}
	
	const url = 'ajax2'
	fetch(url, {
// 		method: 'get',
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

document.querySelector("#btn5").addEventListener("click", async function(){
	console.log("btn3 click!")
	
	let param = {
		id: 1234,
	}
	
	const url = 'ajax2'
	const response = await fetch(url, {
		method: 'post',
		headers:{
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(param)
	})
	
	const data = await response.text()
	console.log(data)
	
})

document.querySelector("#btn6").addEventListener("click", async function(){
	console.log("btn6 click!")
	
	let param = {
		id: 1234,
	}
	
// 	const url = 'ajax3'
// 	const url = 'ajax4'
// 	const url = 'ajax5'
	const url = 'ajax6'
	const response = await fetch(url, {
// 		method: 'post',
		method: 'put',
		headers:{
			'Content-Type': 'application/json'
		},
		body: JSON.stringify(param)
	})
	
	const data = await response.json()
// 	const data = await response.text()
// 	console.log(JSON.parse(data))

	console.log(data)
	
	console.log(data.keyword)
	
	document.querySelector("#keyword input").value = data.keyword
	
	console.log(""+data.list[0])
	
	document.getElementById("tbody").innerHTML = ''
	for(let i=0; i<data.list.length; i++){
		document.getElementById("tbody").innerHTML += `
			<tr>
				<td>\${data.list[i].id}</td>
				<td>\${data.list[i].pw}</td>
				<td>\${data.list[i].email}</td>
			</tr>
		`
	}
})

</script>
</body>
</html>
















