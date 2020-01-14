package com.revature.comicappv2.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.comicappv2.models.Comic;
import com.revature.comicappv2.repositories.ComicDaoPostgres;
import com.revature.comicappv2.services.ComicService;

@WebServlet(name = "FrontController", urlPatterns = {"/api/*"})
public class FrontController extends HttpServlet {
  
  private ComicService comicService;
  private ObjectMapper om;
  
  @Override
  public void init() throws ServletException {
    this.comicService =  new ComicService(new ComicDaoPostgres());
    this.om = new ObjectMapper();
    super.init();
  }
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    System.out.println("URI:" + req.getRequestURI());
    String[] tokens = req.getRequestURI().split("/");
    
    if(tokens[3].equals("comic")) {
      //For now, let's implement our getAll
      List<Comic> comics = comicService.getAll();
      resp.getWriter().write(om.writeValueAsString(comics));
    }
  }
  
}
