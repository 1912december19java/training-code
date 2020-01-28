package com.revature.books.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class Author {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private Integer age;
	
	@OneToMany(mappedBy = "author")
	private List<Book> books;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		StringBuilder bookTitles = new StringBuilder();
		for(Book b : this.getBooks()) {
			bookTitles.append(b.getTitle());
			bookTitles.append(", ");
		}
		if(this.books != null && this.books.size() > 0) {
			bookTitles.delete(bookTitles.length()-2, bookTitles.length());
		}
		return "Author [id=" + id + ", name=" + name + ", age=" + age + ", books=" + bookTitles.toString() + "]";
	}
}
