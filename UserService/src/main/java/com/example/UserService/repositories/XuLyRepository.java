package com.example.UserService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserService.entities.Book;

public interface XuLyRepository extends JpaRepository<Book, Integer>{

}
