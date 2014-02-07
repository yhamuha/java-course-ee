package ru.gs.test.myfirstservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Intern
 */
public class MyFirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        PrintWriter out = resp.getWriter();

        try {
            
            out.write("<html><head><title>My First Servlet Response</title></head><body><h1>Hello " + name + "</h1></body></html>");
            
        } finally {
            out.close();
        }
    }
}
