package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.employee.domain.Employee;


@WebServlet("/Employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public EmployeeServlet() {
        super();
       
    }
    private ArrayList<Employee> employee=new ArrayList<>();
    @Override
    public void init() throws ServletException {
    	employee.add(new Employee("Naveena","IT",30000,157690));
    	employee.add(new Employee("Siri","IT",35000,157691));
    	employee.add(new Employee("Rama","IMS",45000,157601));
    	employee.add(new Employee("Sathyam","BU",55000,152601));
    	employee.add(new Employee("Shubam","BU",25000,162601));
    	
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String employeeId = request.getParameter("EmployeeId");
		int empid = Integer.parseInt(employeeId);		
		int count = 0;
			for (Employee emp : employee) {
				if(emp.getEmployeeId()==empid){
					count = 1;
					out.print("<style> table,th,td { border: 1px solid black; border-collapse:collapse; } th,td {padding: 10px;}</style>");
					out.println("<table> <tr> <th>EmployeeName</th> <th>NameOfTheDepartment</th> <th>Salary</th> </tr>");
					out.println("<tr><td>"+emp.getEmployeeName()+"</td> <td>"+emp.getNameOfTheDepartment()+"</td> <td>"+emp.getSalary()+"</td> </tr>");
					
				}
				
			}
			if(count==0)
			{
				out.println("<h3>Id not found</h3>");
			}
			out.close();
			
		}
		
	
	}


