package com.shaw.PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Partner_POF {

	@FindBy(xpath="//div[@class='courses']//li/p[1]")
	 private List<WebElement> all_courses;

	@FindBy(xpath="//div[@class='courses']//li/a[2]")
	private List<WebElement> Select_btn;
	
	@FindBy(xpath="//span[contains(text(),'view courses')]")
	private WebElement go_down;
	
	public List<WebElement> getAll_courses() {
		return all_courses;
	}

	public WebElement getGo_down() {
		return go_down;
	}

	public List<WebElement> getSelect_btn() {
		return Select_btn;
	}
	
	public List<WebElement> getall_courses() {
		return all_courses;
	}
	
}
