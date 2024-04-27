package com.onetoone.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String bname;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String bname) {
		super();
		this.id = id;
		this.bname = bname;
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
	 * @return the bname
	 */
	public String getBname() {
		return bname;
	}
	/**
	 * @param bname the bname to set
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + "]";
	}
	
	
}
