package com.selbot.pages;

public class DuplicateLeadPage extends ViewLead {
	
	public DuplicateLeadPage NoOfEmployee() {
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		return this;
	}
	
	public DuplicateLeadPage SubmitDupLead() {
		driver.findElementByName("submitButton").click();
		return this;
	}

}
