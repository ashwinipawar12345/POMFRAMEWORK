package com.wiki.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiki.qa.base.Testbase;

public class Homepage extends Testbase{

	//Object repository, page Factory : to locate element and declare the webelement
	
	@FindBy(id="searchInput")
	WebElement searchInputBox;
	@FindBy(xpath="//*[@id=\'search-form\']/fieldset/button")
	WebElement inputbutton;
	
	
	//Class PageFactory
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	//Action Methods
	
	public void PageTitle()
	{
		String title = driver.getTitle();
		System.out.println("the page title is: " + title);
		
	}
	public void ElementsEnabled()
	{
		boolean enable = searchInputBox.isEnabled();
		System.out.println("The input box is enabled ?" + enable);
		boolean display = inputbutton.isEnabled();
		System.out.println("The input button is enabled ?" + display);
		
	}
	
	public SearchPage EnterText()
	{
		searchInputBox.sendKeys("SeleniumAutomation");
		inputbutton.click();
		return new SearchPage();
	}
}
