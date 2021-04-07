$(function () {
    getTableList();



});


function getTableList() {

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
        "sAjaxSource": "/web/user/getUsersListByPaginator.do",
        "fnServerData": function (url, aoData, fnCallback) {
            //   alert(url);
            $.ajax({
                url: url,//这个就是请求地址对应sAjaxSource
                data: {jsonParam: JSON.stringify(aoData)},
                type: 'POST',
                dataType: 'json',
                async: false,
                success: function (result) {
                    //  alert(JSON.stringify(result));
                    fnCallback(result);//把返回的数据传给这个方法就可以了,datatable会自动绑定数据的
                },
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    alert("status:" + XMLHttpRequest.status + ",readyState:" + XMLHttpRequest.readyState + ",textStatus:" + textStatus);
                    //     alert(errorThrown);

                }
            });
        },
        "aoColumns": [
            {"mData": "loginId"},
            {"mData": null , "sClass": "text-center", "sWidth": "16%"}
        ],
        "aoColumnDefs": [
            {
                "aTargets": [1],
                "mRender": function (data, type, full) {
                    var btnStr = "";

                    btnStr += "<button class='btn btn-xs btn-danger' onclick='delMethod(" + JSON.stringify(data.userId) + ")'><i class='icon-remove'></i> </button>";


                    return btnStr;

                }
            }

        ]


    });//table end




}





function delMethod(userId) {
    $.ajax({
        url: "/web/user/delUsers.do",
        data: {userId: userId},
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




