package com.jdc.hhk;

import org.junit.jupiter.api.Test;

import jakarta.persistence.Persistence;

public class JpaFactory {

	@Test
	void create() {
		var emf = Persistence.createEntityManagerFactory("class-mappings");
		var em = emf.createEntityManager();
	}
}
