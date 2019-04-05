package com.ayush;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lserv")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		int  id=Integer.parseInt(request.getParameter("eid"));
	String name="";
	    try{
	    	DBHelper db=new DBHelper();
	    	Emp e=db.getEmpInfo(id);
	    	if(e!=null)
	    	{
	    		name=e.getName();
	    		out.println("welcome"+name);
	    		
	    	   	
	    		
	    	}
	    	else
	    		out.print("Not Null");
	    	
	    }
	    catch(Exception ex){
	    	
	    	out.println(ex);
	    	
	    }

	     
		
	}
}
