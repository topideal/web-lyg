<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String url = "url/index.do";
    url = request.getServletPath();
%>

<!-- Sidebar -->
<div class="sidebar">
    <div class="sidebar-dropdown"><a href="#">导航</a></div>

    <!--- Sidebar navigation -->
    <!-- If the main navigation has sub navigation, then add the class "has_sub" to "li" of main navigation. -->
    <ul id="nav">
        <!-- Main menu with font awesome icon -->
        <li><a href="/platform/url/index.do" class="<%=url.indexOf("index")>0?"open subdrop":""%>"><i class="icon-home"></i>管理员列表</a>
            <!-- Sub menu markup
            <ul>
              <li><a href="#">Submenu #1</a></li>
              <li><a href="#">Submenu #2</a></li>
              <li><a href="#">Submenu #3</a></li>
            </ul>-->
        </li>
        <li class="has_sub"><a href="#" class="<%=url.indexOf("classified_")>0?"open subdrop":""%>"><i
                class="icon-list-alt"></i> 信息管理 <span class="pull-right"><i
                class="icon-chevron-right"></i></span></a>
            <ul style="<%=url.indexOf("classified_")>0?"display: block;":"display: none;"%>">
                <li><a href="/platform/url/classified_list.do" style="<%=url.indexOf("classified_list")>0?"background-color: #e6e6e6;":""%>">信息类型</a></li>
                <li><a href="/platform/url/classified_info_list.do" style="<%=url.indexOf("classified_info_list")>0?"background-color: #e6e6e6;":""%>">作品信息管理</a></li>
            </ul>
        </li>


    </ul>
</div>