function passMerchant() {
    var row = $('#merchantGrid').datagrid('getSelected');
    if(row){
        var url = '/merchant.pass.do';
        $.ajax({
            url: url,
            data:{"id":row.id},
            type: 'POST',
            success: function (result) {
                $('#merchantGrid').datagrid('reload');
                $('#dlg').dialog('open');
            }
        });
    }

}
function rejectMerchant() {
    var row = $('#merchantGrid').datagrid('getSelected');
    if(row){
        var url = '/merchant.reject.do';
        $.ajax({
            url: url,
            data:{"id":row.id},
            type: 'POST',
            success: function (result) {
                $('#dlg').dialog('open');
                $('#merchantGrid').datagrid('reload');
            }
        });
    }

}

//显示本地时间
function formateDate(value, row, index) {
    var unixTimestamp = new Date(value);
    return unixTimestamp.toLocaleString();
}
