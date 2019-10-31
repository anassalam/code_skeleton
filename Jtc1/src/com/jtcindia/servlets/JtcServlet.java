package com.jtcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JtcServlet extends HttpServlet {
	
	String phone;
	String email;
	String state;
	String country;
	//service method is used for processing
	
	public void init(ServletConfig sc) {
		System.out.println("TestServlet -init()");
		
		//1.config paprameter particular jsp fix
	phone=sc.getInitParameter("Phone");
	email=sc.getInitParameter("Email");
	//2 context parameter application fix
	ServletContext ctx=sc.getServletContext();
	state=ctx.getInitParameter("state");
	country=ctx.getInitParameter("country");
		
	}
	
	public void service(HttpServletRequest req,HttpServletResponse res)	throws IOException,ServletException{
           System.out.println("testservice-service()");
			
			//3.request parameter
			String un=req.getParameter("uname");
			String pwd=req.getParameter("passward");
			
			//4display parameters
			
			PrintWriter out=res.getWriter();
			out.println("<h1>Username:" +un+ "</h1>");
			out.println("<h1>phone:" +phone+ "</h1>");
			out.println("<h1>email:" +email+ "</h1>");
			out.println("<h1>state:" +state+ "</h1>");
			out.println("<h1>Country:" +country+ "</h1>");
			
		}
	
		public void destroy() {
			System.out.println("testservlet-destroy()");
		
		}}
