package org.jerometambo.dynamicservletinitializer.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld.
 */
public class HelloWorld extends HttpServlet {

    /**
     * Default constructor.
     */
    public HelloWorld() {
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.getWriter().append("<!doctype html>").append("<html>").append("<head>")
                .append("<meta charset=\"utf-8\">").append("<title>Dynamic Servlet Initializer</title>")
                .append("</head>").append("<body>").append("<h3>Served at: ").append(request.getContextPath())
                .append(".</h3> <br> <h2>Hello World (dynamically ^^).</h2>").append("</body>").append("</html>");
    }

}
