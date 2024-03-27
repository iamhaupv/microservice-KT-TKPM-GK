package com.example.BookService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookService.entities.Book;
import com.example.BookService.service.BookService;

@RestController
@RequestMapping("/api/v1/")
public class BookController {
	@Autowired
	private BookService service;
	@PostMapping("/book")
	public Book add(@RequestBody Book book) {
		return service.add(book);
	}
	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable int id) {
		return service.getBookById(id);
	}
	@GetMapping("/books")
	public List<Book> getAllBook(){
		return service.getAllBook();
	}
}
