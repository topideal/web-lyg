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
        url: "/en/recruit/getRecruitById.do",
        data: {
            id: $('#id').val(),
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
                var str = '<div  class="col-xs-12 col-sm-12 col-md-12" >';
                $("#recruitContent").empty();
                var contentTag = '<div class="content_spacing" ></div>';
                var contentSpaceStr ='<div style="height: 2px;background-color: white;" ></div>';
                for (var i = 0; i < dataList.length; i++) {
                    if(i>0){
                        str += '<div class="row" style="padding: 0;margin: 0">';
                        str += '<div class="col-xs-12 col-sm-12 col-md-12" style="height: 10px;padding: 0;margin:0;">';
                        str += '</div>';
                        str += '</div>';
                    }
                    str += '<div class="row" style="margin: 0;">';
                    str += '<div  class="col-xs-12 col-sm-12 col-md-12" style="background:#fff;padding:50px ;">';
                    str += '<div class="content_txt_span "><span class="content_txt_div_m font_size_12"  style="background-color: #000;">' + getTimeShow(dataList[i].createDate) + ' / ' + dataList[i].salary + '</span></div> ';
                    str +=contentSpaceStr;
                    str += '<div class="content_txt_span title_font font_size_18"><span class="content_txt_div_m " style="background-color: #000;position: inherit;">' + dataList[i].title + '</span></div> ';
                    str +='<div style="height: 1px;background-color: white;" ></div>';
                    if(dataList[i].jobAddr) {
                        str += '<div class="content_txt_span "><span class="content_txt_div_m font_size_12" style="background-color: #000;">' + dataList[i].jobAddr + '</span></div>';
                    }
                    str += contentTag;
                    str += contentTag;
                    str += contentTag;
                    str +=contentSpaceStr;
                    str += '<div class="content_txt_span "><span class="content_txt_div_m title_font font_size_12" style="background-color: #000;">JOB DESCRIPTION</span></div>';
                    if(dataList[i].remark) {
                        str += contentTag;
                        str += '<div class="content_txt_div_bg " >' + dataList[i].remark + '</div>';
                    }

                    if(dataList[i].skill) {
                        str += contentTag;
                        str +=contentSpaceStr;
                        str += '<div class="content_txt_span "><span class="content_txt_div_m title_font font_size_12" style="background-color: #000;">We\' looking for someone who is:</span></div>';

                        str += contentTag;
                        str += '<div class="content_txt_div_bg " >' + dataList[i].skill + '</div>';


                    }
                    if(dataList[i].experience) {
                        str += contentTag;
                        str += contentSpaceStr;
                        str += '<div class="content_txt_span "><span class="content_txt_div_m title_font font_size_12" style="background-color: #000;">What\'s in it for you:</span></div>';

                        str += '<div class="content_txt_div_bg " >' + dataList[i].experience + '</div>';

                    }
                    if(dataList[i].edueation) {
                        str += contentTag;
                        str += contentSpaceStr;
                        str += '<div class="content_txt_span "><span class="content_txt_div_m title_font font_size_12" style="background-color: #000;">Expectations:</span></div>';

                        str += '<div class="content_txt_div_bg ">' + dataList[i].edueation + '</div>';
                    }
                    if(dataList[i].salary) {
                        str += contentSpaceStr;
                        str += '<div class="content_txt_span "><span class="content_txt_div_m title_font" style="background-color: #000;">Job Type:' + dataList[i].salary + '</span></div>';
                    }
                    str += '<div style="height: 40px;" ></div>';
                    str += "<div class='btn-group' role='group' ><a type='button' style='line-height: 65px;vertical-align: middle;padding: 0 20px; border-right: 1px solid #fff;' class='btn btn-inverse btn-default title_font' href='mailto:nana@layuetsai.com'>APPLY FOR JOB</a> <a type='button' style='line-height: 65px;vertical-align: middle; border-left: 1px solid #fff;' class='btn btn-default' href='mailto:nana@layuetsai.com'>"+rightTagSvg+"</a></div>";



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






