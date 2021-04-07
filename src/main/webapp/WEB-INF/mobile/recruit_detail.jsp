<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <%@ include file="header.jsp" %>
    <link href="/style/idangerous.swiper.css" rel="stylesheet">
</head>

<body style="width: 100%">
<input type="hidden" name="id" id="id" value="${id}"/>
<div id="wrapper">
    <div class="overlay" onclick="javascript:closeMenu();"></div>
    <%@ include file="menus.jsp" %>
    <!-- Page Content -->
    <div id="page-content-wrapper">
        <%@ include file="top_common.jsp" %>


        <div class="container-fluid" style="border-top: 1px solid #000;">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12 "
                     style="letter-spacing: 2px;height: 70px;background: #0d0d0d;color:#fff;text-align: center;vertical-align: middle;line-height: 70px;">
                    <a href="/index.do" style="color: #fff">HOMEPAGE</a>
                    / <a href="/recruitenlist.do" style="color: #fff"><span class="title_font">JOBS & TANLENT</span></a>
                </div>

            </div>
        </div>

        <div class="container-fluid">
            <div class="row" id="recruitContent">

            </div>



            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12" style="height: 40px;">

                </div>

            </div>



            <!-- Footer starts -->
            <%@ include file="footer.jsp" %>

            <!-- Footer ends -->
        </div>




    </div>
    <!-- /#page-content-wrapper -->
</div>


<%@ include file="../js.jsp" %>
<script src="/js/web/mobile/recruit_detail.js"></script>

</body>
</html>