package bookService;

import java.util.List;

import pojo.Book;

public interface bookService {
	List<Book> getAllBook();
	List<Book> find(int type,String name);
	
}
