<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>管理平台</title>

    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Toastr style -->
    <link href="${pageContext.request.contextPath}/static/css/plugins/toastr/toastr.min.css" rel="stylesheet">

    <!-- Gritter -->
    <link href="${pageContext.request.contextPath}/static/js/plugins/gritter/jquery.gritter.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/animate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/static/css/style.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/my.css"/>

    <link href="${pageContext.request.contextPath}/static/css/plugins/dataTables/datatables.min.css" rel="stylesheet">

</head>
<body>
<div id="wrapper">
    <!--左侧菜单的开始-->
    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav metismenu" id="side-menu">
                <li class="nav-header">
                    <div class="dropdown profile-element  my-profile-content "> <span>
                            <img alt="image" class="img-circle" src="${worker.workerImgUrl}" width=80px; height=80px/>
                             </span>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold"><div
                                    style="font-size: 30px;color: red"></div></strong>
                             </span> <span class="text-muted text-xs block">用户${worker.workerName}<b
                                    class="caret"></b></span> </span> </a>
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
                    <a href="#"><i class="fa fa-th-large"></i> <span class="nav-label">用户管理</span> <span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li class="active"><a
                                href="${pageContext.request.contextPath}/BaseController/useradd.do">手动添加用户</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/base.do">员工信息</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/base.do">经理信息</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-bar-chart-o"></i>  <span class="nav-label">工程管理</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <li><a href="${pageContext.request.contextPath}/BaseController/project.do">项目信息</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/supplier.do">供应商资料</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/material.do">建材资料</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/warehouse.do">仓库资料</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/location.do">项目场地信息</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/subject.do">部门详情</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-envelope"></i>  <span class="nav-label">站内信箱</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="${pageContext.request.contextPath}/BaseController/message.do">收件箱</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/message.do">发件箱</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/message.do">回收站</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-edit"></i> <span class="nav-label">站内公告</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="${pageContext.request.contextPath}/BaseController/notice.do">发布公告</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/notice.do">查看公告内容</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/notice.do">删除公告</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-desktop"></i> <span class="nav-label">项目详情</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li>
                            <a href="${pageContext.request.contextPath}/BaseController/projectMaterial.do">项目材料需求供应情况</a>
                        </li>
                        <li>
                            <a href="${pageContext.request.contextPath}/BaseController/warehouseMaterial.do">厂库存储货物情况</a>
                        </li>
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
                    <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i>
                    </a>

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
                                <table class="table table-striped table-bordered table-hover dataTables-example">
                                    <thead>
                                    <tr>
                                        <th>工号</th>
                                        <th>部门号</th>
                                        <th>姓名</th>
                                        <th>性别</th>
                                        <th>地址</th>
                                        <th>年龄</th>
                                        <th>电话</th>
                                        <th>emali</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${workers}" var="worker">
                                        <tr class="gradeX" id="row">
                                            <td>${worker.workerId}</td>
                                            <td>﻿﻿ ${worker.subjectId}</td>
                                            <td>﻿﻿ ${worker.workerName}</td>
                                            <td>${worker.workerSex}</td>
                                            <td>${worker.workerAddress}</td>
                                            <td>${worker.workerAge}</td>
                                            <td>${worker.workerPhone}</td>
                                            <td class="center">${worker.workerEmail}</td>
                                            <td class="center">
                                                    <button type="button" class="btn btn-primary" data-toggle="modal"
                                                            data-target="#myModal2" onclick="saveUserInfo()">
                                                        编辑
                                                    </button>

                                                    <button type="button" class="btn btn-primary" data-toggle="modal"
                                                            data-target="#myModal5" onclick="deleteUser(${worker.workerId})">
                                                        删除
                                                    </button>
                                            </td>
                                        </tr>
                                    </c:forEach>


                                    </tbody>
                                    <tfoot>
                                    <tr>
                                        <th>工号</th>
                                        <th>部门号</th>
                                        <th>姓名</th>
                                        <th>性别</th>
                                        <th>地址</th>
                                        <th>年龄</th>
                                        <th>电话</th>
                                        <th>emali</th>
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






<!--编辑的模态框-->
<div class="modal inmodal" id="edit-modal" tabindex="-1" role="dialog"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content animated bounceInRight">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true" id="edit-modal-close1">&times;</span><span
                        class="sr-only">Close</span>
                </button>
                <i class="fa fa-laptop modal-icon"></i>
                <h4 class="modal-title">用户信息</h4>
            </div>
            <div class="modal-body" id="edit-modal-body"></div>
            <div class="modal-footer">
                <button type="button" class="btn btn-white" data-dismiss="modal"
                        id="edit-modal-close">关闭</button>
                <button type="button" class="btn btn-primary"
                        onclick="saveUserInfo()">保存</button>
            </div>
        </div>
    </div>
</div>
<!--增加用户的模态框-->
<div class="modal inmodal" id="addUserInfo" tabindex="-1" role="dialog"
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content animated bounceInRight">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">
                    <span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
                </button>
                <i class="fa fa-laptop modal-icon"></i>
                <h4 class="modal-title">添加用户</h4>
            </div>
            <div class="modal-body">
                <form method="get" class="form-horizontal">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">学号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" value="1111111111">
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
                <button type="submit" class="btn btn-primary">保存</button>
            </div>
        </div>
    </div>
</div>






<!-- Mainly scripts -->
<script src="${pageContext.request.contextPath}/static/js/jquery-3.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

<script src="${pageContext.request.contextPath}/static/js/plugins/dataTables/datatables.min.js"></script>

<!-- Custom and plugin javascript -->
<script src="${pageContext.request.contextPath}/static/js/inspinia.js"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/pace/pace.min.js"></script>


<!-- Toastr -->
<script src="${pageContext.request.contextPath}/static/js/plugins/toastr/toastr.min.js"></script>


<script>
    // 提示用户登陆成功动态效果
    $(document).ready(function () {
        setTimeout(function () {
            toastr.options = {
                closeButton: true,
                progressBar: true,
                showMethod: 'slideDown',
                timeOut: 2000
            };
            toastr.success('欢迎你来到用户管理系统');

        }, 3000);
    });

//把使用的datatables改为中文
    $(document).ready(function () {
        $('.dataTables-example').DataTable({
            language: {
                url: '${pageContext.request.contextPath}/static/zh_CN.txt',
            },
            pageLength: 25,
            responsive: true,
            dom: '<"html5buttons"B>lTfgitp',
            buttons: [
                {extend: 'copy'},
                {extend: 'csv'},
                {extend: 'excel', title: 'ExampleFile'},
                {extend: 'pdf', title: 'ExampleFile'},

                {
                    extend: 'print',
                    customize: function (win) {
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
<script>
    // 删除用户ajex
    function deleteUser(id) {
        swal({
            title : "您确定删除此用户信息么?",
            text : "删除后将无法恢复，请谨慎操作！",
            type : "warning",
            showCancelButton : true,
            confirmButtonColor : "#DD6B55",
            confirmButtonText : "确定",
            cancelButtonText : "取消",
            closeOnConfirm : false,
            closeOnCancel : false
        }, function(isConfirm) {
            if (isConfirm) {
                $.ajax({
                    /*这里为请求地址*/
                    url : "deleteCon?number=" + id,
                    dataType : "html",
                    success : function(data) {//意思是如果请求成功，即删除成功
                        alert(data);
                        $("#table-content").html(data)
                        swal("删除成功！", "您已经永久删除了该用户信息", "success");
                    },
                    error : function() {//如果请求失败，则弹出下面的提示
                        swal("啊哦，删除失败", "服务器走丢了", "error");
                    }
                });

            } else {
                swal("已取消", "您取消了删除操作！", "error");
            }
        });
    };
</script>
<script type="text/javascript">
    function queryUserInfoByNumber(number) {
        $.ajax({
            url : "queryUserInfo?number=" + number,
            dataType : "html",
            success : function(data) {
                $("#edit-modal-body").html(data);
                $("#edit-modal").show();
            }
        })

    }
</script>
<script type="text/javascript">
    function saveUserInfo() {
        $.ajax({
            url : "saveUserServlet",
            data : $("#edit-form").serialize(),
            dataType : "html",
            success : function(data) {
                $("#edit-modal").hide();
                $("#table-content").html(data)
            }
        })

    }
</script>
</html>
