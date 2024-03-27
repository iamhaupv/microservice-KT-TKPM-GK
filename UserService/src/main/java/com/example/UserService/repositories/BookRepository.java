package com.example.UserService.repositories;

import com.example.UserService.entities.Book;

public class BookRepository {
	private Book book;
	public BookRepository() {
		// TODO Auto-generated constructor stub
	}
	public BookRepository(Book book) {
		super();
		this.book = book;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "BookRepository [book=" + book + "]";
	}
}
