package com.onetoone.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onetoone.demo.entity.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer> {
	
	

}
