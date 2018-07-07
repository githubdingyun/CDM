<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DinGYun
  Date: 2018/6/29
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


    <meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no">

    <meta name="renderer" content="webkit">
    <meta name="keywords" >
    <meta name="description">


    <script src="${pageContext.request.contextPath}/static/js/jquery-3.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/jquery-2.1.1.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/video-js.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/base.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/css.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.css">
    <link rel="icon" href="z/ali.jpg" type="image/png">
    <title>详细介绍</title>

</head>

<body class="w100" style="padding-top: 0px;">


<header>
    <div class="container">
        <span>欢迎查看业务详细情况</span>
    </div>
</header>




<div>
    <!--面包屑导航-->
    <div class="container mian-nav">公开课 / ${userCourse.courseTitle}</div>

    <div id="content">


        <div class="intro">
            <div class="container">
                <div class="v-intro">
                    <div class="left">
                        <video
                                width="505"
                                height="280"
                                id="my-player"
                                <%--class="video-js  vjs-big-play-centered vjs-fluid "--%>
                                class="video-js  vjs-big-play-centered  "
                                controls
                                preload="auto"
                                poster="${userVideo.videoImgUrl}"
                                data-setup=''>
                            <source src="${userVideo.videoUrl}" type="video/mp4" />
                            <p class="vjs-no-js">
                                To view this video please enable JavaScript, and consider upgrading to a
                                web browser that
                                <a href="http://videojs.com/html5-video-support/" target="_blank">
                                    supports HTML5 video
                                </a>
                            </p>
                        </video>
                    </div>

                    <div class="right">
                        <p class="right-title">${userVideo.videoTitle}</p>
                        <div class="avatar">
                            <span style="background-image: url(${userSpeaker.speakerHeadUrl})"></span>
                            <p>
                                <b>讲师：${userSpeaker.speakerName}</b><br>
                                <i><strong>${userSpeaker.speakerDesc}</strong></i>
                            </p>
                        </div>
                        <p class="video-intro">
                            <span>本节内容：${userVideo.videoDesc}</span>
                        </p>
                    </div>
                </div>

                <div class="kcjs">
                    <p class="title">课程介绍</p>
                    <p class="content">
                        ${userCourse.courseDesc}</p>
                </div>

            </div>
        </div>
        <!--目录-->
        <div class="catalog">
            <div class="container">
                <p class="title">目录</p>
                <c:forEach items="${videos}" var="i">
                    <c:if test="${userCourse.courseId==i.courseId}">
                        <div class="chapter">
                            <p class="biaoti"><a href="AdminController/videoPlay.do?videoId=${i.videoId}">${i.videoTitle}</a></p>
                            <p class="lecturer"></p>
                            <p class="lecturer">讲师：${userSpeaker.speakerName}</p>
                            <div class="v-info">
                                <span class="count"><img src="z/count.png" alt="">${i.videoPlayNum}</span>
                                <span class="duration"><img src="z/player.png" alt="">${i.videoTime}</span>
                            </div>
                        </div>
                    </c:if>
                </c:forEach>


            </div>
        </div>
    </div>


</div>




</body>
</html>
