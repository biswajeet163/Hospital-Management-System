package com.hr.model;

public class Employee {

	public int id;
	public String Firstname;
	public String lastname;
	public String speciality;

	public Employee() {

	}

	public Employee(int id, String firstname, String lastname, String speciality) {
		this.id = id;
		Firstname = firstname;
		this.lastname = lastname;
		this.speciality = speciality;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
