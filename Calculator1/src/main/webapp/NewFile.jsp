<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp page </title>
<style>
	img{
		height:20%;
		width:20%;
		margin-top:20px;
	}
	body{
		font-size:40px;
		text-align:center;
		background:linear-gradient( to right,#2b40ff,#07121a);
	}
	h1,h3{
		color:white;
		margin:15px;
	}
	input,button{
	font-size:40px;
	color:white;
	border-radius:5%;
	background-color:black;
	border:2px solid white;
	}
	img:hover{
			-ms-transform: scale(1.1);
			-webkit-transform:scale(1.1);
			transform:scale(1.1);
			
	}
</style>
</head>
<body>

<img alt="" src="images/boy.gif">
<h1>Welcome All User !!</h1>
<h1>Joke, of the Day! </h1>

<form action="MyServlet">
		<input name="num1" placeholder="Frist Number" ></input>
		<input name="num2" placeholder="Secound Number" ></input>
		
		<button name="bt1" value="1" >+</button>
		<button name="bt1" value="2" >-</button>
		<button name="bt1" value="3" >*</button>
		<button name="bt1" value="4" >/</button>
				
</form>
<h1>Ans=<%=request.getParameter("ans") %>🚩</h1>

</body>
</html>