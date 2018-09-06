package com.capgemini.employee.domain;



	public class Employee {
		private String employeeName;
		private String nameOfTheDepartment;
		private double salary;
		private int employeeId;
		public Employee() {
			super();
			
		}
		public Employee(String employeeName, String nameOfTheDepartment, double salary, int employeeId) {
			super();
			this.employeeName = employeeName;
			this.nameOfTheDepartment = nameOfTheDepartment;
			this.salary = salary;
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getNameOfTheDepartment() {
			return nameOfTheDepartment;
		}
		public void setNameOfTheDepartment(String nameOfTheDepartment) {
			this.nameOfTheDepartment = nameOfTheDepartment;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		
		
		
		
		

	}



