package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comm.telecom.resources.CommonActtions;

public class AddCustomerPage extends CommonActtions{
	
	public AddCustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[text()='Add Customer'])[1]")
	private WebElement addcustomerbutton;

	@FindBy(xpath="//label[text()='Done']")
	private WebElement donebutton;
	
	@FindBy(id="fname")
	private WebElement fname;
	
	@FindBy(id="lname")
	private WebElement lname;
	
	@FindBy(id="email")
	private WebElement emaile;
	
	@FindBy(name="addr")
	private WebElement addr;
	
	@FindBy(id="telephoneno")
	private WebElement telephoneno;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	@FindBy(xpath="//*[text()='Access Details to Guru99 Telecom']")
	private WebElement message;

	public WebElement getMessage() {
		return message;
	}

	public WebElement getAddcustomerbutton() {
		return addcustomerbutton;
	}

	public WebElement getDonebutton() {
		return donebutton;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmaile() {
		return emaile;
	}

	public WebElement getAddr() {
		return addr;
	}

	public WebElement getTelephoneno() {
		return telephoneno;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
