package com.revature.firstservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("Handling a GET request: " + req.getMethod());
    System.out.println("Parameters found: " + req.getParameterMap().keySet());
    String fruitParam = req.getParameter("fruit");
    System.out.println("fruit param value is: " + fruitParam);
    resp.getWriter().write(
        "<h1>Hello World</h1>" +
        "<p>Your fruit: " + fruitParam + "</p>"
    );
  }

}
