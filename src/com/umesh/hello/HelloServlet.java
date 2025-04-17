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
        out.println("<p>Ready for the Change!</p>");
        out.println("<p>Now tracked via Git and pushed to GitHub!</p>");
        out.println("<p>Deployed via GoCD at 10:25:00 PM!</p>");
        out.println("<p>Second Deployment via GoCD at 11:49:00 PM!</p>");
        out.println("<p>Third Automated Deployment via GoCD at 00:30:00 AM by AUR!</p>");
        out.println("<p>Fourth CD/CD Automated Deployment via GoCD at 06:40:00 AM!</p>");
        out.println("<p>Fifth CD/CD Automated BASIC DEVELOPMENT via GoCD at 08:00:00 PM!</p>");
        out.println("<p>Sixth CD/CD Automated SIT Deployment via GoCD at 08:30:00 PM!</p>");
        out.println("<p>Change 1  CI/CD Automated Deployment!</p>");
    }
}

