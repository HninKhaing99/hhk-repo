package com.jdc.hhk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {
//child table
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false,length = 45)
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Size size;
	
	private boolean active;
	
//	@ManyToOne//join column htwet
//	@JoinTable(name = "product_category_tbl",
//	inverseJoinColumns = {
//			@JoinColumn(name = "cat_id")
//	},
//	joinColumns  = {
//			@JoinColumn(name = "product_id")})
//	private Category category;//hna bat lone ko hmya kyi(p->oto , c->mto)
	
	@ManyToOne
	private Category category;//parent table
	
	public enum Size{
		SMALL,MEDIUM,LARGE
	}
	
}
