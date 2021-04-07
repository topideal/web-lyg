﻿<!DOCTYPE html>
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
                                <div class="pull-left">招聘列表（英）</div>
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

                                        <th>职位</th>
                                        <th>工作类型</th>
                                        <th>职位所在地</th>

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
                <h4 class="modal-title">招聘管理</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal" method="post" id="addFm" novalidate="novalidate">
                    <input type="hidden" name="id" id="id"/>
                    <div class="form-group">
                        <label class="col-md-4 control-label">类型</label>
                        <div class="col-md-8">
                            <select class="form-control" name="categoryId" id="categoryId" placeholder="类型">

                            </select>

                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-4 control-label">职位</label>
                        <div class="col-lg-8">
                            <input type="text" name="title" id="title" class="form-control" placeholder="职位">
                        </div>
                    </div>
                    <%--<div class="form-group">
                        <label class="col-md-4 control-label">要求</label>
                        <div class="col-md-8">
                            <textarea name="content" id="content" rows="5" class="form-control"
                                      placeholder="要求"></textarea>
                        </div>
                    </div>--%>

                    <div class="form-group">
                        <label class="col-md-4 control-label">工作描述</label>
                        <div class="col-md-8">
                                    <textarea name="remark" id="remark" rows="5" class="form-control"
                                              placeholder="工作描述"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">我们在寻找的</label>
                        <div class="col-md-8">
                                    <textarea name="skill" id="skill" rows="5" class="form-control"
                                              placeholder="我们在寻找的"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">在我们这能获取的</label>
                        <div class="col-md-8">
                                    <textarea name="experience" id="experience" rows="5" class="form-control"
                                              placeholder="在我们这能获取的"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">工作经验</label>
                        <div class="col-md-8">
                                    <textarea name="edueation" id="edueation" rows="5" class="form-control"
                                              placeholder="工作经验"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-4 control-label">工作地</label>
                        <div class="col-lg-8">
                            <input type="text" name="jobAddr" id="jobAddr" class="form-control"
                                   placeholder="工作地">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-4 control-label">工作类型</label>
                        <div class="col-lg-8">
                            <input type="text" name="salary" id="salary" class="form-control"
                                   placeholder="工作类型">
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
<script src="/js/lyc/shows_recruit_en_list.js"></script>

</body>
</html>