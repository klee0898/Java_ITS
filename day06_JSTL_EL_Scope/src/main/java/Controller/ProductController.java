package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
@WebServlet("/Prod.do")
public class ProductController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<String> lists = new ArrayList<>();
//		prodList.add("노트북");
		lists.add("노트북");
        lists.add("스마트폰");
        lists.add("냉장고");
		
		
		request.setAttribute("lists", lists);
		RequestDispatcher rd = request.getRequestDispatcher("fruits.jsp");
		rd.forward(request, response);
	}

}
