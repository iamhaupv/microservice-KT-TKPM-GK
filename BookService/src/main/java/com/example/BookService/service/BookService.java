package com.example.BookService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.BookService.entities.Book;

@Service
public interface BookService {
	public List<Book> getAllBook();
	public Book add(Book book);
	public Book getBookById(int id);
}
