<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>版面选择</title>
    <link rel="stylesheet" href="<%=basePath%>resources/index/css/jquery.mobile-1.4.2.min.css">
    <link rel="stylesheet" href="<%=basePath%>resources/index/css/jqm-demos.css">
    <%--<link rel="stylesheet" href="<%=basePath%>resources/index/css/alert.css">--%>
    <script src="<%=basePath%>resources/jquery/jquery-2.2.2.min.js"></script>

</head>
<%--<style>--%>
    <%--div{border-radius:35px 35px 35px 35px;}--%>
<%--</style>--%>
<body>
<%--<div id="pagetitle">--%>
    <%--<span>论文 · 版面选择</span>--%>
<%--</div>--%>
<div data-role="page" class="jqm-demos">
    <div data-role="content" class="ui-content jqm-content">
        <div class="ui-grid-a">
            <div class="ui-block-a">
                <a class="ui-shadow ui-btn jqm-btn ui-corner-all ui-btn-icon-top ui-icon-search"
                    onclick="window.open('index.action?bk=skb','_self')">人文社科版</a>
                <%--<a class="ui-shadow ui-btn jqm-btn ui-corner-all ui-btn-icon-top ui-icon-search"--%>
                   <%--onclick="alert('功能开通中')">人文社科版</a>--%>
            </div>
            <div class="ui-block-b">
                <a class="ui-shadow ui-btn jqm-btn ui-corner-all ui-btn-icon-top ui-icon-search"
                    onclick="window.open('index.action?bk=gxb','_self')">工学版</a>
                <%--<a class="ui-shadow ui-btn jqm-btn ui-corner-all ui-btn-icon-top ui-icon-search"--%>
                   <%--onclick="alert('功能开通中')">工学版</a>--%>
            </div>
            <div class="ui-block-a">
                <a class="ui-shadow ui-btn jqm-btn ui-corner-all ui-btn-icon-top ui-icon-search"
                   onclick="window.open('index.action?bk=yxb','_self')">医学版</a>
                <%--<a class="ui-shadow ui-btn jqm-btn ui-corner-all ui-btn-icon-top ui-icon-search"--%>
                   <%--onclick="alert('功能开通中')">医学版</a>--%>
            </div>
            <div class="ui-block-b">
                <a class="ui-shadow ui-btn jqm-btn ui-corner-all ui-btn-icon-top ui-icon-search"
                   onclick="window.open('index.action?bk=gcsj','_self')">工程设计学报</a>
            </div>
            <div class="ui-block-a">
                <a class="ui-shadow ui-btn jqm-btn ui-corner-all ui-btn-icon-top ui-icon-search"
                   onclick="window.open('index.action?bk=lxb','_self')">理学版</a>
            </div>
            <div class="ui-block-b">
                <a class="ui-shadow ui-btn jqm-btn ui-corner-all ui-btn-icon-top ui-icon-search"
                   onclick="window.open('index.action?bk=nxb','_self')">农业生科版</a>
            </div>
            <div class="ui-block-a">
                <a class="ui-shadow ui-btn jqm-btn ui-corner-all ui-btn-icon-top ui-icon-search"
                   href="http://zdxb.xuebaeasy.com/">英文版</a>
            </div>
        </div>
    </div>
    <div data-role="footer" data-position="fixed" class="jqm-footer">

    </div>
</div>


<%--<table style="margin:auto;width:100%;height:100%; background-color: white">--%>
    <%--<tr>--%>
        <%--<td>--%>
            <%--<div id="bigBox"  style="margin:auto;width:100%;height:100%;font-family: SimHei;">--%>
                <%--<div onclick="window.open('index.action?bk=skb','_self')" id="top_left" style="background-color:rgb(107, 107, 107); float:left; width:100%;height:30%;">--%>
                    <%--<p style="text-align: center ;line-height: 100%;font-size: 100px">社科学版</p>--%>
                <%--</div>--%>
                <%--<div id="middle" style="float:left;width:100%;height:30%;margin-top:4%">--%>
                    <%--<div onclick="window.open('index.action?bk=gxb','_self')" id="middle_left" style="background-color:rgb(0, 174, 239); float:left; width:48%;height:100%;">--%>
                        <%--<p style="text-align: center ;line-height: 100%;font-size: 100px">工学版</p>--%>
                    <%--</div>--%>
                    <%--<div onclick="window.open('index.action?bk=yxb','_self')" id="middle_middle" style="background-color:rgb(67, 181, 31); float:right; width:48%;height:100%;">--%>
                        <%--<p style="text-align: center ;line-height: 100%;font-size: 100px">医学版</p>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div onclick="window.open('index.action?bk=gcsj','_self')" id="buttom_left" style="background-color:rgb(245, 141, 0); float:left; width:100%;height:30%;margin-top:4%">--%>
                    <%--<p style="text-align: center ;line-height: 100%;font-size: 100px">工程设计学版</p>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</td>--%>
    <%--</tr>--%>
<%--</table>--%>
</body>
</html>
