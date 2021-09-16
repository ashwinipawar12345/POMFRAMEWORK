package com.wiki.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiki.qa.base.Testbase;

public class SearchPage extends Testbase{
	//ObectRepository
	
	@FindBy(xpath="//*[@id=\"mw-search-top-table\"]/div/div/div/span/span/button/span[2]")
	WebElement searchbtn;
	@FindBy(linkText="Create account")
	WebElement Clink;
	
 public SearchPage()
 {
	 PageFactory.initElements(driver, this); 
	 }
 
 //ActionMethds
 public void SearchPageTittle()
 {
	 System.out.println("title of the page is" + driver.getTitle());
	 
 }
  public void searchBtnClick()
  {
	  searchbtn.click();
  }
  
  public CreatAccountPage CAlinkClick()
  {
	  Clink.click();
	  
	  return new CreatAccountPage();
  }
 
 
}
