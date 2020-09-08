package com.admission.model;

public class Disese {

	public int id;
	public String Description;
	public String treatment;

	public Disese() {

	}

	public Disese(int id, String description, String treatment) {
		this.id = id;
		Description = description;
		this.treatment = treatment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

}
