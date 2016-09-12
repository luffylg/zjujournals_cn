package com.zdxb.Servlet;

import java.io.IOException;

/**
 * Created by hp on 2016/7/22.
 */
public class IndexServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String bk = request.getParameter("bk");
        if (bk!=null && !"".equals(bk)){
            request.setAttribute("bk",bk);
            request.getRequestDispatcher("\\WEB-INF\\pages\\search\\search.jsp").forward(request,response);
        }
        else {
            request.getRequestDispatcher("\\index.jsp").forward(request,response);
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request,response);
    }
}
