var resUrl = "http://lyc.liuliandesign.com/";
var isRoot = true;
var defaultPageSize = 12;
$.fn.serializeFmObject = function () {
    var o = {};
    var a = this.serializeArray();
    $.each(a, function () {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value.getViewJsonData() || '');
        } else {
            o[this.name] = this.value.getViewJsonData() || '';
        }
    });
    return o;
};


String.prototype.replaceAll = function (reallyDo, replaceWith, ignoreCase) {
    if (!RegExp.prototype.isPrototypeOf(reallyDo)) {
        return this.replace(new RegExp(reallyDo, (ignoreCase ? "gi" : "g")), replaceWith);
    } else {
        return this.replace(reallyDo, replaceWith);
    }
};

String.prototype.getViewJsonData = function () {
    //return this.replaceAll(new RegExp("\r\n","gm"),"\\r\\n").replaceAll(new RegExp(":","gm"),"��").replaceAll("[","a").replaceAll("]","b").replaceAll("{","c").replaceAll("}","d");
    return this.replaceAll(new RegExp("\r\n", "gm"), "<br/>").replaceAll(new RegExp("\"", "gm"), "'").replaceAll(new RegExp("<br/></p><br/><p><br/>", "gm"), "<br/>").replaceAll(new RegExp("<br /><br/>", "gm"), "<br/>");
};

function getParameter(name) {
    var url = location.href;
    var start = url.indexOf("?") + 1;
    if (start == 0) {
        return "";
    }
    var value = "";
    var queryString = url.substring(start);
    var paraNames = queryString.split("&");
    for (var i = 0; i < paraNames.length; i++) {
        if (name == getParameterName(paraNames[i])) {
            value = getParameterValue(paraNames[i])
        }
    }
    return value;
}

function getParameterName(str) {
    var start = str.indexOf("=");
    if (start == -1) {
        return str;
    }
    return str.substring(0, start);
}

function getParameterValue(str) {
    var start = str.indexOf("=");
    if (start == -1) {
        return "";
    }
    return str.substring(start + 1);
}


function getProjectName(isRoot) {
    if (isRoot) {
        return "/"
    } else {
        //获取当前网址，如： http://localhost:8080/ems/Pages/Basic/Person.jsp
        var curWwwPath = window.document.location.href;
        //获取主机地址之后的目录，如： /ems/Pages/Basic/Person.jsp
        var pathName = window.document.location.pathname;
        var pos = curWwwPath.indexOf(pathName);
        //获取主机地址，如： http://localhost:8080
        var localhostPath = curWwwPath.substring(0, pos);
        //获取带"/"的项目名，如：/ems
        var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
        return (localhostPath + projectName + "/");
    }

}


Date.prototype.formatDateTime = function (fmt) {
    var o = {
        "M+": this.getMonth() + 1, //月份
        "d+": this.getDate(), //日
        "h+": this.getHours(), //小时
        "m+": this.getMinutes(), //分
        "s+": this.getSeconds(), //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds() //毫秒
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}

function parseDate(dateStr) {
    if (dateStr == null || dateStr == '') {
        return "";
    }
//根据日期字符串转换成日期
    var regEx = new RegExp("\\-", "gi");
    dateStr = dateStr.replace(regEx, "/");

//parse 需要 2005/3/4 这种格式
    return Date.parse(dateStr);

}


//将毫秒的时间转换成美式英语的时间格式,eg:3rd May 2018
function formatEnDate(millinSeconds) {
    //  alert(date);
    if (millinSeconds == null || millinSeconds == '') {
        return "";
    }

    var date = new Date(millinSeconds);
    var monthArr = new Array("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Spt", "Oct", "Nov", "Dec");
    //  var suffix = new Array("st", "nd", "rd", "th");

    var year = date.getFullYear(); //年
    var month = monthArr[date.getMonth()]; //月
    var ddate = date.getDate(); //日

    /*if (ddate % 10 < 1 || ddate % 10 > 3) {
        ddate = ddate + suffix[3];
    } else if (ddate % 10 == 1) {
        ddate = ddate + suffix[0];
    } else if (ddate % 10 == 2) {
        ddate = ddate + suffix[1];
    } else {
        ddate = ddate + suffix[2];
    }*/
    return year;
   // return month + " " + ddate + ", " + year;
}

function clearFm(fmName) {
    document.getElementById(fmName).reset();

    $(':input', '#' + fmName)
        .not(':button, :submit, :reset, :hidden')
        .val('')
        .removeAttr('checked')
        .removeAttr('selected');
}

function uploadVideoBtn(btnId, fileInput, porpInput, timeInput) {
    var uploader = Qiniu.uploader({
        disable_statistics_report: false,
        runtimes: 'html5,flash,html4',
        browse_button: btnId,
        container: 'container',
        drop_element: 'container',
        max_file_size: '100mb',
        flash_swf_url: 'bower_components/plupload/js/Moxie.swf',
        dragdrop: false,
        chunk_size: '4mb',
        multi_selection: false,
        uptoken_func: function () {
            var ajax = new XMLHttpRequest();
            ajax.open('GET', "/common/getMp4UploadTokenByQN.do", false);
            ajax.setRequestHeader("If-Modified-Since", "0");
            ajax.send();
            if (ajax.status === 200) {
                var res = JSON.parse(ajax.responseText);
                //    console.log('custom uptoken_func:' + res.data);
                return res.data;
            } else {
                //   console.log('custom uptoken_func err');
                return '';
            }
        },
        domain: resUrl,
        get_new_uptoken: false,
        auto_start: true,
        log_level: 5,
        init: {
            'BeforeChunkUpload': function (up, file) {
                console.log("before chunk upload:", file.name);
            },
            'FilesAdded': function (up, files) {
                $('table').show();
                $('#success').hide();
                plupload.each(files, function (file) {
                    var progress = new FileProgress(file,
                        'fsUploadProgress');
                    progress.setStatus("等待...");
                    progress.bindUploadCancel(up);
                });
            },
            'BeforeUpload': function (up, file) {
                console.log("this is a beforeupload function from init");
                var progress = new FileProgress(file, 'fsUploadProgress');
                var chunk_size = plupload.parseSize(this.getOption(
                    'chunk_size'));
                if (up.runtime === 'html5' && chunk_size) {
                    progress.setChunkProgess(chunk_size);
                }
            },
            'UploadProgress': function (up, file) {
                var progress = new FileProgress(file, 'fsUploadProgress');
                var chunk_size = plupload.parseSize(this.getOption(
                    'chunk_size'));
                progress.setProgress(file.percent + "%", file.speed,
                    chunk_size);
            },
            'UploadComplete': function () {
                //$('#success').show();
            },
            'FileUploaded': function (up, file, info) {
                var progress = new FileProgress(file, 'fsUploadProgress');
                console.log("response:", info.response);
                // alert(info.response);
                progress.setComplete(up, JSON.stringify(info.response));
                if (fileInput != null) {
                    var fileInfo = JSON.parse(info.response);
                    $("#" + fileInput).val(fileInfo.key);
                    if (porpInput != null) {
                        if (fileInfo.avinfo != null) {
                            //     alert(JSON.stringify(fileInfo.avinfo.video.duration));
                            $("#" + timeInput).val(fileInfo.avinfo.video.duration);
                        }
                        $("#" + porpInput).val(info.response);
                    }
                }

            },
            'Error': function (up, err, errTip) {
                $('table').show();
                var progress = new FileProgress(err.file, 'fsUploadProgress');
                progress.setError();
                progress.setStatus(errTip);
            }
            ,
            'Key': function (up, file) {
                var key = (new Date().getTime()) + getFileSuffixName(file.name);
                // do something with key
                return key
            }
        }
    });
    //uploader.init();
    uploader.bind('BeforeUpload', function () {
        //   console.log("hello man, i am going to upload a file");
    });
    uploader.bind('FileUploaded', function () {
        //  console.log('hello man,a file is uploaded');
    });
    $('#container').on(
        'dragenter',
        function (e) {
            e.preventDefault();
            $('#container').addClass('draging');
            e.stopPropagation();
        }
    ).on('drop', function (e) {
        e.preventDefault();
        $('#container').removeClass('draging');
        e.stopPropagation();
    }).on('dragleave', function (e) {
        e.preventDefault();
        $('#container').removeClass('draging');
        e.stopPropagation();
    }).on('dragover', function (e) {
        e.preventDefault();
        $('#container').addClass('draging');
        e.stopPropagation();
    });


}

function uploadBtn(btnId, fileInput) {
    var Q2 = new QiniuJsSDK();
    var uploader = Q2.uploader({
        disable_statistics_report: false,
        runtimes: 'html5,flash,html4',
        browse_button: btnId,
        container: 'container',
        drop_element: 'container',
        max_file_size: '100mb',
        flash_swf_url: 'bower_components/plupload/js/Moxie.swf',
        dragdrop: false,
        chunk_size: '4mb',
        multi_selection: false,
        uptoken_func: function () {
            var ajax = new XMLHttpRequest();
            ajax.open('GET', "/common/getUploadTokenByQN.do", false);
            ajax.setRequestHeader("If-Modified-Since", "0");
            ajax.send();
            if (ajax.status === 200) {
                var res = JSON.parse(ajax.responseText);
                console.log('custom uptoken_func:' + res.data);
                return res.data;
            } else {
                console.log('custom uptoken_func err');
                return '';
            }
        },
        domain: resUrl,
        get_new_uptoken: false,
        auto_start: true,
        log_level: 1,
        init: {
            'BeforeChunkUpload': function (up, file) {
                console.log("before chunk upload:", file.name);
            },
            'FilesAdded': function (up, files) {
                $('table').show();
                $('#success').hide();
                plupload.each(files, function (file) {
                    var progress = new FileProgress(file,
                        'fsUploadProgress');
                    progress.setStatus("等待...");
                    progress.bindUploadCancel(up);
                });
            },
            'BeforeUpload': function (up, file) {
                console.log("this is a beforeupload function from init");
                var progress = new FileProgress(file, 'fsUploadProgress');
                var chunk_size = plupload.parseSize(this.getOption(
                    'chunk_size'));
                if (up.runtime === 'html5' && chunk_size) {
                    progress.setChunkProgess(chunk_size);
                }
            },
            'UploadProgress': function (up, file) {
                var progress = new FileProgress(file, 'fsUploadProgress');
                var chunk_size = plupload.parseSize(this.getOption(
                    'chunk_size'));
                progress.setProgress(file.percent + "%", file.speed,
                    chunk_size);
            },
            'UploadComplete': function () {
                //$('#success').show();
            },
            'FileUploaded': function (up, file, info) {
                var progress = new FileProgress(file, 'fsUploadProgress');
                console.log("response:", info.response);
                // alert(info.response);
                progress.setComplete(up, JSON.stringify(info.response));
                if (fileInput != null) {
                    var fileInfo = JSON.parse(info.response);
                    $("#" + fileInput).val(fileInfo.key);
                }

            },
            'Error': function (up, err, errTip) {
                $('table').show();
                var progress = new FileProgress(err.file, 'fsUploadProgress');
                progress.setError();
                progress.setStatus(errTip);
            }
            ,
            'Key': function (up, file) {
                var key = (new Date().getTime()) + getFileSuffixName(file.name);
                // do something with key
                return key
            }
        }
    });
    //uploader.init();
    uploader.bind('BeforeUpload', function () {
        //   console.log("hello man, i am going to upload a file");
    });
    uploader.bind('FileUploaded', function () {
        //  console.log('hello man,a file is uploaded');
    });
    $('#container').on(
        'dragenter',
        function (e) {
            e.preventDefault();
            $('#container').addClass('draging');
            e.stopPropagation();
        }
    ).on('drop', function (e) {
        e.preventDefault();
        $('#container').removeClass('draging');
        e.stopPropagation();
    }).on('dragleave', function (e) {
        e.preventDefault();
        $('#container').removeClass('draging');
        e.stopPropagation();
    }).on('dragover', function (e) {
        e.preventDefault();
        $('#container').addClass('draging');
        e.stopPropagation();
    });


}


/**参数说明：

 * 根据长度截取先使用字符串，超长部分追加…

 * str 对象字符串

 * len 目标字节长度

 * 返回值： 处理结果字符串

 */

function getLenString(str, len) {

    //length属性读出来的汉字长度为1

    if (str.length * 2 <= len) {

        return str;

    }

    var strlen = 0;

    var s = "";

    for (var i = 0; i < str.length; i++) {

        s = s + str.charAt(i);

        if (str.charCodeAt(i) > 128) {

            strlen = strlen + 2;

            if (strlen >= len) {

                return s.substring(0, s.length - 1) + "...";

            }

        } else {

            strlen = strlen + 1;

            if (strlen >= len) {

                return s.substring(0, s.length - 2) + "...";

            }

        }

    }

    return s;

}


function getFileSuffixName(str) {
    var index1 = str.lastIndexOf(".");
    var index2 = str.length;
    return str.substring(index1, index2);//后缀名

}

function viewImg(name) {
    if (name == null || '' == name) {
        return "";
    }
    return '<img src="' + resUrl + name + '?imageView2/2/w/100" class="img-responsive center-block" style="min-width: 120px;max-height: 120px;width: auto;"/>';

}

function viewAudio(name) {
    if (name == null || '' == name) {
        return "";
    }
    return '<audio src="' + resUrl + name + '" controls="controls" loop="loop" style="max-width: 200px;" controlsList="nodownload" oncontextmenu="return false">您的浏览器不支持播放器</audio>';

}

function viewVideo(name) {
    if (name == null || '' == name) {
        return "";
    }
    return '<video width="200px" controls autobuffer><source src="' + resUrl + name + '" type=\'video/mp4; codecs="avc1.42E01E, mp4a.40.2"\'></source></video>';

}

function viewLiveVideo(name) {
    if (name == null || '' == name) {
        return "";
    }
    return '<video width="200px" controls autobuffer><source src="' + resUrl + name + '" type=\'video/mp4; codecs="avc1.42E01E, mp4a.40.2"\'></source></video>';

}

function getScreenRatio() {
    return window.screen.width;
}

function visitUrl(searchType, searchKey) {
    if (searchType != null) {
        location.href = "/" + searchType + "/" + searchKey + "/infolist.do";
    } else {
        location.href = "/infolist.do";
    }
}
function visitInfoDetailUrl(id, title) {

        location.href = "/" + id + "/info_details.do?title="+title;

}

function visitNewsDetailUrl(id, title) {

    location.href = "/" + id + "/news_details.do?title="+title;

}
function visitIndexUrl() {

        location.href = "/index.do";

}
function getMenu(obj, lang) {
    $.ajax({
        type: "POST",   //post提交方式默认是get
        url: "/classified/getMenus.do",
        async: false,
        success: function (data) {
            //console.log(JSON.stringify(data));
            if (data.code === 200) {
                /*var tags = data.data.tags;

                var tagsMenuStr = "";
                var tagsheadMenuStr = "";
                for (var i = 0; i < tags.length; i++) {
                    var title = tags[i].titleCn;
                    if (lang == 'en') {
                        title = tags[i].titleEn;
                    }
                    tagsMenuStr += "<li class='title_font' onclick=\"javascript:visitUrl('tag','" + tags[i].tagsId + "');\">" + title + "<span class='badge'>(" + tags[i].caseCount + ")</span></li>";
                    tagsheadMenuStr += "<li class='title_font' onclick=\"javascript:visitUrl('tag','" + tags[i].tagsId + "');\"><div style='display:table;'><div style='display:table-row;'><div style='display:table-cell;vertical-align: middle;line-height: 120%;width: 80%' class='title_font'>" + title + "</div><div style='display: table-cell' class='badge'>(" + tags[i].caseCount + ")</div></div></div> </li>";

                }*/
                var classifieds = data.data.classifieds;

                var classifiedsMenuStr = "";
                var classifiedsheadMenuStr = "";
                for (var i = 0; i < classifieds.length; i++) {
                    var title = classifieds[i].titleCn;
                    if (lang == 'en') {
                        title = classifieds[i].titleEn;
                    }

                    classifiedsMenuStr += "<li onclick=\"javascript:visitUrl('classified','" + classifieds[i].classifiedId + "');\"><span class='badge'>(" + classifieds[i].caseCount + ")</span><label class='title_font' style='line-height: 1;word-wrap: break-word;width: 70%;padding-left: 10px;margin-bottom: 0;vertical-align: middle;' >" + title + "</label></li>";
                    classifiedsheadMenuStr += "<li class='title_font' onclick=\"javascript:visitUrl('classified','" + classifieds[i].classifiedId + "');\"><div style='display:table;width: 100%;'><div style='display:table-row;width: 100%;'><div style='display:table-cell;vertical-align: middle;line-height: 120%;width: 80%' class='title_font'>" + title + "</div><div style='display: table-cell' class='badge'>(" + classifieds[i].caseCount + ")</div></div></div> </li>";

                }
                var brands = data.data.brands;

                var brandsMenuStr = "";
                var brandsheadMenuStr = "";

                for (var i = 0; i < brands.length; i++) {
                    var title = brands[i].titleCn;
                    if (lang == 'en') {
                        title = brands[i].titleEn;
                    }

                    brandsMenuStr += "<li class='title_font' onclick=\"javascript:visitUrl('brand','" + brands[i].brandsId + "');\"><span class='badge'>(" + brands[i].caseCount + ")</span><label class='title_font' style='line-height: 1;word-wrap: break-word;width: 70%;padding-left: 10px;margin-bottom: 0;vertical-align: middle;' >" + title + "</label></li>";
                    brandsheadMenuStr += "<li class='title_font' onclick=\"javascript:visitUrl('brand','" + brands[i].brandsId + "');\"><div style='display:table;width: 100%;'><div style='display:table-row;width: 100%;'><div style='display:table-cell;vertical-align: middle;line-height: 120%;width: 80%' class='title_font'>" + title + "</div><div style='display: table-cell' class='badge'>(" + brands[i].caseCount + ")</div></div></div> </li>";

                }


                /*var countries = data.data.countries;

                var countriesMenuStr = "";
                var countriesheadMenuStr = "";
                for (var i = 0; i < countries.length; i++) {
                    var title = countries[i].titleCn;
                    if (lang == 'en') {
                        title = countries[i].titleEn;
                    }

                    countriesMenuStr += "<li class='title_font' onclick=\"javascript:visitUrl('country','" + countries[i].countryId + "');\"><span class='badge'>(" + countries[i].caseCount + ")</span>" + title + "</li>";
                    countriesheadMenuStr += "<li class='title_font' onclick=\"javascript:visitUrl('country','" + countries[i].countryId + "');\"><div style='display:table;'><div style='display:table-row;'><div style='display:table-cell;vertical-align: middle;line-height: 120%;width: 80%' class='title_font'>" + title + "</div><div style='display: table-cell' class='badge'>(" + countries[i].caseCount + ")</div></div></div> </li>";

                }*/



                var years = data.data.years;

                var yearsMenuStr = "";
                var yearsheadMenuStr = "";
                for (var i = 0; i < years.length; i++) {
                    var title = years[i].yearsCode;
                    yearsMenuStr += "<li class='title_font' onclick=\"javascript:visitUrl('year','" + title + "');\"><span class='badge'>(" + years[i].caseCount + ")</span><label class='title_font' style='line-height: 1;word-wrap: break-word;width: 70%;padding-left: 10px;margin-bottom: 0;vertical-align: middle;' >" + title + "</label></li>";
                    yearsheadMenuStr += "<li class='title_font' onclick=\"javascript:visitUrl('year','" + title + "');\"><div style='display:table;width: 100%;'><div style='display:table-row;width: 100%;'><div style='display:table-cell;vertical-align: middle;line-height: 120%;width: 80%' class='title_font'>" + title + "</div><div style='display: table-cell' class='badge'>(" + years[i].caseCount + ")</div></div></div> </li>";

                }
                var tagStr = '<span class=\'badge close_menu\' style="margin-right:15px;padding-top: 3px;">' + downTagSvg + '&nbsp; &nbsp; </span><span class=\'badge open_menu\' style="margin-right: 15px;padding-top: 3px;">' + up_black_TagSvg + '&nbsp; &nbsp; </span>';
                var menuTagStr = '<span class=\'badge close_menu\' style="margin-right: 0;">' + downTagSvg + '&nbsp; &nbsp; </span><span class=\'badge open_menu\' style="margin-right: 0;">' + up_black_TagSvg + '&nbsp; &nbsp; </span>';

                var opts = "<ul class=\"nav sidebar-nav\">\n" +
                    "        <li class=\"sidebar-brand\">\n" +
                    "            <a href=\"javascript:closeMenu();\">\n" +
                    "                 <svg version=\"1.2\" baseProfile=\"tiny\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 34 17.9\"  width=\"30\"\n" +
                    "                 height=\"15\"><switch><g><path fill=\"#0F0\" d=\"M31.1 3H30c.7.1 1.3.7 1.3 1.5 0 .2 0 .3-.1.5h1.3c.8 0 1.5-.7 1.5-1.5S33.3 2 32.5 2c-.2.6-.7 1-1.4 1zM31.1 9H30c.7.1 1.3.7 1.3 1.5 0 .2 0 .3-.1.5h1.3c.8 0 1.5-.7 1.5-1.5 0-.9-.7-1.5-1.5-1.5-.2.5-.7 1-1.4 1zM31.1 14.9H30c.7.1 1.3.7 1.3 1.5 0 .2 0 .3-.1.5h1.3c.8 0 1.5-.7 1.5-1.5s-.6-1.5-1.4-1.5c-.3.6-.8 1-1.5 1z\"/><path fill=\"red\" d=\"M30 6c.6-.1 1-.5 1.2-1h-27c-.8 0-1.5-.7-1.5-1.5 0-.2 0-.3.1-.5H1.5C.7 3 0 3.7 0 4.5S.7 6 1.5 6H30zM31.2 10.9h-27c-.8 0-1.5-.7-1.5-1.5 0-.2 0-.3.1-.5H1.5c-.8 0-1.5.7-1.5 1.5s.7 1.5 1.5 1.5H30c.5-.1 1-.4 1.2-1zM2.7 15.4c0-.2 0-.3.1-.5H1.5c-.8 0-1.5.7-1.5 1.5s.7 1.5 1.5 1.5h28.3c.6 0 1.2-.4 1.4-1h-27c-.8 0-1.5-.7-1.5-1.5z\"/><path fill=\"#00F\" d=\"M4.2 2H32.6c.1-.2.1-.3.1-.5C32.7.7 32 0 31.2 0H2.8C2 0 1.3.7 1.3 1.5S1.9 2.9 2.6 3h.1c.3-.6.8-1 1.5-1z\"/><path fill=\"#0FF\" d=\"M4.2 2c-.7 0-1.2.4-1.4 1h28.3c.7 0 1.2-.4 1.4-1H4.2z\"/><path fill=\"#00F\" d=\"M2.8 3h-.2.2z\"/><path fill=\"#FF0\" d=\"M30 3H2.8c-.1.1-.1.3-.1.5 0 .8.7 1.5 1.5 1.5h27c.1-.2.1-.3.1-.5 0-.8-.6-1.4-1.3-1.5z\"/><path fill=\"#00F\" d=\"M4.2 7.9H32.6c.1-.2.1-.3.1-.5 0-.8-.7-1.5-1.5-1.5H2.6c-.7.2-1.3.8-1.3 1.6S1.9 8.9 2.6 9h.1c.3-.6.8-1.1 1.5-1.1z\"/><path fill=\"#0FF\" d=\"M4.2 7.9c-.6 0-1.2.4-1.4 1h28.3c.7 0 1.2-.4 1.4-1H4.2z\"/><path fill=\"#00F\" d=\"M30 6H2.8h-.2H30zM2.8 8.9h-.2c.1 0 .1.1.2 0z\"/><path fill=\"#FF0\" d=\"M30 9H2.8c-.1.1-.1.3-.1.4 0 .8.7 1.5 1.5 1.5h27c.1-.2.1-.3.1-.5 0-.7-.6-1.3-1.3-1.4z\"/><path fill=\"#00F\" d=\"M2.6 11.9a1.514 1.514 0 0 0 0 3h.1c.2-.6.8-1 1.4-1H32.5c.1-.2.1-.3.1-.5 0-.8-.7-1.5-1.5-1.5H2.6z\"/><path fill=\"#0FF\" d=\"M4.2 13.9c-.6 0-1.2.4-1.4 1h28.3c.7 0 1.2-.4 1.4-1H4.2z\"/><path fill=\"#00F\" d=\"M2.6 11.9h27.3H2.8h-.2zM2.8 14.9h-.2.2z\"/><path fill=\"#FF0\" d=\"M30 14.9H2.8c-.1.2-.1.3-.1.5 0 .8.7 1.5 1.5 1.5h27c.1-.2.1-.3.1-.5 0-.8-.6-1.4-1.3-1.5z\"/></g></switch></svg>&nbsp;\n" +
                    "            <svg version=\"1.2\" baseProfile=\"tiny\" xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 52.9 11.6\" width=\"43\"\n" +
                    "                 height=\"15\">\n" +
                    "                <switch>\n" +
                    "                    <g>\n" +
                    "                        <path fill=\"none\" d=\"M8.9 5.7h.6l-.2-.9zM29.6 5.7h1l-1-1.3zM2.8 5.7h.5L3 4.8z\"/>\n" +
                    "                        <path fill=\"#FFF\"\n" +
                    "                              d=\"M8.4 0L6.3 5.7h2.6l.4-.9.2.9h2.8l-1-5.7zM1 0L0 5.7h2.8l.2-.9.3.9H6L3.9 0zM19.5 4.4V2.5H23V0h-6.4v5.7h6.2V4.4zM26.6 0v5.7h3V4.4l1 1.3h3.5L29.6 0zM35 0h2.9v5.7H35zM48.7 0h2.9v5.7h-2.9zM41.8 0h2.9v5.7h-2.9z\"/>\n" +
                    "                        <g>\n" +
                    "                            <path fill=\"none\"\n" +
                    "                                  d=\"M36.3 5.7h-1l1 1.2zM7.5 5.7h-.2l.1.3zM46 7.2c0 .3.1.7.2.9s.3.5.6.7c.3.2.7.2 1.2.2s.9-.1 1.1-.3c.3-.2.5-.4.6-.7s.2-.6.2-.9V5.7h-4v.4c.1.4.1.7.1 1.1z\"/>\n" +
                    "                            <path fill=\"#FFF\"\n" +
                    "                                  d=\"M3.2 11.3l.9-5.6H1.2l-.9 5.6zM7.9 11.3l2.3-5.6H7.5l-.1.3-.1-.3H4.6l2.1 5.6zM14.5 11.3l-1-5.6h-2.8l.9 5.6zM24.3 11.3V8.8h-3.5V6.9h3.3V5.7h-6.3v5.6zM27.9 5.7h2.9v5.6h-2.9zM39.2 11.3V5.7h-2.9v1.2l-1-1.2h-3.4l4.4 5.6zM44.3 10.4c.8.8 2 1.2 3.7 1.2s2.9-.4 3.7-1.2c.8-.8 1.2-2.1 1.2-3.9v-.8H50v1.4c0 .3-.1.7-.2.9s-.3.5-.6.7c-.3.3-.7.3-1.2.3s-.9-.1-1.1-.3c-.3-.2-.5-.4-.6-.7s-.2-.5-.3-.8V5.7h-2.9v.8c0 1.8.4 3.1 1.2 3.9z\"/>\n" +
                    "                        </g>\n" +
                    "                    </g>\n" +
                    "                </switch>\n" +
                    "            </svg>\n" +
                    "            </a>\n" +
                    "        </li>\n" +
                    "        <li>\n" +
                    "            <a href=\"/infolist.do\"><div style='height: 75px;width: 100%;' class='middle'>" + home_menu_portfolio + "</div></a>\n" +
                    "        </li>\n" +
                    "        <li class=\"dropdown nav_spical_li\">\n" +
                    "            <a href=\"#\" class=\"dropdown-toggle title_font letter_spacing_2\" data-toggle=\"dropdown\">CATEGORIES" + menuTagStr + "</a>\n" +
                    "            <ul class=\"dropdown-menu letter_spacing_1\" role=\"menu\">\n" + classifiedsMenuStr +
                    "            </ul>\n" +
                    "        </li>\n" +
                   /* "        <li class=\"dropdown nav_spical_li\">\n" +
                    "            <a href=\"#\" class=\"dropdown-toggle title_font letter_spacing_2\" data-toggle=\"dropdown\">TAGS" + menuTagStr + "</a>\n" +
                    "            <ul class=\"dropdown-menu letter_spacing_1\" role=\"menu\">\n" + tagsMenuStr +
                    "            </ul>\n" +
                    "        </li>\n" +*/
                    "        <li class=\"dropdown nav_spical_li\">\n" +
                    "            <a href=\"#\" class=\"dropdown-toggle title_font letter_spacing_2\" data-toggle=\"dropdown\">BRAND" + menuTagStr + "</a>\n" +
                    "            <ul class=\"dropdown-menu letter_spacing_1\" role=\"menu\">\n" + brandsMenuStr +
                    "            </ul>\n" +
                    "        </li>\n" +
                    "        <li class=\"dropdown nav_spical_li\">\n" +
                    "            <a href=\"#\" class=\"dropdown-toggle title_font letter_spacing_2\" data-toggle=\"dropdown\">YEAR" + menuTagStr + "</a>\n" +
                    "            <ul class=\"dropdown-menu letter_spacing_1\" role=\"menu\">\n" + yearsMenuStr +
                    "            </ul>\n" +
                    "        </li>\n" +
                    "        <li>\n" +
                    "            <a href=\"/aboutus.do\"><div style='height: 75px;width: 100%;' class='middle'>" + home_menu_about + "</div></a>\n" +
                    "        </li>\n" +
                    "        <li>\n" +
                    "            <a href=\"/newslist.do\"><div style='height: 75px;width: 100%;' class='middle'>" + home_menu_news + "</div></a>\n" +
                    "        </li>\n" +
                    "        <li>\n" +
                    "            <a href=\"/recruitenlist.do\"><div style='height: 75px;width: 100%;' class='middle'>" + home_menu_job + "</div></a>\n" +
                    "        </li>\n" +
                    "    </ul>";
                obj.html(opts);


                var topMenuStr = "<ul class='menu menu_top list-group'>\n" +
                    "        <li class='list-group-item'>" + tagStr + "<span class='menu_text'>"+ categoriesSvg + "</span>\n" +
                    "            <ul class='submenu list-group'>\n" + classifiedsheadMenuStr +
                    "                \n" +
                    "            </ul>\n" +
                    "        </li>\n" +
                   /* "        <li  class='list-group-item'>" + tagStr + "<span class='menu_text'>"+tagSvg + "</span>\n" +
                    "            <ul class='submenu list-group'>\n" + tagsheadMenuStr +
                    "                \n" +
                    "            </ul>\n" +
                    "        </li>\n" +
                    "        <li class='list-group-item'>" + tagStr + "<span class='menu_text'>"+countriesSvg + "</span>\n" +
                    "            <ul class='submenu list-group'>\n" + countriesheadMenuStr +
                    "                \n" +
                    "            </ul>\n" +
                    "        </li>\n" +*/
                    "        <li  class='list-group-item'>" + tagStr + "<span class='menu_text' style='text-align: left'>"+brandSvg + "</span>\n" +
                    "            <ul class='submenu list-group'>\n" + brandsheadMenuStr +
                    "                \n" +
                    "            </ul>\n" +
                    "        </li>\n" +
                    "        <li  class='list-group-item'>" + tagStr + "<span class='menu_text'>"+yearSvg + "</span>\n" +
                    "            <ul class='submenu list-group'>\n" + yearsheadMenuStr +
                    "                \n" +
                    "            </ul>\n" +
                    "        </li>\n" +
                    "\n" +
                    "    </ul>";


                $("#topMenus").html(topMenuStr);

                var bottomTagStr = '<div class=\'badge close_menu\' style="text-align: center;margin-right:15px;padding-top: 3px;">' + down_black_TagSvg + '&nbsp; &nbsp; </div><div class=\'badge open_menu\' style="text-align: center;margin-right:15px;padding-top: 3px;">' + upMenuTagSvg + '&nbsp; &nbsp; </div>';

                var bottomMenusStr = "<ul class='menu menu_bottom list-group'>\n" +
                    "        <li class='list-group-item'>" + bottomTagStr + "<span class='menu_text'>"+ categoriesSvg + "</span>\n" +
                    "            <ul class='submenu_bottom list-group'>\n" + classifiedsheadMenuStr +
                    "                \n" +
                    "            </ul>\n" +
                    "        </li>\n" +
                   /* "        <li  class='list-group-item'>" + bottomTagStr + "<span class='menu_text'>"+tagSvg + "</span>\n" +
                    "            <ul class='submenu_bottom list-group'>\n" + tagsheadMenuStr +
                    "                \n" +
                    "            </ul>\n" +
                    "        </li>\n" +
                    "        <li class='list-group-item'>" + bottomTagStr + "<span class='menu_text'>"+countriesSvg + "</span>\n" +
                    "            <ul class='submenu_bottom list-group'>\n" + countriesheadMenuStr +
                    "                \n" +
                    "            </ul>\n" +
                    "        </li>\n" +*/
                    "        <li  class='list-group-item'>" + bottomTagStr + "<span class='menu_text'>"+brandSvg + "</span>\n" +
                    "            <ul class='submenu_bottom list-group'>\n" + brandsheadMenuStr +
                    "                \n" +
                    "            </ul>\n" +
                    "        </li>\n" +
                    "        <li  class='list-group-item'>" + bottomTagStr + "<span class='menu_text'>"+yearSvg + "</span>\n" +
                    "            <ul class='submenu_bottom list-group'>\n" + yearsheadMenuStr +
                    "                \n" +
                    "            </ul>\n" +
                    "        </li>\n" +
                    "\n" +
                    "    </ul>";


                $("#bottomMenus").html(bottomMenusStr);
            }
        }
    });
}



function getTimeShow(time_str){
    //debugger;
    var now = new Date();
    var date = new Date(time_str);
    //计算时间间隔，单位为分钟
    var inter = parseInt((now.getTime() - date.getTime())/1000/60);
    if(inter == 0){
        return "a moment ago";
    }
    //多少分钟前
    else if(inter < 60){
        return inter.toString() + " minute ago";
    }
    //多少小时前
    else if(inter < 60*24){
        return parseInt(inter/60).toString() + " hours ago";
    }
    //本年度内，日期不同，取日期+时间  格式如  06-13 22:11
    else if(now.getFullYear() == date.getFullYear()){
        return (date.getMonth()+1).toString() + "-" +
            date.getDate().toString()/* + " " +
            date.getHours() + ":" +
            date.getMinutes()*/;
    }
    else{
        return date.getFullYear().toString().substring(2, 3) + "-" +
            (date.getMonth()+1).toString() + "-" +
            date.getDate().toString()/* + " " +
            date.getHours() + ":" +
            date.getMinutes()*/;
    }
}
