package kr.ac.hansung.ces;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet") // url 매핑
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
       super();
    }


    // index.html에서 넘긴 데이터 받아서 처리
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//동적 페이지 생성 (사용자의 입력에 따라 내용 달라짐)
		PrintWriter out = response.getWriter();
		String htmlResponse = "<html>";
		htmlResponse += "<h2>Yout username is "+username +"<br/>";
		htmlResponse += "<h2>Yout password is "+password +"<h2/>";
		htmlResponse +="</html>";
		out.println(htmlResponse);
	}
}
