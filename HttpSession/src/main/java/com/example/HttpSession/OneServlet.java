package com.example.HttpSession;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goodsName = null;
        goodsName = request.getParameter("goodsName");
        HttpSession session = request.getSession();
        if (session.getAttribute(goodsName) == null) {
            session.setAttribute(goodsName,1);
        } else {
            session.setAttribute(goodsName,(Integer)session.getAttribute(goodsName) + 1);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
