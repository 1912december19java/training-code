package com.revature.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.books.models.Book;
import com.revature.books.services.ModelService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private ModelService<Book> bookService;
	
	@GetMapping
	public List<Book> getAll() {
		return bookService.getAll();
	}
	
	@GetMapping("/{id}")
	public Book get(@PathVariable int id) {
		return bookService.get(id);
	}
	
	//This endpoint accepts POST only if they're also sending JSON
	@PostMapping(consumes = "application/json")
	public Integer create(Book book) {
		return bookService.save(book);
	}
	
	@PutMapping(value = "/{id}", consumes = "application/json")
	public Book replace(@RequestBody Book book, @PathVariable int id) {
		book.setId(id);
		bookService.saveOrUpdate(book);
		return book;
	}

}
