package com.browserstack.technicalonboarding.percy.Pages;

import org.openqa.selenium.WebDriver;

public class DocsPage extends AbstractPage{

	
	private String title="Developer Documentation Home | BrowserStack Docs"; 
	
	private String url="/docs";
	
	public DocsPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void goToUrl()
	{
		super.navigatetoUrl(super.baseUrl+url);
	}

	public String getDocsTitle()
	{
		return title;
	}
 

}
