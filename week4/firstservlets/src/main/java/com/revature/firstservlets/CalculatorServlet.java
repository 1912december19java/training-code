package com.revature.firstservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CalculatorServlet extends HttpServlet {
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("Reached CalculatorServlet");
    HttpSession session = req.getSession();
    if(session.isNew()) {
      session.setAttribute("runningTotal", 0);
    }
    Integer runningTotal = (Integer) session.getAttribute("runningTotal");
    String toAdd = req.getParameter("add");
    String toSubtract = req.getParameter("subtract");
    
    if(toAdd != null && toAdd.length() != 0) {
      runningTotal += Integer.valueOf(toAdd);
    }
    if(toSubtract != null && toSubtract.length() != 0) {
      runningTotal -= Integer.valueOf(toSubtract);
    }
    
    session.setAttribute("runningTotal", runningTotal);
    
    resp.getWriter().write(
        "<html><form><p>Add:</p><input type=\"number\" name=\"add\">" + 
        "<p>Subtract:</p><input type=\"number\" name=\"subtract\">" + 
        "<input type=\"submit\"></form>" +
        "<p>Your total is: " + runningTotal + "</p></html>"
        );
  }

}
