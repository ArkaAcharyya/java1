package com.jpa_map.jpa_mp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column
	private int id;
	
	@Column
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_details")
	private Customer_details customer_Details;
	public Customer_details getCustomer_Details() {
		return customer_Details;
	}
	public void setCustomer_Details(Customer_details customer_Details) {
		this.customer_Details = customer_Details;
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Customer() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
