package com.example.UserService.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.UserService.entities.Book;
import com.example.UserService.repositories.BookRepository;
import com.example.UserService.repositories.XuLyRepository;
@RestController
@RequestMapping("/api/v2")
public class UserController {
	@Autowired
	private XuLyRepository xuLyRepository;
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/book/{id}")
	public ResponseEntity<BookRepository> bookRemoteBook(@PathVariable Integer id) {
		BookRepository bookReponsitory = new BookRepository();
		String url = "http://localhost:6969/api/v1/book/" + id;
		ResponseEntity<Book> reponse = restTemplate.getForEntity(url, Book.class);
		
		Book book = reponse.getBody();
		bookReponsitory.setBook(book);
		return new ResponseEntity<BookRepository>(bookReponsitory, HttpStatus.OK);
	}
	@PostMapping("/book")
	public ResponseEntity<BookRepository> bookRemoteBookAdd(@RequestBody Book bookf) {
		BookRepository bookReponsitory = new BookRepository();
		String url = "http://localhost:6969/api/v1/book";
		ResponseEntity<Book> reponse = restTemplate.getForEntity(url, Book.class);
		
		Book book = reponse.getBody();
		xuLyRepository.save(bookf);
		bookReponsitory.setBook(book);
		return new ResponseEntity<BookRepository>(bookReponsitory, HttpStatus.OK);
	}
}
