package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//
@WebServlet("/rdLogin.do")
public class RdLoginController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid = request.getParameter("uid");
		String pw = request.getParameter("pw");
		
	    // 로그인 정보 저장 (필수)
		if (uid.equals("test") && pw.equals("2521")) {
			
            response.sendRedirect("/day05_model2/index.jsp?uid="+uid); // 로그인 성공 시 index.jsp로 리다이렉트
        } else {
            response.sendRedirect("login/main.jsp"); // 로그인 실패 시 다시 로그인 페이지로 리다이렉트
          
        }
	}

}
