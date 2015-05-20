function pass() {
    var row = $('#merchantGrid').datagrid('getSelected');
    if(row){
        var url = '../../merchant.pass.do';
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
        var url = '../../merchant.reject.do';
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
function saveAndPass(){
    $('#merchant_form').form('submit',{
        url: "../../merchant.saveAndPass.do",

        onSubmit: function(){
            return $(this).form('validate');
        },
        success: function(result){
            $('#dlg').dialog('close');        // close the dialog
            $('#merchantGrid').datagrid('reload');    // reload the user data
        }
    });
}

function edit(){
    var row = $('#merchantGrid').datagrid('getSelected');
    $('.img').remove();//初始化图片
    $('#merchant_form').form('load',row);
    var pictures = row.pictures;
    if(pictures!=''){
        var imgs = pictures.split(',');
        for(i=0;i<imgs.length;i++){
            if(imgs[i]!=''){
                var img = '<div class="img"><img src="'+imgs[i]+'" height="200" width="200"/></div>';
                $('#container').append(img);
            }
        }
    }
    $('#dlg').dialog('open');
}

function ajaxFileUpload(){
    if($('#file').prop('files')[0]==null){
        alert('请选择需要上传的文件');
        return;
    }
    uploadModule.uploadFile($('#file').prop('files')[0], function (url) {
        var img = '<div class="img"><img src="'+url+'" height="200" width="200"/></div>';
        $('#container').append(img);
        if($('#pictures').val()==''){
            $('#pictures').val(url);
        }else{
            $('#pictures').val($('#pictures').val()+","+url);
        }

    });
}
function cancel(){
    $('#dlg').dialog('close');
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
