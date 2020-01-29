package com.revature.books.repositories;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.books.models.Author;

public class AuthorDaoImpl {
	
	private SessionFactory sf;
	
	public AuthorDaoImpl(SessionFactory sf) {
		this.sf = sf;
	}
	
	public List<Author> getAllAuthors() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		Query q = session.createQuery("from Author");
		List<Author> authors = q.list();
		
		session.getTransaction().commit();
		return authors;
	}
	
	public Author getById(Integer id) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		Author author = (Author) session.get(Author.class, id);
		
		session.getTransaction().commit();
		return author;
	}
	
	public void saveOrUpdate(Author author) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		session.saveOrUpdate(author);
		
		session.getTransaction().commit();
	}

}
