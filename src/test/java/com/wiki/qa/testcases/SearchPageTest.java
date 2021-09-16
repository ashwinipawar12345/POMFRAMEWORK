package com.wiki.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wiki.qa.base.Testbase;
import com.wiki.qa.pages.CreatAccountPage;
import com.wiki.qa.pages.Homepage;
import com.wiki.qa.pages.SearchPage;

public class SearchPageTest extends Testbase{
	Homepage hp;
	SearchPage sp;
	CreatAccountPage cp;
	public SearchPageTest()
	{
		super();
	}
	@BeforeClass
	public void startbrowser()
	{
		initialization();
		hp = new Homepage();
		hp.EnterText();
		sp = new SearchPage();
	}
	@Test(priority='1')
  public void SearchPageTitleTest()
  {
		sp.SearchPageTittle();
  }
	@Test(priority='2')
	public void searchBtnClick()
	{
		sp.searchBtnClick();
	}
	@Test(priority='3')
	public void CalinkClickTest()
	{
		cp=sp.CAlinkClick();
	}
}
