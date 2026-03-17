package com.Capg.spring;

public class Employee {
	private int id;
	private String name;
	private String gmail;
	private double salary;
	private Student student;
	public Employee(int id, String name, String gmail, double salary, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.gmail = gmail;
		this.salary = salary;
		this.student = student;
		System.out.println("Employee with arg constructor is called");
	}
	public Employee() {
		super();
		System.out.println("Employee with no arg constructor");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gmail=" + gmail + ", salary=" + salary + ", student="
				+ student + "]";
	}
	
//	public Employee() {
//		
//		System.out.println("Employee constructor called");
//	}
	
//	public Employee(int id, String name, String gmail, double salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.gmail = gmail;
//		this.salary = salary;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getGmail() {
//		return gmail;
//	}
//	public void setGmail(String gmail) {
//		this.gmail = gmail;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", gmail=" + gmail + ", salary=" + salary + "]";
//	}
//	
	
}
