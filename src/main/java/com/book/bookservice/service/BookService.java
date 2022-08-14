package com.book.bookservice.service;

import java.util.List;

import com.book.bookservice.entity.Book;

public interface BookService {
	
	//create
	
	//read-> by id /getAll
	//update
	//delete
	
	public Book createBook(Book book);
	public Book update(Book book);
	public boolean delete(int id);
	public Book getByteId(int id);
	
	public List<Book>  getAllBook();
	
	

}
