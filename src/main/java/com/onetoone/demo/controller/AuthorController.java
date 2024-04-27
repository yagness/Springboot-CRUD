package com.onetoone.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.demo.entity.Author;
import com.onetoone.demo.repository.AuthorRepo;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	AuthorRepo authorrepo;
	
	@PostMapping("/add")
	public Author addAuthor(@RequestBody Author author)
	{
		Author auth = authorrepo.save(author);
		return auth;
	}
	
	@GetMapping("all")
	public List<Author> getAll()
	{
		List<Author> la = authorrepo.findAll();
		return la;
	}
	
	@PutMapping("/update/{id}")
	public Author updateAuthor(@PathVariable int id,@RequestBody Author author)
	{
		Author auth = authorrepo.findById(id).get();
		auth.setName(author.getName());
		authorrepo.save(auth);
		return auth;
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteAuthor(@PathVariable int id)
	{
		Author author = authorrepo.findById(id).get();
		if(author!=null)
		{
			authorrepo.delete(author);
			return "Author " + id + " is deleted..";
		}
		else
		{
			return "Author not found";
		}
	}
}
