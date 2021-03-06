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

$(".totop").hide();

function totop() {
    $(window).scroll(function () {
        if ($(this).scrollTop() > 300) {
            $('.totop').slideDown();
        }
        else {
            $('.totop').slideUp();
        }
    });

    $('.totop a').click(function (e) {
        e.preventDefault();
        $('body,html').animate({scrollTop: 0}, 500);
    });

}

$(function () {
    $("#prevInfoTag").hide();
    $("#nextInfoTag").hide();
    totop();
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
                var str = "";
                var infoId = info[0].infoId;
                $("#infoFiles").empty();
                $("#infoContent").empty();
                for (var i = 0; i < dataList.length; i++) {


                    if (i == 0) {

                        str += '<div class="row" style="padding: 0;margin: 0">';
                        str += '<div class="col-xs-12 col-sm-12 col-md-12" style="padding: 0 0 0px 0;margin: 0">';
                        if (dataList[i].isVideo == 1) {
                            str += '<img src="' + resUrl + dataList[i].fileName + '" class="center-block img-responsive" style="max-width: 930px;height: auto;cursor: pointer;">';
                        } else {
                            str += '<video style="max-width: 930px;height: auto;" controls autobuffer><source src="' + resUrl + dataList[i].fileName + '" type=\'video/mp4; codecs="avc1.42E01E, mp4a.40.2"\'></source></video>';
                        }
                        str += '</div>';
                        str += '</div>';
                    } else {

                        str += '<div class="col-xs-6 col-sm-6 col-md-6" style="padding: 0 0 0px 0;margin: 0">';
                        if (dataList[i].isVideo == 1) {
                            str += '<img src="' + resUrl + dataList[i].fileName + '" class="center-block img-responsive pimg" style="cursor: pointer;">';
                        } else {
                            str += '<video style="max-width: 100%;height: auto;" controls autobuffer><source src="' + resUrl + dataList[i].fileName + '" type=\'video/mp4; codecs="avc1.42E01E, mp4a.40.2"\'></source></video>';
                        }
                        str += '</div>';

                    }

                    if (i !== 0 && i % 2 == 0) {
                        str += '<div class="row" style="padding: 0;margin: 0">';
                        str += '<div class="col-xs-12 col-sm-12 col-md-12" style="height: 0px;padding: 0;margin:0;">';
                        str += '</div>';
                        str += '</div>';
                    }

                }

                // console.log(str);
                $("#infoFiles").html(str);

                $(".pimg").click(function () {
                    var _this = $(this);//????????????pimg????????????_this????????????
                    imgShow("#outerdiv", "#innerdiv", "#bigimg", _this);
                });


                var contentTag = '<div style="height: 15px;width: 3px;background: #000;"></div>';

                var contentHeadTag = '</div></div></div>';
                contentHeadTag += '<div class="row" style="padding: 0;margin: 0">';
                contentHeadTag += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:20px; padding-top: 2px" >';
                contentHeadTag += contentTag;
                contentHeadTag += '</div>';
                contentHeadTag += '</div>';
                contentHeadTag += '<div class="row" style="padding: 0;margin: 0">';
                contentHeadTag += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                contentHeadTag += '<div class="content_txt_div_bg "  style="padding: 0px 10px 0px 5px;">';


                var contentStr = '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:50px; " >';
                contentStr += '</div>';
                contentStr += '</div>';

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';

                contentStr += '<div class="title_font" style=\'background-image: url("/images/info_title_bg.jpg");color: #fff;padding: 0px 20px 0px 5px;font-size: 24px;max-height: 100px;\'>' + info[0].infoTitleEn + '</div>';

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
              //  contentStr += info[0].infoRemarkEn.replace(new RegExp("br","gm"),"");
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '</div>';

               /* contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                contentStr += '<div class="content_txt_div">';
                contentStr += info[0].classifiedTitleEn;
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '</div>';*/

                /* contentStr += '<div class="row" style="padding: 0;margin: 0">';
                 contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:25px; padding-top: 5px" >';
                 contentStr += contentTag;
                 contentStr += '</div>';
                 contentStr += '</div>';

                 contentStr += '<div class="row" style="padding: 0;margin: 0">';
                 contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                 contentStr += '<div class="content_txt_div">';
                 contentStr += info[0].brandsTitleEn;
                 contentStr += '</div>';
                 contentStr += '</div>';
                 contentStr += '</div>';*/

                /*            contentStr += '<div class="row" style="padding: 0;margin: 0">';
                            contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:25px;padding-top: 5px " >';
                            contentStr += contentTag;
                            contentStr += '</div>';
                            contentStr += '</div>';

                            contentStr += '<div class="row" style="padding: 0;margin: 0">';
                            contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                            contentStr += '<div class="content_txt_div">';
                            contentStr += info[0].tradesTitleEn;
                            contentStr += '</div>';
                            contentStr += '</div>';
                            contentStr += '</div>';*/

               /* contentStr += '<div class="row" style="padding: 0;margin: 0">';
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
                contentStr += '</div>';*/

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:60px; " >';
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
                        contentStr += '<div class="content_txt_div">';
                        contentStr += tag;
                        contentStr += '</div>';
                        contentStr += '</div>';
                        contentStr += '</div>';
                    }
                }


                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:25px; " >';
                contentStr += '</div>';
                contentStr += '</div>';

                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" style="height:60px; " >';
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '<div class="row" style="padding: 0;margin: 0">';
                contentStr += '<div class="col-xs-12 col-sm-12 col-md-12" >';
                contentStr += '<div class="content_txt_div">';
                contentStr += "Produced By <strong class='title_font'>LAYUETSAL.Group</strong>";
                contentStr += '</div>';
                contentStr += '</div>';
                contentStr += '</div>';

                $("#infoContent").html(contentStr);
                setBrowserDetail(infoId, info[0].browser);

                var tagStr = '<div class="container-fluid">\n' +
                    '                                                    <div class="row">';
                if (Cookies.get("A-" + infoId) == "1") {
                    tagStr += '                                                        <div class="col-xs-3 col-sm-3 col-md-3 detail_tag" \n' +
                        '                                                             style="display: inline-block;width: 66px;height: 66px;line-height:66px;vertical-align:middle;padding-top: 5px;background: #262626;cursor: inherit;">\n';
                } else {
                    tagStr += '                                                        <div class="col-xs-3 col-sm-3 col-md-3 detail_tag" \n' +
                        '                                                             style="display: inline-block;width: 66px;height: 66px;line-height:66px;vertical-align:middle;padding-top: 4px;cursor: inherit;">\n';
                }
                tagStr += picUpSvg;
                tagStr += '                                                        </div>\n' +
                    '                                                        <div class="col-xs-3 col-sm-3 col-md-3 title_font"\n' +
                    '                                                             style="background: #ff00ff;width: 66px;height: 66px;line-height:66px;vertical-align:middle;color: #fff;text-align: center;" >\n' +
                    '                                                            <strong id="browsers">' + info[0].browser + '</strong>\n' +
                    '                                                        </div>\n';

                if (Cookies.get("B-" + infoId) == "1") {
                    tagStr += '                                                        <div class="col-xs-3 col-sm-3 col-md-3 detail_tag" \n' +
                        '                                                             style="display: inline-block;width: 66px;height: 66px;line-height:66px;vertical-align:middle;padding-top: 10px;background: #262626;">\n';

                } else {
                    tagStr += '                                                        <div class="col-xs-3 col-sm-3 col-md-3 detail_tag" onclick=\'javascript:setHisDetail("' + infoId + '",' + info[0].hits + ');this.style.background="#262626";return;\'\n' +
                        '                                                             style="display: inline-block;width: 66px;height: 66px;line-height:66px;vertical-align:middle;padding-top: 5px">\n';
                }
                tagStr += picDownSvg;
                tagStr += '                                                        </div>\n' +
                    '                                                        <div class="col-xs-3 col-sm-3 col-md-3 title_font"\n' +
                    '                                                             style="background: #ff0000;width: 66px;height: 66px;line-height:66px;vertical-align:middle;color: #fff;text-align: center;">\n' +
                    '                                                            <strong id="hits">' + info[0].hits + '</strong>\n' +
                    '                                                        </div>\n' +
                    '                                                    </div>\n' +
                    '                                                </div>';
                $("#browserhits").empty();
                $("#browserhits").html(tagStr);

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
                var prevInfo = info.prev;
                var nextInfo = info.next;

                //?????????
                if (prevInfo != null) {

                    var str = '<div class="media detail_thumbnail" style="cursor: pointer;" onclick=\'visitInfoDetailUrl("' + prevInfo.infoId + '","' + prevInfo.infoTitleEn + '")\'>';
                    str += '<div class="media-left" style="width: 220px;height: 120px;padding-right: 0px;">';

                    str += '<img src="' + resUrl + prevInfo.infoResName + '?imageView2/1/w/240/h/140/format/jpg/interlace/1" class="img-responsive">';
                    str += '</div>';
                    str += '<div class="media-body"  style="background: #fff;width: 220px;height: 120px;padding:20px;">';
                    str += '<span class="title_font" style="line-height: 1.1;"> ' + prevInfo.infoTitleEn + '</span>';
                    if (prevInfo.infoMonth != null && prevInfo.infoMonth != '') {

                        str += '<p style="position:absolute; bottom:10px;">' + formatEnDate(parseDate(prevInfo.infoMonth)) + '</p>';

                    }
                    str += '</div>';

                    str += '</div>';

                    $("#prevInfo").html(str);
                    $("#prevInfoTag").show();
                }
                //?????????
                if (nextInfo != null) {


                    str = '<div class="media detail_thumbnail" style="cursor: pointer;" onclick=\'visitInfoDetailUrl("' + nextInfo.infoId + '","' + nextInfo.infoTitleEn + '")\'>';

                    str += '<div class="media-body"  style="background: #fff;width: 220px;height: 120px;padding:20px;">';
                    str += '<span class="title_font" style="line-height: 1.1;">' + nextInfo.infoTitleEn + '</span>';
                    if (nextInfo.infoMonth != null && nextInfo.infoMonth != '') {

                        str += '<p style="position:absolute; bottom:10px;">' + formatEnDate(parseDate(nextInfo.infoMonth)) + '</p>';

                    }
                    str += '</div>';
                    str += '<div class="media-right" style="width: 220px;height: 120px;padding-left: 0px;">';
                    str += '<img src="' + resUrl + nextInfo.infoResName + '?imageView2/1/w/240/h/140/format/jpg/interlace/1" class="img-responsive">';

                    str += '</div>';
                    str += '</div>';

                    $("#nextInfo").html(str);
                    $("#nextInfoTag").show();
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
    setHis(infoId);

    $("#hits").empty();

    $("#hits").html(hisCount + 1);

}

function setBrowserDetail(infoId, browserCount) {
    setBrowser(infoId);
    $("#browsers").empty();
    $("#browsers").html(browserCount + 1);

}

function imgShow(outerdiv, innerdiv, bigimg, _this) {
    var src = _this.attr("src");//?????????????????????pimg????????????src??????
    $(bigimg).attr("src", src);//??????#bigimg?????????src??????

    /*?????????????????????????????????????????????????????????????????????*/
    $(bigimg).bind("load", function () {
        var windowW = $(window).width();//????????????????????????
        var windowH = $(window).height();//????????????????????????
        var realWidth = this.width;//????????????????????????
        var realHeight = this.height;//????????????????????????
        var imgWidth, imgHeight;
        var scale = 0.8;//???????????????????????????????????????????????????????????????????????????????????????

        if (realHeight > windowH * scale) {//??????????????????
            imgHeight = windowH * scale;//????????????????????????????????????????????????
            imgWidth = imgHeight / realHeight * realWidth;//?????????????????????
            if (imgWidth > windowW * scale) {//??????????????????????????????
                imgWidth = windowW * scale;//????????????????????????
            }
        } else if (realWidth > windowW * scale) {//??????????????????????????????????????????
            imgWidth = windowW * scale;//????????????????????????????????????????????????
            imgHeight = imgWidth / realWidth * realHeight;//?????????????????????
        } else {//???????????????????????????????????????????????????????????????
            imgWidth = realWidth;
            imgHeight = realHeight;
        }
        $(bigimg).css("width", imgWidth);//?????????????????????????????????

        var w = (windowW - imgWidth) / 2;//??????????????????????????????
        var h = (windowH - imgHeight) / 2;//??????????????????????????????
        $(innerdiv).css({"top": h, "left": w});//??????#innerdiv???top???left??????
        $(outerdiv).fadeIn("fast");//????????????#outerdiv???.pimg
    });

    $(outerdiv).click(function () {//?????????????????????????????????
        $(this).fadeOut("fast");
    });
}