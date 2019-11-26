package com.example.demo.model;

public class Employee {

	private long Id;
	private String name;
	private String position;
	private double salary;

	public Employee() {
	}

	public Employee(long id, String name, String position, double salary) {
		Id = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
