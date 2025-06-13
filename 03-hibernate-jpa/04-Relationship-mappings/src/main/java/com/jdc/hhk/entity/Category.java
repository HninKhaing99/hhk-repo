package com.jdc.hhk.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false,length = 45)
	private String name;
	
	//@OneToMany//join table htwet
	//@JoinColumn(name = "cat_id")//product htae mr category ko htae yay tr nk tutu pl
	/*
	 * when use join column,
	 * foreign key column will create on product table
	 */
	@OneToMany(mappedBy = "category")
	//thu lok ya mk work twe ma lok pl ta bat ka hr ko pl hlan yuu tr
	private List<Product> product;
	
	private boolean active;
}
