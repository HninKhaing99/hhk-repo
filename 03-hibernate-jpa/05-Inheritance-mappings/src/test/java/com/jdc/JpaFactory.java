package com.jdc;

import org.junit.jupiter.api.Test;

import jakarta.persistence.Persistence;

public class JpaFactory {

	@Test
	void create() {
		var emf = Persistence.createEntityManagerFactory("05-Inheritance-mappings");
		emf.close();
	}
}
