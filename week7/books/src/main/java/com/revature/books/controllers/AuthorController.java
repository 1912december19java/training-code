package com.revature.books.controllers;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.books.models.Author;
import com.revature.books.services.ModelService;

//This is just @Controller and @ResponseBody combined
@RestController
@RequestMapping("/authors")
public class AuthorController implements InitializingBean {
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing AuthorController");
	}

	@Autowired
	private ModelService<Author> authorService;
	
	@GetMapping
	public List<Author> getAll() {
		return authorService.getAll();
	}
	
	@GetMapping("/{id}")
	public Author get(@PathVariable int id) {
		return authorService.get(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Integer create(@RequestBody Author author) {
		return authorService.save(author);
	}
	
	@PutMapping("/{id}")
	public Author replace(@RequestBody Author author, @PathVariable int id) {
		author.setId(id);
		authorService.saveOrUpdate(author);
		return author;
	}
	
}
