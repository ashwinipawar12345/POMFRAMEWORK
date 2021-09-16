package com.wiki.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wiki.qa.base.Testbase;
import com.wiki.qa.pages.CreatAccountPage;
import com.wiki.qa.pages.Homepage;
import com.wiki.qa.pages.SearchPage;
import com.wiki.qa.pages.UploadPage;

public class CreateAccountTest extends Testbase{

	Homepage hp;
	SearchPage sp;
	CreatAccountPage cp;
	UploadPage up;
	public CreateAccountTest()
	{
		super();
	
	}
	@BeforeClass
	public void StartBrowser()
	{
		initialization();
		hp = new Homepage();
		hp.EnterText();
		sp = new SearchPage();
		sp.SearchPageTittle();
		sp.CAlinkClick();
		cp = new CreatAccountPage();
	}
	
	@Test(priority='1')
	public void CreateAccountPageInputTest()
	{
		cp.CreateAccountInput("sonal", "abc@123", "abc@123", "mail@gamil.com");
	}
	@Test(priority='2')
	public void uploadfileclickTest()
	{
	up=	cp.uploadfileclick();
	}
	
}
