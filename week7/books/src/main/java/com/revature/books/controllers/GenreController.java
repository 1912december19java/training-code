package com.revature.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.books.models.Genre;
import com.revature.books.services.ModelService;

@RestController
@RequestMapping("/genres")
public class GenreController {
	
	@Autowired
	private ModelService<Genre> genreService;
	
	@GetMapping
	public List<Genre> getAll() {
		return genreService.getAll();
	}
	
	@GetMapping("/{id}")
	public Genre get(@PathVariable int id) {
		return genreService.get(id);
	}
	
	@PostMapping(consumes = "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Integer create(@RequestBody Genre genre) {
		return genreService.save(genre);
	}
	
	@PutMapping(value = "/{id}", consumes = "application/json")
	public Genre replace(@RequestBody Genre genre, @PathVariable int id) {
		genre.setId(id);
		genreService.saveOrUpdate(genre);
		return genre;
	}
	
	@PatchMapping(consumes = "application/json")
	public void update(@RequestBody Genre genre) {
		genreService.update(genre);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		Genre genre = new Genre();
		genre.setId(id);
		genreService.delete(genre);
	}
	
	@PutMapping("/{id}/rating")
	public void rate(@PathVariable(name = "id") int id, @RequestBody int rating) {
		Genre genre = genreService.get(id);
		genre.setRating(rating);
		genreService.update(genre);
	}
	
}
