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
                    var _this = $(this);//将当前的pimg元素作为_this传入函数
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

                //前一个
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
                //后一个
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
    var src = _this.attr("src");//获取当前点击的pimg元素中的src属性
    $(bigimg).attr("src", src);//设置#bigimg元素的src属性

    /*获取当前点击图片的真实大小，并显示弹出层及大图*/
    $(bigimg).bind("load", function () {
        var windowW = $(window).width();//获取当前窗口宽度
        var windowH = $(window).height();//获取当前窗口高度
        var realWidth = this.width;//获取图片真实宽度
        var realHeight = this.height;//获取图片真实高度
        var imgWidth, imgHeight;
        var scale = 0.8;//缩放尺寸，当图片真实宽度和高度大于窗口宽度和高度时进行缩放

        if (realHeight > windowH * scale) {//判断图片高度
            imgHeight = windowH * scale;//如大于窗口高度，图片高度进行缩放
            imgWidth = imgHeight / realHeight * realWidth;//等比例缩放宽度
            if (imgWidth > windowW * scale) {//如宽度扔大于窗口宽度
                imgWidth = windowW * scale;//再对宽度进行缩放
            }
        } else if (realWidth > windowW * scale) {//如图片高度合适，判断图片宽度
            imgWidth = windowW * scale;//如大于窗口宽度，图片宽度进行缩放
            imgHeight = imgWidth / realWidth * realHeight;//等比例缩放高度
        } else {//如果图片真实高度和宽度都符合要求，高宽不变
            imgWidth = realWidth;
            imgHeight = realHeight;
        }
        $(bigimg).css("width", imgWidth);//以最终的宽度对图片缩放

        var w = (windowW - imgWidth) / 2;//计算图片与窗口左边距
        var h = (windowH - imgHeight) / 2;//计算图片与窗口上边距
        $(innerdiv).css({"top": h, "left": w});//设置#innerdiv的top和left属性
        $(outerdiv).fadeIn("fast");//淡入显示#outerdiv及.pimg
    });

    $(outerdiv).click(function () {//再次点击淡出消失弹出层
        $(this).fadeOut("fast");
    });
}