<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String url = "url/index.do";
    url = request.getServletPath();
   // System.out.println("url============>"+url);
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
        <li class="has_sub"><a href="#" class="<%=url.indexOf("base_")>0?"open subdrop":""%>"><i
                class="icon-list-alt"></i> 基础数据管理 <span class="pull-right"><i
                class="icon-chevron-right"></i></span></a>
            <ul style="<%=url.indexOf("base_")>0?"display: block;":"display: none;"%>">
                <li><a href="/platform/url/classified_list.do" style="<%=url.indexOf("base_classified_list")>0?"background-color: #e6e6e6;":""%>">分类管理</a></li>
                <li><a href="/platform/url/tags_list.do" style="<%=url.indexOf("base_tags_list")>0?"background-color: #e6e6e6;":""%>">标签管理</a></li>
                <li><a href="/platform/url/country_list.do" style="<%=url.indexOf("base_country_list")>0?"background-color: #e6e6e6;":""%>">城市管理</a></li>
                <li><a href="/platform/url/brands_list.do" style="<%=url.indexOf("base_brands_list")>0?"background-color: #e6e6e6;":""%>">品牌管理</a></li>
                <li><a href="/platform/url/trades_list.do" style="<%=url.indexOf("base_trades_list")>0?"background-color: #e6e6e6;":""%>">行业管理</a></li>
               <li><a href="/platform/url/recruit_category_list.do" style="<%=url.indexOf("base_recruit_category_list")>0?"background-color: #e6e6e6;":""%>">招聘类型管理</a></li>


            <%--<li><a href="/platform/url/years_list.do" style="<%=url.indexOf("base_years_list")>0?"background-color: #e6e6e6;":""%>">年度管理</a></li>--%>




            </ul>
        </li>
        <li class="has_sub"><a href="#" class="<%=url.indexOf("shows_")>0?"open subdrop":""%>"><i
                class="icon-list-alt"></i> 展示信息管理 <span class="pull-right"><i
                class="icon-chevron-right"></i></span></a>
            <ul style="<%=url.indexOf("shows_")>0?"display: block;":"display: none;"%>">
                <li><a href="/platform/url/shows_info_list.do" style="<%=url.indexOf("shows_info")>0?"background-color: #e6e6e6;":""%>">案例管理</a></li>
                <li><a href="/platform/url/shows_news_list.do" style="<%=url.indexOf("shows_news")>0?"background-color: #e6e6e6;":""%>">新闻动态</a></li>
                <li><a href="/platform/url/shows_recruit_en_list.do" style="<%=url.indexOf("shows_recruit_en_list")>0?"background-color: #e6e6e6;":""%>">招聘管理(英)</a></li>
                <li><a href="/platform/url/shows_recruit_cn_list.do" style="<%=url.indexOf("shows_recruit_cn_list")>0?"background-color: #e6e6e6;":""%>">招聘管理(中)</a></li>
            </ul>
        </li>


    </ul>
</div>