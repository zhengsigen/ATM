<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ATM用户登录</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" href="css/style.css">
</head>
<body>
	
		<form action="/ATM/login" method="post">
			   
			<div class="container">
				       
				<div class="form row">
					           
					<div class="form-horizontal col-md-offset-3" id="login_form">
						               
						<h3 class="form-title">用户登录</h3>
						               
						<div class="col-md-9">
							                   
							<div class="form-group">
								                        <i class="fa fa-user fa-lg"></i>
								                       <input class="form-control required"
									type="text" placeholder="请输入用户名" name="name"
									autofocus="autofocus" maxlength="20" />                    
							</div>
							                   
							<div class="form-group">
								                            <i class="fa fa-lock fa-lg"></i>
								                          <input class="form-control required"
									type="password" placeholder="请输入密码" name="passwd" />
								                   
							</div>

							                   

							<div class="form-group">
								                        <label class="checkbox">       <a
									href="/ATM/resgister">注册用户</a>              
								</label>                   
							</div>

							                   
							<div class="form-group col-md-offset-9">
								                       
								<button type="submit" class="btn btn-success pull-right"
									name="submit">登录</button>
								                   
							</div>
							               
						</div>
						           
					</div>
					       
				</div>
			</div>
		</form>
	
</body>
</html>