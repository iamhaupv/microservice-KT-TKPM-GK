package com.example.BookService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookService.entities.Book;
import com.example.BookService.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository repository;
	@Override
	public List<Book> getAllBook() {
		return repository.findAll();
	}

	@Override
	public Book add(Book book) {
		return repository.save(book);
	}

	@Override
	public Book getBookById(int id) {
		return repository.findById(id).get();
	}
	
}
