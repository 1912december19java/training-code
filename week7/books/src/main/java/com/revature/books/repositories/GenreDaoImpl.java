package com.revature.books.repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.books.models.Genre;

@Repository
//@Transactional
public class GenreDaoImpl {
	
	@Autowired
	private SessionFactory sf;
	
	public GenreDaoImpl(SessionFactory sf) {
		this.sf = sf;
	}
	
	public List<Genre> getAllGenres() {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		Criteria c = session.createCriteria(Genre.class);
		List<Genre> genres = c.list();
		
		session.getTransaction().commit();
		return genres;
	}
	
	public Genre getById(Integer id) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		Genre genre = (Genre) session.get(Genre.class, id);
		
		session.getTransaction().commit();
		return genre;
	}
	
	public void saveOrUpdate(Genre genre) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		session.saveOrUpdate(genre);
		
		session.getTransaction().commit();
	}
	
	public Integer save(Genre genre) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		Integer id = (Integer) session.save(genre);
		
		session.getTransaction().commit();
		return id;
	}
	
	public void update(Genre genre) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		session.update(genre);
		
		session.getTransaction().commit();
	}
	
	public void delete(Genre genre) {
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		session.delete(genre);
		
		session.getTransaction().commit();
	}

}
