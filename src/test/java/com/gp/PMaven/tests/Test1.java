package com.gp.PMaven.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.gp.PMaven.pages.Page1;

public class Test1 extends Page1{

	

	@Test
	public void TestCase1()
	{
		
		System.out.println("Gaurav");
		openBrowser();
		verifyTitle();
		closeBrowser();
		
	}
	@Test
	public void display()
	{
		System.out.println("Gaurav ");
	}

	
}
