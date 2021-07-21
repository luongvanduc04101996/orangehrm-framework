package com.orangehrm.employee;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.DashboardPageObject;
import pageObjects.EmployeeDetailPageObject;
import pageObjects.LoginPageObject;
import pageObjects.PageGeneratorManager;
import pageObjects.UserDetailPageObject;

public class Employee_01_Add_Edit_Employee_User extends BaseTest {
	WebDriver driver;
	DashboardPageObject dashboardPage;
	EmployeeDetailPageObject employeeDetailPage;
	LoginPageObject loginPage;
	UserDetailPageObject userDetailePage;
	String firstName, lastName, middleName;

	@Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browserName, String url) {
		firstName = "Duc" + randomNumbers();
		lastName = "Luong";
		middleName = "Van";
		
		driver = getBrowserDriverAndOpenURLByWebDriverManager(browserName, url);
		
		log.info("Step 01: Get login page");
		loginPage = PageGeneratorManager.getLoginPage(driver);
		
		log.info("Step 02: Input user name textbox");
		loginPage.inputUserNameTextbox("Admin ");

		log.info("Step 03: Input password textbox");
		loginPage.inputPasswordTextbox("admin123");
		
		log.info("Step 04: Click login button");
		dashboardPage = loginPage.clickLoginButton();
		
		log.info("Step 05: Verify login successful");
		verifyTrue(dashboardPage.isDashBoardDisplayed());
	}

	@Test
	public void Employee_01_Add_Employee_And_Upload_Photo() {
		log.info("Step 01: Hover to PIM");
		dashboardPage.hoverToPIM();
		
		log.info("Step 02: Select add employee");
		employeeDetailPage = dashboardPage.clickToAddEmployee();
		
		log.info("Step 03: Input firstname textbox");
		employeeDetailPage.inputFirstNameTextbox(firstName);
		
		log.info("Step 04: Input middle name textbox");
		employeeDetailPage.inputMiddleNameTextbox(middleName);
		
		log.info("Step 05: Input lastname textbox");
		employeeDetailPage.inputLastNameTextbox(lastName);
		
		log.info("Step 06: Upload photo");
		employeeDetailPage.uploadPhoto("rapit.jpg");
		
		log.info("Step 07: Click save button");
		employeeDetailPage.clickSaveButton();
		
		log.info("Step 08: Verify add employee successful");
		verifyTrue(employeeDetailPage.isAddEmployeeSuccessful());
		
		log.info("Step 09: Verify first name");
		verifyEquals(employeeDetailPage.getFirstNameDetail(), firstName);
		
		log.info("Step 10: Verify middle name");
		verifyEquals(employeeDetailPage.getMiddleNameDetail(), middleName);
		
		log.info("Step 11: Verify last name");
		verifyEquals(employeeDetailPage.getLastNameDetail(), lastName);
	}
	
	@Test
	public void Employee_02_Search_Employee_With_Name() {
		log.info("Step 01: Click to Employee List");
		employeeDetailPage.clickToEmployeeList();
		
		log.info("Step 02: Search employee with name");
		employeeDetailPage.inputToEmployeeNameAtSearchEmployee(firstName + " " + middleName + " " + lastName);
		
		log.info("Step 03: Click search button");
		employeeDetailPage.clickSearchButton();
		
		log.info("Step 04: Verify search successful");
		verifyTrue(	employeeDetailPage.isSearchWithNameSuccessful(firstName + " " + middleName + " " + lastName));
	}
	
	@Test
	public void Employee_03_Edit_Employee_By_Contact() {
	
	}
	
	@Test
	public void Employee_04_Edit_Employee_By_Job() {
	
	}
	
	@Test
	public void Employee_05_Edit_Employee_By_Salary() {
	
	}
	
	@Test
	public void Employee_06_Edit_Employee_By_Personal() {
	
	}
	
	@Test
	public void Employee_07_Add_User_To_Employee() {
	
	}

	
	@Test
	public void Employee_08_Search_User() {
	
	}


	@AfterClass (alwaysRun = true)
	public void afterClass() {
		closeBrowserAndDriver(driver);
	}

}
