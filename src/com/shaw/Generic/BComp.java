package com.shaw.Generic;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.shaw.PageObject.Partner_POF;
import com.shaw.PageObject.Registration_POF;

public class BComp {
    static String to_return="PASS";
    Partner_POF partner= PageFactory.initElements(Constant.driver , Partner_POF.class);
	public static String match_text(){
		System.out.println("Checking all the text of the present page");
		List<WebElement> list=new ArrayList<WebElement>();
		WebElement elem=Constant.driver.findElement(By.tagName("body"));
	
		String text=elem.getText();
		System.out.println(text);
		if(text.contains(".php")||text.contains("Warning")||text.contains("warning")||text.contains("public_html")||text.contains("error")){
			System.out.println("Error Message is:==>"+ text);
			to_return="FALSE";
		}
		/*for(int i=0;i<list.size();i++){
			String text=list.get(i).getText();
			System.out.println(text);
			if(text.contains(".php")||text.contains("Warning")||text.contains("warning")||text.contains("public_html")||text.contains("error")){
				System.out.println("Error Message is:==>"+ text);
				to_return="FALSE";
			}
		}*/
		return to_return;
	}
	
	public static void waitForElement(WebElement element){
		WebDriverWait wait = new WebDriverWait(Constant.driver, 90);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void Scroll_Window(){
		JavascriptExecutor jse1 = (JavascriptExecutor)Constant.driver;
		jse1.executeScript("window.scrollBy(0,250)", "");		
	}
	
	public static void waitForPageToLoad(){
		Constant.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public static void selectCourseFromPartnerPage(List<WebElement> list,List<WebElement> list_select,String Course_Name){		
		
		for(int i=0;i<list.size();i++){
			String Exp_course=list.get(i).getText();
			if(Exp_course.equalsIgnoreCase(Course_Name)){
				list_select.get(i).click();
			}
		
	
	}
	}
}
