package com.jdc.hhk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee extends Account{

	@ManyToOne
	private Department department;
	
	public Employee() {
		setAccountType(AccountType.EMPLOYEE);
	}
	
	public Employee(Department department) {
		this.department = department;
		setAccountType(AccountType.EMPLOYEE);
	}
}
