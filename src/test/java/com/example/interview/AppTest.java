package com.example.interview;

import static org.testng.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	/**
	 * Test Method to test Remove all occurrences of "e" from "Suresh"
	 */
	@Test
	public void test1(){
		
		App testM1 = new App();
		String gh = testM1.replaceMethod1("Suresh",'e');
		Assert.assertEquals(gh,"Sursh");
		
	}
	
	/**
	 * Test Method to test Remove all occurrences of " " from "Suresh"
	 */
	@Test
	public void test2(){
		
		App testM1 = new App();
		String gh = testM1.replaceMethod1("Suresh",' ');
		Assert.assertEquals(gh.toString(),"Suresh");
		
	}
	
	/**
	 * Test Method to test Remove all occurrences of "Special Char" from "Suresh"
	 */
	@Test
	public void test3(){
		
		App testM1 = new App();
		String gh = testM1.replaceMethod1("Suresh",'$');
		Assert.assertEquals(gh.toString(),"Suresh");
		
	}
	
	
	@Test
	public void test7(){
		
		App testM1 = new App();
		String gh = testM1.replaceMethod1("Suresh Subramaniam",'a');
		Assert.assertEquals(gh.toString(),"Suresh Subrmnim");
		String gh2 = testM1.replaceMethod3("Suresh Subramaniam",'a');
		Assert.assertEquals(gh2,"Suresh Subrmnim");
		
	}
	
	
	@Test
	public void test8(){
		
		App testM1 = new App();
		String gh = testM1.replaceMethod2("Suresh Subramaniam",'a');
		Assert.assertEquals(gh.toString(),"Suresh Subrmnim");
		
	}
	
	
	/**
	 * Test Method to test Remove all occurrences of "Special Char" from "Suresh"
	 */
	@Test
	public void test4(){
		
		App testM1 = new App();
		String gh = testM1.replaceMethod2("Suresh",'$');
		Assert.assertEquals(gh,"Suresh");
		
	}
	
	/**
	 * Test for Char empty value
	 */
	
	@Test
	public void test5(){
		
		App testM1 = new App();
		String gh = testM1.replaceMethod2("Suresh",' ');
		Assert.assertEquals(gh,"Suresh");
		
	}
	
	/**
	 * Test for Char "e"
	 */
	@Test
	public void test6(){
		
		App testM1 = new App();
		String gh = testM1.replaceMethod2("Suresh",'e');
		Assert.assertEquals(gh,"Sursh");
		
	}

}
