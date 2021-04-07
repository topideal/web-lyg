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


        <div class="container-fluid" style="border-top: 1px solid #000;">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12 "
                     style="letter-spacing: 2px;height: 70px;background: #0d0d0d;color:#fff;text-align: center;vertical-align: middle;line-height: 70px;">
                    <a href="/index.do" style="color: #fff">HOMEPAGE</a>
                    / <span class="title_font">NEWS</span>
                </div>

            </div>
        </div>

        <div style="display:table;width: 100%;">
            <div style="display:table-row;width: 100%;">
                <div class="left_bg_bar" style="position:relative;display: table-cell;width: 12%;">
                    <div style="position:absolute;right:50px; bottom:0px;"><image src="/images/bottom_tag.png"></image></div>
                </div>
                <div style="display: table-cell;width:76%;">

                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-12" style="height:20px "></div>

                        </div>
                    </div>

                    <div class="container-fluid">

                        <div class="row">

                            <div class="col-xs-12 col-sm-12 col-md-12">
                                <div class="row" id="masonry">


                                </div>
                            </div>

                        </div>





                        <div class="row">

                            <div class="col-xs-12 col-sm-12 col-md-12" style="height: 50px;">

                            </div>

                        </div>
                        <div class="row">

                            <div class="col-xs-12 col-sm-12 col-md-12" >
                                <div class="row" style="padding-left: 0;margin-left: 0;">
                                    <div class="col-xs-3 col-sm-3 col-md-3" id="previous" style="padding-left: 0;margin-left: 0;padding-right: 0;margin-right: 0px;">
                                        < PREVIOUS
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6 text-center" id="pages" style="padding-left: 0;margin-left: 0;padding-right: 0;margin-right: 0px;">

                                    </div>
                                    <div class="col-xs-3 col-sm-3 col-md-3 text-right" id="next" style="padding-left: 0;margin-left: 0;padding-right: 0;margin-right: 0px;">
                                        NEXT >
                                    </div>

                                </div>
                            </div>

                        </div>
                        <div class="row">

                            <div class="col-xs-12 col-sm-12 col-md-12" style="height: 20px;">

                            </div>

                        </div>

                    </div>

                    <!-- Footer starts -->
                    <%@ include file="footer.jsp" %>

                    <!-- Footer ends -->
                </div>
                <div class="right_bg_bar" style="margin-right: 0px;padding-right: 0px;display: table-cell;width: 12%">

                </div>
            </div>
        </div>
    </div>
    <!-- /#page-content-wrapper -->
</div>


<%@ include file="totop.jsp" %>

<%@ include file="js.jsp" %>
<script src="/js/web/news_list.js"></script>

</body>
</html>