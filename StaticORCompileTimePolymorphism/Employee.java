package com.StaticORCompileTimePolymorphism;

public class Employee 
{
	private int employeeId;
	private String employeeName;
	private String employeeRole;
	private double employeeSalary;
	
	public Employee() {
		employeeId =9876;
		employeeName = "rajesh";
		employeeRole = "SE";
		employeeSalary = 456789;
	}

	public Employee(int employeeId, String employeeName, String employeeRole, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
	}
	
	public void getDetails() {
		System.out.println(employeeId);
		System.out.println(employeeName);
		System.out.println(employeeRole);
		System.out.println(employeeSalary);
	}

}
