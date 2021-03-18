package com.nashira.functionalprogramming.models;

public class User {

	private Integer id;
	private String name;
	private String lastname;

	private static int ultimoId;

	public User() {}

	public User(String name, String lastname) {
		id = ++ultimoId;
		this.name = name;
		this.lastname = lastname;
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", lastname=" + lastname + "]";
	}



}
