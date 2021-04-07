﻿<!DOCTYPE html>
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
                <div class="col-xs-12 col-sm-12 col-md-12"
                     style="letter-spacing: 2px;height: 70px;background: #0d0d0d;color:#fff;text-align: center;vertical-align: middle;line-height: 70px;"><a href="/index.do" style="color: #fff">HOMEPAGE</a>
                    / <span class="title_font" style="line-height: 1.1;">${title}</span></div>

            </div>
        </div>



        <div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12" id="infoFiles">

                </div>

            </div>
        </div>

        <%--<div class="container-fluid">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12">
                    <img src="/images/m_detail_bg.jpg" class="img-responsive">
<div style="position: absolute;left:0;top: 35%;width: 100%">

    <div style="display:table;width: 100%;">
        <div style="display:table-row;width: 100%;">
            <div style="display: table-cell;width:13%;">

            </div>
            <div style="display: table-cell;width:18.5%;" class="center-block text-center">
                <svg version="1.2" baseProfile="tiny" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 28.5 13.5" width="28" height="17"><switch><g><path fill="none" d="M24.9 5.9c.1-.2.1-.4.1-.7 0-.2 0-.4-.1-.6-.3-.3-.7-.6-1.2-.8-.4-.2-.8-.2-1.2-.3.5.3 1 .6 1.5 1 .4.4.7.9.9 1.4zM19.8 8.7c.9.4 2 .4 2.9 0 .4-.2.8-.5 1.2-.8l.1-.1c0-.4-.1-.7-.3-1-.2-.4-.5-.8-.8-1.2-.3-.3-.7-.6-1.2-.8-.5-.2-1-.3-1.5-.3-.2 0-.4 0-.6.1-.3.3-.6.7-.8 1.2-.2.5-.3 1-.3 1.5 0 .2 0 .4.1.6.3.3.7.6 1.2.8zM11.4 9.3l.3-.6c.2-.4.2-.8.3-1.2-.1.3-.3.6-.5.8 0 .3 0 .7-.1 1zM19 3.2c.4-.3.8-.6 1.2-.8 1-.4 2-.5 3.1-.3l-.6-.3c-.5-.2-1-.3-1.5-.3s-1 .1-1.5.3c-.4.2-.8.5-1.2.8-.3.3-.5.6-.7 1 .1 0 .2-.1.3-.2.4-.1.6-.2.9-.2zM17.4 9.3c-.1-.3-.2-.5-.2-.8l-.6-.9c0 .2-.1.4-.1.7 0 .5.1 1 .3 1.5.2.4.5.8.8 1.2.3.3.7.6 1.2.8.4.2.8.2 1.2.3-.5-.3-1-.6-1.5-1-.4-.6-.8-1.2-1.1-1.8zM5 3.2c.4-.3.8-.6 1.2-.8 1-.4 2-.5 3.1-.3l-.6-.3c-.5-.2-1-.3-1.5-.3s-1 .1-1.5.3c-.4.2-.8.5-1.1.8-.3.3-.5.6-.7 1 .1 0 .2-.1.3-.2.3-.1.5-.2.8-.2zM4.8 5.8c-.2.5-.3 1-.3 1.5 0 .2 0 .4.1.6.3.3.7.6 1.2.8.9.4 2 .4 2.9 0 .4-.2.8-.5 1.2-.8l.1-.1c0-.4-.1-.7-.3-1-.2-.5-.5-.9-.8-1.2-.3-.3-.7-.6-1.2-.8-.5-.2-1-.3-1.5-.3-.2 0-.4 0-.6.1-.3.3-.6.7-.8 1.2zM23.6 9.9c-.1 0-.2.1-.3.2-.6.3-1.3.4-2 .4-.3 0-.7 0-1-.1l.6.3c.7.3 1.4.3 2.1.2.2-.3.4-.6.6-1zM3.6 9.6c-.1 0-.1.1-.2.1s-.2.1-.3.1c-.1 0-.2 0-.3-.1.2.4.5.8.8 1.2.3.3.7.6 1.2.8.4.2.8.2 1.2.3-.5-.3-1-.6-1.5-1-.4-.4-.7-.9-.9-1.4zM9.6 9.9c-.1 0-.2.1-.3.2-.6.3-1.3.4-2 .4-.3 0-.7 0-1-.1l.6.3c.5.3 1.3.3 2 .2.3-.3.5-.6.7-1zM9.7 3.8c-.4-.2-.8-.2-1.2-.3.5.3 1 .6 1.5 1 .4.4.7.9 1 1.4v-.7c0-.2 0-.4-.1-.6-.3-.3-.7-.6-1.2-.8z"/><path fill="red" d="M21.7 4.8c.4.2.8.5 1.2.8.3.3.6.7.8 1.2.1.3.2.7.3 1 .3-.3.6-.7.7-1.1-.1-.3 0-.6.2-.8-.3-.5-.6-1-1-1.4-.4-.4-.9-.8-1.5-1h-.2c-.5 0-1 .1-1.5.3-.3.2-.7.4-1.1.8.2 0 .4-.1.6-.1.6 0 1 .1 1.5.3zM24.7 9.7c.1-.2.2-.5.2-.7-.4.4-.8.7-1.3.9-.2.4-.4.7-.7 1 .3 0 .6-.1.9-.2.4-.1.7-.4 1-.6-.2-.1-.1-.3-.1-.4zM20.2 12.1c-.1 0-.1-.1-.2-.1-.4 0-.8-.1-1.2-.3-.4-.2-.8-.5-1.2-.8-.3-.3-.6-.7-.8-1.2-.2-.5-.3-1-.3-1.5 0-.2 0-.5.1-.7 0-.1-.1-.2-.2-.3-.3-.6-.4-1.2-.4-2v-.1c-.2.3-.4.7-.6 1-.3.6-.4 1.3-.4 2s.1 1.4.4 2c.3.6.6 1.2 1.1 1.7.5.5 1 .9 1.7 1.1.6.3 1.3.4 2 .4s1.4-.1 2-.4c.4-.2.9-.5 1.2-.8-.4.1-.8.2-1.3.2-.6.2-1.2.1-1.9-.2zM19 3.2c-.3.1-.5.1-.8.2-.1 0-.2.1-.3.2 0 .1-.1.1-.1.2-.2.4-.2.8-.3 1.2.3-.5.6-1 1-1.5.2-.1.3-.2.5-.3zM25.5 8.3c0 .3 0 .6-.1 1l.3-.6c.2-.3.2-.7.3-1.1-.2.2-.3.5-.5.7z"/><path fill="red" d="M24.7 6.7c.1-.3.2-.5.2-.8-.2.2-.3.5-.2.8zM25.4 9.3c.1-.3.1-.6.1-1-.2.2-.3.5-.5.7 0 .2-.1.5-.2.7-.1.1-.1.3 0 .4.1-.1.2-.1.2-.2.1-.2.3-.4.4-.6zM3.5 4.9s.1 0 0 0c.3-.5.6-1 1-1.4.2-.1.3-.2.5-.3-.3 0-.5.1-.8.2-.1.1-.2.1-.3.2 0 .1-.1.1-.1.2-.2.3-.2.7-.3 1.1zM11 9c-.4.4-.9.7-1.4 1-.2.4-.4.7-.7 1 .3 0 .6-.1.9-.2.4-.2.8-.5 1.2-.8.2-.2.4-.4.5-.6.1-.3.1-.6.1-1-.3.1-.4.4-.6.6zM6.2 12.1c-.1 0-.1-.1-.2-.1-.4 0-.8-.1-1.2-.3-.4-.2-.8-.5-1.2-.8-.3-.3-.6-.7-.8-1.2-.2-.1-.3-.2-.4-.4-.2-.5-.3-1-.4-1.6-.2 0-.3-.1-.5-.2 0 .2-.1.5-.1.7 0 .5.1 1 .3 1.5.1.3 0 .7-.2.9.3.5.6 1 1 1.4.5.5 1 .9 1.7 1.1.6.3 1.3.4 2 .4s1.4-.1 2-.4c.4-.2.9-.5 1.2-.8-.4.1-.8.2-1.3.2-.6 0-1.2-.1-1.9-.4zM8.5 3.5h-.2c-.5 0-1 .1-1.5.3-.4.2-.8.4-1.2.8.2 0 .4-.1.6-.1.5 0 1 .1 1.5.3.5.2.9.5 1.2.8.3.3.6.7.8 1.2.1.3.2.7.3 1 .3-.3.6-.7.7-1.1.1-.3.2-.5.2-.8-.3-.5-.6-1-1-1.4-.4-.4-.9-.7-1.4-1z"/><path fill="red" d="M1 8.2c0-.5.1-1 .2-1.5-.1-.3-.2-.7-.2-1-.3 0-.5.2-.6.4-.3.8-.4 1.4-.4 2.1s.1 1.4.4 2c.1.3.4.5.7.5.1 0 .2 0 .3-.1.1 0 .1-.1.2-.1 0-.1-.1-.2-.2-.3-.3-.6-.4-1.2-.4-2z"/><path fill="red" d="M1.8 9.7c-.2-.5-.3-1-.3-1.5 0-.2 0-.5.1-.7-.1 0-.1-.1-.2-.2-.1-.2-.1-.4-.2-.6-.1.5-.2 1-.2 1.5 0 .7.1 1.4.4 2 0 .1.1.2.2.3.2-.1.3-.5.2-.8z"/><path fill="#0F0" d="M18.8 5.8c.2-.4.5-.8.8-1.2-.3 0-.6.1-.9.2-.4.2-.8.5-1.2.8l-.1.1c0 .4.1.7.3 1 .2.4.4.8.8 1.1 0-.2-.1-.4-.1-.6.1-.5.2-.9.4-1.4zM26.7 8.7c.2-.4.3-.8.3-1.2-.1.2-.3.3-.5.3 0 .2.1.3.1.5 0 .7-.1 1.4-.4 2-.1.3-.4.5-.7.5-.1 0-.2 0-.3-.1-.1 0-.1-.1-.2-.1-.3.5-.6 1-1 1.4-.1.1-.3.2-.4.4.3-.1.5-.1.8-.2.6-.3 1.2-.6 1.7-1.1.4-.4.7-.9 1-1.4-.4-.3-.5-.7-.4-1zM20.8 10.7l-.6-.3c-.3-.1-.7-.2-1-.3-.6-.3-1.2-.7-1.7-1.1-.1-.1-.2-.3-.4-.4.1.3.1.5.2.8.3.6.6 1.2 1.1 1.7.4.4.9.8 1.5 1 .6 0 1.2 0 1.7-.3.4-.2.8-.4 1.1-.8-.5 0-1.3 0-1.9-.3zM20.2 2.4c-.4.2-.9.5-1.2.8 1.1-.3 2.3-.2 3.3.2.1 0 .1.1.2.1.4 0 .8.1 1.2.3.4.2.8.5 1.2.8 0-.3-.1-.6-.2-.9-.2-.4-.5-.8-.8-1.2-.2-.2-.4-.4-.6-.5-1-.1-2.1 0-3.1.4z"/><path fill="#FF0" d="M17.5 5.7c.1-.1.1-.1 0 0 .4-.4.8-.7 1.2-.9.3-.1.6-.2.9-.2.4-.4.8-.6 1.2-.8.5-.2 1-.3 1.5-.3h.2c-.1 0-.1-.1-.2-.1-1-.4-2.2-.5-3.3-.2-.1.1-.3.2-.4.4-.4.4-.8.9-1 1.5v.2c-.1.1-.1.2-.1.4zM26.4 7.7c-.2 0-.3 0-.3-.1-.1 0-.1-.1-.1-.1 0 .4-.1.8-.3 1.1l-.3.6c-.1.2-.3.4-.5.6-.1.1-.2.1-.2.2-.3.2-.6.5-1 .6-.3.1-.6.2-.9.2-.3.3-.7.6-1.1.8-.5.3-1.1.4-1.7.4.1 0 .1.1.2.1.6.3 1.3.4 2 .4.4 0 .9-.1 1.3-.2.1-.1.3-.2.4-.4.4-.4.7-.9 1-1.4.1 0 .1.1.2.1s.2.1.3.1c.3 0 .6-.2.7-.5.3-.6.4-1.3.4-2 0-.1 0-.3-.1-.5z"/><path fill="#0F0" d="M28.1 5.2c-.1-.3-.4-.4-.6-.4v.5c0 .3 0 .7-.1 1 .1.3.1.7.1 1 0 .7-.1 1.4-.4 2 0 .1-.1.2-.2.3.1 0 .1.1.2.1s.2.1.3.1c.3 0 .6-.2.7-.5.3-.6.4-1.3.4-2s-.1-1.4-.4-2.1z"/><path fill="#0F0" d="M27.5 7.2c0-.3 0-.7-.1-1-.1.4-.2.7-.3 1 0 .1-.1.1-.1.2 0 .4-.1.8-.3 1.2-.1.3 0 .7.2.9 0-.1.1-.2.2-.3.3-.6.4-1.2.4-2zM12.3 4c.1.4.2.8.2 1.3 0 .7-.1 1.4-.4 2 0 .1-.1.1-.1.2 0 .4-.1.8-.3 1.2l-.3.6c-.1.3-.2.7-.3 1-.3.6-.6 1.2-1.1 1.7-.1.1-.3.2-.4.4.3-.1.5-.1.8-.2.6-.3 1.2-.6 1.7-1.1s.9-1 1.1-1.7c.3-.6.4-1.3.4-2s-.1-1.4-.4-2c-.3-.6-.6-1-.9-1.4zM3.8 5.4v.4c-.1.1-.1.3-.1.4 0 .2.1.3.1.5.2.4.4.8.8 1.2 0-.2-.1-.4-.1-.6 0-.5.1-1 .3-1.5.2-.5.5-.9.8-1.2-.3 0-.6.1-.9.2-.3.1-.6.4-.9.6zM6.2 2.4c-.4.2-.8.5-1.2.8 1.1-.3 2.2-.2 3.3.2.1 0 .1.1.2.1.4 0 .8.1 1.2.3.4.2.8.5 1.2.8 0-.3-.1-.6-.2-.9-.2-.4-.5-.8-.8-1.2-.2-.1-.4-.3-.6-.4-1-.2-2.1-.1-3.1.3zM6.8 10.7l-.6-.3c-.3-.1-.7-.2-1-.3-.5-.2-1-.5-1.4-.9 0 .2-.1.3-.3.4.3.5.6 1 1 1.4.5.4 1 .7 1.5 1 .6 0 1.2 0 1.7-.3.4-.2.8-.4 1.1-.8-.6.1-1.4.1-2-.2z"/><path fill="#FF0" d="M11.1 10.3c.1-.3.2-.7.3-1-.1.2-.3.4-.5.6-.3.3-.7.6-1.2.8-.3.1-.6.2-.9.2-.3.3-.7.6-1.1.8-.5.2-1.1.3-1.7.3.1 0 .1.1.2.1.6.3 1.3.4 2 .4.4 0 .9-.1 1.3-.2.1-.1.3-.2.4-.4.5-.4.9-1 1.2-1.6z"/><path fill="#0F0" d="M3.4 9.7c.1 0 .1-.1.2-.1 0-.1-.1-.2-.2-.3-.1-.3-.2-.5-.2-.8-.3-.3-.5-.6-.6-.9 0 .2-.1.4-.1.7 0 .5.1 1 .3 1.4.1 0 .2.1.3.1.1-.1.2-.1.3-.1z"/><path fill="#FF0" d="M2.6 7.6c-.1 0-.1.1-.2.1s-.2.1-.3.1H2c.1.5.2 1.1.4 1.6.1.2.2.3.4.4-.2-.6-.3-1.1-.3-1.6 0-.2 0-.4.1-.6z"/><path fill="#0F0" d="M3.6 4.9s-.1 0 0 0c-.1 0-.1.1 0 0-.1.1 0 0 0 0zM3.2 8.5c0 .3.1.5.2.8 0 .1.1.2.2.3.1-.1.2-.2.3-.4-.2-.1-.3-.2-.4-.2-.1-.2-.2-.3-.3-.5zM3.8 5.4c0 .1-.1.1-.2.2l-.1.1c0 .2.1.4.1.6 0-.2.1-.3.1-.5.1-.1.2-.3.1-.4z"/><path fill="#FF0" d="M8.3 3.4C7.2 3 6.1 2.9 5 3.2c-.2.1-.3.2-.5.3-.4.4-.7.9-1 1.4V5.6l.1-.1c.1-.1.2-.1.2-.2.3-.2.6-.5 1-.6.3-.1.6-.2.9-.2.3-.3.7-.5 1.1-.7.5-.2.9-.3 1.5-.4 0 .1.1.1.2.1-.1 0-.1-.1-.2-.1z"/><path fill="#00F" d="M17 7.2c0-.3 0-.7.1-1l-.3.6c-.1.3-.2.5-.2.8.2.3.4.7.6.9-.1-.4-.2-.8-.2-1.3zM17.9 3.6a3.592 3.592 0 0 1 1.9-1.8c.5-.2 1-.3 1.5-.3s1 .1 1.5.3l.6.3c.3.1.7.2 1 .3.5.2 1 .5 1.4.9 0-.2.1-.3.3-.4-.3-.5-.6-1-1-1.4-.5-.5-1-.9-1.7-1.1-1.3-.5-2.8-.5-4.1 0-.6.3-1.2.6-1.7 1.1-.5.5-.9 1-1.1 1.7-.3.6-.4 1.3-.4 2 .2-.2.3-.4.5-.6.3-.5.8-.8 1.3-1zM24.9 5.9c.1 0 .1-.1.2-.1.2-.1.4-.1.6 0-.2-.4-.4-.8-.8-1.1.1.1.1.3.1.5 0 .3 0 .5-.1.7zM24 8.2v-.4l-.1.1c-.3.3-.7.6-1.2.8-.9.4-2 .4-2.9 0-.4-.2-.8-.5-1.2-.8 0 .3.1.6.2.9.2.4.5.8.8 1.2.2.2.4.4.6.5.3.1.7.1 1 .1.7 0 1.4-.1 2-.4.1 0 .2-.1.3-.2 0-.1.1-.1.1-.2.3-.6.4-1 .4-1.6zM24.9 5.9z"/><path fill="#F0F" d="M16.4 7.3c0 .1.1.2.2.3 0-.3.1-.5.2-.8l.3-.6c.1-.3.2-.7.3-1 0-.1.1-.1.1-.2 0-.4.1-.8.3-1.2 0-.1.1-.1.1-.2-.5.3-1 .6-1.4 1-.2.1-.3.4-.5.6v.1c0 .7.1 1.3.4 2z"/><path fill="#0FF" d="M17.2 8.5c.1.1.2.3.4.4.5.5 1 .9 1.7 1.1.3.1.7.2 1 .3-.2-.1-.4-.3-.6-.5-.3-.3-.6-.7-.8-1.2-.1-.3-.2-.6-.2-.9-.3-.3-.6-.7-.8-1.1-.1-.3-.2-.7-.3-1-.2.2-.3.4-.4.6-.2.4-.2.7-.2 1 0 .5.1.9.2 1.3z"/><path fill="#FFF" d="M17.5 5.2V5c0 .1-.1.1 0 .2-.2.3-.3.6-.4 1 .1-.2.3-.4.4-.6v-.4z"/><path fill="#00F" d="M26.3 4l.6.9c.1 0 .1-.1.2-.1s.2-.1.3 0c0-.5-.2-1.1-.4-1.6-.2-.4-.6-.6-1-.4-.1 0-.1.1-.2.1.2.1.2.2.3.3.1.3.2.5.2.8zM26 7.6s0-.1 0 0c0-.1-.1-.1 0 0-.1 0 0 0 0 0z"/><path fill="#00F" d="M25.7 3.3c.1.1.2.1.3.2.1.1.2.3.4.4-.1-.3-.1-.5-.2-.8-.2 0-.2-.1-.3-.2-.1.1-.2.3-.2.4z"/><path fill="#F0F" d="M25.8 6.2c0-.1-.1-.3-.1-.4-.2-.1-.4-.1-.6 0-.1 0-.1.1-.2.1 0 .3-.1.5-.2.8-.2.4-.4.8-.7 1.1v.4c0 .5-.1 1-.3 1.5 0 .1-.1.1-.1.2.5-.2.9-.5 1.3-.9.2-.2.4-.4.5-.6.2-.2.3-.5.4-.7v-.1-.3c.2-.4.1-.7 0-1.1z"/><path fill="#0FF" d="M27.5 4.8h-.3c-.1 0-.1.1-.2.1-.2-.3-.4-.7-.6-.9-.1-.1-.2-.3-.4-.4-.1-.1-.2-.2-.3-.2-.4-.4-.9-.7-1.4-.9-.3-.1-.7-.2-1-.3.2.1.4.3.6.5.3.3.6.7.8 1.2.1.3.2.6.2.9.3.3.6.7.8 1.1.1 0 .1.1.2.1s.1.1.2.2c.1.2.1.4.2.5.1.3.2.7.2 1 .2 0 .4-.1.5-.3 0-.1.1-.1.1-.2.1-.3.2-.7.3-1 .1-.3.1-.7.1-1v-.4z"/><path fill="#FFF" d="M26.3 6.7c-.1-.2-.1-.4-.2-.5-.1-.1-.1-.2-.2-.2-.1-.1-.1-.1-.2-.1.1.1.1.3.1.4.1.3.2.7.2 1v.4l.1.1c.1 0 .2.1.3.1h.1c-.1-.5-.1-.8-.2-1.2z"/><path fill="#00F" d="M11.7 5.8c-.2-.4-.4-.8-.8-1.1.1.1.1.3.1.5s0 .5-.1.7c.1.1.1.2.2.3.3.6.4 1.3.4 2v.1c.2-.3.3-.5.5-.8v-.3c0-.5-.1-.9-.3-1.4zM10 8.2v-.4l-.1.1c-.3.3-.7.6-1.2.8-.9.4-2 .4-2.9 0-.5-.2-.9-.5-1.2-.8 0 .3.1.6.2.9.2.4.5.8.8 1.1.2.2.4.4.6.5.3.1.7.1 1 .1.7 0 1.4-.1 2-.4.1 0 .2-.1.3-.2 0-.1.1-.1.1-.2.3-.5.4-.9.4-1.5zM2.8 3.8c-.1.2-.2.5-.2.7.4-.4.8-.7 1.3-.9a3.592 3.592 0 0 1 1.9-1.8c.5-.2 1-.3 1.5-.3s1 .1 1.5.3c.1.1.3.2.5.3.3.1.7.2 1 .3.6.3 1.2.6 1.7 1.1.1.1.2.3.4.4-.1-.3-.1-.5-.2-.8-.4-.5-.8-1.1-1.2-1.6-.5-.5-1-.9-1.7-1.1C8-.1 6.5-.1 5.2.4c-.6.3-1.2.7-1.7 1.1-.4.4-.7.9-1 1.4.3.2.4.6.3.9z"/><path fill="#F0F" d="M10 7.8v.4c0 .5-.1 1-.3 1.5 0 .1-.1.1-.1.2.5-.3 1-.6 1.4-1 .2-.2.4-.4.5-.6v-.1c0-.7-.1-1.4-.4-2-.1-.1-.1-.2-.2-.3 0 .3-.1.5-.2.8-.2.4-.4.8-.7 1.1z"/><path fill="#0FF" d="M10.3 2.4c-.3-.1-.7-.2-1-.3.2.1.4.3.6.5.3.3.6.7.8 1.2.1.3.2.6.2.9.3.3.6.7.8 1.1.2.5.3 1 .3 1.5v.3c0-.1.1-.1.1-.2.3-.6.4-1.3.4-2 0-.4-.1-.9-.2-1.3-.1-.1-.2-.3-.4-.4-.4-.6-1-1-1.6-1.3z"/><path fill="#00F" d="M2.6 7.6zM1.4 5.8c.1 0 .1.1.2.1.1-.2.2-.5.4-.7 0-.7.1-1.3.4-2 0-.1.1-.2.2-.3-.1 0-.1-.1-.2-.1-.4-.2-.8 0-1 .4-.3.7-.4 1.3-.4 2 0 .2 0 .3.1.5.1 0 .2.1.3.1z"/><path fill="#00F" d="M2 5.2c.2-.2.3-.5.5-.7 0-.2.1-.5.2-.7.1-.3 0-.7-.2-.9 0 .1-.1.2-.2.3-.2.6-.3 1.3-.3 2z"/><path fill="#F0F" d="M2.6 4.5s-.1 0 0 0c-.3.2-.4.5-.6.7-.2.2-.3.5-.4.7-.1 0-.1-.1-.2-.1s-.2-.1-.3 0c0 .3.1.7.2 1 .1.2.1.4.2.5 0 .1.1.2.2.2 0 .2.2.2.3.2v-.5c0-.3 0-.7.1-1 .1-.4.2-.7.3-1 0-.1.1-.1.1-.2.2-.3.6-.4.9-.2.1 0 .1.1.1.1 0-.4.1-.8.3-1.1 0-.1.1-.1.1-.2-.5.2-.9.5-1.3.9z"/><path fill="#0FF" d="M5.6 9.9c-.3-.3-.6-.7-.8-1.2-.1-.3-.2-.6-.2-.8-.4-.4-.6-.8-.8-1.2-.1-.1-.1-.3-.1-.5-.1-.1-.1-.3-.2-.5-.1.1-.3.3-.4.5l-.3.6c-.1.2-.2.5-.2.8.2.3.4.7.6.9.1.2.2.3.3.5.1 0 .2.1.3.2.4.4.9.7 1.4.9.3.1.7.2 1 .3-.2-.1-.4-.3-.6-.5z"/><path fill="#FFF" d="M3.5 5.2V5v-.1l-.1-.1c-.3-.1-.7 0-.9.2 0 0-.1.1-.1.2-.1.3-.2.7-.3 1-.1.4-.1.7-.1 1v.5h.1c.1 0 .2 0 .3-.1.1 0 .1-.1.2-.1 0-.3.1-.5.2-.8.1-.1.2-.3.3-.5.1-.2.3-.4.4-.5v-.5z"/></g></switch></svg>
            </div>
            <div style="display: table-cell;width:18.5%;color: #fff;" class="center-block text-center title_font">
                <strong id="browsers"></strong>
            </div>
            <div style="display: table-cell;width:18.5%;" class="center-block text-center">
                <svg version="1.2" baseProfile="tiny" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 16.3 21.1" width="30" height="19"><switch><g><path fill="none" d="M11.1 12.2c-.3-.3-.3-.8 0-1.1.5-.5.9-1.1 1.2-1.8.2-.4.3-.8.3-1.2l-.3-1.2c-.3-.7-.7-1.3-1.2-1.8S10 4.2 9.3 3.9c-1.1-.4-2.4-.5-3.6-.2-.2.2-.4.3-.5.5-.6.5-1 1.1-1.3 1.7-.3.7-.4 1.5-.4 2.2s.1 1.5.4 2.2c.3.7.7 1.3 1.2 1.8.1.1.2.2.2.4h.1c.2.1.4.1.5.1.2 0 .4.1.6.1h1.2c.2 0 .4 0 .6-.1.2 0 .4-.1.5-.1.4-.1.8.1.9.5.1.3 0 .5-.2.7h.1c.2 0 .4 0 .6-.1.2 0 .4-.1.5-.1h.1c0-.1.1-.3.2-.4.2-.2.4-.5.6-.7h-.1l-.4-.2zM1.6 8.1c.1.5.2.9.3 1.2.1.2.2.4.3.5-.1-.5-.2-1.1-.2-1.7s.1-1.1.2-1.6c-.1.1-.2.3-.3.4l-.3 1.2zM14.2 8.1c0 .3.1.7.1 1 0 .6-.1 1.1-.2 1.7.1-.2.2-.3.3-.5.3-.7.4-1.4.4-2.2s-.1-1.5-.4-2.2c-.1-.2-.2-.3-.3-.5.1.5.2 1.1.2 1.7 0 .4 0 .7-.1 1zM11.3 3.3c0-.1-.1-.1-.1-.2-.2-.1-.4-.2-.6-.4-.2-.1-.4-.1-.6-.1.4.2.9.4 1.3.7zM5 2.3c.4-.3.9-.5 1.3-.7-.4.1-.9.2-1.3.3-.7.3-1.3.7-1.8 1.3-.1 0-.1.1-.2.1.4-.3.9-.5 1.4-.7l.6-.3z"/><path fill="red" d="M13.1 12.1c.4-.4.7-.8.9-1.3.1-.5.2-1.1.2-1.7 0-.3 0-.7-.1-1-.1.6-.2 1.2-.5 1.8-.4.9-.9 1.6-1.5 2.3-.1.1-.3.2-.5.2-.2.3-.4.5-.6.7v.4c.4 0 .7.2.8.5v.4c.2 0 .3-.1.4-.2.3-.3.6-.7.9-1.1-.2-.3-.2-.7 0-1zM9.3 3.9c.7.3 1.3.7 1.8 1.2s.9 1.1 1.2 1.8c.2.4.3.8.3 1.2.1-.3.1-.7.1-1 0-.8-.1-1.5-.4-2.2-.3-.6-.6-1.1-1.1-1.6-.3-.3-.8-.5-1.2-.7-1-.1-2.1 0-3 .4-.5.1-.9.4-1.3.7 1.2-.3 2.5-.2 3.6.2zM4.1 3.1c.3-.3.6-.5.9-.8l-.6.3c-.5.2-1 .4-1.4.7-.4.5-.8 1-1.1 1.6-.3.7-.4 1.5-.4 2.2 0 .3 0 .7.1 1l.3-1.2c.1-.1.2-.3.3-.4.1-.4.2-.7.4-1.1.3-.9.8-1.7 1.5-2.3zM.6 9.9C.3 9.4.2 8.8.1 8.1c-.1.4-.1.7-.1 1 0 1 .2 1.9.6 2.8.4.9.9 1.6 1.5 2.3.3.3.8.3 1.1 0s.3-.8 0-1.1c-.2-.2-.4-.5-.6-.7-.2 0-.3-.1-.5-.2-.7-.7-1.2-1.4-1.5-2.3zM5.1 15.7c.1-.4.5-.7.9-.6.2 0 .4.1.6.1H7.7c-.2-.1-.5-.2-.7-.2-.1 0-.2-.1-.3-.2h-.1c-.2 0-.4 0-.6-.1-.2 0-.4-.1-.5-.1-.4-.1-.8.1-.9.5-.2.3 0 .8.4.9h.1v-.3zM9 15.3c.1.1.2.2.2.4v.3h.1c.3-.1.5-.4.5-.7H9zM6.6 17.6H8h-.2c-.2 0-.4-.2-.5-.4h-.6c-.2 0-.4 0-.6-.1-.4-.1-.8.2-.9.6-.1.4.2.8.6.9h.1c0-.1-.1-.2 0-.3-.1-.5.3-.8.7-.7zM8.4 17.7c-.1 0-.3 0-.4-.1.3.1.5.3.5.6v.3h.1c.4-.1.6-.5.6-.9-.3.1-.5.1-.8.1zM7.8 19.6H6.6c-.4-.1-.8.3-.8.7 0 .4.3.8.7.8h1.4c.4 0 .7-.4.7-.8 0-.1 0-.1-.1-.2h-.1c-.3-.1-.5-.3-.6-.5z"/><path fill="#00F" d="M11.3 2.9c-.2-.1-.5-.2-.7-.2.2.2.4.3.5.5.1.1.1.1.1.2.3.2.6.5.9.8.7.7 1.2 1.4 1.5 2.3.2.6.4 1.2.5 1.8 0-.3.1-.7.1-1 0-.6-.1-1.1-.2-1.7-.3-.5-.6-.9-.9-1.3-.5-.7-1.1-1.1-1.8-1.4zM12.8 9.1c0-.3 0-.7-.1-1l-.3 1.2c-.3.7-.7 1.3-1.2 1.8-.3.3-.3.8 0 1.1.1.1.3.2.5.2h.1c.2-.3.4-.7.6-1.1.3-.6.4-1.4.4-2.2zM2.1 4.1c.3-.3.6-.5.9-.8 0-.1.1-.1.1-.2.6-.5 1.2-.9 1.9-1.2.4-.2.9-.3 1.4-.4C8 .8 9.7.8 11.3 1.3c-.4-.3-.9-.5-1.4-.7-1.8-.7-3.8-.7-5.6 0-.8.3-1.5.8-2.2 1.5S.9 3.5.6 4.4C.2 5.2 0 6.2 0 7.1c0 .3 0 .7.1 1 .1-.6.2-1.2.5-1.8.3-.8.8-1.6 1.5-2.2zM2.2 9.8c-.1-.1-.2-.3-.3-.5-.1-.3-.2-.7-.3-1.2-.1.3-.1.7-.1 1 0 .8.1 1.5.4 2.2.2.4.4.7.6 1.1.2 0 .4 0 .6-.2 0 0 0-.1.1-.1-.3-.4-.5-.8-.6-1.2-.2-.3-.3-.7-.4-1.1z"/><path fill="#F0F" d="M1.5 9.1c0-.3 0-.7.1-1-.1-.3-.1-.7-.1-1 0-.8.1-1.5.4-2.2.3-.6.7-1.1 1.1-1.6-.3.3-.6.5-.9.8C1.4 4.7.9 5.5.6 6.4.3 6.9.2 7.5.1 8.1c.1.6.2 1.2.5 1.8.4.9.9 1.6 1.5 2.3.1.1.3.2.5.2-.2-.3-.4-.7-.6-1.1-.4-.6-.5-1.4-.5-2.2zM12.2 4.1c-.3-.3-.6-.5-.9-.8.4.5.8 1 1.1 1.6.3.7.4 1.4.4 2.2 0 .3 0 .7-.1 1 .1.3.1.7.1 1 0 .8-.1 1.5-.4 2.2-.2.4-.4.7-.6 1.1.2 0 .3-.1.5-.2.7-.7 1.2-1.4 1.5-2.3.2-.6.4-1.2.5-1.8-.1-.6-.2-1.2-.5-1.8-.4-.8-.9-1.6-1.6-2.2z"/><path fill="#00F" d="M7.5 13.5c.2.1.4.1.5.1.2 0 .4.1.6.1h1c.2-.2.3-.5.2-.7-.1-.4-.5-.6-.9-.5-.2.1-.4.1-.5.1-.2 0-.4.1-.6.1H6.6c-.2 0-.4 0-.6-.1-.2 0-.4-.1-.5-.1h-.1c0 .2 0 .5-.2.7-.2.2-.4.2-.6.2 0 .3.2.5.4.6.2.1.5.1.7.2.2 0 .5.1.7.1h.1v-.2c.2-.5.6-.7 1-.6zM7.4 16.3H6.5c-.2 0-.5-.1-.7-.1-.2 0-.4-.1-.6-.1.1.3.3.5.6.5.2 0 .5.1.7.1h.7c0-.2 0-.3.2-.4zM8.5 16.2s.1 0 0 0h.6c0-.1.1-.1.1-.2-.2.1-.4.1-.7.2.1 0 0 0 0 0z"/><path fill="#F0F" d="M9.2 15.7c0-.2-.1-.3-.2-.4h-.5c-.2 0-.4-.1-.6-.1H6.7c-.2 0-.4 0-.6-.1-.4-.1-.8.2-.9.6v.3c.2.1.4.1.6.1.2 0 .5.1.7.1H7.4c.1-.1.4-.2.6-.1.2 0 .3.1.5.1h.1c.2 0 .4-.1.6-.1v-.4z"/><path fill="#00F" d="M8.3 18.6c-.1 0-.3 0-.4.1H6.5c-.2 0-.4-.1-.6-.1.1.3.3.5.6.5h1.4c0-.3.1-.4.4-.5zM8.5 18.6h-.1.1z"/><path fill="#F0F" d="M8 17.6H6.5c-.4 0-.8.3-.8.7v.3c.2 0 .4.1.6.1h1.4c.1 0 .3 0 .4-.1h.2c0-.1.1-.2 0-.3.2-.4 0-.6-.3-.7z"/><path fill="#0F0" d="M15.7 5.4c-.4-.9-.9-1.6-1.5-2.3-.7-.7-1.4-1.2-2.3-1.5-.2-.1-.4-.2-.6-.2.3.2.6.5.9.8.7.7 1.2 1.4 1.5 2.3.2.4.3.7.4 1.1.1.2.2.3.3.5.3.7.4 1.4.4 2.2s-.1 1.5-.4 2.2c-.1.2-.2.3-.3.5-.1.4-.2.7-.4 1.1l-.6 1.2s0 .1.1.1c.1.1.3.2.5.2s.4-.1.5-.2c.7-.7 1.2-1.4 1.5-2.3.4-.9.6-1.8.6-2.8s-.2-2.1-.6-2.9zM4.5 13c.1-.4.5-.6.8-.5 0-.1-.1-.3-.2-.4-.5-.5-.9-1.1-1.2-1.8-.3-.6-.4-1.4-.4-2.2s.1-1.5.4-2.2c.3-.7.7-1.3 1.2-1.8.2-.1.4-.2.6-.4-.3.1-.5.1-.7.2-.7.3-1.3.7-1.8 1.3-.4.3-.7.8-1 1.3C2.1 7 2 7.6 2 8.1s.1 1.1.2 1.7c.3.5.6.9.9 1.3.3.3.3.7.1 1 .3.4.6.7.9 1.1.1.1.3.2.4.2V13zM9.9 2.6s.1 0 0 0c.3.1.5.1.7.2-.4-.3-.8-.6-1.3-.8-1-.4-2-.5-3-.4-.4.2-.9.4-1.3.7 1.6-.5 3.4-.4 4.9.3z"/><path fill="#FF0" d="M10 2.6s-.1 0 0 0c-1.6-.7-3.4-.8-5-.3-.3.3-.6.5-.9.8-.7.6-1.2 1.4-1.5 2.3-.2.3-.3.7-.4 1.1.3-.5.6-1 1-1.3.5-.6 1.1-1 1.8-1.3.2-.1.5-.2.7-.2.4-.3.8-.6 1.3-.8.9-.4 2-.5 3-.3zM14.1 10.8c-.3.5-.6.9-.9 1.3-.3.3-.3.7-.1 1 .3-.4.5-.8.6-1.2.2-.3.3-.7.4-1.1z"/><path fill="#0FF" d="M3.2 11.1c-.4-.4-.7-.8-.9-1.3.1.4.2.7.4 1.1l.6 1.2c.1-.3.1-.7-.1-1zM6.4 1.6s-.1 0 0 0c1-.1 2 0 3 .4.5.2.9.5 1.3.8.2.1.5.1.7.2.7.3 1.3.7 1.8 1.2.4.4.7.8.9 1.3-.1-.4-.2-.7-.4-1.1-.4-.9-.9-1.6-1.5-2.3-.3-.3-.6-.5-.9-.8-1.6-.5-3.4-.4-4.9.3zM5.2 13.2c.2-.2.2-.4.2-.7-.4 0-.7.2-.8.5v.4c.1 0 .4 0 .6-.2z"/><path fill="#0F0" d="M11.1 14.2c-.1-.2-.2-.4-.1-.7h-.1c-.2.1-.4.1-.5.1-.2 0-.4.1-.6.1h-.1c-.1.1-.2.2-.3.2-.2.1-.5.1-.7.2-.2 0-.5.1-.7.1H6.7c0 .2.1.4.2.5h1c.2 0 .4 0 .6-.1.2 0 .4-.1.5-.1.4-.1.8.1.9.5v.2h.1c.2 0 .5-.1.7-.1.2 0 .5-.1.7-.2.3-.1.5-.3.5-.6h-.1c-.3.1-.5 0-.7-.1z"/><path fill="#FF0" d="M11.8 14c-.1-.4-.5-.6-.8-.5 0 .2 0 .5.2.7.1.1.3.2.5.2h.1V14zM8.8 14.5c-.2.1-.4.1-.5.1-.2 0-.4.1-.6.1h-1c.1.2.2.2.3.3.2.1.5.1.7.2h.1c.2 0 .3 0 .5-.1.3-.1.5 0 .7.2h.8v-.2c-.2-.5-.6-.7-1-.6z"/><path fill="#0FF" d="M7.9 14.3c.2 0 .5-.1.7-.1.2 0 .5-.1.7-.2.1 0 .2-.1.3-.2h-1c-.2 0-.4 0-.6-.1-.2 0-.4-.1-.5-.1-.4-.1-.8.1-.9.5v.2H7.9z"/><path fill="#0F0" d="M9 15.3c-.2-.2-.4-.3-.7-.2-.2 0-.3.1-.5.1.2 0 .4.1.6.1H9zM8.6 16.6c-.2 0-.5.1-.7.1h-.7c0 .2 0 .4.1.5h.5c.2 0 .4 0 .6-.1.4-.1.8.2.9.6h.7c.2 0 .5-.1.7-.1.4-.1.7-.5.6-.9-.1-.4-.5-.7-.9-.6-.2 0-.4.1-.6.1h-.6c-.2.2-.4.3-.6.4z"/><path fill="#FF0" d="M8.3 17.1c-.2 0-.4.1-.6.1h-.5c.1.2.3.3.5.4H8c.1 0 .3 0 .4.1h.7c0-.4-.4-.7-.8-.6z"/><path fill="#0FF" d="M8.5 16.2c-.2 0-.4.1-.6.1h-.5c-.1.1-.2.2-.2.4h.7c.2 0 .5-.1.7-.1.2 0 .4-.2.5-.4h-.6c.1 0 0 0 0 0z"/><path fill="#FFF" d="M8.5 16.2c-.2 0-.3 0-.5-.1s-.5 0-.7.2h.5c.3-.1.5-.1.7-.1z"/><path fill="#FF0" d="M7.9 17.6c.1 0 .1 0 0 0 .1 0 .1 0 0 0z"/><path fill="#0F0" d="M7.9 19.1s-.1 0 0 0c-.1.1-.1.1-.1.2v.3c.3 0 .6.2.7.5h1.4c.4 0 .7-.4.7-.8s-.4-.7-.8-.7H8.6h-.1c-.1.2-.3.4-.6.5z"/><path fill="#FF0" d="M7.8 19.6c.1.3.3.5.6.5h.1c-.1-.3-.4-.5-.7-.5z"/><path fill="#0FF" d="M8.3 18.6c-.2.1-.4.2-.5.5h.1c.3 0 .5-.2.6-.5h-.2zM8.3 18.6h.1-.1z"/></g></switch></svg>
            </div>
            <div style="display: table-cell;width:18.5%;color: #fff;" class="center-block text-center title_font">
                <strong id="hits"></strong>
            </div>
            <div style="display: table-cell;">

            </div>
        </div>
    </div>
</div>

                </div>

            </div>
            <div class="row">

                <div class="col-xs-12 col-sm-12 col-md-12" style="text-align: center;height: 40px;" >
                    </div>

            </div>
            <div class="row">

                <div class="col-xs-12 col-sm-12 col-md-12" style="text-align: center;" id="nextInfo" >

                </div>

            </div>
            <div class="row">

                <div class="col-xs-12 col-sm-12 col-md-12" style="text-align: center;height: 40px;" >
                </div>

            </div>

        </div>--%>


        <%@ include file="footer.jsp" %>


    </div>
    <!-- /#page-content-wrapper -->
</div>

<%@ include file="../js.jsp" %>
<script src="/js/web/mobile/info_details.js"></script>

</body>
</html>