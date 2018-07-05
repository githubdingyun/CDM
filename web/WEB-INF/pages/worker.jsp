<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>管理平台</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Toastr style -->
    <link href="css/plugins/toastr/toastr.min.css" rel="stylesheet">

    <!-- Gritter -->
    <link href="js/plugins/gritter/jquery.gritter.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/my.css"/>
    
    <link href="css/plugins/dataTables/datatables.min.css" rel="stylesheet">
    
</head>
<body>
    <div id="wrapper">
    	<!--左侧菜单的开始-->
        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav metismenu" id="side-menu">
                    <li class="nav-header">
                        <div class="dropdown profile-element  my-profile-content "> <span>
                            <img alt="image" class="img-circle" src="img/profile.jpg" width=80px; height=80px/>
                             </span>
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold"><div style="font-size: 30px;color: red"></div></strong>
                             </span> <span class="text-muted text-xs block">用户${username}<b class="caret"></b></span> </span> </a>
                            <ul class="dropdown-menu animated fadeInRight m-t-xs">
                                <li><a href="profile.jsp">个人主页</a></li>
                                <li><a href="permission.jsp">我的权限</a></li>
                                <li><a href="mailbox.jsp">我要投诉</a></li>
                                <li class="divider"></li>
                                <li><a href="login.jsp">退出登录</a></li>
                            </ul>
                        </div>
                        <div class="logo-element">
                            IN+
                        </div>
                    </li>
                    <li class="active">
                        <a href="#"><i class="fa fa-th-large"></i> <span class="nav-label">用户管理</span> <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li class="active"><a href="useradd.jsp">添加用户</a></li>
                            <li><a href="worker.jsp">员工信息</a></li>
                            <li><a href="manager.jsp">经理信息</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-th-large"></i> <span class="nav-label">工程管理</span><span class="fa arrow"></span></a>
                         <ul class="nav nav-second-level">
                          <li><a href="construc.jsp">项目信息</a></li>
                             <li><a href="cost.jsp">花费情况</a></li>
                            <li><a href="receipt.jsp">建材资料</a></li>
                            <li><a href="warehouse.jsp">仓库资料</a></li>
                             <li><a href="lease.jsp">工具租赁信息</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-bar-chart-o"></i> <span class="nav-label">详细选项</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level collapse">
                            <li><a href="c3.html">未同意请求</a></li>
                            <li><a href="graph_peity.html">已同意请求</a></li>
                        </ul>
                    </li>
				</ul>
            </div>
        </nav>
			
		<!--左侧菜单的结束-->
        <div id="page-wrapper" class="gray-bg dashbard-1">
        <div class="row border-bottom">
        <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
            <form role="search" class="navbar-form-custom" action="search_results.html">
                <div class="form-group">
                    <input type="text" placeholder="请输入搜索内容" class="form-control" name="top-search" id="top-search">
                </div>
            </form>
        </div>
            <ul class="nav navbar-top-links navbar-right">
                <li>
                    <span class="m-r-sm text-muted welcome-message">欢迎来到管理平台</span>
                </li>
                <li>
                    <a href="login.jsp">
                        <i class="fa fa-sign-out"></i> 注销
                    </a>
                </li>
            </ul>
        </nav>
        </div>
        
<div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
                <div class="col-lg-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>用户列表如下</h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">

                        <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover dataTables-example" >
                    <thead>
                    <tr>
                        <th>工号</th>
                        <th>姓名</th>
                        <th>电话</th>
                        <th>email </th>
                        <th>地址</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                      <tbody>
                    	<c:forEach items="${message}" var="worker">
                    	<tr class="gradeX" id="row">
                    	<td>${worker.wid}</td>
                    	<td>﻿﻿ ${worker.wname}</td>
                        <td>${worker.wphone}</td>
                        <td class="center">${worker.wmail}</td>
                        <td class="center">${worker.username}</td>
                        <td class="center">
                            <a href="#"> <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                              		  查看
                            </button></a>
                              <a href="#"><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal5">
                                 		  删除
                                </button></a>
                            <a href="#"><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal2">
                               		编辑
                            </button></a>
                          
                        </td>
                    </tr>
                    	</c:forEach>
                    	
                        
                  
                    </tbody>
                   <tfoot>
                    <tr>
                        <th>工号</th>
                        <th>姓名</th>
                        <th>电话</th>
                        <th>email </th>
                        <th>地址</th>
                        <th>操作</th>
                    </tr>
                    </tfoot>
                    </table>
                        </div>

                    </div>

                </div>
            </div>
            </div>
        </div>
       
       
    </div>
	</div>
		 <div class="modal inmodal" id="myModal" tabindex="-1" role="dialog" aria-hidden="true">
                                <div class="modal-dialog">
                                <div class="modal-content animated bounceInRight">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                            <i class="fa fa-laptop modal-icon"></i>
                                            <h4 class="modal-title">查看内容</h4>
                                        </div>
                                        <div class="modal-body">
                                            <p><strong>这是这个学生的个人简介</strong> 这个学生长得很好看.</p>
                                                    <div class="form-group"><label>输入评价</label> <input type="email" placeholder="请诚恳的输入你的评价，不要欺骗他" class="form-control"></div>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
                                            <button type="button" class="btn btn-primary">保存设置</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
		<div class="modal inmodal" id="myModal2" tabindex="-1" role="dialog" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content animated flipInY">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                            <h4 class="modal-title">修改学生信息</h4>
                                            <small class="font-bold">请编辑这一个学生的信息</small>
                                        </div>
                                        <div class="modal-body">
                                            <p><strong>输入编辑修改内容</strong> ~~~~~~~~~~~~~~~~~~~·.</p>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
                                            <button type="button" class="btn btn-primary">保存</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
 <div class="modal inmodal fade" id="myModal5" tabindex="-1" role="dialog"  aria-hidden="true">
                                <div class="modal-dialog modal-lg">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                            <h4 class="modal-title">删除学生信息</h4>
                                            <small class="font-bold">在这里删除学生信息</small>
                                        </div>
                                        <div class="modal-body">
                                            <p><strong>你确定删除这个学生吗</strong> 没有后悔药的.</p>
                                        </div>

                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
                                            <button type="button" class="btn btn-primary">删除并退出</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
	
    <!-- Mainly scripts -->
    <script src="js/jquery-3.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

    <script src="js/plugins/dataTables/datatables.min.js"></script>

    <!-- Custom and plugin javascript -->
    <script src="js/inspinia.js"></script>
    <script src="js/plugins/pace/pace.min.js"></script>


    <!-- Toastr -->
    <script src="js/plugins/toastr/toastr.min.js"></script>


    <script>
        $(document).ready(function() {
            setTimeout(function() {
                toastr.options = {
                    closeButton: true,
                    progressBar: true,
                    showMethod: 'slideDown',
                    timeOut: 2000
                };
                toastr.success('欢迎你来到用户管理系统');

            }, 3000);
				});
				
				
		 $(document).ready(function(){
            $('.dataTables-example').DataTable({
            	language: {
            url: 'zh_CN.txt',
        },
                pageLength: 25,
                responsive: true,
                dom: '<"html5buttons"B>lTfgitp',
                buttons: [
                    { extend: 'copy'},
                    {extend: 'csv'},
                    {extend: 'excel', title: 'ExampleFile'},
                    {extend: 'pdf', title: 'ExampleFile'},

                    {extend: 'print',
                     customize: function (win){
                            $(win.document.body).addClass('white-bg');
                            $(win.document.body).css('font-size', '10px');

                            $(win.document.body).find('table')
                                    .addClass('compact')
                                    .css('font-size', 'inherit');
                    }
                    }
                ]

            });

        });
        
//      $(document).ready(function() {
//  $('.dataTables-example').DataTable({
//      language: {
//          url: 'zh_CN.txt',
//      },
//  });
//});

    </script>
</body>
</html>
