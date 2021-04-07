var pageNumber = getParameter("pageNumber");
if (!pageNumber) {
    pageNumber = 1;
}



/* Scroll to Top */


$(".totop").hide();

function totop(){
    $(window).scroll(function(){
        if ($(this).scrollTop()>300)
        {
            $('.totop').slideDown();
        }
        else
        {
            $('.totop').slideUp();
        }
    });

    $('.totop a').click(function (e) {
        e.preventDefault();
        $('body,html').animate({scrollTop: 0}, 500);
    });

}



$(function () {
    getMenu($('#sidebar-wrapper'), 'en');
    // alert(classifiedId);
    totop();

    trigger.on("click",function () {
        hamburger_cross();
    });


    $('[data-toggle="offcanvas"]').click(function () {
        $('#wrapper').toggleClass('toggled');
    });


    getInfoList(pageNumber);

});

function getInfoList(pageNumber) {
    $.ajax({
        url: "/info/getInfoList.do",
        data: {
            searchType: $('#searchType').val(),
            searchKey: $('#searchKey').val(),
            pageSize: defaultPageSize,
            pageNumber: pageNumber
        },
        type: 'POST',
        dataType: 'json',
        async: false,
        success: function (data) {
            if (data != null) {
                var dataList = data.data;
                // alert(JSON.stringify(data));
                var str = "";
                $("#masonry").empty();
                for (var i = 0; i < dataList.length; i++) {
                    str += '<div class="col-xs-6 col-sm-6 col-md-4" style="padding: 15px 2px 15px 2px;">';
                    str += '<div class="item">';
                    str += '<div class="thumbnail" >';
                    str +='<div style="display: block;width: 100%;height: 100%;overflow: hidden;">';
                    // str += '<a href="'+dataList[i].infoId+'/classified_details.do">';
                    str += '<img onclick=\'visitInfoDetailUrl("'+dataList[i].infoId+'","'+dataList[i].infoTitleEn+'")\' src="' + resUrl + dataList[i].infoResName + '?imageView2/1/w/' + (Math.round(getScreenRatio() / 4) + 100) + '/h/'+Math.round(((getScreenRatio() / 4) + 100)*0.55)+'/format/jpg/interlace/1" class="img-responsive">';
                    //  str += '</a>';
                    str +="</div>";
                    str += '<div class="caption">';


                    str += '<div class="media">';

                    str += '<div class="media-body"  onclick=\'visitInfoDetailUrl("'+dataList[i].infoId+'","'+dataList[i].infoTitleEn+'")\'>';
                    str += '<span class="title_font" style="line-height: 1.1;">' + dataList[i].infoTitleEn + '</span>';
                    str += '<p class="font_color_80 font_size_10 content_font" style="padding-top:12px;line-height: 1.1;">' + (typeof (dataList[i].classifiedTitleEn)=="object"?'':dataList[i].classifiedTitleEn.toLowerCase()) + '</p>';
                    if (dataList[i].infoMonth != null && dataList[i].infoMonth != '') {

                        str += '<p style="position:absolute; bottom:30px;" class="font_color_80 font_size_10 content_font">' + formatEnDate(parseDate(dataList[i].infoMonth)) + '</p>';

                    }
                    str += '</div>';
                    str += '<div class="media-right">';
                    str += '<ul class="icon">';
                    if(Cookies.get("A-"+dataList[i].infoId)=="1"){
                        str += '<li class="info_visited" style="border-bottom: 0px solid #262626;">';
                    }else{
                    str += '<li onclick=\'javascript:setBrowser("'+dataList[i].infoId+'");this.className="info_visited";return;\' style="padding-top: 18px;border-bottom: 0px solid #262626;">';
                    }
                    str += picUpSvg;
                    str += '</li>';
                    if(Cookies.get("B-"+dataList[i].infoId)=="1"){
                        str += '<li class="info_visited" style="background: #262626;border-top: 0px solid #262626;">';
                    }else{
                        str += '<li onclick=\'javascript:setHis("'+dataList[i].infoId+'");this.className="info_visited";return;\' style="padding-top: 18px;background: #1e1e1e;border-top: 0px solid #262626;">';
                    }

                    str += picDownSvg;
                    str += '</li>';
                    str += '</ul>';
                    str += '</div>';
                    str += '</div>';


                    str += '</div>';
                    str += '</div>';
                    str += '</div>';
                    str += '</div>';
                }


                //分页
                $('#previous').empty();
                $('#next').empty();
                $('#pages').empty();
                var previousStr = "<div class='btn-group' role='group' ><a type='button' style='height: 65px;padding-top: 20px;' class='btn btn-default'>"+leftMenuTagSvg+"</a> <a type='button' style='line-height: 63px;vertical-align: middle;padding: 0 20px;width:120px; ' class='btn btn-default'>" + pages_pre + "</a></div>";
                var searchType = $('#searchType').val();
                var searchKey = $('#searchKey').val();
                var url = "/index.do";
                if (searchType != null && searchType != '') {
                    url = "/" + searchType + "/" + searchKey + "/infolist.do";
                }
                if (data.currentPage > 1) {
                    pageNumber = data.currentPage - 1;

                    previousStr = "<div class='btn-group' role='group' ><a type='button' style='height: 65px;padding-top: 20px;' class='btn btn-default' href='" + url + "?pageNumber=" + pageNumber + "'>"+leftMenuTagSvg+"</a> <a type='button' style='line-height: 63px;vertical-align: middle;padding: 0 20px;width:120px;' class='btn btn-default' href='" + url + "?pageNumber=" + pageNumber + "'>" + pages_pre + "</a></div>";
                    //var previousStr="<a href='#' onclick=\"javascript:getInfoList('"+classifiedId+"',"+pageNumber+")\">< PREVIOUS</a>";

                }
                $('#previous').html(previousStr);
                var nextStr = "<div class='btn-group' role='group' ><a type='button' style='line-height: 63px;vertical-align: middle;padding: 0 20px;width:120px;' class='btn btn-default'>" + pages_next + "</a><a type='button' style='height: 65px;padding-top: 20px;' class='btn btn-default'>"+rightMenuTagSvg+"</a></div>";
                if (data.currentPage < data.pages) {
                    pageNumber = data.currentPage + 1;
                    nextStr = "<div class='btn-group' role='group' ><a type='button' style='line-height: 63px;vertical-align: middle;padding: 0 20px;width:120px;' class='btn btn-default' href='" + url + "?pageNumber=" + pageNumber + "'>" + pages_next + "</a> <a type='button' style='height: 65px;padding-top: 20px;' class='btn btn-default' href='" + url + "?pageNumber=" + pageNumber + "'>"+rightMenuTagSvg+"</a></div>";
                }
                $('#next').html(nextStr);
                if (data.currentPage <= data.pages) {
                    var pages = data.pages < 6 ? data.pages : data.currentPage + 4;
                    var pagesStr = "<div class='btn-group' role='group' >";
                    var i = data.pages < 6 ? 1 : data.currentPage;


                    for (i; i <= pages; i++) {
                        if (i < 6) {
                            pagesStr += '<a type="button" style="height: 65px;padding-top: 25px;" class="btn btn-default" href=\'' + url + '?pageNumber=' + i + '\'>' + eval("pages_" + i) + "</a>";
                        } else {
                            pagesStr += '<a type="button" style="height: 65px;padding-top: 25px;" class="btn btn-default" href=\'' + url + '?pageNumber=' + i + '\'>' + i + "</a>";
                        }

                    }
                    pagesStr += "</div>";
                    $('#pages').html(pagesStr);

                }

                $("#masonry").html(str);


            }
            return;

        }, error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert("status:" + XMLHttpRequest.status + ",readyState:" + XMLHttpRequest.readyState + ",textStatus:" + textStatus);
            //     alert(errorThrown);

        }
    });

}



