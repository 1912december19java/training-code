package com.revature.recipe.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.revature.recipe.model.Recipe;

public class FormServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("Reached GET FormServlet");
  }
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("Reached POST FormServlet");
    String name = req.getParameter("name");
    String directions =  req.getParameter("directions");
    Integer serves = null;
    if(req.getParameter("serves") != null && req.getParameter("serves").length() > 0 ) {
      serves = Integer.valueOf(req.getParameter("serves"));
    }
    
    Recipe recipe = new Recipe();
    recipe.setName(name);
    recipe.setDirections(directions);
    recipe.setServes(serves);
    
    System.out.println("Received recipe: " + recipe);
    
    //something like : 
    //recipeService.save(recipe);
    
    resp.getWriter().write("Received Recipe: " + recipe);
  }
  
}
