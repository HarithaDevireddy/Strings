package com.Lab2.StringExercise;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class PositiveStringTest {
    private PositiveString positiveString;
    
    @Before
	public void setup() {
		positiveString =new PositiveString();
	}
    @Test
	public void test_getString_Is_GivenEmpty_ShouldReturn_Empty_String() {
    	String str[]= {};
		String result= positiveString.getSort(str);
		assertEquals(null,result);
		
	}
    @Test
	public void test_getString_Is_GivenPositiveString_ShouldCheck_Positive_String() {
    	String str[]= {"abc"};
		String result= positiveString.getSort(str);
		assertEquals("positive string",result);
		
	}
    @Test
	public void test_getString_Is_GivenNegativeString_ShouldCheck_Negative_String() {
    	String str[]= {"acdec"};
		String result= positiveString.getSort(str);
		assertEquals("negative string",result);
		
	}
	
    
}
