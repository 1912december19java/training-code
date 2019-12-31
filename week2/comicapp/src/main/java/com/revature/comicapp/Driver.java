package com.revature.comicapp;

import com.revature.comicapp.models.Comic;
import com.revature.comicapp.repositories.ComicDao;
import com.revature.comicapp.repositories.ComicDaoPostgres;

public class Driver {

  public static void main(String[] args) {
    ComicDao comicDao = new ComicDaoPostgres();
    
    Comic comic2 =  comicDao.get(2);
    Comic comic3 = comicDao.get(3);
    Comic comic70 = comicDao.get(70);
    Comic comic60 = comicDao.get(-33);
    
  }

}
