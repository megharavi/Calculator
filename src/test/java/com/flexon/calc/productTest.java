//package com.flexon.calc;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//public class productTest {
//	
//
//	@Test
//	public void test() {
//
//		double x = 5;
//		double y = 5.56d;
//		double expresult = 27.8d;
//		double delta = 01.1d;
//		double result = Calculator.mul(x,y);
//		assertEquals("TESTING TWO INTEGER TYPES",expresult,Calculator.mul(7,4),delta);
//		assertEquals("TESTING INT AND FLOAT TYPES",expresult,Calculator.mul(6,4.55),delta);	
//		assertEquals("TESTING FLOAT AND INT TYPES",expresult,Calculator.mul(6.9,4),delta);	
//		assertEquals("TESTING TWO FLOAT TYPES",expresult,Calculator.mul(9.9,2.7),delta);
////		assertEquals("TESTING WITH DIFF(-VE & +VE) SYMBOLS",expresult,Calculator.mul(-7.966,3.5),delta);
//		assertEquals("TESTING WITH DIFF( -VE & -VE) SYMBOLS",expresult,Calculator.mul(-3.89,-7.05),delta);
//				
//		assertEquals(expresult,result,delta);
//
//		System.out.println("result is " + result);
//	}
//}
//
