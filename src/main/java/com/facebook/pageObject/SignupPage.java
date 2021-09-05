package com.facebook.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.facebook.utility.BaseClass;

public class SignupPage extends BaseClass {

	@FindBy(how=How.NAME,using="firstname")
	private WebElement nametxtbox;
	
	@FindBy(how=How.NAME,using="lastname")
	private WebElement surnametxtbox;
	
	@FindBy(how=How.NAME,using="reg_email__")
	private WebElement emailtxtbox;
	
	@FindBy(how=How.NAME,using="reg_passwd__")
	private WebElement passtxtbox;
	
	@FindBy(how=How.ID,using="day")
	private WebElement daylistbox;
	
	@FindBy(how=How.ID,using="month")
	private WebElement monthlistbox;
	
	@FindBy(how=How.ID,using="year")
	private WebElement yearlistbox;
	
	@FindBy(how=How.ID,using="u_4_2_Z4")
	private WebElement male_radiobtn;
	
	@FindBy(how=How.ID,using="u_4_3_K6")
	private WebElement female_radiobtn;
	
	@FindBy(how=How.ID,using="u_4_4_Qx")
	private WebElement custom_radiobtn;
	
	@FindBy(how=How.ID,using="u_4_s_fv")
	private WebElement signup_btn;
	
	public SignupPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement nameTxtBox() {
		return nametxtbox;	
	}
	public WebElement surnameTxtBox() {
		return surnametxtbox;
	}
	public WebElement emailTxtBox() {
		return emailtxtbox;
	}
	public WebElement passwordTxtBox() {
		return passtxtbox;
	}
	public WebElement dayListBox() {
		return daylistbox;
	}
	public WebElement monthListBox() {
		return monthlistbox;
	}
	public WebElement yearListBox() {
		return yearlistbox;
	}
	public WebElement maleRadioBtn() {
		return male_radiobtn;
	}
	public WebElement femaleRadioBtn() {
		return female_radiobtn;
	}
	public WebElement cutomRadioBtn() {
		return custom_radiobtn;
	}
	public WebElement signupBtn() {
		return signup_btn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
