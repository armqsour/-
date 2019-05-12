package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RsLogin
 */
@WebServlet("/RsLogin")
public class RsLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RsLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
		response.setCharacterEncoding("gbk");
		String userID=request.getParameter("userName");
		if(userID==null) userID="";
		String userPWD=request.getParameter("pwd");
		if(userPWD==null) userPWD="";
		if(userID.equals("qiuge") && userPWD.equals("123") ||  userID.equals("haozai") && userPWD.equals("123"))
		{
		Cookie userCookie=new Cookie("userName",URLEncoder.encode(request.getParameter("userName"), "UTF-8"));
		Cookie pwdCookie=new Cookie("pwd",request.getParameter("pwd"));
		if(request.getParameter("SaveCookie")!=null&&request.getParameter("SaveCookie").equals("yes")){
			userCookie.setMaxAge(30*24*60*60);
			pwdCookie.setMaxAge(30*24*60*60);
			userCookie.setPath(request.getContextPath());
		    pwdCookie.setPath(request.getContextPath());
		}
		else {
			userCookie.setMaxAge(0);
			pwdCookie.setMaxAge(0);
		}
	    response.addCookie(userCookie);
		response.addCookie(pwdCookie);
		/*response.setContentType("text/html;charset=gbk");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("gbk");
		response.setCharacterEncoding("gbk");
		out.println("<!DOCTYPE HTML>");
		out.println("<html>");
		out.println("<head><title>login Servlet</title></head>");
		out.println("<body>");
		out.println("</body>");
		//out.println("wodiu");
		out.print("ª∂”≠"+request.getParameter("userName")+"∑√Œ ±æÕ¯’æ!");
		out.println("</html>");
		out.flush();
		out.close();*/
		HttpSession session=request.getSession(true);
		String name="";
		name=request.getParameter("userName");
		//String name=(String)session.getAttribute("NAME");
		session.setAttribute("NAME", name);
		int i=0;
		String []chatmsg;
		//ArrayList sayings;
		//ArrayList<String>chatrec=(ArrayList)getServletContext().getAttribute("chatrec");
		String chatrec=(String)getServletContext().getAttribute("chatrec");
		//int count=(Integer)getServletContext().getAttribute("count");
		//chatrec.add("wodiu");
		//System.out.println(chatrec);
		if(chatrec == null) {
			chatrec=getInitParameter("chatrec");
			//chatrec.add("nnn");
			//getServletContext().setAttribute("chatrec",chatrec);
			//getServletContext().setAttribute("count", count);
			getServletContext().setAttribute("chatrec", chatrec);	
		}
		RequestDispatcher dispatcher=
				request.getRequestDispatcher("Chatroom");
		dispatcher.forward(request,response);
	}
		PrintWriter out = response.getWriter();
		out.println("<html>\r\n"
				+ "<head>\r\n"
				+ "<title> login failed...</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<h1>please login again</h1>\r\n"+userID+userID.length());
		RequestDispatcher dispatcher=
				request.getRequestDispatcher("Login.html");
		dispatcher.include(request,response);
		out.println("<body>\r\n"
				+ "</html>");
    } 
}
