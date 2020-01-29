package com.revature.books.repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.revature.books.models.Genre;

@Repository
@Transactional
@EnableTransactionManagement
public class GenreDaoImpl {
	
	@Autowired
	private SessionFactory sf;
	
	public GenreDaoImpl(SessionFactory sf) {
		this.sf = sf;
	}
	
	public List<Genre> getAllGenres() {
		Session session = sf.getCurrentSession();
		
		Criteria c = session.createCriteria(Genre.class);
		List<Genre> genres = c.list();
		
		return genres;
	}
	
	public Genre getById(Integer id) {
		Session session = sf.getCurrentSession();
		
		Genre genre = (Genre) session.get(Genre.class, id);
		
		return genre;
	}
	
	public void saveOrUpdate(Genre genre) {
		Session session = sf.getCurrentSession();
		
		session.saveOrUpdate(genre);
	}
	
	public Integer save(Genre genre) {
		Session session = sf.getCurrentSession();
		
		Integer id = (Integer) session.save(genre);

		return id;
	}
	
	public void update(Genre genre) {
		Session session = sf.getCurrentSession();
		
		session.update(genre);
	}
	
	public void delete(Genre genre) {
		Session session = sf.getCurrentSession();
		
		session.delete(genre);
	}

}
