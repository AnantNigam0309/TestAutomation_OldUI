package com.shaw.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration_POF {
	
	@FindBy(xpath="//span[contains(text(),'Redeem a')]")
	 private WebElement Redeem;
	
	@FindBy(xpath="//div[@id='form-headings']/h1")
	 private WebElement Page1_header;
	
	@FindBy(id="first_name")
	 private WebElement First_Name;
	
	@FindBy(id="last_name")
	 private WebElement Last_name;
	
	@FindBy(id="email")
	 private WebElement Email;
	
	@FindBy(id="tel_number")
	 private WebElement Mobile_Number;
	
	@FindBy(id="voucher_code")
	 private WebElement Voucher_code;

	@FindBy(id="partner")
	 private WebElement partner;
	
	@FindBy(id="submit")
	 private WebElement Continue;
	
	@FindBy(id="ddlTimeZone")
	private WebElement TimeDateZone;
	
	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="password_confirm")
	private WebElement Conform_password;

	@FindBy(id="ddlGender")
	private WebElement Gender_Select;
	
	@FindBy(id="ddlAge")
	private WebElement Age_Select;
	
	@FindBy(id="ddlOccupation")
	private WebElement OldOccupation;
	
    @FindBy(id="next")
    private WebElement btn_Next;
	
    @FindBy(id="ddlBestTimeCall")
    private WebElement DayTim_Select;
    
    @FindBy(id="ddlLevel")
    private WebElement level_select;
    
    @FindBy(id="ddlExperience")
    private WebElement Experience_select;
    
    @FindBy(id="ddlTraining_objectives")
    private WebElement goal_select;
    
    @FindBy(id="ddlEducation")
    private WebElement EducationDegree_select;
    
    @FindBy(id="ddlEmployment")
    private WebElement Current_Position;
    
    @FindBy(xpath="//a[contains(text(),'My Courses')]/..")
    private WebElement My_Course;
   
    @FindBy(id="btnRespNav")
    private WebElement Menu;

    @FindBy(xpath="//ul[@class='userlist']//a[@href='/logout.php']")
    private WebElement Logout;
    
    @FindBy(xpath="//div[@class='about-features']//h1")
    private WebElement CourseName_MYCoursePage;
    
    @FindBy(id="course")
    private WebElement sel_course;
    
    @FindBy(xpath="//div[@class='userlogin']/a")
    private WebElement login_btn;
    
    @FindBy(id="user")
    private WebElement Username_Login;
    
    @FindBy(xpath="//ul[@class='usercourses']//a[1]")
    private WebElement usercourse_text;
    
    public WebElement getusercourse_text() {
		return usercourse_text;
	}
    
    public WebElement getUsername_Login() {
		return Username_Login;
	}

	public WebElement getPassword_Login() {
		return password_Login;
	}


	@FindBy(id="password")
    private WebElement password_Login;
    
    public WebElement getlogin_btn() {
		return login_btn;
	}
    
    public WebElement getsel_course() {
		return sel_course;
	}
    
    public WebElement getCourseName_MYCoursePage() {
		return CourseName_MYCoursePage;
	}

	public WebElement getLogout() {
		return Logout;
	}

    public WebElement getMenu() {
		return Menu;
	}
    
	public WebElement getMy_Course() {
		return My_Course;
	}


	public WebElement getCurrent_Position() {
		return Current_Position;
	}


	public WebElement getGoal_select() {
		return goal_select;
	}


	public WebElement getEducationDegree_select() {
		return EducationDegree_select;
	}


	public WebElement getDayTim_Select() {
		return DayTim_Select;
	}


	public WebElement getLevel_select() {
		return level_select;
	}


	public WebElement getExperience_select() {
		return Experience_select;
	}


	public WebElement getBtn_Next() {
		return btn_Next;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getConform_password() {
		return Conform_password;
	}


	public WebElement getGender_Select() {
		return Gender_Select;
	}


	public WebElement getAge_Select() {
		return Age_Select;
	}


	public WebElement getOldOccupation() {
		return OldOccupation;
	}


	public WebElement getRedeem() {
		return Redeem;
	}


	public WebElement getPage1_header() {
		return Page1_header;
	}


	public WebElement getFirst_Name() {
		return First_Name;
	}


	public WebElement getLast_name() {
		return Last_name;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getMobile_Number() {
		return Mobile_Number;
	}


	public WebElement getVoucher_code() {
		return Voucher_code;
	}


	public WebElement getPartner() {
		return partner;
	}


	public WebElement getContinue() {
		return Continue;
	}


	public WebElement getTimeDateZone() {
		return TimeDateZone;
	}


}
