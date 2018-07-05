<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>用户  | 注册 </title>

    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/font-awesome/css/font-awesome.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/animate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel="stylesheet">

</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen   animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">IN+</h1>

            </div>
            <h3>注册成为一名用户</h3>
            <p>在这个界面你能创建你打账号</p>
            <form class="m-t" role="form" action="login.html">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="用户名" name="workerName" required="">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="所在小组号" name="subjectId" required="">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" name="workerPassword" placeholder="密码" required="">
                </div>
                <div class="form-group">
                        <div class="checkbox i-checks"><label> <input type="checkbox"><i></i> 同意用户请求 </label></div>
                </div>
                <button type="submit" class="btn btn-primary block full-width m-b">Register</button>

                <p class="text-muted text-center"><small>已经有了账号？</small></p>
                <a class="btn btn-sm btn-white btn-block" href="login.jsp">Login</a>
            </form>
            <p class="m-t"> <small>design @   by  dingyun   6 &copy; 2018</small> </p>
        </div>
    </div>

    <!-- Mainly scripts -->
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
    <!-- iCheck -->
    <script src="${pageContext.request.contextPath}/static/js/plugins/iCheck/icheck.min.js"></script>
    <script>
        $(document).ready(function(){
            $('.i-checks').iCheck({
                checkboxClass: 'icheckbox_square-green',
                radioClass: 'iradio_square-green',
            });
        });
    </script>
</body>

</html>
