$(function () {
    getDataList();
    uploadBtn("uploadFileBtn", "infoResName");
    $("#infoMonth").datetimepicker({
        format: 'yyyy-mm-dd',//显示格式
        todayHighlight: 1,//今天高亮
        minView: "month",//设置只显示到月份
        startView:2,
        forceParse: 0,
        showMeridian: 1,
        autoclose: 1//选择后自动关闭
    });
    $.ajax({
        type: "POST",   //post提交方式默认是get
        url: "/classified/getClassifiedListForAll.do",
        async: false,
        success: function (data) {

            var opts = "";
            for (var i = 0; i < data.length; i++) {

                opts += "<option value='" + data[i].classifiedId + "'>" + data[i].titleCn + "</option>";
            }

            $("#classifiedId").append(opts);
            $('#classifiedId').multiselect({
                nonSelectedText:'分类选择',
                allSelectedText:'全选',
                includeSelectAllOption:true,
                maxHeight: 200,
               /* enableFiltering: true,
                enableCaseInsensitiveFiltering:true,
                filterPlaceholder: '查找中...',*/
                selectAllText: '全选'
            });
        }
    });

    $.ajax({
        type: "POST",   //post提交方式默认是get
        url: "/classified/getTagsListForAll.do",
        async: false,
        success: function (data) {

            var opts = "";
            for (var i = 0; i < data.length; i++) {

                opts += "<option value='" + data[i].tagsId + "'>" + data[i].titleCn + "</option>";
            }

            $("#tagsId").append(opts);
            $('#tagsId').multiselect({
                nonSelectedText:'标签选择',
                allSelectedText:'全选',
                includeSelectAllOption:true,
                maxHeight: 200,
              /*  enableFiltering: true,
                enableCaseInsensitiveFiltering:true,
                filterPlaceholder: '查找中...',*/
                selectAllText: '全选'
            });
        }
    });

    $.ajax({
        type: "POST",   //post提交方式默认是get
        url: "/classified/getTradeListForAll.do",
        async: false,
        success: function (data) {

            var opts = "";
            for (var i = 0; i < data.length; i++) {

                opts += "<option value='" + data[i].tradesId + "'>" + data[i].titleCn + "</option>";
            }

            $("#tradeId").append(opts);

        }
    });

    $.ajax({
        type: "POST",   //post提交方式默认是get
        url: "/classified/getCountryListForAll.do",
        async: false,
        success: function (data) {

            var opts = "";
            for (var i = 0; i < data.length; i++) {

                opts += "<option value='" + data[i].countryId + "'>" + data[i].titleCn + "</option>";
            }

            $("#countryId").append(opts);

        }
    });

    $.ajax({
        type: "POST",   //post提交方式默认是get
        url: "/classified/getBrandListForAll.do",
        async: false,
        success: function (data) {

            var opts = "";
            for (var i = 0; i < data.length; i++) {

                opts += "<option value='" + data[i].brandsId + "'>" + data[i].titleCn + "</option>";
            }

            $("#brandsId").append(opts);

        }
    });


    $('#saveDataBtn').click(function () {
        var parms = $("#addFm").serializeFmObject();
     //   alert(JSON.stringify(parms));

        $.ajax({
            type: "POST",   //post提交方式默认是get
            dataType: 'json',
            contentType: 'application/json;charset=utf-8',
            url: "/info/addInfo.do",
            data: JSON.stringify(parms),   //序列化(传递对象)
            async: false,
            success: function (data) {
                if (data.code === 200) {
                    $("#addDataModal").modal('hide');
                    $('#data_list').DataTable().ajax.reload();

                }
                bootbox.alert(data.msg);
                return;

            }, error: function (XMLHttpRequest, textStatus, errorThrown) {
                alert("status:" + XMLHttpRequest.status + ",readyState:" + XMLHttpRequest.readyState + ",textStatus:" + textStatus);
                //     alert(errorThrown);

            }
        });


    });

});


function getDataList() {

    $('#data_list').DataTable({
        "bJQueryUI": true,
        "sPaginationType": "full_numbers",
        "sDom": 't<"F"p>',
        "iDisplayLength": defaultPageSize,
        'oLanguage': {
            "sLengthMenu": "每页显示 _MENU_ 条记录",
            "sZeroRecords": "抱歉， 没有找到",
            "sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
            "sInfoEmpty": "没有数据",
            "sInfoFiltered": "(从 _MAX_ 条数据中检索)",
            "oPaginate": {
                "sFirst": "首页",
                "sPrevious": "前一页",
                "sNext": "后一页",
                "sLast": "尾页"
            },
            "sZeroRecords": "没有检索到数据",
            /*  "sProcessing": "<img src='./loading.gif' />",*/
        },
        "bFilter": false,
        "bPaginite": true,
        "bInfo": true,
        "bSort": false,
        "bProcessing": true,
        "bServerSide": true,
        "sAjaxSource": "/info/getInfoListByPaginator.do",
        "fnServerData": function (url, aoData, fnCallback) {
            $.ajax({
                url: url,//这个就是请求地址对应sAjaxSource
                data: {jsonParam: JSON.stringify(aoData)},
                type: 'POST',
                dataType: 'json',
                async: false,
                success: function (result) {
                    //   alert(JSON.stringify(result));
                    fnCallback(result);//把返回的数据传给这个方法就可以了,datatable会自动绑定数据的
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert("status:" + XMLHttpRequest.status + ",readyState:" + XMLHttpRequest.readyState + ",textStatus:" + textStatus);
                    //     alert(errorThrown);

                }
            });
        },
        "aoColumns": [
            {"mData": null, "sClass": "text-center"},
            {"mData": null, "sWidth": "20%"},
            {"mData": "infoTitleEn"},
            {"mData": "infoTitleCn"},
            {"mData": "classifiedTitleCn"},
            {"mData": "tagsTitleCn"},
            {"mData": "countryTitleCn"},
            {"mData": "brandsTitleCn"},
            {"mData": "tradesTitleCn"},
            {"mData": "infoMonth"},
            {"mData": "sortFiled"},
            {"mData": null, "sClass": "text-center", "sWidth": "5%"}
        ],
        "aoColumnDefs": [
            {
                "aTargets": [0],
                "mRender": function (data, type, full) {
                    return "<input type='checkbox' value='" + data.infoId + "' />";
                }
            },
            {
                "aTargets": [1],
                "mRender": function (data, type, full) {
                    return viewImg(data.infoResName);
                }
            },
            {
                "aTargets": [11],
                "mRender": function (data, type, full) {
                    var btnStr = "<a href='"+data.infoId+"/info_file_list.do' class='btn btn-info active' role='button'>上传多图 </a>";
                    btnStr += "<br/>";
                    btnStr += "<br/>";
                    btnStr += "<button class='btn btn-xs btn-default' onclick='onEdit(" + JSON.stringify(data) + ")'><i class='icon-pencil'></i> </button>";
                    btnStr += "&nbsp;";
                    btnStr += "<button class='btn btn-xs btn-default' onclick='onDel(" + JSON.stringify(data) + ")'><i class='icon-remove'></i> </button>";
                    return btnStr;
                }
            }

        ]


    });//table end


    $("span.icon input:checkbox, th input:checkbox").click(function () {
        var checkedStatus = this.checked;
        var checkbox = $(this).parents('.widget-content').find('tr td:first-child input:checkbox');
        checkbox.each(function () {
            this.checked = checkedStatus;
            if (checkedStatus == this.checked) {
                $(this).closest('.checker > span').removeClass('checked');
            }
            if (this.checked) {
                $(this).closest('.checker > span').addClass('checked');
            }
        });
    });


}


// 新增
function onAdd() {
    clearFm("addFm");
    $('#id').val('');

    $('#classifiedId').multiselect('select', []);
    $('#tagsId').multiselect('select', []);
    $("#countryId").val('');
    $("#brandsId").val('');
    $("#tradeId").val('');
    $("#infoTitleCn").val('');
    $("#infoTitleEn").val('');
    $("#infoRemarkEn").val('');
    $("#infoRemarkCn").val('');

    $("#infoResName").val('');
    $("#infoMonth").val('');
    $("#sortFiled").val('999999999');
    $("#uploadFileTable").hide();
    $("#fsUploadProgress").empty();
    $("#addDataModal").modal('show');

}

// 修改
function onEdit(obj) {
    clearFm("addFm");
    $("#id").val(obj.infoId);
    var classifiedIdArray = [];
if(obj.classifiedId!=null){
    var classifiedIds=obj.classifiedId.split(',');
    $.each(classifiedIds,function(index,val){
        classifiedIdArray.push(val);
    });
}

    var tagsIdArray = [];
    if(obj.tagsId!=null){
        var tagsIds=obj.tagsId.split(',');
        $.each(tagsIds,function(index,val){
            tagsIdArray.push(val);
        });
    }

    $('#classifiedId').multiselect('select', classifiedIdArray);
    $('#tagsId').multiselect('select', tagsIdArray);
    $("#countryId").val(obj.countryId);
    $("#brandsId").val(obj.brandsId);
    $("#tradeId").val(obj.tradeId);
    $("#infoTitleCn").val(obj.infoTitleCn);
    $("#infoTitleEn").val(obj.infoTitleEn);
    $("#infoRemarkEn").val(obj.infoRemarkEn);
    $("#infoRemarkCn").val(obj.infoRemarkCn);





    $("#infoResName").val(obj.infoResName);
    $("#sortFiled").val(obj.sortFiled);
    $("#infoMonth").val(obj.infoMonth);


    $("#uploadFileTable").hide();
    $("#fsUploadProgress").empty();
    $("#addDataModal").modal('show');

}

function onDel(obj) {
    //  e.preventDefault();//这行代码就是用来阻止默认行为发生，防止异步的关键
    bootbox.confirm("删除数据将不可恢复,是否断续?", function (confirmed) {
        if (confirmed == true) {
            //执行删除
            var delArray = [];
            delArray.push(obj);
            delMethod(JSON.stringify(delArray));
            return;
        }
    });


}

function onDelAll() {
    var delArray = [];
    $(':checkbox:checked', '#data_list').each(function () {
        var id = $(this).val();
        $("#data_list tbody").find('tr').each(function (index, element) {
            var data = ($('#data_list').DataTable().rows(index).data())[0];
            if (data.infoId == id) {
                delArray.push(data);
            }
        });

    });


    if (delArray.length > 0) {

        bootbox.confirm("删除数据将不可恢复,是否断续?", function (confirmed) {
            if (confirmed == true) {


                delMethod(JSON.stringify(delArray));


                return;
            }
        });
    } else {
        bootbox.alert("请选择需要删除的数据!");
    }

}


function delMethod(data) {
    $.ajax({
        url: "/info/delInfo.do",
        data: {delStr: data},
        type: 'POST',
        dataType: 'json',
        async: false,
        success: function (data) {
            if (data.code === 200) {

                $('#data_list').DataTable().ajax.reload();

            }
            bootbox.alert(data.msg);
            return;
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert("status:" + XMLHttpRequest.status + ",readyState:" + XMLHttpRequest.readyState + ",textStatus:" + textStatus);
            //     alert(errorThrown);

        }
    });
}




