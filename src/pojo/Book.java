package pojo;

import java.util.Date;

public class Book {
	private int book_id;
	private String book_bame;
	private String book_author;
	private String book_publish;
	private int book_page;
	private int book_price;
	private Date creation_time;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_bame() {
		return book_bame;
	}
	public void setBook_bame(String book_bane) {
		this.book_bame = book_bane;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_publish() {
		return book_publish;
	}
	public void setBook_publish(String book_publish) {
		this.book_publish = book_publish;
	}
	public int getBook_page() {
		return book_page;
	}
	public void setBook_page(int book_page) {
		this.book_page = book_page;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	public Date getCreation_time() {
		return creation_time;
	}
	public void setCreation_time(Date creation_time) {
		this.creation_time = creation_time;
	}
	public Book(String book_bame, String book_author, String book_publish, int book_page, int book_price) {
		super();
		this.book_bame = book_bame;
		this.book_author = book_author;
		this.book_publish = book_publish;
		this.book_page = book_page;
		this.book_price = book_price;
	}
	public Book() {
		super();
	}
	
}
