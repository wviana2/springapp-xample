package com.util.apps.springapp.xample.model;

public class Customer {

	private String firstname;
	private String lastname;
	private String address;
	private String occupation;
	private String mobile;
	private String gender;
	private String idType;
	
	public Customer(String firstname, 
						String lastname, 
						String address, 
						String occupation,
						String mobile, 
						String gender, 
						String idType) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.occupation = occupation;
		this.mobile = mobile;
		this.gender = gender;
		this.idType = idType;
	}
	

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
}
