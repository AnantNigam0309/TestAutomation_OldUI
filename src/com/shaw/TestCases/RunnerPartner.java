package com.shaw.TestCases;

import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shaw.Generic.BComp;
import com.shaw.Generic.Constant;
import com.shaw.Generic.RandomString;
import com.shaw.PageObject.Partner_POF;
import com.shaw.PageObject.Registration_POF;

public class RunnerPartner {
	Registration_POF DSet;
	Partner_POF partner;
	RandomString res=new RandomString(5);
	
	@DataProvider(name="data")
	public Object[][] getdata(Method name){
		Object[][] obj =null;
			if(name.getName().equalsIgnoreCase("First_Page_Registration")){
			obj =new Object[2][11];
			obj[0][0]="Diploma in Photography";
			obj[0][1]="English";
			obj[0][2]="Male";
			obj[0][3]="18-21";
			obj[0][4]="Arts";
			obj[0][5]="9am-1pm";
			obj[0][6]="Intermediate";
			obj[0][7]="0-1years";
			obj[0][8]="To generate a second income";
			obj[0][9]="Postgraduate";
			obj[0][10]="Student";
			
			obj[1][0]="Diploma in Photography";
			obj[1][1]="English";
			obj[1][2]="Male";
			obj[1][3]="18-21";
			obj[1][4]="Arts";
			obj[1][5]="9am-1pm";
			obj[1][6]="Intermediate";
			obj[1][7]="0-1years";
			obj[1][8]="To generate a second income";
			obj[1][9]="Postgraduate";
			obj[1][10]="Student";
			}
			if(name.getName().equalsIgnoreCase("Login_test")){
				obj=new Object[2][2];
				obj[0][0]="anant98@mailinator.com";
				obj[0][1]="Diploma in Digital Marketing";
				obj[1][0]="test.case1@mailinator.com";
				obj[1][1]="Diploma in Digital Marketing";
				//Photography
				
				
			}
		
		return obj;
	}
	

	@BeforeClass
	  public void beforeClass() {
		Constant.driver=new FirefoxDriver();
		DSet = PageFactory.initElements(Constant.driver , Registration_POF.class);
		partner=PageFactory.initElements(Constant.driver, Partner_POF.class);
	  }
	
	@Parameters("Partner_Name")
	@BeforeMethod
	  public void beforeMethod(String Partner_Name) {
		 String Partner_URL=Constant.URL+"/"+Partner_Name;
		 Constant.driver.get(Constant.PartnerURL_virginmobile);
		 BComp.waitForPageToLoad();
	  }

	
	@Test(dataProvider="data")
	 public void First_Page_Registration(String Course,String language, String Sex,String Age,String Occupation,String Day_Time , String Level , String Experience,String Goal,String Edu_Degree,String current_position) throws InterruptedException{
		String res1=BComp.match_text();
		if(res1.equalsIgnoreCase("FALSE")){Assert.fail();}
		List<WebElement> list_coursename=partner.getall_courses();
		List<WebElement> list_select=partner.getSelect_btn();
		partner.getGo_down().click();
		BComp.selectCourseFromPartnerPage(list_coursename,list_select,"Digital Marketing");
		
		/*
		DSet.getRedeem().click();
		BComp.waitForPageToLoad();
		String Actual_Text=DSet.getPage1_header().getText();
		String Expected_Text="You're about to join the Future of Education";
		if(Actual_Text.equalsIgnoreCase(Expected_Text)){}else{Assert.fail();}
		
		BComp.waitForElement(DSet.getFirst_Name());
		String res2=BComp.match_text();
		if(res2.equalsIgnoreCase("FALSE")){Assert.fail();}
		
		String FName=res.nextString();
		String Lname=res.nextString();
		String Email=FName+"_"+Lname+"@mailinator.com";
		DSet.getFirst_Name().sendKeys(FName);
		DSet.getLast_name().sendKeys(Lname);
		DSet.getEmail().sendKeys(Email);
		DSet.getMobile_Number().sendKeys(res.nextnumber());
		DSet.getVoucher_code().sendKeys(FName+Lname);
		BComp.Scroll_Window();
		DSet.getContinue().click();
		
		BComp.waitForElement(DSet.getPartner());
		String actual_placeholder=DSet.getPartner().getAttribute("placeholder");
		if(actual_placeholder.equalsIgnoreCase(Constant.Expected_placeholder)){}else{Assert.fail();}
      
		
		BComp.Scroll_Window();
		Thread.sleep(2000);
		new Select(DSet.getsel_course()).selectByVisibleText(Course);
      DSet.getPartner().sendKeys(FName);
      DSet.getContinue().click();
      
      String res_page2=BComp.match_text();
		if(res_page2.equalsIgnoreCase("FALSE")){Assert.fail();}
		
		
		new Select(DSet.getTimeDateZone()).selectByVisibleText(language);
		BComp.waitForPageToLoad();
		
		String res_page3=BComp.match_text();
		if(res_page3.equalsIgnoreCase("FALSE")){Assert.fail();}
		DSet.getContinue().click();
		
		String res_page4=BComp.match_text();
		if(res_page4.equalsIgnoreCase("FALSE")){Assert.fail();}
		
		DSet.getPassword().sendKeys(Constant.Password);
		DSet.getConform_password().sendKeys(Constant.Password);
		new Select(DSet.getGender_Select()).selectByVisibleText(Sex);
		new Select(DSet.getAge_Select()).selectByVisibleText(Age);
		new Select(DSet.getOldOccupation()).selectByVisibleText(Occupation);
		
		
		DSet.getBtn_Next().click();
		Actions act=new Actions(Constant.driver);
		act.moveToElement(DSet.getBtn_Next()).click().perform();
		BComp.waitForPageToLoad();
		new Select(DSet.getDayTim_Select()).selectByVisibleText(Day_Time);
		new Select(DSet.getLevel_select()).selectByVisibleText(Level);
		new Select(DSet.getExperience_select()).selectByVisibleText(Experience);
		
		DSet.getBtn_Next().click();
		BComp.waitForPageToLoad();
		String res_page5=BComp.match_text();
		if(res_page5.equalsIgnoreCase("FALSE")){Assert.fail();}
		new Select(DSet.getGoal_select()).selectByVisibleText(Goal);
		new Select(DSet.getEducationDegree_select()).selectByVisibleText(Edu_Degree);
		
		DSet.getBtn_Next().click();
		new Select(DSet.getCurrent_Position()).selectByVisibleText(current_position);
		DSet.getContinue().click();
	    
		BComp.waitForPageToLoad();
		String My_CoursePage=BComp.match_text();
		if(My_CoursePage.equalsIgnoreCase("FALSE")){Assert.fail();}

		String CourseName=DSet.getCourseName_MYCoursePage().getText();
		if(CourseName.equalsIgnoreCase(Course)){}else{Assert.fail();}

		DSet.getLogout().click();   */
	 }
	/*
	@Test(dataProvider="data")
	public void Login_test(String Username, String Course){
		BComp.waitForPageToLoad();
		DSet.getlogin_btn().click();
		BComp.waitForPageToLoad();
		DSet.getUsername_Login().sendKeys(Username);
		DSet.getPassword().sendKeys(Constant.Password);
		DSet.getContinue().click();
		BComp.waitForPageToLoad();
		String CourseName=DSet.getusercourse_text().getText();
		if(CourseName.contains(Course)){}else{Assert.fail();}
      
		DSet.getLogout().click();
	}
	*/
  @AfterMethod
    public void afterMethod() {
	
  }

  @AfterClass
  public void afterClass() {
   //Constant.driver.quit();
}
}
