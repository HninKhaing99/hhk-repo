package com.jdc.hhk.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer extends Account{

	private MemberType memberType;
	
	public Customer() {
		setAccountType(AccountType.CUSTOMER);
	}
	public Customer(MemberType memberType) {
		this.memberType = memberType;
		setAccountType(AccountType.CUSTOMER);
	}
	
	public enum MemberType{
		SILVER,GOLD,DIAMOND
	}
	
}
