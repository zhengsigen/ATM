<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  
<meta charset="utf-8">
  
<title>ATM用户注册</title>   
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
      
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	
	<form action="/ATM/resgister" method="post">
		    
		<div class="container">
			       
			<div class="form row">
				           
				<div class="form-horizontal col-md-offset-3" id="login_form">
					               
					<h3 class="form-title">用户注册</h3>
					               
					<div class="col-md-9">
						                   
						<div class="form-group">
							                        <i class="fa fa-user fa-lg"></i>
							                       <input class="form-control required"
								type="text" placeholder="请输入手机号码" name="telNumber"
								autofocus="autofocus" maxlength="20" />                    
						</div>
						<div class="form-group">
							                        <i class="fa fa-user fa-lg"></i>
							                       <input class="form-control required"
								type="text" placeholder="请输入身份证号码" name="idNumber"
								autofocus="autofocus" maxlength="20" />                    
						</div>
						<div class="form-group">
							                        <i class="fa fa-user fa-lg"></i>
							                       <input class="form-control required"
								type="text" placeholder="请输入用户名" name="name"
								autofocus="autofocus" maxlength="20" />                    
						</div>
						                   
						<div class="form-group">
							                            <i class="fa fa-lock fa-lg"></i>
							                          <input class="form-control required"
								type="password" placeholder="请输入登录密码" name="passwd" />
							                   
						</div>
						<div class="form-group">
							                            <i class="fa fa-lock fa-lg"></i>
							                          <input class="form-control required"
								type="password" placeholder="请输入交易密码" name="payPasswd" />
							                   
						</div>

						                   
						
						<div class="form-group">
							                        <label class="checkbox">
								      <a href="/ATM/login">用户登录</a>              
							</label> 
							                  
						</div>

						                   
						<div class="form-group col-md-offset-9">
							                       
							<button type="submit" class="btn btn-success pull-right"
								name="submit">注册</button>
							                   
						</div>
						               
					</div>
					           
				</div>
				       
			</div>
			   
		</div>
	</form>

</body>
</html>