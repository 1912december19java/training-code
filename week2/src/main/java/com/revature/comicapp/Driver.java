package com.revature.comicapp;

import com.revature.comicapp.models.Comic;
import com.revature.comicapp.repositories.ComicDao;
import com.revature.comicapp.repositories.ComicDaoPostgres;

public class Driver {

  public static void main(String[] args) {
    ComicDao comicDao = new ComicDaoPostgres();
    
    Comic comicToEdit =  comicDao.get(2);
    comicToEdit.setTitle("Batman: Detective Man 2");
    comicToEdit.setPageCount(333);
    comicToEdit.setRating(2);
    comicDao.update(comicToEdit);
    
    System.out.println(comicDao.getAll());

  }

}
