<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String kanming=request.getParameter("bk");
    String name="";
    String palceholder="";
    if ("gxb".equals(kanming)){
        name="浙大学报工学版";
        palceholder="G160000(W)";
    }else if ("skb".equals(kanming)) {
        name = "浙大学报人文社会科学版";
        palceholder="E-W/L-16-0000";
    }else if ("yxb".equals(kanming)){
        name="浙大学报医学版";
        palceholder="20160000";
    }else if ("gcsj".equals(kanming)){
        name="工程设计学报";
        palceholder="2016-000";
    }else if ("lxb".equals(kanming)){
        name="浙大学报理学版";
        palceholder="16000";
    }else if ("nxb".equals(kanming)){
        name="浙大学报农业与生命科学版";
        palceholder="16000";
    }
    else{
        request.getRequestDispatcher(basePath+"index.jsp").forward(request, response);
    }
%>
<base href="<%=basePath%>">
<html>
<head>
    <meta charset="UTF-8">
    <!-- width=device-width,height=device-height,  -->
    <meta name="viewport"
          content="width=device-width,height=device-height,initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no" />
    <title>文稿查询</title>
    <script src="<%=basePath%>resources/jquery/jquery-2.2.2.min.js"></script>
    <script src="<%=basePath%>resources/jquery/jquery-2.2.2.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>resources/search/css/search.css">
    <script>
        $.search = function() {
            var id = $("#ducumentId").val().trim();
            $("#ducumentId").val(id);
            if ($("#ducumentId").val() == "" || $("#ducumentId").val() == "ZUSA/B/C-S/D-15-00") {
                $("#tips span").text("请输入文稿编号");
                return;
            }
//            if(!id.match(/^[Zz][Uu][Ss][ABCabc]\-[DdSs]\-\d{2}\-\d{5}/)){
//                $("#tips span").text("请输入指定格式ZUSA/B/C-S/D-15-00");
//                return;
//            }
            $.ajax({
                type : "post",
                dataType : "text",
                url : "<%=basePath%>flowquery.action",
                data : {
                    "zid" : $("#ducumentId").val(),
                    "bk":'<%=kanming%>'
                    //"documentDTO.lid" : $("#ducumentId").serialize()
                },

                success : function(data) {
                    //alert(data);
                    if (data == 'meizhi') {
                        $("#tips").text("查询的文稿不存在，请重新输入");
                        return;
                    }
                    if (data=='' || data==null || data==undefined){
                        $("#tips").text("服务器出错，稍后再试");
                        return
                    }
                    sessionStorage.docu = data;
                    window.location.href = "showtable.action?bk=<%=kanming%>";


                },
                error: function(XMLHttpRequest, textStatus, errorThrown) {
                    //alert(XMLHttpRequest.status);
                    //alert(XMLHttpRequest.readyState);
                    //alert(textStatus);
                    alert("服务器未响应");
                }


            });
        }
    </script>
</head>
<body>
<div style="width: 100%; height: 100%; min-height: 400px;">
    <div id="content">
        <div id="pagetitle">
            <span>论文 · 状态查询</span>
        </div>
        <div id="imgShow">
            <img alt="nit_logo" src="<%=basePath%>resources/search/images/LOGO.png">
            <div>
                <span id="logo_title"><%=name%>稿件状态查询</span>
            </div>
        </div>
        <div id="search">
            <input id="ducumentId" type="text" placeholder=<%=palceholder%>>
            <div align="center">
                <div id="button" onclick="$.search()">搜索</div>
                <div id="tips" align="center">
                    <span id="tipscontent"></span>
                </div>
            </div>
            <div id="writeTips">
                <div align="center">
                    <span style="color: red;">注：</span>&nbsp;&nbsp;&nbsp;请输入投稿确认邮件中形如<%=palceholder%>的稿号。
                    <br>
                </div>
            </div>
        </div>
        <div id="copyRight" class="copyRight" align="center"><%=name%></div>
    </div>
</div>
</body>