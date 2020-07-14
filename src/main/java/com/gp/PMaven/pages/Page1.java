package com.gp.PMaven.pages;

import java.io.IOException;

import org.testng.Assert;

import com.gp.PMaven.base.BaseClass;

public class Page1 extends BaseClass{

	
	
	public void verifyTitle()
	{
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google");
	}
}
