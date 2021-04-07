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

$(function () {
    getMenu($('#sidebar-wrapper'), 'en');
    trigger.click(function () {
        hamburger_cross();
    });
    $('[data-toggle="offcanvas"]').click(function () {
        $('#wrapper').toggleClass('toggled');
    });
    getRecruitList(0)
});


function getRecruitList(pageNumber) {
    $.ajax({
        url: "/en/recruit/getRecruitList.do",
        data: {
            searchType: $('#searchType').val(),
            searchKey: $('#searchKey').val(),
            pageSize: 0,
            pageNumber: pageNumber
        },
        type: 'POST',
        dataType: 'json',
        async: false,
        success: function (data) {
            if (data != null) {
                var dataList = data.data;
                // alert(JSON.stringify(data));
                var str = '<div  class="col-xs-12 col-sm-12 col-md-12" style="background:#fff;padding:20px ;">';
                $("#recruitContent").empty();
                var contentTag = '<div class="content_spacing" ></div>';
                var contentSpaceStr ='<div style="height: 2px;background-color: white;" ></div>';
                for (var i = 0; i < dataList.length; i++) {

                    str += '<div class="row" style="margin: 0;padding: 0">';
                    str += '<div  class="col-xs-12 col-sm-12 col-md-12" style="margin: 0;padding: 0">';
                    str += '<div class="content_txt_span " style="padding: 0"><span class="content_txt_div_m font_size_12"  style="background-color: #000;">' + getTimeShow(dataList[i].createDate) + ' / ' + dataList[i].salary + '</span></div> ';
                    str +='<div style="height: 4px;background-color: white;" ></div>';
                    str += '<div class="content_txt_span title_font font_size_18" style="padding: 0"><span class="content_txt_div_m " style="background-color: #000;position: inherit;">' + dataList[i].title + '</span></div> ';
                    str +=contentSpaceStr;
                    str += '<div class="content_txt_span " style="padding: 0"><span class="content_txt_div_m font_size_12" style="background-color: #000;">' + dataList[i].jobAddr + '</span></div>';
                    str +=contentSpaceStr;
                    str +='<a href="/' + dataList[i].id + '/recruitendetail.do">';
                    str +=recruit_view_icon;
                    str +='</a>';
                    str += contentTag;
                    str += contentTag;
                    str += '</div>';
                    str += '</div>';


                }
                str += '</div>';
                $("#recruitContent").html(str);


            }
            return;

        }, error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert("status:" + XMLHttpRequest.status + ",readyState:" + XMLHttpRequest.readyState + ",textStatus:" + textStatus);
            //     alert(errorThrown);

        }
    });

}






