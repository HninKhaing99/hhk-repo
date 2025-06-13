package com.jdc.hhk.dto;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
//value same tr nk object same tl so tr myo pyik say chin loh
//Id htae sayar ma lo
//embeddable so yin serializable lok poh lo p yin hash and equal ko overwrite lpk po lo
public class Contact implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String phone;
	private String email;
}
