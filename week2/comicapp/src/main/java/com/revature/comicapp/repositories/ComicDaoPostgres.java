package com.revature.comicapp.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.revature.comicapp.models.Comic;

public class ComicDaoPostgres implements ComicDao {
  
  private static Logger log = Logger.getLogger(ComicDaoPostgres.class);

  private static Connection conn;

  // This guy will run when the class loads, after static fields are initialized.
  static {
    try {
      conn = DriverManager.getConnection(
          System.getenv("connstring"), System.getenv("username"), System.getenv("password"));
      log.info("Connected to Database");
    } catch (SQLException e) {
      log.error("Failed to connect to Database", e);
    }
  }

  @Override
  public Comic get(int id) {
    log.info("Attempting to get Comic with id: " + id);
    Comic out = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      stmt = conn.prepareStatement("SELECT * FROM comics WHERE id = ?");
      // 1 is the index of the ?
      log.trace("Setting prepared statement id to: " + id);
      stmt.setInt(1, id);
      // Now our statement is ready to go. Lets run it.
      log.trace("Executing prepared statement");
      if (stmt.execute()) {
        // Now we have some results. Lets get them.
        log.trace("Statement execution successful, getting ResultSet");
        rs = stmt.getResultSet();
        log.trace("ResultSet successfully retrieved");
      }
      // This line is typical, but not particularly useful for our 1-line rs
      log.trace("Beginning to loop through ResultSet");
      while (rs.next()) {
        out = new Comic(rs.getInt("id"), rs.getString("title"), rs.getInt("page_count"),
            rs.getDouble("price"), rs.getInt("rating"));
        log.trace("read out Comic with id :" + rs.getInt("id"));
      }
    } catch (SQLException e) {
      log.error("Failed to retrieve Comic with id: " + id, e);
    }
    
    if (out == null) {
      log.debug("Returning null since Comic with id: " + id + " was not found in the database.");
    } else {
      log.debug("Returning Comic with id: " + id);
    }
    return out;
  }

  @Override
  public void save(Comic comic) {
    PreparedStatement stmt = null;
    try {
      stmt = conn.prepareStatement(
          "INSERT INTO comics(title, page_count, price, rating) VALUES (?,?,?,?)");
      stmt.setString(1, comic.getTitle());
      stmt.setInt(2, comic.getPageCount());
      stmt.setDouble(3, comic.getPrice());
      stmt.setInt(4, comic.getRating());
      
      stmt.execute();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void update(Comic comic) {
    PreparedStatement stmt = null;
    try {
      stmt = conn.prepareStatement("UPDATE comics SET title = ?, page_count = ?, price = ?, rating = ? WHERE id = ?");
      stmt.setString(1, comic.getTitle());
      stmt.setInt(2, comic.getPageCount());
      stmt.setDouble(3, comic.getPrice());
      stmt.setInt(4, comic.getRating());
      stmt.setInt(5, comic.getId());
      
      stmt.execute();
      
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  @Override
  public List<Comic> getAll() {
    List<Comic> allComics = new ArrayList<Comic>();

    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      stmt = conn.prepareStatement("SELECT * FROM comics");

      if (stmt.execute()) {
        rs = stmt.getResultSet();
      }
      while (rs.next()) {
        allComics.add(new Comic(rs.getInt("id"), rs.getString("title"), rs.getInt("page_count"),
            rs.getDouble("price"), rs.getInt("rating")));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return allComics;
  }

  @Override
  public List<Comic> getByPriceRange(double lower, double upper) {
    List<Comic> comicsInRange = new ArrayList<Comic>();

    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      stmt = conn.prepareStatement("SELECT * FROM comics WHERE price < ? AND price > ?");
      stmt.setDouble(1, upper);
      stmt.setDouble(2, lower);

      if (stmt.execute()) {
        rs = stmt.getResultSet();
      }
      while (rs.next()) {
        comicsInRange.add(new Comic(rs.getInt("id"), rs.getString("title"), rs.getInt("page_count"),
            rs.getDouble("price"), rs.getInt("rating")));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return comicsInRange;
  }

}
