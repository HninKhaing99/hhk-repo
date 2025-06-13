package com.jdc.hhk;

import org.junit.jupiter.api.Test;

import jakarta.persistence.Persistence;

public class JpaFactory {

	@Test
	void test() {
		var emf = Persistence.createEntityManagerFactory("Field-mappings");
		emf.close();
	}
}
