package com.capgemini.employeeapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.employeeapp.dao.EmployeeDao;
import com.capgemini.employeeapp.dao.impl.EmployeeDaoImpl;

@WebServlet("/deleteEmployee")
public class DeleteEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao;
	private ServletContext context;

	public DeleteEmployeeController() {
		super();
		// employeeDao = new EmployeeDaoImpl();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		int empId = Integer.parseInt(request.getParameter("empid"));
	//	context.setAttribute("employeeDao", employeeDao);
		RequestDispatcher dispatcher = null;
		employeeDao = (EmployeeDao) context.getAttribute("employeeDao");

		if (employeeDao.deleteEmployee(empId)) {
			
			response.sendRedirect("getAllEmployees");
		}

		else {
			dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}
	}

}
