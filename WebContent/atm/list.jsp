<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户界面</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>


	<form action="/ATM/addmoney" method="get">

		 请输入金额: <input type="text" name="money" /> <input
			type="submit" value="存款">
		
	</form>
	<form action="/ATM/takemoney" method="get">

		请输入金额: <input type="text" name="money" /> 
		请输入交易密码: <input type="password" name="passwd">
		<input type="submit" value="取款">


	</form>
	 <form action="/ATM/turnmoney" method="post">

		<input type="text" placeholder="请输入转账卡号" name="bank_card" /> 
		<input type="text" placeholder="请输入用户真实姓名" name="name" /> 
		<input type="text" placeholder="请输入转账金额" name="money" /> 
		<input type="submit" value="确认转账">

	</form> 

	
</body>
</html>