package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");// setting the content type
		PrintWriter pw = res.getWriter();// get the stream to write the data
		
		String name = req.getParameter("name");

		// writing html in the stream
		pw.println("<html><body ><h2>");
		pw.println(name+"  Welcome to the SIVA's Kingdom");
		pw.println("</h2></body></html>");

		pw.close();// closing the stream

	}
}
