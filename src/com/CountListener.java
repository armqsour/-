package com;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class CountListener
 *
 */
@WebListener
public class CountListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
	private static int count=0;
    public CountListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	count++;
    	String cc=(String)se.getSession().getServletContext().getAttribute("count");
    	if(cc==null)
    		cc=se.getSession().getServletContext().getInitParameter("count");
    	cc=String.valueOf(count);
    	se.getSession().getServletContext().setAttribute("count",cc);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	count--;
    	se.getSession().getServletContext().setAttribute("count", count);
    }
    public static int  getcount() {
    	return count;
    }
	
}
