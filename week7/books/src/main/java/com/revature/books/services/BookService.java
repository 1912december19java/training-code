package com.revature.books.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.books.models.Book;
import com.revature.books.repositories.BookDaoImpl;

@Service
public class BookService implements ModelService<Book> {

	@Autowired
	private BookDaoImpl bookDao;
	
	@Override
	public List<Book> getAll() {
		return bookDao.getAllBooks();
	}

	@Override
	public Book get(int id) {
		return bookDao.getById(id);
	}

	@Override
	public void saveOrUpdate(Book t) {
		bookDao.saveOrUpdate(t);
	}
	
}
