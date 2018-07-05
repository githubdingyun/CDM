<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>

<head>
<%
session.invalidate();
%>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>登陆~</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

</head>

<body class="gray-bg">

    <div class="loginColumns animated fadeInDown">
        <div class="row">

            <div class="col-md-6">
                <h2 class="font-bold">欢迎来到公司管理平台</h2>
				<p>
						您好！！
					
				</p>
                <p>
                    	登陆这一个界面你能够查询公司的工程进度信息,在这里你能看到各个项目的完成情况，可以方便您对资源的调整~
                </p>

               	<p>
               			当你使用管理员账号登陆的时候，你能够对项目的进度进行修改，也能够添加，删除，修改公司项目的数量~
               		
               	</p>

            </div>
            <div class="col-md-6">
                <div class="ibox-content">
                    <form class="m-t" role="form" action="LoginSvt">
                        <div class="form-group">
                            <input type="text" class="form-control" name="username" placeholder="账号" required="">
                        </div>
                    
                        <div class="form-group">
                            <input type="password" class="form-control" name="password" placeholder="密码" required="">
                        </div>
                        
                        <button type="submit" class="btn btn-primary block full-width m-b">登陆</button>

                        <a href="#">
                            <small>忘记密码</small>
                        </a>

                        <p class="text-muted text-center">
                            <small>没有登陆账号？</small>
                        </p>
                        <a class="btn btn-sm btn-white btn-block" href="register2.html">申请一个账号</a>
                    </form>
                    <p class="m-t" style="text-align: center;">
                        <small>公司管理平台欢迎您的使用</small>
                    </p>
                </div>
            </div>
        </div>
        <hr/>
        <div class="row">
            <div class="col-md-6">
                	@ 2018 -2019	
            </div>
        </div>
    </div>

</body>

</html>
