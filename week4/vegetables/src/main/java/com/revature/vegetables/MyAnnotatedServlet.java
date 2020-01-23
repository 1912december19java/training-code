package com.revature.vegetables;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyAnnotatedServlet", urlPatterns = {"/1","/annotationsarefun/examplesarefuntoo", "/joe"})
public class MyAnnotatedServlet extends HttpServlet {
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    //Try redireccting or forwarding to navigate the user from the server
    resp.sendRedirect("/vegetables/veggie");
    //req.getRequestDispatcher("/veggie").forward(req, resp);
  }
}
