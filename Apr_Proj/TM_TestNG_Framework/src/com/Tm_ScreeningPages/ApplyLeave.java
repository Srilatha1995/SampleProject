package com.Tm_ScreeningPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Tm_GenericFunctions.Weblibrary;

public class ApplyLeave extends Weblibrary {
	
	
	@FindBy(how = How.XPATH, using="//a[@id='menu_leave_viewLeaveModule']")
	public static WebElement Leave_Tab;
	
	@FindBy(how = How.XPATH, using="//a[@id='menu_leave_applyLeave']")
	public static WebElement Apply_Tab;
	
	@FindBy(how = How.XPATH, using="//select[@id='applyleave_txtLeaveType']")
	public static WebElement Leave_Type;
	
	@FindBy(how = How.XPATH, using="//input[@id='applyleave_txtFromDate']")
	public static WebElement from_date;
	
	@FindBy(how = How.XPATH, using="//input[@id='applyleave_txtToDate']")
	public static WebElement to_date;
	
	@FindBy(how = How.XPATH, using="//select[@id='applyleave_duration_duration']")
	public static WebElement duration_field;
	
	@FindBy(how = How.XPATH, using="//textarea[@id='applyleave_txtComment']")
	public static WebElement Comment_box;
	
	@FindBy(how = How.XPATH, using="//input[@id='applyBtn']")
	public static WebElement Apply_btn;
	
	
	public void LeaveApply()
	{
		boolean status;
		status= clickElement(Leave_Tab);
		logEvent(status, "Clicked on Leave Tab", "Unable to click on Leave Tab");
		
		status= clickElement(Apply_Tab);
		logEvent(status, "Clicked on Apply Tab", "Unable to click on Apply Tab");
		
		status= selectByvalue(Leave_Type, "Annual Leave");
		logEvent(status, "Selected Leave", "Unable to select Leave");
		
		status = setTextandEscape(from_date, "2019-04-22");
		logEvent(status, "Selected fromdate", "Unable to fromdate");
		
		status = setTextandEscape(to_date, "2019-05-22");
		logEvent(status, "Selected todate", "Unable to todate");
		
		
		status= selectByvalue(duration_field, "Full Day");
		logEvent(status, "Selected Duration", "Unable to duration");
		
		status= setText(Comment_box, "Sick Leave");
		logEvent(status, "Entered Reason for Leave", "Unable to Enter reason");
		
		status= clickElement(Apply_btn);
		logEvent(status, "Clicked on Apply Button", "Unable to click on Apply Button");
		
	}
	
	

}
