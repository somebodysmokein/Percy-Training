package com.browserstack.technicalonboarding.percy.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.browserstack.technicalonboarding.percy.Pages.HomePAge;

public class TestHomePage extends TestRunner{

	@Test
	public void testHomePage()
	{
		HomePAge pg=new HomePAge(driver);
		pg.goToUrl();
		assertEquals(driver.getTitle(), pg.getHomeTitle());
		percy.snapshot("Home Page Test");
	}
}
