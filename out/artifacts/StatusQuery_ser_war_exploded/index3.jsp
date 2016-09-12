<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2016/7/22
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>选择版面</title>
  </head>
  <style>
    div{border-radius:35px 35px 35px 35px;}
  </style>
  <body>
  <%--<form action="index.action" method="post">--%>
  <%--<input type="radio" id="gxb" name="bk" value="gxb">工学版--%>
  <%--<input type="radio" id="skb" name="bk" value="skb">社科学版--%>
  <%--<input type="radio" id="yxb" name="bk" value="yxb">医学版--%>
  <%--<input type="radio" id="gcsj" name="bk" value="gcsj">工程设计学版--%>
    <%--<input type="submit" value="选择">--%>
  <%--</form>--%>
  <%--$END$--%>
  <table style="margin:auto;width:100%;height:100%; background-color: white">
    <tr>
      <td>
        <div id="bigBox"  style="margin:auto;width:100%;height:100%;font-family: SimHei;">
          <div onclick="window.open('index.action?bk=skb','_self')" id="top_left" style="background-color:rgb(107, 107, 107); float:left; width:100%;height:30%;">
            <p style="text-align: center ;line-height: 100%;font-size: 100px">社科学版</p>
          </div>
          <div id="middle" style="float:left;width:100%;height:30%;margin-top:4%">
            <div onclick="window.open('index.action?bk=gxb','_self')" id="middle_left" style="background-color:rgb(0, 174, 239); float:left; width:48%;height:100%;">
              <p style="text-align: center ;line-height: 100%;font-size: 100px">工学版</p>
            </div>
            <div onclick="window.open('index.action?bk=yxb','_self')" id="middle_middle" style="background-color:rgb(67, 181, 31); float:right; width:48%;height:100%;">
              <p style="text-align: center ;line-height: 100%;font-size: 100px">医学版</p>
            </div>
          </div>
          <div onclick="window.open('index.action?bk=gcsj','_self')" id="buttom_left" style="background-color:rgb(245, 141, 0); float:left; width:100%;height:30%;margin-top:4%">
            <p style="text-align: center ;line-height: 100%;font-size: 100px">工程设计学版</p>
          </div>
        </div>
      </td>
    </tr>
  </table>
  </body>
</html>
