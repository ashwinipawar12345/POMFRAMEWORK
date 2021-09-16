package com.wiki.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wiki.qa.base.Testbase;

public class CreatAccountPage extends Testbase{
	
	@FindBy(id="wpName2")
	WebElement username;
   @FindBy(id="wpPassword2")
	WebElement pswad;
	@FindBy(id="wpRetype")
	WebElement retype;
	@FindBy(id="wpEmail")
	WebElement email;
	@FindBy(xpath="//*[@id=\'n-upload\']/a")
	WebElement uploadfile;

	
	public CreatAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action methods
	public void CreateAccountInput(String uname, String pass, String retyp, String mail)
	{
		username.sendKeys(uname);
		pswad.sendKeys(pass);
		retype.sendKeys(retyp);
		email.sendKeys(mail);
		
	}
	
	public UploadPage uploadfileclick()
	{
		uploadfile.click();
		
		return new UploadPage();
	}
}
