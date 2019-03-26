package com.flexon.calc;

import static org.junit.Assert.*;
import org.testng.annotations.*;   


//import org.junit.*;
//import org.junit.Test;
//import org.testng.annotations.*;

public class addTest {
	
		@Test
		public void testInts() {
			System.out.println("THIS IS TEST FOR ADDITION...................................................................");			
			Integer x = 15;
			Integer y = 5;
			Integer expresult = 20;
			String str ="";
			double delta = 0.81d;
			double result = Calculator.add(x,y);
			assertEquals("TESTING TWO INTEGER TYPES",result,Calculator.add(14,6),delta);
			System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.add(-6.966,-13.6));
			System.out.println("..........................................");
		}
		
		@Test
		public void testIntFloat() {
			Integer x = 15;
			double y = 5.9d;
			double expresult = 20.9d;
			String str ="";
			double delta = 0.81d;	
			double result = Calculator.add(x,y);
			assertEquals("TESTING INT AND FLOAT TYPES",expresult,Calculator.add(15,5.48),delta);
			System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.add(15,5.48));
			System.out.println("..........................................");
		}
		
		@Test
		public void testFloatInt() {
			double x = 15.5;
			Integer y = 5;
			double expresult = 20.5;
			String str ="";
			double delta = 0.81d;
			double result = Calculator.add(x,y);
			assertEquals("TESTING FLOAT AND INT TYPES",expresult,Calculator.add(.9d,19),delta);	
			System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.add(.9d,19));
			System.out.println("..........................................");
		}
		
		@Test
		public void testFloats() {
			double x = 15.9;
			double y = 5.9;
			Integer expresult = 21;
			String str ="";
			double delta = 0.81d;
			double result = Calculator.add(x,y);
			assertEquals("TESTING TWO FLOAT TYPES",expresult,Calculator.add(6.966,13.84),delta);
			System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.add(6.966,13.84));
			System.out.println("..........................................");
		}
		
		@Test
		public void test() {
			Integer x = -15;
			Integer y = 5;
			Integer expresult = 10;
			String str ="";
			double delta = 0.81d;
			double result = Calculator.add(x,y);
			assertEquals("TESTING WITH DIFF(-VE & +VE) SYMBOLS",expresult,Calculator.add(-6.966,17.0),delta);
			System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.add(-6.966,17.0));
			System.out.println("..........................................");
		}
	
		@Test
		public void testneg() {
			Integer x = -15 ;
			Integer y = -5 ;
			Integer expresult = -20;
			String str ="";
			double delta = 0.81d;
			double result = Calculator.add(x,y);
			Integer expresult1 = -20;
			assertEquals("TESTING WITH DIFF( -VE & -VE) SYMBOLS",expresult1,Calculator.add(-6.966,-13.6),delta);
			System.out.println("EXPECTED : " + expresult + " &  ACTUAL RESULT : " + Calculator.add(-6.966,-13.6));
			System.out.println("..........................................");
		}
//		@BeforeTest
//		public void BeforeTest(){
//			System.out.println("this is test for addition");			
//		}

//		@AfterTest
//		public void AfterTest(){
//			System.out.println("AfterTest");			
//		}
//		
		
}
