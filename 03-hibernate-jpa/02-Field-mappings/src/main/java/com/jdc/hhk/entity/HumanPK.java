package com.jdc.hhk.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class HumanPK implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nrc;
	private LocalDate dob;
	
}
