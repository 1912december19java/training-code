package com.revature.firstservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends HttpServlet {
  

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("Reached SessionServlet");
    HttpSession session = req.getSession();
    if(session.isNew()) {
      session.setAttribute("runningTotal", 0);
    }
    
    //quick request counter
    
    Integer runningTotal = (Integer) session.getAttribute("runningTotal");
    runningTotal++;
    session.setAttribute("runningTotal", runningTotal);
    
    resp.getWriter().write("Your running total: " + runningTotal);
  }

}
