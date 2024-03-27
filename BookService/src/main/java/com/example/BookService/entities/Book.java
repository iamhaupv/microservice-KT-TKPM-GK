package com.example.BookService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subId;
	private String name;
	private String credit;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int subId, String name, String credit) {
		super();
		this.subId = subId;
		this.name = name;
		this.credit = credit;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	@Override
	public String toString() {
		return "Book [subId=" + subId + ", name=" + name + ", credit=" + credit + "]";
	}
}
