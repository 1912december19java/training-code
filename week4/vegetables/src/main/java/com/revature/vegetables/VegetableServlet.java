package com.revature.vegetables;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VegetableServlet extends HttpServlet {
  
  //Lifecycle methods: init, service, destroy
  @Override
  public void init() throws ServletException {
    System.out.println("Initializing VegetableServlet: " + getServletName());
    super.init();
  }
  
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("VegetableServlet service() method");
    super.service(req, resp);
  }
  
  @Override
  public void destroy() {
    System.out.println("VegetableServlet destroy() method");
    super.destroy();
  }
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    
    System.out.println("Reached VegetableServlet GET");
    
    String textToLog = "";
    String textToWriteToResponse = "";
    
    String veggieName = req.getParameter("name");
    String veggieColor = req.getParameter("color");
    
    textToLog = veggieName + " " + veggieColor;
    textToWriteToResponse = textToLog;
    
    System.out.println(textToLog);
    
    String configFruit = getServletConfig().getInitParameter("fruit");
    String contextVegetable = getServletContext().getInitParameter("vegetable");
    
    System.out.println(configFruit + " " + contextVegetable);
    
    resp.getWriter().write(textToWriteToResponse);
  }

}
