package com.book.bookservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.bookservice.entity.Book;
import com.book.bookservice.service.BookServiceIMPL;

//@Controller
@RestController
@RequestMapping("/api/book/")
public class BookController {
	
	//@RequestMapping(value="/",method =RequestMethod.GET)
	

	// @ResponseBody
	 //public String getBookDetail() {
	 
	// return "new Book"; }
	 

	// @Controller+@ResponseBody = @restController
	// @RequestMapping(value="/",method =RequestMethod.GET)

	@Autowired

	private BookServiceIMPL bookServiceIMPL;

	@GetMapping("/")
	//@PostMapping("/")
	public List<Book> getBookDetails() {

	   List<Book> book = bookServiceIMPL.getAllBook();

		//List<Book> book = new ArrayList<>();

		/*Book book1 = new Book(1, "Abhimanyu", "title", 10);
		Book book2 = new Book(2, "Abhimanyu1", "title1", 100);
		Book book3 = new Book(3, "Abhimanyu2", "title2", 1000);
		Book book4 = new Book(4, "Abhimanyu3", "title3", 10000);

		book.add(book1);
		book.add(book2);
		book.add(book3);
		book.add(book4);*/
		return book;

	}
	@GetMapping("/{id}")
	//@PostMapping("/")
	public Book getBookDetail(@PathVariable("id") int id) {

	   Book book = bookServiceIMPL.getByteId(id);
	   return book;
	}
	
	@PostMapping("/")
	public Book createBook(@RequestBody Book book) {
		Book book1 = bookServiceIMPL.createBook(book);
		return book1;
	}
	@DeleteMapping("/id")
	public void  deleteByID(@PathVariable("id") int id) {

		    bookServiceIMPL.getByteId(id);
		   
	
}
}

