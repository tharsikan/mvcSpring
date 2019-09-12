package com.sgic.dto;

import java.util.List;

public class Employee {
	private Integer id;
	private String name;
	private List dogs;
	public List getDogs() {
		return dogs;
	}
	public void setDogs(List dogs) {
		this.dogs = dogs;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	private Double salary;
}
