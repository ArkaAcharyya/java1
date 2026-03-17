package com.jpa_map.jpa_mp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_details")
public class Customer_details {
	@Id
	@Column
	private int id;
	
	@Column
	private String mobile;
	
	@Column
	private String address;
	
	@Column
	private String email;
	@OneToOne(mappedBy = "customer_details")
	private Customer customer;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer_details(int id, String mobile, String address, String email) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.address = address;
		this.email = email;
	}

	public Customer_details() {
		super();
	}
	class Xyz implements Cloneable {
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
	}
}
