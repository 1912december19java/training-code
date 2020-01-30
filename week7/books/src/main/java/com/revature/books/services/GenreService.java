package com.revature.books.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.books.models.Genre;
import com.revature.books.repositories.GenreDaoImpl;

@Service
public class GenreService implements ModelService<Genre> {

	@Autowired
	private GenreDaoImpl genreDao;

	@Override
	public List<Genre> getAll() {
		return genreDao.getAllGenres();
	}

	@Override
	public Genre get(int id) {
		return genreDao.getById(id);
	}

	@Override
	public void saveOrUpdate(Genre t) {
		genreDao.saveOrUpdate(t);		
	}
	
	@Override
	public Integer save(Genre t) {
		return genreDao.save(t);
	}
	
	@Override
	public void update(Genre t) {
		genreDao.update(t);
	}
	
	@Override
	public void delete(Genre t) {
		genreDao.delete(t);
	}
}
