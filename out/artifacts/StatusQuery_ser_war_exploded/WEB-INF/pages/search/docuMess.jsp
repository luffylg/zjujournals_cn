<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<html>
<head>
    <meta charset="UTF-8">
    <title>文稿信息</title>
    <script src="<%=basePath%>resources/jquery/jquery-2.2.2.min.js"></script>
    <script src="<%=basePath%>resources/jquery/jquery-2.2.2.js"></script>
    <meta name="viewport"
          content="width=device-width,height=device-height,initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no" />

    <style type="text/css">
        body, html {
            width: 100%;
            height: 100%;
            padding: 0px;
            margin: 0px;
        }

        #content {
            width: 100%;
            height: 95%;
        }

        #pagetitle {
            height: 5%;
            border-bottom: 5px solid #ccc;
            padding-left: 10%;
            padding-top: 2%;
            font-size: 20px;
        }

        #mess {
            width: 90%;
            height: 85%;
            border: 1px solid #ccc;
            margin: auto;
            margin-top: 5%;
            border-radius: 2%;
            box-shadow: 0px 0px 5px #909090;
        }

        #messTitle {
            height: 8%;
            border-bottom: 3px solid #ccc;
            text-align: center;
            padding-top: 2%;
        }

        #status {
            height: 10%;
            word-wrap: break-word;
        }

        #status div {
            width: 38%;
            float: left;
            color: #080e7f;
            font-size: 20px;
        }

        #statusTime {
            height: 18%;
            word-wrap: break-word;
        }

        #statusTime div:first-child {
            width: 100%;
            float: left;
            color: #080e7f;
            font-size: 20px;
        }

        #title {
            height: 28%;
            word-wrap: break-word;
        }

        #title div:first-child {
            width: 100%;
            float: left;
            color: #080e7f;
            font-size: 20px;
        }

        #author {
            height: 10%;
            word-wrap: break-word;
        }

        #author div {
            width: 38%;
            float: left;
            color: #080e7f;
            font-size: 20px;
        }

        #zid {
            height: 10%;
            word-wrap: break-word;
        }

        #zid div {
            width: 38%;
            float: left;
            color: #080e7f;
            font-size: 20px;
        }

        #tail {
            width: 100%;
            height: 5%;
        }

        #copyRight {
            width: 100%;
            height: 15px;
            font-size: 10px;
            background-color: #dcdcdc;
            line-height: 15px;
            overflow: hidden;
            text-align: center;
            color: #3a3a3a;
        }
    </style>
</head>
<script>
    $(function() {
        $("#content").hide();
        var a = sessionStorage.docu;
        if (a == undefined) {
            alert("请先在搜索页面搜索信息");
            window.location.href = "search.jsp";
        } else {

            $("#content").show();
            var obj =JSON.parse(a);
            $("#statusContent").text(obj.phase_name);
            $("#statusTimeContent").text(obj.currentflow_actual_date=="null"?obj.currentflow_submit_date:obj.currentflow_actual_date);
            $("#titleContent").html(
                    "<br><br>&nbsp;&nbsp;&nbsp;&nbsp;" + obj.title);
            $("#zidContent").text(obj.manu_number);
            $("#authorContent").text(obj.dis_authors);

        }
    })

</script>
<body>
<div id="content">
    <div id="pagetitle">
        <span>论文 · 状态查询</span>
    </div>
    <div id="mess">
        <div id="messTitle">
            <div style="height: 40px;font-size:25px; line-height: 40px; overflow: hidden;">status</div>
        </div>
        <div style="width: 100%; height: 90%; margin-top: 15px;">
            <div id="title">
                <div id="titleFont">&nbsp;&nbsp;论文标题&nbsp;:</div>
                <div style="width: 92%; height: 80%; padding-left: 20px;">
                    <font id="titleContent"></font></div>
            </div>
            <div id="author">
                <div id="authorFont">&nbsp;&nbsp;论文作者&nbsp;:</div>
                    <font id="authorContent"></font>
            </div>

            <div id="status">
                <div id="statusFont">&nbsp;&nbsp;论文状态&nbsp;:</div>
                <font id="statusContent"></font>
            </div>

            <div id="statusTime">
                <div id="statusTimeFont">&nbsp;&nbsp;状态更新时间&nbsp;:</div>
                <div style="width: 92%; height: 80%; padding-left: 60px;padding-top: 40px;">
                    <font id="statusTimeContent"></font></div>
            </div>
            <div id="zid">
                <div id="zidFont">&nbsp;&nbsp;论文编号&nbsp;:</div>
                <font id="zidContent"></font>
            </div>
        </div>
    </div>
</div>
<div id="tail">
    <div id="copyRight">浙大学报中文版</div>
</div>
</body>
</html>