package com.onetoone.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_id")
	private Book book;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(int id, String name, Book book) {
		super();
		this.id = id;
		this.name = name;
		this.book = book;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", book=" + book + "]";
	}

	
	
	
	
}
