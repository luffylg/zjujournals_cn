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
    <title>版面介绍</title>
    <link rel="stylesheet" href="<%=basePath%>resources/index/css/jquery.mobile-1.4.2.min.css">
    <link rel="stylesheet" href="<%=basePath%>resources/index/css/jqm-demos.css">
    <%--<link rel="stylesheet" href="<%=basePath%>resources/index/css/alert.css">--%>
    <script src="<%=basePath%>resources/jquery/jquery-2.2.2.min.js"></script>
    <script src="<%=basePath%>resources/jquery/jquery.mobile-1.4.2.min.js"></script>

</head>
<body>
<div data-role="page" class="jqm-demos">
    <div data-role="main" class="ui-content jqm-content">
        <%--<div class="ui-grid-solo">--%>
            <%--<div class="ui-block-a">--%>
                <%--<a class="ui-shadow ui-btn jqm-btn ui-corner-all ui-btn-icon-right ui-icon-info" >人文社科版</a>--%>
            <%--</div>--%>
        <%--</div>--%>

        <%--<ul data-role="listview" data-inset="true">--%>
            <%--<li  data-icon="info">--%>
                <%--<a href="#">--%>
                    <%--<img src="<%=basePath%>resources/introduction/images/人文版·2016年第1期封面_页面_1.jpg" alt="人文社科版">--%>
                    <%--<h2>人文社科版</h2>--%>
                    <%--<p>《浙江大学学报(人文社会科学版)》</p>--%>
                <%--</a>--%>
            <%--</li>--%>
            <%--<li  data-icon="info"><a href="#"><img src="<%=basePath%>resources/introduction/images/ZDZC201601工学版.jpg" alt="工学版"><h2>工学版</h2><p>《浙江大学学报（工学版）》</p></a> </li>--%>
            <%--<li  data-icon="info"><a href="#"><img src="<%=basePath%>resources/introduction/images/20160126-浙大学报（医学版）-pb1.jpg" alt="医学版"><h2>医学版</h2><p>《浙江大学学报（医学版）》</p></a> </li>--%>
            <%--<li  data-icon="info"><a href="#"><img src="<%=basePath%>resources/introduction/images/工程设计-封面.png" alt="工程设计学报"><h2>工程设计学报</h2><p>《工程设计学报》</p></a> </li>--%>
            <%--<li  data-icon="info"><a href="#"><img src="<%=basePath%>resources/introduction/images/理学版-第五期封.png" alt="理学版"><h2>理学版</h2><p>《浙江大学学报（理学版）》</p></a> </li>--%>
            <%--<li  data-icon="info"><a href="#"><img src="<%=basePath%>resources/introduction/images/农学版-第一期封.png" alt="农业生科版"><h2>农业生科版</h2><p>《浙江大学学报（农业与生命科学版）》</p></a> </li>--%>
            <%--<li  data-icon="info"><a href="#"><img src="<%=basePath%>resources/introduction/images/JZUS-A-cover.png" alt="浙江大学学报英文版A辑"><h2>浙江大学学报（英文版）A辑</h2><p>应用物理与工程</p></a> </li>--%>
            <%--<li  data-icon="info"><a href="#"><img src="<%=basePath%>resources/introduction/images/JZUS-B cover.tif" alt="浙江大学学报（英文版）B辑"><h2>浙江大学学报（英文版）B辑</h2><p>生物医学与生物技术</p></a> </li>--%>
            <%--<li  data-icon="info"><a href="#"><img src="<%=basePath%>resources/introduction/images/FITEE cover.tif" alt="信息与电子工程前沿"><h2>信息与电子工程前沿</h2><p>原英文版C辑</p></a> </li>--%>

        <%--</ul>--%>


            <ul data-role="listview" data-inset="true">
                <li data-icon="info"><a href="introduction.action?bk=skb">
                    <img src="<%=basePath%>resources/introduction/images/人文版·2016年第1期封面_页面_1.jpg" alt="人文社科版">
                    <h2>人文社科版</h2>
                    <p>浙江大学学报(人文社会科学版)</p>
                    </a>
                </li>
            </ul>
            <ul data-role="listview" data-inset="true">
                <li  data-icon="info"><a href="introduction.action?bk=gxb"><img src="<%=basePath%>resources/introduction/images/ZDZC201601工学版.jpg" alt="工学版"><h2>工学版</h2><p>浙江大学学报（工学版）</p></a> </li>

            </ul>
            <ul data-role="listview" data-inset="true">
                <li  data-icon="info"><a href="introduction.action?bk=yxb"><img src="<%=basePath%>resources/introduction/images/20160126-浙大学报（医学版）-pb1.jpg" alt="医学版"><h2>医学版</h2><p>浙江大学学报（医学版）</p></a> </li>

            </ul>
            <ul data-role="listview" data-inset="true">
                <li  data-icon="info"><a href="introduction.action?bk=gcsj"><img src="<%=basePath%>resources/introduction/images/工程设计-封面.png" alt="工程设计学报"><h2>工程设计学报</h2><p>《工程设计学报》</p></a> </li>

            </ul>
            <ul data-role="listview" data-inset="true">
                <li  data-icon="info"><a href="introduction.action?bk=lxb"><img src="<%=basePath%>resources/introduction/images/lxb.jpg" alt="理学版"><h2>理学版</h2><p>浙江大学学报（理学版）</p></a> </li>

            </ul>

            <ul data-role="listview" data-inset="true">
                <li  data-icon="info"><a href="introduction.action?bk=nxb"><img src="<%=basePath%>resources/introduction/images/nxb.jpg" alt="农业生科版"><h2>农业生科版</h2><p>浙江大学学报（农业与生命科学版）</p></a> </li>

            </ul>

            <ul data-role="listview" data-inset="true">
                <li  data-icon="info"><a href="introduction.action?bk=ywba"><img src="<%=basePath%>resources/introduction/images/JZUS-A-cover.png" alt="浙大学报英文版A辑"><h2>浙大学报英文版A辑</h2><p>应用物理与工程</p></a> </li>

            </ul>

            <ul data-role="listview" data-inset="true">
                <li  data-icon="info"><a href="introduction.action?bk=ywbb"><img src="<%=basePath%>resources/introduction/images/JZUS-B.png" alt="浙大学报英文版B辑"><h2>浙大学报英文版B辑</h2><p>生物医学与生物技术</p></a> </li>

            </ul>

            <ul data-role="listview" data-inset="true">
                <li  data-icon="info"><a href="introduction.action?bk=ywbc"><img src="<%=basePath%>resources/introduction/images/FITEE.png" alt="信息与电子工程前沿"><h2>信息与电子工程前沿</h2><p>原英文版C辑</p></a> </li>

            </ul>





    </div>
    <div data-role="footer" data-position="fixed" class="jqm-footer">

    </div>
</div>
</body>
</html>
