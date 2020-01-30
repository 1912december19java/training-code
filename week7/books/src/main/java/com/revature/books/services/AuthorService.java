package com.revature.books.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.books.models.Author;
import com.revature.books.repositories.AuthorDaoImpl;

@Service
public class AuthorService implements ModelService<Author> {

	@Autowired
	AuthorDaoImpl authorDao;
	
	public List<Author> getAll() {
		return authorDao.getAllAuthors();
	}
	
	public Author get(int id) {
		return authorDao.getById(id);
	}
	
	public void saveOrUpdate(Author author) {
		authorDao.saveOrUpdate(author);
	}

}
