package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Chatroom
 */
@WebServlet("/Chatroom")
public class Chatroom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Chatroom() {
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
		//ArrayList chatrec=(ArrayList)getServletContext().getAttribute("chatrec");
		//String chatrec=(String)getServletContext().getAttribute("chatrec");
		//if(chatrec==null)
		//	out.println("error");
		//else
		//out.println(chatrec);
		//out.println("\n");
		try {
			    out.println("<html>\r\n" + 
			    		"<head>\r\n" + 
			    		"<title>chatting room</title>\r\n" + 
			    		"<center><h3><b>welcome to qiuge's chatting room</b></h3></center>\r\n" + 
			    		"</head>\r\n" + 
			    		"<body>\r\n" + 
			    		"<iframe src='ShowMsg' width='100%' height='70%'></iframe>\r\n"+
			    		"<iframe src='InputMsg' width='100%' height='30%'></iframe>\r\n"+
			    		//+ "<iframe src='count.jsp' width=100% height='10%'></iframe>\r\n"+
			   /* 		"    <form action='Msg'  method='post'>\r\n" + 
			    		"    <textarea name = 'showtextarea'  rows = '25'  cols='180'></textarea>\r\n" + 
			    		"    <br>\r\n" + 
			    		"    <textarea name = 'inputarea' rows='5' cols='180'></textarea>\r\n" + 
			    		"    <input type='submit'  value='submit'  name=submit>\r\n" + 
			    		"    <input type='reset'  value='reset' name='reset'>\r\n" + 
			    		"</form>\r\n" + 
			    		"</body>\r\n" + 
			    		"</html>\r\n" + */
			    		"</body>\r\n" + 
			    		"</html>");
		}finally {
			out.close();
		}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}