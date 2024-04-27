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

import com.onetoone.demo.entity.Book;
import com.onetoone.demo.repository.BookRepo;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookRepo bookrepo;
	
	@PostMapping("/add")
	public Book addBook(@RequestBody Book book)
	{
		bookrepo.save(book);
		return book;
	}
	
	@GetMapping("/all")
	public List<Book> getAll()
	{
		List<Book> lb = bookrepo.findAll();
		return lb;
	}
	
	@PutMapping("/update/{id}")
	public Book updateBook(@PathVariable int id,@RequestBody Book book)
	{
		Book b = bookrepo.findById(id).get();
		b.setBname(book.getBname());
		bookrepo.save(b);
		return b;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id)
	{
		Book book = bookrepo.findById(id).get();
		if(book!=null)
		{
			bookrepo.delete(book);
			return "Book " + id + " is deleted..";
		}
		else
		{
			return "Book not found";
		}
	}

}
