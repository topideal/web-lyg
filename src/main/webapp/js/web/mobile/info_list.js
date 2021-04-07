var pageNumber = getParameter("pageNumber");
if (!pageNumber) {
    pageNumber = 1;
}
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
function closeMenu(){
    hamburger_cross();
    $('#wrapper').toggleClass('toggled');
}






$(function () {

    trigger.click(function () {
        hamburger_cross();
    });


    $('[data-toggle="offcanvas"]').click(function () {
        $('#wrapper').toggleClass('toggled');
    });


    getMenu($('#sidebar-wrapper'), 'en');




    getInfoList(pageNumber);

});

function getInfoList(pageNumber) {
    $.ajax({
        url: "/info/getInfoList.do",
        data: {
            searchType: $('#searchType').val(),
            searchKey: $('#searchKey').val(),
            pageSize: 0,
            pageNumber: 0
        },
        type: 'POST',
        dataType: 'json',
        async: false,
        success: function (data) {
            if (data != null) {
                var dataList = data.data;
                // alert(JSON.stringify(data));
                var str = "";
                $("#infoList").empty();
                for (var i = 0; i < dataList.length; i++) {
                    str += '<div class="row">';
                    str += '<div class="col-xs-12 col-sm-12" style="padding-bottom: 30px;margin-left: 0;margin-right: 0;padding-left: 0;">';
                    str += '<img onclick=\'visitInfoDetailUrl("'+dataList[i].infoId+'","'+dataList[i].infoTitleEn+'")\' src="' + resUrl + dataList[i].infoResName + '?imageView2/1/w/' + (Math.round(getScreenRatio()) ) + '/format/jpg/interlace/1" class="img-responsive">';

                    str += '<div class="info_grad" onclick=\'visitInfoDetailUrl("'+dataList[i].infoId+'","'+dataList[i].infoTitleEn+'")\'>';
                    str += '<h4 style="margin-top:0;margin-bottom:0; line-height: 0.8"><strong><span class="info_title title_font font_size_20" style="padding-top: 5px;">' + dataList[i].infoTitleEn + '</span></strong></h4>';
                    str += '<span class="info_title" style="line-height: 20px;"> ' + dataList[i].classifiedTitleEn + '</span>';
                    str += '</div>';
                    str += '</div>';
                    str += '</div>';
                }

                $("#infoList").html(str);

                //分页
               /* $('#previous').empty();
                $('#next').empty();
                $('#pages').empty();
                var previousStr = "<div class='btn-group' role='group' ><a type='button' style='line-height: 85px;vertical-align: middle;' class='btn btn-default'>"+leftTagSvg+"</a> <a type='button' style='line-height: 85px;vertical-align: middle;padding: 0 20px;' class='btn btn-default'>" + pages_pre + "</a></div>";
                var searchType = $('#searchType').val();
                var searchKey = $('#searchKey').val();
                var url = "/index.do";
                if (searchType != null && searchType != '') {
                    url = "/" + searchType + "/" + searchKey + url;
                }
                if (data.currentPage > 1) {
                    pageNumber = data.currentPage - 1;

                    previousStr = "<div class='btn-group' role='group' ><a type='button' style='line-height: 85px;vertical-align: middle;' class='btn btn-default' href='" + url + "?pageNumber=" + pageNumber + "'>"+leftTagSvg+"</a> <a type='button' style='line-height: 85px;vertical-align: middle;padding: 0 20px;' class='btn btn-default' href='" + url + "?pageNumber=" + pageNumber + "'>" + pages_pre + "</a></div>";
                    //var previousStr="<a href='#' onclick=\"javascript:getInfoList('"+classifiedId+"',"+pageNumber+")\">< PREVIOUS</a>";

                }
                $('#previous').html(previousStr);
                var nextStr = "<div class='btn-group' role='group' ><a type='button' style='line-height: 85px;vertical-align: middle;' class='btn btn-default'>" + pages_next + "</a><a type='button' style='line-height: 85px;vertical-align: middle;' class='btn btn-default'>"+rightTagSvg+"</a></div>";
                if (data.currentPage < data.pages) {
                    pageNumber = data.currentPage + 1;
                    nextStr = "<div class='btn-group' role='group' ><a type='button' style='line-height: 85px;vertical-align: middle;' class='btn btn-default' href='" + url + "?pageNumber=" + pageNumber + "'>" + pages_next + "</a> <a type='button' style='line-height: 85px;vertical-align: middle;' class='btn btn-default' href='" + url + "?pageNumber=" + pageNumber + "'>"+rightTagSvg+"</a></div>";
                }
                $('#next').html(nextStr);
                if (data.currentPage <= data.pages) {
                    var pages = data.pages < 6 ? data.pages : data.currentPage + 4;
                    var pagesStr = "<div class='btn-group' role='group' >";
                    var i = data.pages < 6 ? 1 : data.currentPage;


                    for (i; i <= pages; i++) {
                        if (i < 6) {
                            pagesStr += '<a type="button" style="line-height: 85px;vertical-align: middle;" class="btn btn-default" href=\'' + url + '?pageNumber=' + i + '\'>' + eval("pages_" + i) + "</a>";
                        } else {
                            pagesStr += '<a type="button" style="line-height: 85px;vertical-align: middle;" class="btn btn-default" href=\'' + url + '?pageNumber=' + i + '\'>' + i + "</a>";
                        }

                    }
                    pagesStr += "</div>";
                    $('#pages').html(pagesStr);

                }*/




            }
            return;

        }, error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert("status:" + XMLHttpRequest.status + ",readyState:" + XMLHttpRequest.readyState + ",textStatus:" + textStatus);
            //     alert(errorThrown);

        }
    });

}



