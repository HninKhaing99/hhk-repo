package com.jdc.hhk.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Manager extends Account{

	public Manager() {
		setAccountType(AccountType.MANAGER);
	}
}
