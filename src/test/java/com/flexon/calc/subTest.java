package com.flexon.calc;
import static org.junit.Assert.*;
//import org.junit.Test;
import org.testng.annotations.*;

public class subTest {
	
	
	
	@Test
	public void testIntsSub() {
		System.out.println("THIS IS TEST FOR SUBTRACTION.............................................................");			


		double x = 15;
		double y = 5d;
		double expresult = 10;
		double delta = 0.8d;
		double result = Calculator.sub(x,y);
		assertEquals("TESTING TWO INTEGER TYPES",expresult,Calculator.sub(67,57),delta);
		System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.sub(67,57));
		System.out.println("..........................................");
	}
	
		@Test
		public void testIntFloatSub() {
		double x = 15;
		double y = 5.5d;
		double expresult = 9.5d;
		double delta = 0.5d;
		double result = Calculator.sub(x,y);
		assertEquals("TESTING INT AND FLOAT TYPES",expresult,Calculator.sub(19,9.55),delta);	
		System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.sub(19,9.55));
		System.out.println("..........................................");
	}
		@Test
		public void testFloatIntSub() {
		double x = 15.5;
		double y = 5;
		double expresult = 9.5d;
		double delta = 0.5d;
		double result = Calculator.sub(x,y);
		assertEquals("TESTING FLOAT AND INT TYPES",expresult,Calculator.sub(18.9,9),delta);	
		System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.sub(18.9,9));
		System.out.println("..........................................");
	}
		@Test
		public void testFloatsSub() {
		double x = 15.9;
		double y = 5.5d;
		double expresult = 9.5d;
		double delta = 0.5d;
		double result = Calculator.sub(x,y);
		assertEquals("TESTING TWO FLOAT TYPES",expresult,Calculator.sub(9.9,0.2),delta);
		System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.add(9.9,0.2));
		System.out.println("..........................................");
	}
		@Test
		public void testNegPosSub() {
		double x = -15;
		double y = 5.5d;
		double expresult = -20.5d;
		double delta = 0.9d;
		double result = Calculator.sub(x,y);	
		assertEquals("TESTING WITH DIFF(-VE & +VE) SYMBOLS",expresult,Calculator.sub(-9.066,10.6),delta);
		System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.sub(-9.066,10.6));
		System.out.println("..........................................");
	}
		@Test
		public void testNegsSub() {
		double x = -15.5;
		double y = -5.5d;
		double expresult = -10d;
		double delta = 0.5d;
		double result = Calculator.sub(x,y);
		assertEquals("TESTING WITH DIFF( -VE & -VE) SYMBOLS",expresult,Calculator.sub(-10.89,-0.55),delta);
		System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.sub(-10.89,-0.55));
		System.out.println("..........................................");
	}
//		@BeforeTest
//		public void BeforeTest(){
//			System.out.println("this is test for subtraction");			
//	}

//		@AfterTest
//		public void AfterTest(){
//			System.out.println("AfterTest");			
//	}
}

