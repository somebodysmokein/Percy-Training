package com.browserstack.technicalonboarding.percy.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.browserstack.technicalonboarding.percy.Pages.HomePAge;
import com.browserstack.technicalonboarding.percy.Pages.IntegrationsPage;

public class TestIntegrations extends TestRunner{

	@Test
	public void testIntegrationsPage()
	{
		IntegrationsPage pg=new IntegrationsPage(driver);
		pg.goToUrl();
		assertEquals(driver.getTitle(), pg.getIntegrationsTitle());
		percy.snapshot("Integrations Page Test");
	}
}
