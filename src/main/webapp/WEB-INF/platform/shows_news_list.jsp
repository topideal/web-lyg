<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <%@ include file="header.jsp" %>

</head>

<body>


<%@ include file="site_header.jsp" %>

<!-- Header starts -->
<%@ include file="top.jsp" %>

<!-- Header ends -->

<!-- Main content starts -->

<div class="content">

    <%@ include file="menus.jsp" %>

    <!-- Sidebar ends -->

    <!-- Main bar -->
    <div class="mainbar">


        <!-- Matter -->

        <div class="matter">
            <div class="container">

                <!-- Today status. jQuery Sparkline plugin used. -->

                <div class="row">
                    <div class="col-md-12">
                        <!-- List starts -->
                        <div class="widget">

                            <div class="widget-head">
                                <div class="pull-left">新闻动态列表</div>
                                <div class="widget-icons pull-right">
                                    <div class="btn-group">
                                        <a class="btn btn-large tip-bottom" onclick="onAdd();" title="新增"><i
                                                class="icon-plus"></i></a>
                                        <!--<a class="btn btn-large tip-bottom" title="编辑"><i class="icon-edit"></i></a>-->
                                        <a class="btn btn-large tip-bottom" title="删除" onclick="onDelAll();"><i
                                                class="icon-trash"></i></a>
                                    </div>

                                    <%-- <a href="#addDataModal" class="btn btn-info" data-toggle="modal"><i class='icon-plus'></i> 新增</a>
 --%>

                                </div>
                                <div class="clearfix"></div>
                            </div>

                            <div class="widget-content">

                                <table id="data_list"
                                       class="table data-table table-hover table-bordered table-striped with-check clearfix">
                                    <thead>
                                    <tr>
                                        <th width="3%"><input type="checkbox" id="title-table-checkbox"
                                                              name="title-table-checkbox"/></th>
                                        <th>封面</th>
                                        <th>标题（英）</th>
                                        <th>标题（中）</th>
                                        <th>日期</th>
                                        <th>排序</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>


                                    </tbody>
                                </table>


                            </div>

                        </div>
                    </div>
                </div>

            </div>
        </div>

        <!-- Matter ends -->

    </div>

    <!-- Mainbar ends -->
    <div class="clearfix"></div>

</div>
<!-- Content ends -->

<!-- Modal -->
<div id="addDataModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="addDataModalLabel"
     aria-hidden="true" data-backdrop="static" data-keyboard="false">
    <div class="modal-dialog">
        <div class="modal-content" style="width:160%;">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title">新闻动态编辑</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" method="post" id="addFm" novalidate="novalidate" class="form-inline">
                    <input type="hidden" name="infoId" id="id"/>
                    <input type="hidden" name="infoResName" id="infoResName"/>



                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label class="col-md-4 control-label">标题（英）</label>
                                <div class="col-md-8">
                                    <input type="text" name="infoTitleEn" id="infoTitleEn" class="form-control"
                                           placeholder="标题（英）">
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <div class="form-group">
                                <label class="col-md-4 control-label">标题（中）</label>
                                <div class="col-md-8">
                                    <input type="text" name="infoTitleCn" id="infoTitleCn" class="form-control"
                                           placeholder="标题（中）">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label class="col-md-4 control-label">内容（英）</label>
                                <div class="col-md-8">
                                    <textarea name="infoRemarkEn" id="infoRemarkEn" rows="10" class="form-control"
                                              placeholder="内容（英）"></textarea>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-6">
                            <div class="form-group">
                                <label class="col-md-4 control-label">内容（中）</label>
                                <div class="col-md-8">
                                    <textarea name="infoRemarkCn" id="infoRemarkCn" rows="10" class="form-control"
                                              placeholder="内容（中）"></textarea>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label class="col-md-4 control-label">封面</label>
                                    <div class="col-md-8">
                                        <div class="row">
                                            <div class="col-md-12">
                                                <div id="container">
                                                    <a class="btn btn-default btn-lg " id="uploadFileBtn" href="#">
                                                        <i class="glyphicon glyphicon-plus"></i>
                                                        <span>选择文件</span>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="col-md-12 ">
                                                <table id="uploadFileTable" class="table table-striped table-hover text-left"
                                                       style="margin-top:10px;display:none">
                                                    <thead>
                                                    <tr>
                                                        <th class="col-md-4 col-xs-4">文件名</th>
                                                        <th class="col-md-2 col-xs-3">大小</th>
                                                        <th class="col-md-6 col-xs-5">操作</th>
                                                    </tr>
                                                    </thead>
                                                    <tbody id="fsUploadProgress">
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label class="col-md-4 control-label">日期</label>
                                <div class="col-md-8">
                                    <input class="form-control" name="infoMonth" id="infoMonth" placeholder="日期"
                                           readonly>

                                    </input>

                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">


                            <div class="form-group">
                                <label class="col-md-4 control-label">排序</label>
                                <div class="col-md-8">
                                    <input class="form-control" type="number" name="sortFiled" id="sortFiled" placeholder="排序">

                                    </input>

                                </div>
                            </div>
                        </div>
                    </div>

                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" id="saveDataBtn"><i class='icon-save'></i> 保 存</button>
                <button type="button" class="btn btn-default" data-dismiss="modal" aria-hidden="true"><i
                        class='icon-remove'></i> 关 闭
                </button>

            </div>
        </div>
    </div>
</div>

<!-- Footer starts -->
<%@ include file="footer.jsp" %>

<!-- Footer ends -->

<!-- Scroll to top -->
<span class="totop"><a href="#"><i class="icon-chevron-up"></i></a></span>

<%@ include file="js.jsp" %>
<script src="/js/lyc/shows_news_list.js"></script>

</body>
</html>