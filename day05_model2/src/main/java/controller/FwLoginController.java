package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.UserDTO;


@WebServlet("/fwLogin.do")
public class FwLoginController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uid = request.getParameter("uid");
		String pw = request.getParameter("pw");
		
		System.out.println(uid + "," +pw);
		
		UserDTO dto = new UserDTO(uid, pw);
		request.setAttribute("user", dto);

		if (uid.equals("test") && pw.equals("2521")) {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp"); 
            rd.forward(request, response);
        } else {
            response.sendRedirect("login/main.jsp"); // 로그인 실패 시 다시 로그인 페이지로 리다이렉트
        }
	}
}