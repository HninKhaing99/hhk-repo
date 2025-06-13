package com.jdc.hhk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String state;
	
	@Column(nullable = false)
	private String township;
	
	@Column(nullable = false)
	private String address;
	
//	@OneToOne
//	@JoinTable(name = "address_customer_tbl",
//	inverseJoinColumns = {
//			@JoinColumn(name = "cus_id")
//	},
//	joinColumns = {
//			@JoinColumn(name = "add_id")
//	}\
	
//	)
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Customer customer;
	
}
