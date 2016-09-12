package com.zdxb.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by hp on 2016/9/10.
 */
@WebServlet(name = "IntroductionServlet")
public class IntroductionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String bk = request.getParameter("bk");
        if (bk!=null && !"".equals(bk)){
            request.setAttribute("bk",bk);
            request.getRequestDispatcher("\\WEB-INF\\pages\\introduction\\details.jsp").forward(request,response);
        }
        else {
            request.getRequestDispatcher("\\WEB-INF\\pages\\introduction\\introduction.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
