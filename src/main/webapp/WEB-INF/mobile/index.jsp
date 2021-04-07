<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <%@ include file="header.jsp" %>
    <link href="/style/idangerous.swiper.css" rel="stylesheet">
</head>

<body style="width: 100%">
<input type="hidden" name="searchType" id="searchType" value="${searchType}"/>
<input type="hidden" name="searchKey" id="searchKey" value="${searchKey}"/>
<div id="wrapper">
    <div class="overlay" onclick="javascript:closeMenu();"></div>
    <%@ include file="menus.jsp" %>
    <!-- Page Content -->
    <div id="page-content-wrapper">
        <%@ include file="top_common.jsp" %>

        <%@ include file="carousel.jsp" %>


        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12" style="height:40px "></div>

            </div>
        </div>

        <div class="container-fluid">

            <div class="row">

                <div class="col-xs-12 col-sm-12 col-md-12"
                     style="margin-left: 0;margin-right: 0;padding-left: 15px;padding-right: 0;">
                    <div class="row" id="infoList"
                         style="margin-left: 0;margin-right: 0;padding-left: 0;padding-right: 0;">


                    </div>
                </div>

            </div>
            <div class="row">

                <div class="col-xs-12 col-sm-12 col-md-12" style="height: 50px;">

                </div>

            </div>


            <div class="row">

                <div class="col-xs-12 col-sm-12 col-md-12" style="text-align: center;">
                    <div class='btn-group' role='group'><a type='button'
                                                           style='line-height: 65px;vertical-align: middle;padding: 0 20px; border-right: 1px solid #000;'
                                                           class='btn btn-inverse btn-default title_font' href='/infolist.do'>SHOW
                        MORE</a> <a type='button'
                                    style='line-height: 65px;vertical-align: middle; border-left: 1px solid #000000;'
                                    class='btn btn-default' href='#'>
                        <svg version="1.2" baseProfile="tiny" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 15.6 9"
                             width="20" height="10">
                            <switch>
                                <g>
                                    <path fill="#00F" d="M3.9 2h8.7l1.8-2H0l3.6 4h2.1z"/>
                                    <path fill="red" d="M7.2 8L3.6 4H2.2l4.6 5 1.7-1.9-.3-.3z"/>
                                    <path fill="#00F" d="M8.2 6.8L5.7 4H3.6l3.6 4z"/>
                                    <path fill="#F0F" d="M8.2 6.8L5.7 4H3.6l3.6 4z"/>
                                    <path fill="#0F0" d="M15.6 2h-3l-1.8 2h.4L8.5 7.1l1.3 1.4z"/>
                                    <path fill="#00F" d="M5.7 4h5.1l1.8-2H3.9z"/>
                                    <path fill="#0FF" d="M5.7 4h5.1l1.8-2H3.9z"/>
                                    <path fill="red" d="M10.8 4L8.2 6.8l.3.3L11.2 4z"/>
                                    <path fill="#FF0" d="M10.8 4L8.2 6.8l.3.3L11.2 4z"/>
                                    <path fill="#00F" d="M8.2 6.8L10.8 4H5.7z"/>
                                    <path fill="red" d="M8.2 6.8L10.8 4H5.7z"/>
                                    <path fill="#FFF" d="M8.2 6.8L10.8 4H5.7z"/>
                                </g>
                            </switch>
                        </svg>
                    </a></div>
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
    <!-- /#page-content-wrapper -->
</div>


<%@ include file="../js.jsp" %>
<script src="/js/idangerous.swiper.min.js"></script>
<script src="/js/web/mobile/index.js"></script>

</body>
</html>