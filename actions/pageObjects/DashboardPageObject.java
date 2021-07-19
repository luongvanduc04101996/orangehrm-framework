package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.DashboardPageUI;

public class DashboardPageObject extends BasePage {
	WebDriver driver;

	public DashboardPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isDashBoardDisplayed() {
		waitToElementVisible(driver, DashboardPageUI.DASHBOARD_TEXT);
		return isElementDisplayed(driver, DashboardPageUI.DASHBOARD_TEXT);
	}

	public void hoverToPIM() {
		waitToElementVisible(driver, DashboardPageUI.PIM);
		hoverMouseToElement(driver, DashboardPageUI.PIM);
	}

	public EmployeeDetailPageObject clickToAddEmployee() {
		waitToElementClickAble(driver, DashboardPageUI.ADD_EMPLOYEE);
		clickToElement(driver, DashboardPageUI.ADD_EMPLOYEE);
		return PageGeneratorManager.getEmployeeDetailPage(driver);
	}

}
