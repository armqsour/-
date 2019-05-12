package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowMsg
 */
@WebServlet("/ShowMsg")
public class ShowMsg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowMsg() {
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
				+ "<head>\r\n"
				+ "<meta http-equiv='refresh' content='1'>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n");
		String chatrec=(String)getServletContext().getAttribute("chatrec");
		if(chatrec!=null)
			out.println(chatrec);
		else
			out.println("Message:");
		out.println("ÈËÊý£º");
			
		 //out.println("Online people:
	    String count=(String)getServletContext().getAttribute("count");
	    if(count==null)
	    	count="0";
	    //int c=Integer.parseInt(count);
	   out.println(count
		 		+ "<br>"
		 		+ "</body>\r\n"
		    	+ "</html>");
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		}
}
