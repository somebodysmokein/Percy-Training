package com.browserstack.technicalonboarding.percy.Pages;

import org.openqa.selenium.WebDriver;

public class PricijngPage extends AbstractPage{

private String title="BrowserStack Subscription Plans"; 
	
	private String url="/pricing";
	public PricijngPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void goToUrl()
	{
		super.navigatetoUrl(super.baseUrl+url);
	}

	public String getPricingTitle()
	{
		return title;
	}

}
