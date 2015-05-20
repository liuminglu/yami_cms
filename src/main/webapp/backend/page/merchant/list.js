function pass() {
    var row = $('#merchantGrid').datagrid('getSelected');
    if(row){
        var url = '/merchant.pass.do';
        $.ajax({
            url: url,
            data:{"id":row.id},
            type: 'POST',
            success: function (result) {
                openSuccessDialog();
                autoCloseSuccessDialog();
                $('#merchantGrid').datagrid('reload');
            }
        });
    }

}
function reject() {
    var row = $('#merchantGrid').datagrid('getSelected');
    if(row){1
        var url = '/merchant.reject.do';
        $.ajax({
            url: url,
            data:{"id":row.id},
            type: 'POST',
            success: function (result) {
                openSuccessDialog();
                autoCloseSuccessDialog();
                $('#merchantGrid').datagrid('reload');
            }
        });
    }

}

function edit(){
    $('#dlg').dialog('open');
}

function openSuccessDialog(){
    $('#dlg-success').dialog('open');
}

function closeSuccessDialog(){
    $('#dlg-success').dialog('close');
}

function autoCloseSuccessDialog(){
    setInterval(closeSuccessDialog,2000);
}
