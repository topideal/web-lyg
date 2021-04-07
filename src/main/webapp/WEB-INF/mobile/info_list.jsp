<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <%@ include file="header.jsp" %>

</head>

<body style="width: 100%">
<input type="hidden" name="searchType" id="searchType" value="${searchType}"/>
<input type="hidden" name="searchKey" id="searchKey" value="${searchKey}"/>
<div id="wrapper" >
    <div class="overlay" onclick="javascript:closeMenu();"></div>
    <%@ include file="menus.jsp" %>
    <!-- Page Content -->
    <div id="page-content-wrapper" >
        <%@ include file="top_common.jsp" %>

        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12" style="height:40px "></div>

            </div>
        </div>

        <div class="container-fluid">

            <div class="row">

                <div class="col-xs-12 col-sm-12 col-md-12" style="margin-left: 0;margin-right: 0;padding-left: 15px;padding-right: 0;">
                    <div class="row" id="infoList" style="margin-left: 0;margin-right: 0;padding-left: 0;padding-right: 0;">


                    </div>
                </div>

            </div>
            <div class="row">

                <div class="col-xs-12 col-sm-12 col-md-12" style="height: 50px;">

                </div>

            </div>





            <div class="row">

                <div class="col-xs-12 col-sm-12 col-md-12" style="height: 20px;">

                </div>

            </div>

        </div>

        <!-- Footer starts -->
        <%@ include file="footer.jsp" %>
    </div>
    <!-- /#page-content-wrapper -->
</div>




<%@ include file="../js.jsp" %>
<script src="/js/web/mobile/info_list.js"></script>

</body>
</html>