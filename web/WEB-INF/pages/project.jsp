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

    <jsp:useBean id="worker" scope="session" type="com.cdm.model.Worker"/>

    <!-- Sweet Alert    这是一个跳出漂亮样式模态框的样式-->
    <link href="${pageContext.request.contextPath}/static/css/plugins/sweetalert/sweetalert.css"
          rel="stylesheet">


    <!-- Bootstrap core CSS -->
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
                             </span> <span class="text-muted text-xs block"><c:if
                                    test="${worker.subjectId == 0}">管理员</c:if>
                                <c:if test="${worker.subjectId == 2}">用户</c:if>
                                <c:if test="${worker.subjectId == 1}">项目经理</c:if>
                                ${worker.workerName}
                                <b class="caret"></b></span> </span> </a>
                        <ul class="dropdown-menu animated fadeInRight m-t-xs">
                            <li><a href="${pageContext.request.contextPath}/BaseController/profile.do">个人主页</a></li>
                            <li><a href="${pageContext.request.contextPath}/BaseController/permission.do">我的权限</a></li>
                            <li><a href="${pageContext.request.contextPath}/BaseController/mailbox.do">我要投诉</a></li>
                            <li class="divider"></li>
                            <li><a href="${pageContext.request.contextPath}/WorkerController/loginOut">退出登录</a></li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        IN+
                    </div>
                </li>
                <li class="">
                    <a href="#"><i class="fa fa-th-large"></i> <span class="nav-label">用户管理</span> <span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level">
                        <c:if test="${worker.subjectId == 0}">
                            <li class=""><a
                                    href="${pageContext.request.contextPath}/BaseController/useradd.do">手动添加用户</a></li>
                        </c:if>

                        <li><a href="${pageContext.request.contextPath}/BaseController/base.do">员工信息</a></li>
                        <c:if test="${worker.subjectId == 0}">
                            <li><a href="${pageContext.request.contextPath}/BaseController/base.do">经理信息</a></li>
                        </c:if>
                    </ul>
                </li>
                <c:if test="${worker.subjectId <=1}">
                    <li>
                        <a href="#"><i class="fa fa-bar-chart-o"></i> <span class="nav-label">工程管理</span><span
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
                </c:if>
                <li>
                    <a href="#"><i class="fa fa-envelope"></i> <span class="nav-label">站内信箱</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="${pageContext.request.contextPath}/BaseController/message.do">收件箱</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/message.do">发邮件</a></li>
                        <li><a href="${pageContext.request.contextPath}/BaseController/message.do">回收站</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-edit"></i> <span class="nav-label">站内公告</span><span
                            class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <c:if test="${worker.subjectId == 1}">
                            <li><a href="${pageContext.request.contextPath}/BaseController/notice.do">发布公告</a></li>
                        </c:if>
                        <li><a href="${pageContext.request.contextPath}/BaseController/notice.do">查看公告内容</a></li>
                        <c:if test="${worker.subjectId == 1}">
                            <li><a href="${pageContext.request.contextPath}/BaseController/notice.do">删除公告</a></li>
                        </c:if>
                    </ul>
                </li>
                <c:if test="${worker.subjectId <= 1 }">
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
                </c:if>
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
                        <a href="${pageContext.request.contextPath}/WorkerController/loginOut">
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
                                        <th>项目号</th>
                                        <th>项目负责人id</th>
                                        <th>场地id</th>
                                        <th>项目名称</th>
                                        <th>项目预算</th>
                                        <th>项目开始日期</th>
                                        <th>项目截至日期</th>

                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <jsp:useBean id="projects" scope="request" type="java.util.List"/>
                                    <c:forEach items="${projects}" var="i">
                                        <tr class="gradeX" id="row">
                                            <td>${i.projectId}</td>
                                            <td>﻿﻿ ${i.workerId}</td>
                                            <td>﻿﻿ ${i.locationId}</td>
                                            <td>${i.projectTitle}</td>
                                            <td>${i.projectBudget}</td>
                                            <td>${i.projectStartDate}</td>
                                            <td>${i.projectEndDate}</td>
                                            <td class="center">
                                                <a href="${pageContext.request.contextPath}/ProjectController/query.do?projectId=${i.projectId}">
                                                    <button type="button" class="btn btn-primary" data-toggle="modal"
                                                            id="myshow" onclick="myshow(${i})">
                                                        查看介绍
                                                    </button>
                                                </a>


                                                <c:if test="${worker.subjectId == 0 || worker.subjectId == 1}">
                                                    <button type="button" class="btn btn-primary" data-toggle="modal"
                                                            data-target="#myModal">
                                                        编辑
                                                    </button>

                                                    <button type="button" class="btn btn-primary" data-toggle="modal"
                                                            onclick="deleteUser(${i.projectId})">
                                                        删除
                                                    </button>
                                                </c:if>
                                            </td>
                                        </tr>
                                    </c:forEach>


                                    </tbody>
                                    <tfoot>
                                    <tr>
                                        <th>项目号</th>
                                        <th>项目负责人id</th>
                                        <th>场地id</th>
                                        <th>项目名称</th>
                                        <th>项目预算</th>
                                        <th>项目开始日期</th>
                                        <th>项目截至日期</th>

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
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span
                        class="sr-only">Close</span></button>
                <i class="fa fa-laptop modal-icon"></i>
                <h4 class="modal-title">编辑信息</h4>
            </div>
            <div class="modal-body">
                <form class="m-t" role="form" action="${pageContext.request.contextPath}/ProjectController/update.do"
                      method="post">

                    <div class="form-group">
                        项目号:<input class="form-control" type="text" name="projectId" value="" placeholder="项目号">
                    </div>
                    <div class="form-group">
                        项目负责人id:<input class="form-control" type="text" name="workerId" value=""
                                   placeholder="项目负责人id">
                    </div>
                    <div class="form-group">
                        场地id: <input class="form-control" type="text" name="locationId" value="" placeholder="场地id">

                    </div>

                    <div class="form-group">
                        项目名称: <input class="form-control" type="text" name="projectTitle" value=""
                                   placeholder="项目名称">
                    </div>
                    <div class="form-group">
                        项目预算: <input class="form-control" type="text" name="projectBudget" value="" placeholder="项目预算">
                    </div>
                    <div class="form-group">
                        项目开始日期: <input class="form-control" type="text" name="projectStartDate" value=""
                                   placeholder="项目开始日期">
                    </div>
                    <div class="form-group">
                        项目截至日期: <input class="form-control" type="text" name="projectEndDate" value=""
                                      placeholder="项目截至日期">
                    </div>

                    <div class="modal-footer">
                        <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
                        <button type="submit" class="btn btn-primary">保存设置</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<div class="modal inmodal" id="myModal2" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content animated flipInY">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span
                        class="sr-only">Close</span></button>
                <h4 class="modal-title">员工评价</h4>

            </div>
            <div class="modal-body">
                <p><strong>${workers.get(3).workerDesc}</strong> ~~~~~~~~~~~~~~~~~~~·.</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">保存</button>
            </div>
        </div>
    </div>
</div>

<%--<div class="modal inmodal fade" id="myModal5" tabindex="-1" role="dialog"  aria-hidden="true">--%>
<%--<div class="modal-dialog modal-lg">--%>
<%--<div class="modal-content">--%>
<%--<div class="modal-header">--%>
<%--<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>--%>
<%--<h4 class="modal-title">删除学生信息</h4>--%>
<%--<small class="font-bold">在这里删除学生信息</small>--%>
<%--</div>--%>
<%--<div class="modal-body">--%>
<%--<p><strong>你确定删除这个学生吗</strong> 没有后悔药的.</p>--%>
<%--</div>--%>

<%--<div class="modal-footer">--%>
<%--<button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>--%>
<%--<button type="button" class="btn btn-primary">删除并退出</button>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>


<!-- Mainly scripts -->
<script src="${pageContext.request.contextPath}/static/js/jquery-3.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

<script src="${pageContext.request.contextPath}/static/js/plugins/dataTables/datatables.min.js"></script>

<!-- Custom and plugin javascript -->
<script src="${pageContext.request.contextPath}/static/js/inspinia.js"></script>
<script src="${pageContext.request.contextPath}/static/js/plugins/pace/pace.min.js"></script>
<!-- Custom and plugin javascript -->
<script src="${pageContext.request.contextPath}/static/js/plugins/wow/wow.min.js"></script>
<!-- Sweet alert    这个是跳出动态模态框的js-->
<script src="${pageContext.request.contextPath}/static/js/plugins/sweetalert/sweetalert.min.js"></script>

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
<script type="text/javascript">

    // 删除用户ajex
    function deleteUser(id) {
        swal({
            title: "您确定删除此用户信息么?",
            text: "删除后将无法恢复，请谨慎操作！",
            type: "warning",
            showCancelButton: true,
            confirmButtonColor: "#DD6B55",
            confirmButtonText: "确定",
            cancelButtonText: "取消",
            closeOnConfirm: false,
            closeOnCancel: false
        }, function (isConfirm) {
            if (isConfirm) {
                $.ajax({
                    /*这里为请求地址*/
                    url: "${pageContext.request.contextPath}/ProjectController/delete.do?projectId=" + id,
                    dataType: "html",
                    success: function (data) {//意思是如果请求成功，即删除成功
                        // alert(data);
                        $("#table-content").html(data)
                        swal("删除成功！", "您已经永久删除了该用户信息", "success");
                        project.reload(true);
                    },
                    error: function () {//如果请求失败，则弹出下面的提示
                        swal("啊哦，删除失败", "服务器走丢了", "error");
                    }
                });

            } else {
                swal("已取消", "您取消了删除操作！", "error");
            }
        });
    }
</script>

<script type="text/javascript">
    $(document).read(function () {
        $('#myshow').click(function () {
            $("#myModal").modal(options);
        });
    });

    function queryUserInfoByNumber(number) {
        $.ajax({
            url: "queryUserInfo?number=" + number,
            dataType: "html",
            success: function (data) {
                $("#edit-modal-body").html(data);
                $("#edit-modal").show();
            }
        })

    }
</script>
<script type="text/javascript">
    function saveUserInfo() {
        $.ajax({
            url: "saveUserServlet",
            data: $("#edit-form").serialize(),
            dataType: "html",
            success: function (data) {
                $("#edit-modal").hide();
                $("#table-content").html(data)
            }
        })

    }
</script>
</html>
