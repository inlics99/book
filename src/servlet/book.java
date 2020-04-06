package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookService.bookService;
import bookService.impl.bookServiceImpl;
import pojo.Book;

/**
 * Servlet implementation class book
 */
@WebServlet("/book")
public class book extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private bookService bk=new bookServiceImpl(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public book() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String op=request.getParameter("op");
		if("show".equals(op)) {
			getAllBook(request,response);
		}else if("find".equals(op)) {
			find(request,response);
		}else if("add".equals(op)) {
			saveBook(request,response);
		}
	}

	private void saveBook(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String author=request.getParameter("author");
		String publish=request.getParameter("publish");
		int page=Integer.parseInt(request.getParameter("page"));
		int price=Integer.parseInt(request.getParameter("price"));
		//System.out.println(name+author+publish+page+price);
		Book book=new Book(name, author, publish, page, price);
		boolean isOk=bk.saveBook(book);
		if(isOk) {
			response.sendRedirect("book?op=show");
		}else {
			request.getRequestDispatcher("Add.jsp").forward(request, response);
		}
	}

	private void find(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		//request.setCharacterEncoding("UTF-8");
		int findType=Integer.parseInt(request.getParameter("findType"));
		String findName=request.getParameter("findName");
		List<Book> list=null;
		if("".equals(findName) || findName==null ) {
			list=bk.getAllBook();
		}else {
			list=bk.find(findType, findName);
		}
		request.getSession().setAttribute("lists", list);
		response.sendRedirect("index.jsp");
	}

	private void getAllBook(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		List<Book> list=bk.getAllBook();
		request.getSession().setAttribute("lists", list);
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
