function pass() {
    var row = $('#productGrid').datagrid('getSelected');
    if(row){
        var url = '/product.pass.do';
        $.ajax({
            url: url,
            data:{"id":row.id},
            type: 'POST',
            success: function (result) {
                openSuccessDialog();
                autoCloseSuccessDialog();
                $('#productGrid').datagrid('reload');
            }
        });
    }

}
function reject() {
    var row = $('#productGrid').datagrid('getSelected');
    if(row){
        var url = '/product.reject.do';
        $.ajax({
            url: url,
            data:{"id":row.id},
            type: 'POST',
            success: function (result) {
                openSuccessDialog();
                autoCloseSuccessDialog();
                $('#productGrid').datagrid('reload');
            }
        });
    }

}

function saveProduct(){
    $('#product_form').form('submit',{
        url: "/product.saveAndPass.do",

        onSubmit: function(){
            return $(this).form('validate');
        },
        success: function(result){
            $('#dlg').dialog('close');        // close the dialog
            $('#productGrid').datagrid('reload');    // reload the user data
        }
    });
}

function edit(){
    var row = $('#productGrid').datagrid('getSelected');
    $('.img').remove();//初始化图片
    $('#product_form').form('load',row);
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

function cancel(){
    $('#dlg').dialog('close');
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

function openSuccessDialog(){
    $('#dlg-success').dialog('open');
}

function closeSuccessDialog(){
    $('#dlg-success').dialog('close');
}

function autoCloseSuccessDialog(){
    setInterval(closeSuccessDialog,2000);
}
