package com.eq.employee;

public class Employee {
	public int empID;
	public String empName;
	public double empSalary;
	public static String companyName = "EQ";

	public Employee(int empID, String empName, double empSalary) {
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public void printDetails(Employee emp) {
		System.out.println("ID: " + emp.empID);
		System.out.println("Name: " + emp.empName);
		System.out.println("Salary: " + emp.empSalary);
		System.out.println("Company: " + companyName);
	}

}
