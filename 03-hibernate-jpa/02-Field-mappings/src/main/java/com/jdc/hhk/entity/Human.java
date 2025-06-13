package com.jdc.hhk.entity;

import java.time.LocalDate;

//import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@IdClass(HumanPK.class)
public class Human {

	@Id
	private String nrc;
	@Id
	private LocalDate dob;
	
	//@EmbeddedId
	//private HumanPK id;
	private String name;
	private Type type;

	public enum Type{
		STUDENT,EMPLOYEE;
	}
}
