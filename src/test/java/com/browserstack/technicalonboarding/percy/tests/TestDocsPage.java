package com.browserstack.technicalonboarding.percy.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.browserstack.technicalonboarding.percy.Pages.DocsPage;

public class TestDocsPage extends TestRunner{

	@Test
	public void testDocsPage()
	{
		DocsPage pg=new DocsPage(driver);
		pg.goToUrl();
		assertEquals(driver.getTitle(), pg.getDocsTitle());
		percy.snapshot("Docs Page Test");
	}
}
