package com.book.bookservice.entity;

public class Book {
     private int bookId;
     private String authorName;
     private String title;
     private int price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String authorName, String title, int price) {
		super();
		
		this.authorName = authorName;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", authorName=" + authorName + ", title=" + title + ", price=" + price + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}