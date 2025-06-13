package com.jdc.hhk;

import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaFactory {

	static EntityManagerFactory emf;

	@Test
	void Test() {
		emf = Persistence.createEntityManagerFactory("Relationship-mappings");
	}
}
