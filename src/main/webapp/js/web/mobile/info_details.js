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
    $.ajax({
        url: "/info/getInfoDetailList.do",
        data: {infoId: $('#infoId').val()},
        type: 'POST',
        dataType: 'json',
        async: false,
        success: function (data) {
            if (data != null) {
                var info = data.data;
                //    alert(JSON.stringify(info));
                var dataList = info[0].infoFileList;

                var infoId = info[0].infoId;
                var contentTag = '<div style="height: 15px;width: 3px;background: #000;"></div>';

                $("#infoFiles").empty();

                var contentHeadTag = '</div></div></div>';
                contentHeadTag += '<div class="row" style="padding: 0;margin: 0">';
                contentHeadTag += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:20px; padding-top: 2px" >';
                contentHeadTag += contentTag;
                contentHeadTag += '</div>';
                contentHeadTag += '</div>';
                contentHeadTag += '<div class="row" style="padding: 0;margin: 0">';
                contentHeadTag += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                contentHeadTag += '<div class="content_txt_div_bg "  style="padding: 0px 10px 0px 5px;">';

                var contentStr = '<div class="container-fluid" style="background-color: white;"><div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:50px; " >';
                contentStr += '</div>';
                contentStr += '</div>';

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';

                contentStr += '<h4 style="margin-top:0;margin-bottom:0; line-height: 0.8"><strong><span class="info_title_black title_font font_size_20" style="padding-top: 5px;">' + info[0].infoTitleEn + '</span></strong></h4>';

                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:2px; " >';
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:20px; padding-top: 0px" >';
                contentStr += contentTag;
                contentStr += '</div>';
                contentStr += '</div>';

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                contentStr += '<div class="content_txt_div_bg "  style="padding: 0px 10px 0px 5px;">';
                contentStr += info[0].infoRemarkEn.replace(new RegExp("<br/>","gm"),contentHeadTag);
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '</div>';


                /*contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                contentStr += '<div class="content_txt_div">';
                contentStr += info[0].classifiedTitleEn;
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '</div>';



                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:5px; " >';
                contentStr += '</div>';
                contentStr += '</div>';

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                contentStr += '<div class="content_txt_div"><strong>';
                var year = info[0].infoMonth;
                if (year != null && info[0].infoMonth != '') {
                    contentStr += year.split("-")[0];
                }

                contentStr += '</strong></div>';
                contentStr += '</div>';
                contentStr += '</div>';

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:25px;padding-top: 5px " >';
                contentStr += contentTag;
                contentStr += '</div>';
                contentStr += '</div>';

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                contentStr += '<div class="content_txt_div">';
                contentStr += info[0].countryTitleEn;
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:20px;padding-top: 5px " >';
                contentStr += contentTag;
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:25px; padding-top: 5px" >';
                contentStr += contentTag;
                contentStr += '</div>';
                contentStr += '</div>';

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                contentStr += '<div class="content_txt_div">';
                contentStr += formatEnDate(parseDate(info[0].infoMonth));
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '</div>';
*/
                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:50px;" >';
                contentStr += '</div>';
                contentStr += '</div></div></div>';

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:5px;background-color: #000; " >';
                contentStr += '</div>';
                contentStr += '</div>';


                var str = contentStr;

                str += '<div class="row" style="padding: 0;margin: 0"><div class="col-xs-12 col-sm-12 col-md-12" style="background-color: #000;padding: 0;margin: 0;">';
                for (var i = 0; i < dataList.length; i++) {
                    if(i>0){
                        str += '<div class="row" style="padding: 0;margin: 0">';
                        str += '<div class="col-xs-12 col-sm-12 col-md-12" style="height: 5px;padding: 0;margin:0;">';
                        str += '</div>';
                        str += '</div>';
                    }


                    str += '<div class="row" style="padding: 0;margin: 0">';
                    str += '<div class="col-xs-12 col-sm-12 col-md-12" style="padding: 0 0 0px 0;margin: 0">';
                    if (dataList[i].isVideo == 1) {
                        str += '<img src="' + resUrl + dataList[i].fileName + '" class="center-block img-responsive " style="max-width: 100%;height: auto;">';
                    } else {
                        str += '<video style="max-width: 100%;height: auto;" controls autobuffer><source src="' + resUrl + dataList[i].fileName + '" type=\'video/mp4; codecs="avc1.42E01E, mp4a.40.2"\'></source></video>';
                    }
                    str += '</div>';
                    str += '</div>';

                }
                str += '</div>';
                str += '</div>';
                // console.log(str);



                str += '<div class="row" style="padding: 0;margin: 0"><div class="col-xs-12 col-sm-12 col-md-12" style="background-color: white; padding-bottom: 50px;">';


                contentStr=str;
         /*       contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:25px; " >';
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12">';
                contentStr += tagSvg_black + "&nbsp; &nbsp; &nbsp; &nbsp; " + downTagSvg;
                contentStr += '</div>';
                contentStr += '</div>';

                var tags = info[0].tagsTitleEn;
                if (tags != null && tags != '') {
                    contentStr += '<div class="row" style="padding: 0;margin: 0">';
                    contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:18px; " >';
                    contentStr += '</div>';
                    contentStr += '</div>';
                    var tagArray = tags.split(",");
                    for (var i = 0; i < tagArray.length; i++) {
                        var tag = tagArray[i];
                        contentStr += '<div class="row" style="padding: 2px 0;margin: 0">';
                        contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                        contentStr += '<div class="content_txt_div title_font">';
                        contentStr += tag;
                        contentStr += '</div>';
                        contentStr += '</div>';
                        contentStr += '</div>';
                    }
                }
*/

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:50px; " >';
                contentStr += '</div>';
                contentStr += '</div>';


                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                contentStr += '<div class="content_txt_div">';
                contentStr += "Produced By <strong class='title_font'>LAYUETSAL.Group</strong>";
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '</div>';

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:25px; " >';
                contentStr += '</div>';
                contentStr += '</div>';

                setBrowserDetail(infoId, info[0].browser);

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="text-align: center;" >';

                var tagStr = '<div class="row" style="padding: 0;margin: 0;">';
                if (Cookies.get("A-" + infoId) == "1") {
                    tagStr += '                                                        <div class="col-xs-3 col-sm-3 col-md-3 detail_tag" \n' +
                        '                                                             style="display: inline-block;width: 75px;height: 75px;line-height:75px;vertical-align:middle;padding-top: 5px;background: #262626;cursor: inherit;">\n';
                } else {
                    tagStr += '                                                        <div class="col-xs-3 col-sm-3 col-md-3 detail_tag" \n' +
                        '                                                             style="display: inline-block;width: 75px;height: 75px;line-height:75px;vertical-align:middle;padding-top: 4px;cursor: inherit;">\n';
                }
                tagStr += picUpSvg;
                tagStr += '                                                        </div>\n' +
                    '                                                        <div class="col-xs-3 col-sm-3 col-md-3 title_font"\n' +
                    '                                                             style="background: #ff00ff;width: 75px;height: 75px;line-height:75px;vertical-align:middle;color: #fff;text-align: center;" >\n' +
                    '                                                            <strong id="browsers">' + info[0].browser + '</strong>\n' +
                    '                                                        </div>\n';

                if (Cookies.get("B-" + infoId) == "1") {
                    tagStr += '                                                        <div class="col-xs-3 col-sm-3 col-md-3 detail_tag" \n' +
                        '                                                             style="display: inline-block;width: 75px;height: 75px;line-height:75px;vertical-align:middle;padding-top: 10px;background: #262626;">\n';

                } else {
                    tagStr += '                                                        <div class="col-xs-3 col-sm-3 col-md-3 detail_tag" onclick=\'javascript:setHisDetail("' + infoId + '",' + info[0].hits + ');this.style.background="#262626";return;\'\n' +
                        '                                                             style="display: inline-block;width: 75px;height: 75px;line-height:75px;vertical-align:middle;padding-top: 5px">\n';
                }
                tagStr += picDownSvg;
                tagStr += '                                                        </div>\n' +
                    '                                                        <div class="col-xs-3 col-sm-3 col-md-3 title_font"\n' +
                    '                                                             style="background: #ff0000;width: 75px;height: 75px;line-height:75px;vertical-align:middle;color: #fff;text-align: center;">\n' +
                    '                                                            <strong id="hits">' + info[0].hits + '</strong>\n' +
                    '                                                        </div>\n' +
                    '                                                </div>';

                contentStr+=tagStr;
                contentStr += '</div>';
                contentStr += '</div>';

                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '</div>';


                /*setBrowserDetail(infoId,info[0].browser);

                $("#hits").empty();

                $("#hits").html(info[0].hits);*/



                $("#infoFiles").html(contentStr);
            }
            return;

        }, error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert("status:" + XMLHttpRequest.status + ",readyState:" + XMLHttpRequest.readyState + ",textStatus:" + textStatus);
            //     alert(errorThrown);

        }
    });

    $.ajax({
        url: "/info/getPrevNextInfoDetail.do",
        data: {infoId: $('#infoId').val()},
        type: 'POST',
        dataType: 'json',
        async: false,
        success: function (data) {
            if (data.code == 200) {
                var info = data.data;

                var nextInfo = info.next;


                //后一个
                if (nextInfo != null) {


                    var str = ' <div class=\'btn-group\' role=\'group\' style="cursor: pointer;"  onclick=\'visitInfoDetailUrl("' + nextInfo.infoId + '","' + nextInfo.infoTitleEn + '")\'><a type=\'button\' style=\'line-height: 65px;vertical-align: middle;padding: 0 20px; border-right: 1px solid #000;\' class=\'btn btn-inverse btn-default title_font\' href=\'#\'>SCROLL RIGHT TO NEXT</a> <a type=\'button\' style=\'line-height: 65px;vertical-align: middle; border-left: 1px solid #000000;\' class=\'btn btn-default\' href=\'#\'><svg version="1.2" baseProfile="tiny" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 15.6 9" width="20" height="10" transform="rotate(270)"><switch><g><path fill="#00F" d="M3.9 2h8.7l1.8-2H0l3.6 4h2.1z"/><path fill="red" d="M7.2 8L3.6 4H2.2l4.6 5 1.7-1.9-.3-.3z"/><path fill="#00F" d="M8.2 6.8L5.7 4H3.6l3.6 4z"/><path fill="#F0F" d="M8.2 6.8L5.7 4H3.6l3.6 4z"/><path fill="#0F0" d="M15.6 2h-3l-1.8 2h.4L8.5 7.1l1.3 1.4z"/><path fill="#00F" d="M5.7 4h5.1l1.8-2H3.9z"/><path fill="#0FF" d="M5.7 4h5.1l1.8-2H3.9z"/><path fill="red" d="M10.8 4L8.2 6.8l.3.3L11.2 4z"/><path fill="#FF0" d="M10.8 4L8.2 6.8l.3.3L11.2 4z"/><path fill="#00F" d="M8.2 6.8L10.8 4H5.7z"/><path fill="red" d="M8.2 6.8L10.8 4H5.7z"/><path fill="#FFF" d="M8.2 6.8L10.8 4H5.7z"/></g></switch></svg></a></div>';

                    $("#nextInfo").html(str);
                }

            }
            return;

        }, error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert("status:" + XMLHttpRequest.status + ",readyState:" + XMLHttpRequest.readyState + ",textStatus:" + textStatus);
            //     alert(errorThrown);

        }
    });
});

function setHisDetail(infoId, hisCount) {
    return ;
    setHis(infoId);

    $("#hits").empty();

    $("#hits").html(hisCount);

}

function setBrowserDetail(infoId, browserCount) {
    setBrowser(infoId);
    $("#browsers").empty();
    $("#browsers").html(browserCount + 1);

}



