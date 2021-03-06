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
	<link href="${pageContext.request.contextPath}/static/css/plugins/steps/jquery.steps.css" rel="stylesheet">
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
		<div id="page-wrapper" class="gray-bg">

			<div class="wrapper wrapper-content animated fadeInRight">

				<div class="row">
					<div class="col-lg-12">
						<div class="ibox">
							<div class="ibox-title">
								<h5>添加公司的一员</h5>
								<div class="ibox-tools">
									<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
									</a> <a class="dropdown-toggle" data-toggle="dropdown" href="#">
										<i class="fa fa-wrench"></i>
									</a>
									<ul class="dropdown-menu dropdown-user">
										<li><a href="#">Config option 1</a></li>
										<li><a href="#">Config option 2</a></li>
									</ul>
									<a class="close-link"> <i class="fa fa-times"></i>
									</a>
								</div>
							</div>
							<div class="ibox-content">
								<h2>你需要要记住你的注册信息~</h2>
								<p>请按照以下注册步骤完成注册~</p>

								<form id="form" action="${pageContext.request.contextPath}/WorkerController/add.do" class="wizard-big">
									<h1>账户</h1>
									<fieldset>
										<h2>账户信息</h2>
										<div class="row">
											<div class="col-lg-8">
												<div class="form-group">
													<label>Username *</label> <input id="userName"
														name="userName" type="text" placeholder="用户名"
														class="form-control required">
												</div>
												<div class="form-group">
													<label>Password *</label> <input id="password"
														name="password" type="text" placeholder="密码"
														class="form-control required">
												</div>
												<div class="form-group">
													<label>Confirm Password *</label> <input id="confirm"
														name="confirm" type="text" placeholder="重复密码"
														class="form-control required">
												</div>
											</div>
											<div class="col-lg-4">
												<div class="text-center">
													<div style="margin-top: 20px">
														<i class="fa fa-sign-in"
															style="font-size: 180px; color: #e5e5e5"></i>
													</div>
												</div>
											</div>
										</div>

									</fieldset>
									<h1>个人信息</h1>
									<fieldset>
										<h2>Profile Information</h2>
										<div class="row">
											<div class="col-lg-6">
												<div class="form-group">
													<label>姓名 *</label> <input id="name" name="name"
														type="text" class="form-control required">
												</div>
												<div class="form-group">
													<label>性别 *</label> <input id="surname" name="sex"
														type="text" class="form-control required">
												</div>
											</div>
											<div class="col-lg-6">
												<div class="form-group">
													<label>age *</label> <input id="email" name="age"
														type="text" class="form-control required">
												</div>
												<div class="form-group">
													<label>地址 *</label> <input id="address" name="address"
														type="text" class="form-control required">
												</div>
											</div>
										</div>
									</fieldset>

									<h1>Warning//警告！！</h1>
									<fieldset>
										<div class="text-center" style="margin-top: 120px">
											<h2>马上就要成功了！！</h2>
										</div>
										<div class="col-lg-6">
											<div class="form-group">
												<label>id *</label> <input id="id" name="id" type="text"
													class="form-control required">
											</div>
											<div class="form-group">
												<label>phone *</label> <input id="phone" name="phone"
													type="text" class="form-control required">
											</div>
										</div>
									</fieldset>

									<h1>Finish//完成</h1>
									<fieldset>
										<h2>Terms and Conditions//条款</h2>
										<input id="acceptTerms" name="acceptTerms" type="checkbox"
											class="required"> <label for="acceptTerms">同意这些惨绝人寰的公司条约QAQ</label>
									</fieldset>
								</form>
							</div>
						</div>
					</div>

				</div>
			</div>
			<div class="footer">
				<div class="pull-right">
					10GB of <strong>250GB</strong> Free.
				</div>
				<div>
					<strong>Copyright</strong> Example Company &copy; 2014-2017
				</div>
			</div>

		</div>

	</div>



	<!-- Mainly scripts -->
	<script src="${pageContext.request.contextPath}/static/js/jquery-3.1.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/plugins/metisMenu/jquery.metisMenu.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

	<!-- Custom and plugin javascript -->
	<script src="${pageContext.request.contextPath}/static/js/inspinia.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/plugins/pace/pace.min.js"></script>

	<!-- Steps -->
	<script src="${pageContext.request.contextPath}/static/js/plugins/steps/jquery.steps.min.js"></script>

	<!-- Jquery Validate -->
	<script src="${pageContext.request.contextPath}/static/js/plugins/validate/jquery.validate.min.js"></script>


	<script>
		$(document)
				.ready(
						function() {
							$("#wizard").steps();
							$("#form")
									.steps(
											{
												bodyTag : "fieldset",
												onStepChanging : function(
														event, currentIndex,
														newIndex) {
													// Always allow going backward even if the current step contains invalid fields!
													if (currentIndex > newIndex) {
														return true;
													}

													// Forbid suppressing "Warning" step if the user is to young
													if (newIndex === 3
															&& Number($("#age")
																	.val()) < 18) {
														return false;
													}

													var form = $(this);

													// Clean up if user went backward before
													if (currentIndex < newIndex) {
														// To remove error styles
														$(
																".body:eq("
																		+ newIndex
																		+ ") label.error",
																form).remove();
														$(
																".body:eq("
																		+ newIndex
																		+ ") .error",
																form)
																.removeClass(
																		"error");
													}

													// Disable validation on fields that are disabled or hidden.
													form.validate().settings.ignore = ":disabled,:hidden";

													// Start validation; Prevent going forward if false
													return form.valid();
												},
												onStepChanged : function(event,
														currentIndex,
														priorIndex) {
													// Suppress (skip) "Warning" step if the user is old enough.
													if (currentIndex === 2
															&& Number($("#age")
																	.val()) >= 18) {
														$(this).steps("next");
													}

													// Suppress (skip) "Warning" step if the user is old enough and wants to the previous step.
													if (currentIndex === 2
															&& priorIndex === 3) {
														$(this).steps(
																"previous");
													}
												},
												onFinishing : function(event,
														currentIndex) {
													var form = $(this);

													// Disable validation on fields that are disabled.
													// At this point it's recommended to do an overall check (mean ignoring only disabled fields)
													form.validate().settings.ignore = ":disabled";

													// Start validation; Prevent form submission if false
													return form.valid();
												},
												onFinished : function(event,
														currentIndex) {
													var form = $(this);

													// Submit form input
													form.submit();
												}
											}).validate(
											{
												errorPlacement : function(
														error, element) {
													element.before(error);
												},
												rules : {
													confirm : {
														equalTo : "#password"
													}
												}
											});
						});
	</script>

</body>

</html>

