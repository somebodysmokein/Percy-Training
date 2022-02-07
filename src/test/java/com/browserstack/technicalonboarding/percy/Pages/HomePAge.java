package com.browserstack.technicalonboarding.percy.Pages;

import org.openqa.selenium.WebDriver;

public class HomePAge extends AbstractPage{

private String title="Most Reliable App & Cross Browser Testing Platform | BrowserStack"; 
	
	private String url="/";
	
	public HomePAge(WebDriver driver) {
		super(driver);
		
	}
	public void goToUrl()
	{
		super.navigatetoUrl(super.baseUrl+url);
	}

	public String getHomeTitle()
	{
		return title;
	}

	
}
