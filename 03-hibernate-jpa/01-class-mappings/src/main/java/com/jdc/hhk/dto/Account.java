package com.jdc.hhk.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.SecondaryTables;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "account_tbl",

		indexes = {
			@Index(columnList = "username")
		},
		uniqueConstraints = {
			@UniqueConstraint(columnNames = {"username"})
		}
		)//array nk let khan tr (annotation type ko let khan tl)

//@SecondaryTables({
//	@SecondaryTable(name = "address_tbl"),
//	@SecondaryTable(name = "cont_tbl")
//})

@SecondaryTable(name = "address_tbl")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private key loh thet hmate ya mk column 1 ku pr ko pr ya ml
	private int id;
	//@Column(nullable = false,unique = true)
	//java yk field names twe pyik ya ml
	//@Column(name = "user")
	private String username;
	private String password;
	@Column(table = "address_tbl" )//address table htae ko youk say chin loh
	private String city;
	@Column(table = "address_tbl" )
	private String township;
	@Column(table = "address_tbl" )
	private String street;
	private boolean active;
	@Embedded
	//java bat mr class 2 ku lo chin p db mr table 1 ku htae shi yin ya tk condition mr use
	private Contact contact;
}
