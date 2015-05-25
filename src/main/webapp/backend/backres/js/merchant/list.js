function query(){
    $('#merchantGrid').datagrid('load',{
            "id":$('#id').numberbox('getValue'),
            "verifyStatus":$('#verifyStatus').numberbox('getValue'),
            "createFrom":$('#createFrom').datebox('getValue'),
            "createTo":$('#createTo').datebox('getValue')
        }
    );
}

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

function update(){
    $('#merchant_form').form('submit',{
        url: "../../merchant.update.do",

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

function restSingleSelect(index){
    var row =  $("#merchantGrid").datagrid('getData').rows[index];
    var selectRow = $("#rest"+index);
    if(selectRow.prop('checked')==true){
        row['isRest'] = true;
    }else{
        row['isRest'] = false;
    }
}

function isRestCheckbox(value,row,index){
    if(value==true){
        return "<input id="+"rest"+index+"name='isRest' type='checkbox' onClick=restSingleSelect("+index+") checked='checked'>";
    }else{
        return "<input id="+"rest"+index+" name='isRest' type='checkbox' onClick=restSingleSelect("+index+") >";
    }
    row.isCheck=1;
}

function autoOpenSingleSelect(index){
    var row =  $("#merchantGrid").datagrid('getData').rows[index];
    var selectRow = $("#autoOpen"+index);
    if(selectRow.prop('checked')==true){
        row['isAutoOpen'] = true;
    }else{
        row['isAutoOpen'] = false;
    }
}

function isAutoOpenCheckbox(value,row,index){
    if(value==true){
        return "<input id="+"autoOpen"+index+"name='isAutoOpen' type='checkbox' onClick=autoOpenSingleSelect("+index+") checked='checked'>";
    }else{
        return "<input id="+"autoOpen"+index+" name='isAutoOpen' type='checkbox' onClick=autoOpenSingleSelect("+index+") >";
    }
    row.isCheck=1;
}



function autoOpenAllSelect(th){
    //获取所有的行
    var rows = $("#merchantGrid").datagrid('getRows'); //这段代码是获取当前页的所有行。
    for(var i=0;i<rows.length;i++)
    {
        //给checkBox赋值 1 代表勾选 有权限
        if(th.checked==true){
            rows[i]['isAutoOpen']=true;
        }else{
            rows[i]['isAutoOpen']=false;
        }
        rows[i].isCheck=1;
    }

    //全选 反选 属性修改;
    if(th.checked){
        $('input[name=isAutoOpen]').attr('checked',true);
    }else{
        $('input[name=isAutoOpen]').attr('checked',false);
    }
}

function restAllSelect(th){
    //获取所有的行
    var rows = $("#merchantGrid").datagrid('getRows'); //这段代码是获取当前页的所有行。
    for(var i=0;i<rows.length;i++)
    {
        //给checkBox赋值 1 代表勾选 有权限
        if(th.checked==true){
            rows[i]['isRest']=true;
        }else{
            rows[i]['isRest']=false;
        }
        rows[i].isCheck=1;
    }

    //全选 反选 属性修改;
    if(th.checked){
        $('input[name=isRest]').attr('checked',true);
        $('#isRest').attr('checked',true);
    }else{
        $('input[name=isRest]').attr('checked',false);
        $('#isRest').attr('checked',false);
    }
}


function submit(){
    var rows = $('#merchantGrid').datagrid("getRows");
    var ids = new Array();
    var isAutoOpens = new Array();
    var isRests = new Array();
    for(var i=0;i<rows.length;i++){
        ids.push(rows[i].id);
        isAutoOpens.push(rows[i].isAutoOpen);
        isRests.push(rows[i].isRest);
    }
    $.post(
        '../../../merchant.confirmAutoOpenMerchants.do',
        {
            ids : ids.join(","),
            isAutoOpens:isAutoOpens.join(","),
            isRests:isRests.join(",")
        },
        function(r) {
            $('#merchantGrid').datagrid('reload');
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
