package com.zdxb.Servlet;

import java.io.IOException;

/**
 * Created by hp on 2016/7/22.
 */
public class ShowServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher("\\WEB-INF\\pages\\search\\docuMess.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request,response);
    }
}
