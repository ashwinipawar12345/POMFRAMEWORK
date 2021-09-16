package com.wiki.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wiki.qa.base.Testbase;
import com.wiki.qa.pages.Homepage;
import com.wiki.qa.pages.SearchPage;


public class HomePageTest extends Testbase{
	Homepage hp;
	SearchPage sp;

	public HomePageTest()
	{
		super();
	}
	@BeforeClass
    public void startBrowser()
	{
		initialization();
		hp= new Homepage();
	}
	
	@Test(priority='1')
	public void pageTitleTest(){
		hp.PageTitle();
		
	}
	@Test(priority='2')
	public void elementsEnabledTest()
	{
		hp.ElementsEnabled();
		
	}
	@Test(priority='3')
	public void EntertextTest()
	{
	sp=	hp.EnterText();
		
	}

	
}
