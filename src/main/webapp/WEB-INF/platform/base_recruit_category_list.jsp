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
                                <div class="pull-left">招聘分类列表</div>
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
                                        <th>分类名称（英）</th>
                                        <th>分类名称（中）</th>

                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>


                                    </tbody>
                                </table>

                                <%-- <div class="widget-foot" >

                                     <ul class="pagination pull-right" id="carousel_type_data_list_pagination"></ul>


                                     <div class="clearfix"></div>

                                 </div>--%>

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
     aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title">分类管理</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" method="post" id="addFm" novalidate="novalidate">
                    <input type="hidden" name="id" id="id"/>

                    <div class="form-group">
                        <label class="col-lg-4 control-label">名称（英）</label>
                        <div class="col-lg-8">
                            <input type="text" name="titleEn" id="titleEn" class="form-control" placeholder="名称（英）">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-4 control-label">名称（中）</label>
                        <div class="col-lg-8">
                            <input type="text" name="titleCn" id="titleCn" class="form-control" placeholder="名称（中）">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">排序</label>
                        <div class="col-md-8">
                            <input type="text" name="orderTag" id="orderTag" class="form-control" placeholder="排序">
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
<script src="/js/lyc/base_recruit_category_list.js"></script>

</body>
</html>