package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CreditCard")
public class CreditCardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CreditCardServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Acholdername = request.getParameter("acholdername");
		String Bankname = request.getParameter("bankname");
		String Acnumber = request.getParameter("acnumber");
		String Cvv = request.getParameter("cvv");
		String Month = request.getParameter("month");
		String Year = request.getParameter("year");
		
		out.println("Acholdername:"+Acholdername+"<br> Bankname:"+Bankname+"<br> Acnumber:"+Acnumber+"<br>Cvv:"+Cvv+"<br>Month:"+Month+"year:"+Year);
		out.close();
	}
	

}
