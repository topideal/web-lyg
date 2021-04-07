var trigger = $('.hamburger'),
    overlay = $('.overlay'),
    isClosed = false;

function hamburger_cross() {

    if (isClosed == true) {
        overlay.hide();
        trigger.removeClass('is-open');
        trigger.addClass('is-closed');
        isClosed = false;
    } else {
        overlay.show();
        trigger.removeClass('is-closed');
        trigger.addClass('is-open');
        isClosed = true;
    }
}

function closeMenu() {
    hamburger_cross();
    $('#wrapper').toggleClass('toggled');
}

function getPortraitIpadCount() {
    var ua = navigator.userAgent.toLowerCase();

    if (ua.match(/iPad/i)=="ipad" && (window.orientation == 90 || window.orientation == -90)) {

        return 12;
    }
    else if (ua.match(/iPad/i)=="ipad" && (window.orientation == 0 || window.orientation == 180)){

        return 9;
    }
    return 5;
}



$(function () {
    getMenu($('#sidebar-wrapper'), 'en');
    trigger.click(function () {
        hamburger_cross();
    });


    $('[data-toggle="offcanvas"]').click(function () {
        $('#wrapper').toggleClass('toggled');
    });
    var preViewCount=getPortraitIpadCount();


    var mySwiper = new Swiper('.swiper-container',{
        pagination: '.pagination',
        paginationClickable: true,
        slidesPerView: preViewCount,
        loop: true
    });

});





