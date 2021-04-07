<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <%@ include file="header.jsp" %>

</head>

<body style="width: 100%">
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
                <div class="col-xs-12 col-sm-12 col-md-12 "
                     style="letter-spacing: 2px;height: 70px;background: #0d0d0d;color:#fff;text-align: center;vertical-align: middle;line-height: 70px;">
                    <a href="/index.do" style="color: #fff">HOMEPAGE</a>
                    / <span class="title_font">JOBS & TANLENT</span>
                </div>

            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12" style="height: 30px;">

                </div>

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
                            <div class="col-xs-12 col-sm-12 col-md-12"
                                 style="padding: 20px 60px 50px 60px ;background:#0d0d0d; ">

                                <div style="display:table;">
                                    <div style="display:table-row;">
                                        <div style="display: table-cell;width:30%;background:#fff;vertical-align: top;padding:50px 20px ;">
                                            <div class="content_txt_span " style="background-color: #000;"><span class="content_txt_div_m title_font"
                                                                                 style="background-color: #000;">FILTER JOBS BY</span></div>

                                            <div class="content_spacing"></div>


                                            <ul class='menu_select menu_top list-group' style="color: #fff;">
                                                <li class='list-group-item' style=" text-align: left;padding-top: 0px;padding-left: 0px;">
                                                    <div class='btn-group' role='group' style="width: 100%"><a type='button' style='width: 76%;line-height: 70px;vertical-align: middle;padding: 0 20px; border-right: 1px solid #fff;' class='btn btn-inverse btn-default title_font' href='#'>LOCATION</a> <a type='button' style='width: 19%;line-height: 70px;vertical-align: middle; border-left: 1px solid #fff;' class='btn btn-default' href='#'><svg version="1.2" baseProfile="tiny" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 15.6 9" width="20" height="10"><switch><g><path fill="#00F" d="M3.9 2h8.7l1.8-2H0l3.6 4h2.1z"/><path fill="red" d="M7.2 8L3.6 4H2.2l4.6 5 1.7-1.9-.3-.3z"/><path fill="#00F" d="M8.2 6.8L5.7 4H3.6l3.6 4z"/><path fill="#F0F" d="M8.2 6.8L5.7 4H3.6l3.6 4z"/><path fill="#0F0" d="M15.6 2h-3l-1.8 2h.4L8.5 7.1l1.3 1.4z"/><path fill="#00F" d="M5.7 4h5.1l1.8-2H3.9z"/><path fill="#0FF" d="M5.7 4h5.1l1.8-2H3.9z"/><path fill="red" d="M10.8 4L8.2 6.8l.3.3L11.2 4z"/><path fill="#FF0" d="M10.8 4L8.2 6.8l.3.3L11.2 4z"/><path fill="#00F" d="M8.2 6.8L10.8 4H5.7z"/><path fill="red" d="M8.2 6.8L10.8 4H5.7z"/><path fill="#FFF" d="M8.2 6.8L10.8 4H5.7z"/></g></switch></svg></a></div>
                                                         <ul class='submenu_select list-group'>
                                                            <li class='title_font' >SHANGHAI</li>
                                                             <li class='title_font' >TAIWAN</li>
                                                         </ul>
                                                      </li>

                                              </ul>



                                            <div class="content_spacing"></div>
                                            <div class="content_spacing"></div>
                                            <div style="height: 2px;"></div>
                                            <div class="content_txt_span " style="background-color: #000;"><span class="content_txt_div_m title_font"
                                                                                 style="background-color: #000;">CREATIVE FIELD</span></div>

                                            <div class="content_spacing"></div>
                                            <ul class='menu_select menu_top list-group' style="color: #fff;">
                                                <li class='list-group-item' style=" text-align: left;padding-top: 0px;padding-left: 0px;">
                                                    <div class='btn-group' role='group' style="width: 100%"><a type='button' style='width: 76%;line-height: 70px;vertical-align: middle;padding: 0 20px; border-right: 1px solid #fff;' class='btn btn-inverse btn-default title_font' href='#'>CREATIVE FIELDS</a> <a type='button' style='width: 19%;line-height: 70px;vertical-align: middle; border-left: 1px solid #fff;' class='btn btn-default' href='#'><svg version="1.2" baseProfile="tiny" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 15.6 9" width="20" height="10"><switch><g><path fill="#00F" d="M3.9 2h8.7l1.8-2H0l3.6 4h2.1z"/><path fill="red" d="M7.2 8L3.6 4H2.2l4.6 5 1.7-1.9-.3-.3z"/><path fill="#00F" d="M8.2 6.8L5.7 4H3.6l3.6 4z"/><path fill="#F0F" d="M8.2 6.8L5.7 4H3.6l3.6 4z"/><path fill="#0F0" d="M15.6 2h-3l-1.8 2h.4L8.5 7.1l1.3 1.4z"/><path fill="#00F" d="M5.7 4h5.1l1.8-2H3.9z"/><path fill="#0FF" d="M5.7 4h5.1l1.8-2H3.9z"/><path fill="red" d="M10.8 4L8.2 6.8l.3.3L11.2 4z"/><path fill="#FF0" d="M10.8 4L8.2 6.8l.3.3L11.2 4z"/><path fill="#00F" d="M8.2 6.8L10.8 4H5.7z"/><path fill="red" d="M8.2 6.8L10.8 4H5.7z"/><path fill="#FFF" d="M8.2 6.8L10.8 4H5.7z"/></g></switch></svg></a></div>

                                                    <ul class='submenu_select list-group'>
                                                        <li class='title_font' >ALL CREATIVE FIELDS</li>

                                                    </ul>
                                                </li>

                                            </ul>

                                            <div class="content_spacing"></div>
                                            <div class="content_spacing"></div>
                                            <div style="height: 2px;"></div>
                                            <div class="content_txt_span " style="background-color: #000;"><span class="content_txt_div_m title_font"
                                                                                 style="background-color: #000;margin-top: 2px;">JOB TYPES</span></div>

                                            <div class="content_spacing"></div>
                                            <ul class='menu_select menu_top list-group' style="color: #fff;">
                                                <li class='list-group-item' style=" text-align: left;padding-top: 0px;padding-left: 0px;">
                                                    <div class='btn-group' role='group' style="width: 100%"><a type='button' style='width: 76%;line-height: 70px;vertical-align: middle;padding: 0 20px; border-right: 1px solid #fff;' class='btn btn-inverse btn-default title_font' href='#'>FULL-TIME</a> <a type='button' style='width: 19%;line-height: 70px;vertical-align: middle; border-left: 1px solid #fff;' class='btn btn-default' href='#'><svg version="1.2" baseProfile="tiny" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 15.6 9" width="20" height="10"><switch><g><path fill="#00F" d="M3.9 2h8.7l1.8-2H0l3.6 4h2.1z"/><path fill="red" d="M7.2 8L3.6 4H2.2l4.6 5 1.7-1.9-.3-.3z"/><path fill="#00F" d="M8.2 6.8L5.7 4H3.6l3.6 4z"/><path fill="#F0F" d="M8.2 6.8L5.7 4H3.6l3.6 4z"/><path fill="#0F0" d="M15.6 2h-3l-1.8 2h.4L8.5 7.1l1.3 1.4z"/><path fill="#00F" d="M5.7 4h5.1l1.8-2H3.9z"/><path fill="#0FF" d="M5.7 4h5.1l1.8-2H3.9z"/><path fill="red" d="M10.8 4L8.2 6.8l.3.3L11.2 4z"/><path fill="#FF0" d="M10.8 4L8.2 6.8l.3.3L11.2 4z"/><path fill="#00F" d="M8.2 6.8L10.8 4H5.7z"/><path fill="red" d="M8.2 6.8L10.8 4H5.7z"/><path fill="#FFF" d="M8.2 6.8L10.8 4H5.7z"/></g></switch></svg></a></div>

                                                    <ul class='submenu_select list-group'>
                                                        <li class='title_font' >FULL-TIME</li>
                                                        <li class='title_font' >PART-TIME</li>
                                                    </ul>
                                                </li>

                                            </ul>

                                            <div class="content_spacing"></div>


                                        </div>

                                        <div style="display: table-cell;">
                                            <div class="row" id="recruitContent">

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


<%@ include file="js.jsp" %>
<script src="/js/web/recruit_list.js"></script>

</body>
</html>