package com.zdxb.Servlet;

import com.zdxb.Service.TableService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by hp on 2016/7/22.
 */
public class ManuscriptQueryServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter outer=response.getWriter();
        String zid=request.getParameter("zid");
        String kanming=request.getParameter("bk");
        TableService ms=new TableService();

        try {
            String data=ms.ManuscriptQueryStatus(zid,kanming);
            outer.write(data);
            outer.flush();
            outer.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
