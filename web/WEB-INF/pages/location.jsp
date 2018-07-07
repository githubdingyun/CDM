<%--
  Created by IntelliJ IDEA.
  User: DinGYun
  Date: 2018/7/6
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="page-wrapper" class="gray-bg dashbard-1">
    <div class="row border-bottom">
        <nav class="navbar navbar-static-top" role="navigation"
             style="margin-bottom: 0">
            <div class="navbar-header">
                <a class="navbar-minimalize minimalize-styl-2 btn btn-primary "
                   href="#"><i class="fa fa-bars"></i> </a>
                <form role="search" class="navbar-form-custom"
                      action="search_results.html">
                    <div class="form-group">
                        <input type="text" placeholder="请输入搜索内容" class="form-control"
                               name="top-search" id="top-search">
                    </div>
                </form>
            </div>
            <ul class="nav navbar-top-links navbar-right">
                <li><span class="m-r-sm text-muted welcome-message">欢迎来到管理平台</span>
                </li>
                <li><a href=""> <i class="fa fa-sign-out"></i> 注销
                </a></li>
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
                            <a class="collapse-link"> <i class="fa fa-chevron-up"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content">

                        <div class="table-responsive">
                            <table
                                    class="table table-striped table-bordered table-hover dataTables-example">
                                <thead>
                                <tr>
                                    <th>工号</th>
                                    <th>姓名</th>
                                    <th>电话</th>
                                    <th>email</th>
                                    <th>地址</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="{message}" var="worker">
                                    <tr class="gradeX" id="row">
                                        <td>{worker.wid}</td>
                                        <td>﻿﻿ {worker.wname}</td>
                                        <td>{worker.wmail}</td>
                                        <td class="center">{worker.wphone}</td>
                                        <td class="center">{worker.username}</td>
                                        <td class="center">
                                            <a href="#">
                                                <button type="button" class="btn btn-primary"
                                                        data-toggle="modal" data-target="#myModal">查看</button>
                                            </a>
                                            <a href="#">
                                                <button type="button" class="btn btn-primary"
                                                        data-toggle="modal" data-target="#myModal5">删除
                                                </button>
                                            </a>
                                            <a href="#">
                                                <button type="button" class="btn btn-primary"
                                                        data-toggle="modal" data-target="#myModal2">编辑</button>
                                            </a> </td>
                                    </tr>
                                </c:forEach>



                                </tbody>
                                <tfoot>
                                <tr>
                                    <th>工号</th>
                                    <th>姓名</th>
                                    <th>电话</th>
                                    <th>email</th>
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


</body>
</html>
