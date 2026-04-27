<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	window.addEventListener('load', ()=>{
		bind()
	})
	
	function bind(){
		document
			.querySelector('input[type=submit]')
			.addEventListener('click', function(event){
			console.log('submit')
			
			event.preventDefault();
			
			const menu = document.getElementById('menu').value
			const count = document.getElementById('count').value
			const form = document.querySelector('form')

			let param = {
				menu: menu,
				count: count
			}
			
			fetch("cafe2", {
				method: 'post',
				headers: {
					'Content-Type': 'application/json'
				},
				body: JSON.stringify( param )
			}).then(
					resp => resp.json()
			).then(function(data){
				console.log(data)
				console.log('data.price', data.price)
				console.log('data["menu"]', data["menu"])
			})
			
			form.submit()
		})
		
		
		document.querySelector('#btn')
			.addEventListener('click', function(event){
				const menus = document.querySelector('#menus')
				
				const div = document.createElement('div')
				div.setAttribute('class', 'menu')
				div.classList.add('menu')
				div.innerHTML = `
					종류 : <select name="menu" id=menu>
								<option value="americano">americano</option>
								<option value="cider">cider</option>
								<option value="latte">latte</option>
								<option value="peppermint">peppermint</option>
							</select>
					개수 : <input type="number" name="count" id=count>
				`
				
				menus.append( div )
			})
		
			
		document
			.querySelector('#submit2')
			.addEventListener('click', function(event){
			console.log('submit2')
			
			event.preventDefault();
			
			
			let orders = []
			const menus = document.querySelectorAll('.menu')
			for(let i=0; i<menus.length; i++){
				menu = menus[i].querySelector('#menu').value
				count = menus[i].querySelector('#count').value
				
				let param = {
					menu: menu,
					count: count
				}
				orders.push(param)
			}
			

			fetch("cafe4", {
				method: 'post',
				headers: {
					'Content-Type': 'application/json'
				},
				body: JSON.stringify( orders )
			}).then(
					resp => resp.json()
			).then(function(data){
				console.log(data)
				console.log('data.price', data.price)
				console.log('data["menu"]', data["menu"])
			})
			
		})
	}
</script>
</head>
<body>
<button type="button" id="btn">메뉴 추가 하기</button>
<!-- <form method="post" action="cafe"> -->
<form method="get" action="cafe3">
	<div id=menus>
		<div class='menu'>
			종류 : <select name="menu" id=menu>
						<option value="americano">americano</option>
						<option value="cider">cider</option>
						<option value="latte">latte</option>
						<option value="peppermint">peppermint</option>
					</select>
		<!-- 			<input type=hidden name=price> -->
			개수 : <input type="number" name="count" id=count>
		</div>
	</div>
	<input type="submit" value="주문하기">
	<input type="submit" id=submit2 value="ajax 주문하기">
</form>
-------------------------<br>
|------ 주문 내역 -----|<br>
-------------------------<br>
품목 / 가격 / 개수<br>
<br>
${menu } / ${price} / ${count }<br>
-----------------<br>
총 액 : ${price*count}  <br>
</body>
</html>