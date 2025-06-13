package com.jdc.hhk.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Registration implements Serializable{

	private static final long serialVersionUID = 1L;
	private LocalDate registredAt;
	private LocalDate validAt;
	
	//@ElementCollectons
	//List<String> tests;
	
}
