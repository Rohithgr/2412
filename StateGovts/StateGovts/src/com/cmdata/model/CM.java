package com.cmdata.model;



public class CM {
	
	private String id;
	
	private String name;
	
	private String qualification;
	
	private String state;
	
	private String date;
	
	private String party;

	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getQualification() {
		return qualification;
	}



	public void setQualification(String qualification) {
		this.qualification = qualification;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getParty() {
		return party;
	}



	public void setParty(String party) {
		this.party = party;
	}



	@Override
	public String toString() {
		return "CM [id=" + id + ", name=" + name + ", qualification=" + qualification + ", state=" + state + ", date="
				+ date + ", party=" + party + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getQualification()=" + getQualification() + ", getState()=" + getState() + ", getDate()="
				+ getDate() + ", getParty()=" + getParty() + "]";
	}
}