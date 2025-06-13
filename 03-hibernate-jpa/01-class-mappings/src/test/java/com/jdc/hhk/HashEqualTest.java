package com.jdc.hhk;

import java.io.Serializable;
import java.util.Objects;

import org.junit.jupiter.api.Test;

public class HashEqualTest {

	@Test
	void test() {
		Data d1 = new Data();
		d1.a = 5;
		Data d2 = new Data();
		d2.a = 5;
		
		System.out.println(d1 + "\t" + d2);
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
	}

class Data implements Serializable{
	private static final long serialVersionUID = 1L;
	int a;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getEnclosingInstance().hashCode();
		result = prime * result + Objects.hash(a);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
			return false;
		return a == other.a;
	}
	private HashEqualTest getEnclosingInstance() {
		return HashEqualTest.this;
	}
	
	
}
}
