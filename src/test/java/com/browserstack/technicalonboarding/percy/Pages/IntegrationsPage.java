package com.browserstack.technicalonboarding.percy.Pages;

import org.openqa.selenium.WebDriver;

public class IntegrationsPage  extends AbstractPage{

private String title="Integrations with Automate for Testing | BrowserStack"; 
	
	private String url="/integrations/automate";
	
	public IntegrationsPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void goToUrl()
	{
		super.navigatetoUrl(super.baseUrl+url);
	}

	public String getIntegrationsTitle()
	{
		return title;
	}

}
