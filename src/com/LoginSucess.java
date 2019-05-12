package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginSucess
 */
@WebServlet("/LoginSucess")
public class LoginSucess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSucess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
		response.setCharacterEncoding("gbk");
		PrintWriter out =response.getWriter();
		out.println("<html>\r\n" + 
				"<head>\r\n" + 
				"<title>chatting room</title>\r\n" + 
				"<center><h3><b>welcome to dark dark chatting room</b></h3></center>\r\n" + 
				"<iframe name='2'  width='100%'  height='75%'  frameborder='1' scrolling='auto'  src='2.html' ></iframe>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <form action='LoginSucess'  method='post'>\r\n" + 
				"    Input area:<textarea name = 'textarea'  rows = '4'  cols='180'></textarea>\r\n" + 
				"    <input type='submit'  value='submit'  name=submit>\r\n" + 
				"    <input type='reset'  value='reset' name='reset'>\r\n" + 
				"</form>\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}
}

