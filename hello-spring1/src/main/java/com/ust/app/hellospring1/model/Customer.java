package com.ust.app.hellospring1.model;

public class Customer {

	private int id;
	private String Name;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer(int id, String name, String email) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
