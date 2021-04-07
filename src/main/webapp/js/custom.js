
/* Navigation */

$(document).ready(function(){

    $(window).resize(function()
    {
        if($(window).width() >= 765){
            $(".sidebar #nav").slideDown(350);
        }
        else{
            $(".sidebar #nav").slideUp(350);
        }
    });


    $("#nav > li > a").on('click',function(e){
        if($(this).parent().hasClass("has_sub")) {
            e.preventDefault();
        }

        if(!$(this).hasClass("subdrop")) {
            // hide any open menus and remove all other classes
            $("#nav li ul").slideUp(350);
            $("#nav li a").removeClass("subdrop");

            // open our new menu and add the open class
            $(this).next("ul").slideDown(350);
            $(this).addClass("subdrop");
        }

        else if($(this).hasClass("subdrop")) {
            $(this).removeClass("subdrop");
            $(this).next("ul").slideUp(350);
        }

    });

    $(".sidebar-dropdown a").on('click',function(e){
        e.preventDefault();

        if(!$(this).hasClass("open")) {
            // hide any open menus and remove all other classes
            $(".sidebar #nav").slideUp(350);
            $(".sidebar-dropdown a").removeClass("open");

            // open our new menu and add the open class
            $(".sidebar #nav").slideDown(350);
            $(this).addClass("open");
        }

        else if($(this).hasClass("open")) {
            $(this).removeClass("open");
            $(".sidebar #nav").slideUp(350);
        }
    });

    $("#slist a").click(function(e){
        e.preventDefault();
        $(this).next('p').toggle(200);
    });

});

/* Widget close */

$('.wclose').click(function(e){
    e.preventDefault();
    var $wbox = $(this).parent().parent().parent();
    $wbox.hide(100);
});

/* Widget minimize */

$('.wminimize').click(function(e){
    e.preventDefault();
    var $wcontent = $(this).parent().parent().next('.widget-content');
    if($wcontent.is(':visible'))
    {
        $(this).children('i').removeClass('icon-chevron-up');
        $(this).children('i').addClass('icon-chevron-down');
    }
    else
    {
        $(this).children('i').removeClass('icon-chevron-down');
        $(this).children('i').addClass('icon-chevron-up');
    }
    $wcontent.toggle(500);
});







function setHis(infoId) {
    if(Cookies.get("B-"+infoId)=="1"){
        return;
    }
    Cookies.set("B-"+infoId,"1");
    $.ajax({
        url: "/info/setHis.do",
        data: {infoId: infoId},
        type: 'POST',
        dataType: 'json',
        async: false,
        success: function (data) {
            //  bootbox.alert(data.msg);
            return;
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert("status:" + XMLHttpRequest.status + ",readyState:" + XMLHttpRequest.readyState + ",textStatus:" + textStatus);
            //     alert(errorThrown);

        }
    });
}
function setBrowser(infoId) {
    if(Cookies.get("A-"+infoId)=="1"){
        return;
    }
    Cookies.set("A-"+infoId,"1");
    $.ajax({
        url: "/info/setBrowser.do",
        data: {infoId: infoId},
        type: 'POST',
        dataType: 'json',
        async: false,
        success: function (data) {
            //  bootbox.alert(data.msg);
            return;
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert("status:" + XMLHttpRequest.status + ",readyState:" + XMLHttpRequest.readyState + ",textStatus:" + textStatus);
            //     alert(errorThrown);

        }
    });
}



var trigger = $('.hamburger'),
    overlay = $('.overlay'),
    isClosed = false;

function hamburger_cross() {
    if (isClosed == true) {
        overlay.hide();
        trigger.removeClass('is-open').addClass('is-closed');
        isClosed = false;
    } else {
        overlay.show();
        trigger.removeClass('is-closed').addClass('is-open');
        isClosed = true;
    }
}
function closeMenu(){
    hamburger_cross();
    $('#wrapper').toggleClass('toggled');
}
function showSearchBar(){

    $('#searchBar').show();
}
function hideSearchBar(){
   // alert($('#searchKeys').val());
    if($('#searchKeys').val().length>0) {
        visitUrl('all', $('#searchKeys').val());
    }
    $('#searchBar').hide();
}