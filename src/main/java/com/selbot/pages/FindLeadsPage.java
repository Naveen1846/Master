package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class FindLeadsPage extends Annotations {
	
	public FindLeadsPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="(//input[@name='firstName'])[3]") WebElement eleFname;

	public FindLeadsPage searchByFname(String Name) {
		clearAndType(eleFname, Name);
		return this;
	}
	
	
	public FindLeadsPage clickFindLeads() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		return this;
	}
	
	public ViewLead selectLead() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new ViewLead();


	}
	


}
