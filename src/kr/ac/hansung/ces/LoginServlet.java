package kr.ac.hansung.ces;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet") // url ����
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
       super();
    }


    // index.html���� �ѱ� ������ �޾Ƽ� ó��
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// read form data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//���� ������ ���� (������� �Է¿� ���� ���� �޶���)
		PrintWriter out = response.getWriter();
		String htmlResponse = "<html>";
		htmlResponse += "<h2>Yout username is "+username +"<br/>";
		htmlResponse += "<h2>Yout password is "+password +"<h2/>";
		htmlResponse +="</html>";
		out.println(htmlResponse);
	}
}
