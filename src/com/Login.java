package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("gbk");
		response.setCharacterEncoding("gbk");
		String userName="";
		String pwd="";
		String isChecked="";
		Cookie[] cookies=request.getCookies();
		if(cookies != null) {
		isChecked="checked";
		for(int i=0;i<cookies.length;i++) {
			if(cookies[i].getName().equals("userName"))
				userName=URLDecoder.decode(cookies[i].getValue(), "UTF-8");
			if(cookies[i].getName().equals("pwd"))
				pwd=cookies[i].getValue();
			}
		}
		response.setCharacterEncoding("gbk");
		request.setCharacterEncoding("gbk");
		PrintWriter out=response.getWriter();
		try {
			out.println("<html>\r\n" + 
					"<head>\r\n" +
					"<title>Chatting Room Login</title>\r\n"+
					"<center><b><font size=8>Login in</font></b></center>\r\n"+
					"<meta charset=\"gbk\" />\r\n" + 
					"    <style type=\"text/css\">\r\n" + 
					"    form{\r\n" + 
					"    text-align: center;  \r\n" + 
					"    border-radius: 20px;\r\n" + 
					"    width: 300px;\r\n" + 
					"    height: 350px;\r\n" + 
					"    margin: auto;\r\n" + 
					"    position: absolute;\r\n" + 
					"    top: 0;\r\n" + 
					"    left: 0;\r\n" + 
					"    right: 0;\r\n" + 
					"    bottom: 0;\r\n" + 
					"}\r\n" + 
					"</style>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"    <div class=\"form\">\r\n" + 
					"    <form action=\"RsLogin\" method=\"post\">\r\n" +  
					"         <p><b> 用户名：</b><input type='text'"+"name='userName' value='"+userName+"'><br><br>\r\n"+ 
					"         <b>密码:&nbsp;&nbsp;&nbsp;</b><input type='password'"+"name='pwd' value='"+pwd+"'></p>\r\n" + 
					"         <label><input name='SaveCookie'"+"type='checkbox'"+"value='yes'"+isChecked+"/>记住账号和密码</label>\r\n" +  
					"         <br><input type=\"submit\" name=\"submit\" value=\"提交\">     <input type=\"reset\" name=\"reset\" value=\"重置\"></br></br></br></br>\r\n" + 
					"</form>\r\n" + 
					"</div>\r\n" + 
					"</body>\r\n" + 
					"</html>");
		}finally{
			out.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}