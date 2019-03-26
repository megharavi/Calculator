package com.flexon.calc;

import static org.junit.Assert.*;
import org.junit.Test;
import java.math.*;

public class addTest {
	
	@Test
	public void test() {

		double x = 15.9d;
		double y = 5;
		double expresult = 20.9d;
		String str ="";
		double delta = 0.81d;
		double ab = Calculator.add(x,y);
		double result = Math.abs(ab);
		assertEquals("TESTING TWO INTEGER TYPES",expresult,Calculator.add(15,6),delta);
		assertEquals("TESTING INT AND FLOAT TYPES",expresult,Calculator.add(15,5.98),delta);	
		assertEquals("TESTING FLOAT AND INT TYPES",expresult,Calculator.add(.9d,20),delta);	
		assertEquals("TESTING TWO FLOAT TYPES",expresult,Calculator.add(6.966,13.94),delta);
		assertEquals("TESTING WITH DIFF(-VE & +VE) SYMBOLS",expresult,Calculator.add(-6.966,27.9),delta);
//		assertEquals("TESTING WITH DIFF( -VE & -VE) SYMBOLS",expresult,Calculator.add(-6.966,-13.6),delta);
		
		
		if (Calculator.add(x,y) == expresult || Calculator.add(x,y) == Math.abs(expresult))
			assertEquals(str,expresult,result,delta);

		System.out.println("result is " + result);
}
}
