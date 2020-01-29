package com.revature.books.repositories;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.revature.books.models.Author;

@Repository
@Transactional
@EnableTransactionManagement
public class AuthorDaoImpl {
	
	@Autowired
	private SessionFactory sf;
	
	public AuthorDaoImpl(SessionFactory sf) {
		this.sf = sf;
	}
	
	public List<Author> getAllAuthors() {
		Session session = sf.getCurrentSession();
		
		Query q = session.createQuery("from Author");
		List<Author> authors = q.list();
		
		return authors;
	}
	
	public Author getById(Integer id) {
		Session session = sf.getCurrentSession();
		
		Author author = (Author) session.get(Author.class, id);
		
		return author;
	}
	
	public void saveOrUpdate(Author author) {
		Session session = sf.getCurrentSession();
		
		session.saveOrUpdate(author);
	}

}
