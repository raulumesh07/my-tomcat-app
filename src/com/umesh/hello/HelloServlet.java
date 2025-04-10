package com.umesh.hello;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello from Umesh's Web App!</h1>");
	out.println("<p>This is my first dynamic servlet deployment!</p>");
        out.println("<p>This is my Second Change!</p>");
        out.println("<p>This is my Third Change before Github!</p>");
        out.println("<p>Reay for the Change!</p>");
    }
}

