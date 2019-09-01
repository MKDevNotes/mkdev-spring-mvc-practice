package com.dn.simplejettyweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/***
 * @author Muthukumar Thangavinayagam.
 */
public class DnSimpleJettyServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet Called..");
        PrintWriter out = resp.getWriter();
        out.println("Hello Dn Simple Jetty Servlet");
        out.flush();
        out.close();
        super.doGet(req, resp);
    }

}
