package bookService.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import bookService.bookService;
import conmmons.MyBatisUtils;
import dao.BookMapper;
import pojo.Book;

public class bookServiceImpl implements bookService {
	private SqlSession SqlSession;
	private BookMapper bkm;
	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		SqlSession=MyBatisUtils.createSqlSession();
		List<Book> list=SqlSession.getMapper(BookMapper.class).getAllBook();
		MyBatisUtils.close(SqlSession);
		return list;
	}
	@Override
	public List<Book> find(int type, String name) {
		// TODO Auto-generated method stub
		SqlSession =MyBatisUtils.createSqlSession();
		List<Book> list=null;
		if(type ==3) {
			list=SqlSession.getMapper(BookMapper.class).findByPublish(name);
		}else if(type ==2) {
			list=SqlSession.getMapper(BookMapper.class).findByAuthor(name);
		}else {
			list=SqlSession.getMapper(BookMapper.class).findByBame(name);
		}
		MyBatisUtils.close(SqlSession);
		return list;
	}
	@Override
	public boolean saveBook(Book book) {
		// TODO Auto-generated method stub
		SqlSession =MyBatisUtils.createSqlSession();
		int result=SqlSession.getMapper(BookMapper.class).saveBook(book);
		if(result>0) {
			SqlSession.commit();
			return true;
		}
		MyBatisUtils.close(SqlSession);
		return false;
	}
	
}
