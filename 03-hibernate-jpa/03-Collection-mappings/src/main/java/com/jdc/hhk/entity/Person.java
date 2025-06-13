package com.jdc.hhk.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.MapKeyEnumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "person_tbl")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false,length = 45)
	private String name;
	private int age;
	
	@ElementCollection //Collection use yin tet ko tet pay ya ml
	@CollectionTable(name = "jobs_tbl",
					joinColumns = {@JoinColumn(name = "id")})
	@Column(name = "valueCol")
	private Set<Registration> jobs;//collection yk sub interface
	
	@ElementCollection
	@CollectionTable(name = "hobbies_tbl",
			      joinColumns = {@JoinColumn(name = "id")})
    //collection type kyouk htwet lr mk join table name change tr
	private List<Registration> hobbies;//collection yk sub interface
	
	@ElementCollection
	@CollectionTable(name = "history_tbl",
			      joinColumns = {@JoinColumn(name = "id")})
	@MapKeyColumn(name = "his_key")
	@MapKeyEnumerated(EnumType.STRING)//ek dr ma thone pl enumerated thone yin ma change buu
	//map key enumerated use ma tinyint ma hok pl thu lo chin tk string type ko ya tr
	private Map<Worker,Registration> histories;
	
	@ElementCollection
	@CollectionTable(name = "worker_tbl")
	@Enumerated(EnumType.STRING)
	private List<Worker> workers;
}
