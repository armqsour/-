package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputMsg
 */
@WebServlet("/InputMsg")
public class InputMsg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputMsg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setCharacterEncoding("gbk");
		request.setCharacterEncoding("gbk");
		PrintWriter out=response.getWriter();
		out.println("<html>\r\n"
				+ "<body>\r\n"
				+"<form action='Msg' method='post' >\r\n"
		        +"<textarea name = 'inputarea' rows='5' cols='220'></textarea>\r\n"
		        +"<br><br><input type='submit'  value='submit'  name=submit>\r\n"
	    		+"<input type='reset'  value='reset' name='reset'>\r\n" 
		        +"</form>\r\n"
		        + "</body>\r\n"
		        + "</html>"
				);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
