//package com.flexon.calc;
//
//import static org.junit.Assert.assertEquals;
//
//import static org.junit.Assert.*;
//
//
//import org.junit.Test;
//
//public class divTest {
//	
//	
//	@Test
//	public void test() {
//
//		double x = 15;
//		double y = 5;
//		double expresult = 3.0d;
//		double delta = 0.89d;
//		double result = Calculator.div(x,y);
//		assertEquals("TESTING TWO INTEGER TYPES",expresult,Calculator.div(15,5),delta);
//		assertEquals("TESTING INT AND FLOAT TYPES",expresult,Calculator.div(15,5.05),delta);	
// 		assertEquals("TESTING TWO FLOAT TYPES",expresult,Calculator.div(8.9,3.2),delta);
//		assertEquals("TESTING WITH DIFF( -VE & -VE) SYMBOLS",expresult,Calculator.div(-50.89,-18.75),delta);
//		assertEquals(expresult,result,delta);
//		System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.div(-50.89,-18.752));
//
//
//	}
//
//		@Test
//		public void testfloat() {
//		double x = 1;
//		double y = 2;
//		double expresult1 = .5d;
//		double delta = 0.89d;
//		double result = Calculator.div(x,y);
//		assertEquals("TESTING FLOAT AND INT TYPES",expresult1,Calculator.div(.9,2),delta);
//		System.out.println("EXPECTED : " + expresult1 + " &  ACTUAL RESULT : " + Calculator.div(.9,2));
//		assertEquals(expresult1,result,delta);
//
//		}
//        
//		
//		@Test
//		public void testfloatneg() {
//		double x = -78;
//		double y = 20;
//		double expresult2 = -3.9d;
//		double delta = 0.89d;
//		double result = Calculator.div(x,y);
//		assertEquals("TESTING WITH DIFF(-VE & +VE) SYMBOLS",expresult2,Calculator.div(-7.966,2.4),delta);
//		System.out.println("EXPECTED : " + expresult2 + " &  ACTUAL RESULT : " + Calculator.div(-7.966,2.4));
//		assertEquals(expresult2,result,delta);
//		}
//	
//}
//
