package com.flexon.calc;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

import org.junit.Test;

public class subTest {
	
	
	@Test
	public void test() {

		double x = 15;
		double y = 5.5d;
		double expresult = 9.5d;
		double delta = 0.5d;
		double result = Calculator.sub(x,y);
		
		assertEquals("TESTING TWO INTEGER TYPES",expresult,Calculator.sub(10,1),delta);
		assertEquals("TESTING INT AND FLOAT TYPES",expresult,Calculator.sub(19,9.55),delta);	
		assertEquals("TESTING FLOAT AND INT TYPES",expresult,Calculator.sub(18.9,9),delta);	
		assertEquals("TESTING TWO FLOAT TYPES",expresult,Calculator.sub(9.9,.2),delta);
//		assertEquals("TESTING WITH DIFF(-VE & +VE) SYMBOLS",expresult,Calculator.sub(-8.966,.5),delta);
//		assertEquals("TESTING WITH DIFF( -VE & -VE) SYMBOLS",expresult,Calculator.sub(-1.89,-7.05),delta);
				
		
		assertEquals(expresult,result,delta);

		System.out.println("result is " + result);
	}
}

