package dao;

import java.util.List;

import pojo.Book;

public interface BookMapper {
	public List<Book> getAllBook();
	public List<Book> findByBame(String name );
	public List<Book> findByAuthor(String name );
	public List<Book> findByPublish(String name );
}
