package com.ayush;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rserv")
public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String msg="";
	     int i=Integer.parseInt(request.getParameter("eid"));
		String name=request.getParameter("ename");
	    double sal=Double.parseDouble(request.getParameter("sal"));
	    try{
	    	
	    	DBHelper db=new DBHelper();
	    	int count=db.addEmp(i, name, sal);
	    	if(count>0)
	    	{
	    		out.print("Welcome "+name+" you succesfully registered..");
	    	}
	    	
	    }
	    catch(Exception e){
	    	
	    	out.print("GIRRAJ SOFTWARE TECHNOLOGY PVT LTD"+e);
	        
	    	
	    }
	}

}
