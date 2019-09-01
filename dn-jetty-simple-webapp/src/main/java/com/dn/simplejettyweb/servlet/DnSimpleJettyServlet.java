package com.dn.simplejettyweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/***
 * @author Muthukumar Thangavinayagam.
 */
@WebServlet("/dnsimplejetty")
public class DnSimpleJettyServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet Called..");
        doPost(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
                    out.println("Hello Dn Simple Jetty Servlet");
                    out.flush();
                    out.close();
        super.doPost(req, resp);
    }
}
