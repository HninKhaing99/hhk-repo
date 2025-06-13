package com.jdc.hhk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class SaleDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int qty;
	private double total;//join table ko kwel sout lite tot htae chin tk column htae loh ya
	@ManyToOne
	private Sales sales;
	@ManyToOne
	private Product product;
	
}
