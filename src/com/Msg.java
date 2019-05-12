package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Msg
 */
@WebServlet("/Msg")
public class Msg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Msg() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		request.setCharacterEncoding("gbk");
		response.setCharacterEncoding("gbk");
		PrintWriter out= response.getWriter();
		try {
			String text=request.getParameter("inputarea");
			Date now=new Date();
			SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = date.format(now);
			String username=(String)request.getSession().getAttribute("NAME");
			String chatting =time+"<br>"+username+"      ˵: "+text;
			//ArrayList chatrec=(ArrayList)getServletContext().getAttribute("chatrec");
			String chatrec=(String)getServletContext().getAttribute("chatrec");
			chatrec=chatrec+"<br>"+chatting;
			//int count=(Integer)getServletContext().getAttribute("count");
			//chatrec[count++]=chatting;
			//getServletContext().setAttribute("count",count);
			///chatrec.add((String)chatting);
			getServletContext().setAttribute("chatrec",chatrec);
			request.getRequestDispatcher("InputMsg").forward(request, response);
			//out.println(chatting);
			//String a=(String)getServletContext().getAttribute("chatrec");
			//out.println(a);
			//out.println(chatrec);
			// out.println(chatting);
		}
		finally {
			out.close();
		}
	}

}
