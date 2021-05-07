package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.MainClass;

public class ValuesPage extends MainClass {

	@FindBy(id = "lbl_val_1")
	WebElement LblValue1;
	
	@FindBy(id = "lbl_val_2")
	WebElement LblValue2;
	
	@FindBy(id = "lbl_val_3")
	WebElement LblValue3;
	
	@FindBy(id = "lbl_val_4")
	WebElement LblValue4;
	
	@FindBy(id = "lbl_val_5")
	WebElement LblValue5;
	
	@FindBy(id = "lbl_ttl_val")
	WebElement LblTotalBalance;
	
	
	@FindBy(id = "txt_val_1")
	WebElement TxtValue1;
	
	@FindBy(id = "txt_val_2")
	WebElement TxtValue2;
	
	@FindBy(id = "txt_val_4")
	WebElement TxtValue4;
	
	@FindBy(id = "txt_val_5")
	WebElement TxtValue5;
	
	
	@FindBy(id = "txt_val_6")
	WebElement TxtValue6;
	
	@FindBy(id = "txt_ttl_val")
	WebElement TxtTotalValue;
	
	
	
	
	public ValuesPage()
	{
	PageFactory.initElements(driver, this);
		
	}
	
	
	public String getPageTitle() {
		
		return driver.getTitle();
	}
	
	public String getTxtVal_1() {
	
		return TxtValue1.getText();
	}
	
	public String getTxtVal_2() {
		
		return TxtValue2.getText();
	}
	
	public String getTxtVal_4() {
		
		return TxtValue4.getText();
	}
	
	
	public String getTxtVal_5() {
		
		return TxtValue5.getText();
	}
	
	public String getTxtVal_6() {
		
		return TxtValue6.getText();
	}
	
	public String TxtTotalValue() {
		
		return TxtTotalValue.getText();
	}
	
	
	
}
