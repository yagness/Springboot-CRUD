package com.onetoone.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.demo.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
	

}
