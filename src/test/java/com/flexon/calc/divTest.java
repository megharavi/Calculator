package com.flexon.calc;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;


import org.junit.Test;

public class divTest {
	
	
	@Test
	public void test() {

		double x = 15;
		double y = 5;
		double expresult = 3.0d;
		double delta = 0.89d;
		double result = Calculator.div(x,y);
		assertEquals("TESTING TWO INTEGER TYPES",expresult,Calculator.div(15,5),delta);
		assertEquals("TESTING INT AND FLOAT TYPES",expresult,Calculator.div(15,5.05),delta);	
//		assertEquals("TESTING FLOAT AND INT TYPES",expresult,Calculator.div(.9,2),delta);	
		assertEquals("TESTING TWO FLOAT TYPES",expresult,Calculator.div(8.9,3.2),delta);
//		assertEquals("TESTING WITH DIFF(-VE & +VE) SYMBOLS",expresult,Calculator.div(-6.966,2.4),delta);
		assertEquals("TESTING WITH DIFF( -VE & -VE) SYMBOLS",expresult,Calculator.div(-50.89,-18.75),delta);
		
		assertEquals(expresult,result,delta);

		System.out.println("result is " + result);
	}
}

