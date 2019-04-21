package com.selbot.testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.pages.LoginPage;
import com.selbot.testng.api.base.Annotations;

public class TC002_DuplicateLead extends Annotations {
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_DuplicateLead";
		testcaseDec = "Login, Create Lead and Verify";
		author = "Sarath";
		category = "smoke";
		excelFileName = "TC001";
	}

	@Test(dataProvider="fetchData")
	public void DupLead(String uName, String pwd, String asd, String ddd, String Name) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindlead()
		.searchByFname(Name)
		.clickFindLeads()
		.selectLead()
		.ClickDupLead()
		.NoOfEmployee()
		.SubmitDupLead();
	}
		
		
	}
	
	
