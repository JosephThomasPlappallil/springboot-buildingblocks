package com.stacksimplify.restservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	
	private Long id;
	@Column(name="EMP_NAME",nullable=false)
	private String employeename;
	@Column(name="FIRST_NAME",nullable=false)
	private String firstname;
	@Column(name="LAST_NAME",nullable=false)
	private String lastname;
	@Column(name="EMAIL",nullable=false)
	private String email;
	@Column(name="ROLE",nullable=false)
	private String role;
	@Column(name="SSN",nullable=false)
	private String ssn;
	public Employee() {
	}
	public Employee(Long id, String employeename, String firstname, String lastname, String email, String role, String ssn) {
		this.id = id;
		this.employeename = employeename;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeename=" + employeename + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", role=" + role + ", ssn=" + ssn + "]";
	}
	
	

}