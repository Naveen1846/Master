package com.selbot.pages;


public class ViewLead extends FindLeadsPage {
	
	public DuplicateLeadPage ClickDupLead() {
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicateLeadPage();
	}

}
