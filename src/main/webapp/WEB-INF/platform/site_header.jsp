<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<div class="navbar navbar-fixed-top bs-docs-nav" role="banner">

    <div class="conjtainer">
        <!-- Menu button for smallar screens -->
        <div class="navbar-header">
            <button class="navbar-toggle btn-navbar" type="button" data-toggle="collapse"
                    data-target=".bs-navbar-collapse">
                <span>菜单</span>
            </button>
            <!-- Site name for smallar screens -->
            <a href="/platform/url/index.do" class="navbar-brand hidden-lg">信息管理平台 V1.0</a>
        </div>


        <!-- Navigation starts -->
        <nav class="collapse navbar-collapse bs-navbar-collapse" role="navigation">
            <!-- Links -->
            <ul class="nav navbar-nav pull-right">
                <li class="dropdown pull-right">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="icon-user"></i> 管理员 <b class="caret"></b>
                    </a>

                    <!-- Dropdown menu -->
                    <ul class="dropdown-menu">
                        <%--<li><a href="#"><i class="icon-user"></i> 资料</a></li>
                        <li><a href="#"><i class="icon-cogs"></i> 设置</a></li>--%>
                        <li><a href="/"><i class="icon-off"></i> 退出</a></li>
                    </ul>
                </li>

            </ul>
        </nav>

    </div>
</div>