package com.revature.books;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.books.models.Genre;
import com.revature.books.repositories.AuthorDaoImpl;
import com.revature.books.repositories.BookDaoImpl;
import com.revature.books.repositories.GenreDaoImpl;

@Deprecated
public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GenreDaoImpl genreDao = ac.getBean(GenreDaoImpl.class);
		
		Genre horror = genreDao.getById(3);
		
		horror.setRating(7);
		
		genreDao.update(horror);

		System.out.println(genreDao.getAllGenres());
		
		AuthorDaoImpl authorDao =  ac.getBean(AuthorDaoImpl.class);
		
		BookDaoImpl bookDao = ac.getBean(BookDaoImpl.class);
		
		System.out.println(authorDao.getAllAuthors());
		
		System.out.println(bookDao.getAllBooks());
	}

}
