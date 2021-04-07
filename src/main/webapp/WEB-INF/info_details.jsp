<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <%@ include file="header.jsp" %>

</head>

<body style="width: 100%">
<div id="outerdiv"
     style="position:fixed;top:0;left:0;background:rgba(0,0,0,0.7);z-index:2;width:100%;height:100%;display:none;">
    <div id="innerdiv" style="position:absolute;"><img id="bigimg" style="border:2px solid #fff;cursor: pointer;"
                                                       src=""/></div>
</div>
<input type="hidden" name="searchType" id="searchType" value="${searchType}"/>
<input type="hidden" name="searchKey" id="searchKey" value="${searchKey}"/>
<input type="hidden" name="infoId" id="infoId" value="${infoId}"/>
<div id="wrapper">
    <div class="overlay" onclick="javascript:closeMenu();"></div>
    <%@ include file="menus.jsp" %>
    <!-- Page Content -->
    <div id="page-content-wrapper">
        <%@ include file="top_common.jsp" %>


        <div class="container-fluid" style="border-top: 1px solid #000;">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12"
                     style="letter-spacing: 2px;height: 70px;background: #0d0d0d;color:#fff;text-align: center;vertical-align: middle;line-height: 70px;">
                    <a href="/index.do" style="color: #fff">HOMEPAGE</a>
                    / <span class="title_font">${title}</span></div>

            </div>
        </div>


        <div style="display:table;width: 100%;">
            <div style="display:table-row;width: 100%;">
                <div class="left_bg_bar" style="position:relative;display: table-cell;width: 13%;">
                    <div style="position:absolute;right:50px; bottom:0px;">
                        <image src="/images/bottom_tag.png"></image>
                    </div>
                </div>
                <div style="display: table-cell;width:74%;">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-12" style="height:40px "></div>

                        </div>
                    </div>

                    <div class="container-fluid">
                        <div class="row">

                            <div class="col-xs-12 col-sm-12 col-md-12" style="background: #0d0d0d;padding: 50px 70px;">
                                <div style="display:table;min-height:800px;">
                                    <div style="display:table-row;">
                                        <div style="display: table-cell;" id="infoFiles">

                                        </div>
                                        <div style="display: table-cell;width:10px;min-width: 10px;">

                                        </div>
                                        <div style="display: table-cell;width:500px;background:#fff;vertical-align: top;min-width: 340px;min-height:800px;">
                                            <div id="infoContent"></div>
                                            <div style="bottom:50px;position:absolute;padding: 0 40px 50px 40px; "
                                                 id="browserhits">


                                            </div>
                                        </div>
                                    </div>
                                </div>


                            </div>

                        </div>

                    </div>

                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-12" style="height: 40px;">

                            </div>

                        </div>
                    </div>

                    <div class="container-fluid"
                         style="position:relative;padding-left: 0;padding-right: 0;margin-right: 0;margin-left: 0;">
                        <div class="row" style="padding-left: 0;padding-right: 0;margin-right: 0;margin-left: 0;">
                            <div class="col-xs-5 col-sm-5 col-md-5"
                                 style="padding-left: 0;padding-right: 0;margin-right: 0;margin-left: 0;">

                                <div  style="display: table;">
                                    <div style="display: table-row">
                                        <div style="display: table-cell">
                                            <div id="prevInfo" style=" display:inline;"></div>
                                        </div>
                                        <div  style="display: table-cell;">
                                            <div id="prevInfoTag" class='btn-group' role='group'
                                                 style="display:inline;position:absolute;bottom: -1px;display: none;"><a type='button'
                                                                                                           style='height: 65px;padding-top: 20px;'
                                                                                                           class='btn btn-default'>
                                                <svg id="leftMenuTagSvg" xmlns="http://www.w3.org/2000/svg"
                                                     viewBox="0 0 9 15.6" width="10" height="20">
                                                    <path fill="#00f" d="M7 3.9v8.7l2 1.8V0L5 3.6v2.1z"/>
                                                    <path fill="red" d="M1 7.2l4-3.6V2.2L0 6.8l1.9 1.7.3-.3z"/>
                                                    <path fill="#00f" d="M2.2 8.2L5 5.7V3.6L1 7.2z"/>
                                                    <path fill="#f0f" d="M2.2 8.2L5 5.7V3.6L1 7.2z"/>
                                                    <path fill="#0f0" d="M7 15.6v-3l-2-1.8v.4L1.9 8.5.5 9.8z"/>
                                                    <path fill="#00f" d="M5 5.7v5.1l2 1.8V3.9z"/>
                                                    <path fill="#0ff" d="M5 5.7v5.1l2 1.8V3.9z"/>
                                                    <path fill="red" d="M5 10.8L2.2 8.2l-.3.3L5 11.2z"/>
                                                    <path fill="#ff0" d="M5 10.8L2.2 8.2l-.3.3L5 11.2z"/>
                                                    <path fill="#00f" d="M2.2 8.2L5 10.8V5.7z"/>
                                                    <path fill="red" d="M2.2 8.2L5 10.8V5.7z"/>
                                                    <path fill="#fff" d="M2.2 8.2L5 10.8V5.7z"/>
                                                </svg>
                                            </a></div>

                                        </div>
                                    </div>
                                </div>


                            </div>
                            <div class="col-xs-2 col-sm-2 col-md-2">


                            </div>
                            <div class="col-xs-5 col-sm-5 col-md-5"
                                 style="padding-left: 0;padding-right: 0;margin-right: 0;margin-left: 0;">

                                <div class="pull-right"  style=" right: 0;width: auto;position:relative;">
                                    <div id="nextInfoTag" class='btn-group' role='group'
                                         style=" display:inline;position:absolute;bottom: -1px;left:-66px;display:none;"><a
                                            type='button'
                                            style='height: 65px;padding-top: 20px;'
                                            class='btn btn-default'>
                                        <svg id="rightMenuTagSvg" xmlns="http://www.w3.org/2000/svg"
                                             viewBox="0 0 9 15.6" width="10" height="20">
                                            <path fill="#00f" d="M2 3.9v8.7l-2 1.8V0l4 3.6v2.1z"/>
                                            <path fill="red" d="M8 7.2L4 3.6V2.2l5 4.6-1.9 1.7-.3-.3z"/>
                                            <path fill="#00f" d="M6.8 8.2L4 5.7V3.6l4 3.6z"/>
                                            <path fill="#f0f" d="M6.8 8.2L4 5.7V3.6l4 3.6z"/>
                                            <path fill="#0f0" d="M2 15.6v-3l2-1.8v.4l3.1-2.7 1.4 1.3z"/>
                                            <path fill="#00f" d="M4 5.7v5.1l-2 1.8V3.9z"/>
                                            <path fill="#0ff" d="M4 5.7v5.1l-2 1.8V3.9z"/>
                                            <path fill="red" d="M4 10.8l2.8-2.6.3.3L4 11.2z"/>
                                            <path fill="#ff0" d="M4 10.8l2.8-2.6.3.3L4 11.2z"/>
                                            <path fill="#00f" d="M6.8 8.2L4 10.8V5.7z"/>
                                            <path fill="red" d="M6.8 8.2L4 10.8V5.7z"/>
                                            <path fill="#fff" d="M6.8 8.2L4 10.8V5.7z"/>
                                        </svg>
                                    </a></div>

                                    <div id="nextInfo" style=" display:inline;"></div>
                                </div>

                            </div>
                        </div>
                    </div>

                    <div class="container-fluid"
                         style="padding-left: 0;padding-right: 0;margin-right: 0;margin-left: 0;">
                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-12" style="height: 150px">

                            </div>
                        </div>
                    </div>
                    <!-- Footer starts -->
                    <%@ include file="footer.jsp" %>

                    <!-- Footer ends -->
                </div>
                <div class="right_bg_bar" style="margin-right: 0px;padding-right: 0px;display: table-cell;width:13%">

                </div>
            </div>
        </div>


    </div>
    <!-- /#page-content-wrapper -->
</div>
<%@ include file="totop.jsp" %>
<%@ include file="js.jsp" %>
<script src="/js/web/info_details.js"></script>

</body>
</html>