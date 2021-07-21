package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commons.BasePage;
import pageUI.EmployeeDetailPageUI;

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

	public String getFirstNameDetail() {
		waitToElementVisible(driver, EmployeeDetailPageUI.FIRST_NAME_DETAIL);
		return getElementAttribute(driver, EmployeeDetailPageUI.FIRST_NAME_DETAIL, "value");
	}

	public String getMiddleNameDetail() {
		waitToElementVisible(driver, EmployeeDetailPageUI.MIDDLE_NAME_DETAIL);
		return getElementAttribute(driver, EmployeeDetailPageUI.MIDDLE_NAME_DETAIL, "value");
	}

	public String getLastNameDetail() {
		waitToElementVisible(driver, EmployeeDetailPageUI.LAST_NAME_DETAIL);
		return getElementAttribute(driver, EmployeeDetailPageUI.LAST_NAME_DETAIL, "value");
	}

	public void clickToEmployeeList() {
		waitToElementClickAble(driver, EmployeeDetailPageUI.EMPLOYEE_LIST_SUB_MENU);
		clickToElement(driver, EmployeeDetailPageUI.EMPLOYEE_LIST_SUB_MENU);
		
	}

	public void inputToEmployeeNameAtSearchEmployee(String nameValue) {
		waitToElementVisible(driver, EmployeeDetailPageUI.SEARCH_NAME_TEXTBOX);
		sendkeyToElement(driver, EmployeeDetailPageUI.SEARCH_NAME_TEXTBOX, nameValue);
	}

	public void clickSearchButton() {
		waitToElementClickAble(driver, EmployeeDetailPageUI.SEARCH_BUTTON);
		clickToElement(driver, EmployeeDetailPageUI.SEARCH_BUTTON);
	}

	public boolean isSearchWithNameSuccessful(String nameValue) {
		List<WebElement> elements = getElements(driver, EmployeeDetailPageUI.ID_AND_NAME_VALUE);
		StringBuilder strBuilder = new StringBuilder();
		for(int i = 0; i < elements.size(); i++)
		{
			strBuilder.append(elements.get(i).getText());
		}
		if(strBuilder.toString().replaceAll(" ", "").contains(nameValue.replaceAll(" ", ""))) {
			return true;
		}
		else {
			return false;
		}
	}

}
