package com.browserstack.technicalonboarding.percy.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.browserstack.technicalonboarding.percy.Pages.IntegrationsPage;
import com.browserstack.technicalonboarding.percy.Pages.PricijngPage;

public class TestPricing extends TestRunner{

	@Test
	public void testPricingPage()
	{
		PricijngPage pg=new PricijngPage(driver);
		pg.goToUrl();
		assertEquals(driver.getTitle(), pg.getPricingTitle());
		percy.snapshot("Pricing Page Test");
	}
}
