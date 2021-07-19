package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.EmployeeDetailPageUI;
import pageUI.LoginPageUI;

public class EmployeeDetailPageObject extends BasePage {
	WebDriver driver;

	public EmployeeDetailPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void inputFirstNameTextbox(String firstName) {
		waitToElementVisible(driver, EmployeeDetailPageUI.FIRST_NAME_TEXTBOX);
		sendkeyToElement(driver, EmployeeDetailPageUI.FIRST_NAME_TEXTBOX, firstName);
	}

	public void inputMiddleNameTextbox(String middleName) {
		waitToElementVisible(driver, EmployeeDetailPageUI.MIDDLE_NAME_TEXTBOX);
		sendkeyToElement(driver, EmployeeDetailPageUI.MIDDLE_NAME_TEXTBOX, middleName);
	}

	public void inputLastNameTextbox(String lastName) {
		waitToElementVisible(driver, EmployeeDetailPageUI.LAST_NAME_TEXTBOX);
		sendkeyToElement(driver, EmployeeDetailPageUI.LAST_NAME_TEXTBOX, lastName);		
	}

	public void uploadPhoto(String fullImageName) {
		waitToElementClickAble(driver, EmployeeDetailPageUI.PHOTO_FILE_BUTTON);
		uploadFileForWindows(driver, EmployeeDetailPageUI.PHOTO_FILE_BUTTON, fullImageName);
	}

	public void clickSaveButton() {
		waitToElementClickAble(driver, EmployeeDetailPageUI.SAVE_BUTTON);
		clickToElement(driver, EmployeeDetailPageUI.SAVE_BUTTON);
	}

	public boolean isAddEmployeeSuccessful() {
		waitToElementVisible(driver, EmployeeDetailPageUI.PERSONAL_DETAILS_TEXT);
		return isElementDisplayed(driver, EmployeeDetailPageUI.PERSONAL_DETAILS_TEXT);
	}

}
