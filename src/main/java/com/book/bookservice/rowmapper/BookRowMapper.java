package com.book.bookservice.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.book.bookservice.entity.Book;

public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		book.setBookId(rs.getInt("bookid"));
		book.setAuthorName(rs.getString("Author_name"));
		book.setPrice(rs.getInt("price"));
		book.setTitle(rs.getString("title"));
		return book;
	}

}
