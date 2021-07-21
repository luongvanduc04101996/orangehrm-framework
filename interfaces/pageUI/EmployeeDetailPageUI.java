package pageUI;

public class EmployeeDetailPageUI {
	
	//Add Employee Page
	public static final String FIRST_NAME_TEXTBOX = "//input[@id='firstName']";
	public static final String MIDDLE_NAME_TEXTBOX = "//input[@id='middleName']";
	public static final String LAST_NAME_TEXTBOX = "//input[@id='lastName']";
	public static final String PHOTO_FILE_BUTTON = "//input[@id='photofile']";
	public static final String SAVE_BUTTON = "//input[@id='btnSave']";
	public static final String PERSONAL_DETAILS_TEXT = "//h1[text()='Personal Details']";
	
	//Employee Details Page
	public static final String FIRST_NAME_DETAIL = "//div[@class='fieldDescription']/following-sibling::input[@id='personal_txtEmpFirstName']";
	public static final String MIDDLE_NAME_DETAIL = "//div[@class='fieldDescription']/following-sibling::input[@id='personal_txtEmpMiddleName']";
	public static final String LAST_NAME_DETAIL = "//div[@class='fieldDescription']/following-sibling::input[@id='personal_txtEmpLastName']";

	//Search Employee Page
	public static final String EMPLOYEE_LIST_SUB_MENU = "//a[@id='menu_pim_viewEmployeeList']";
	public static final String SEARCH_NAME_TEXTBOX = "//input[@id='empsearch_employee_name_empName']";
	public static final String SEARCH_BUTTON = "//input[@id='searchBtn']";
	public static final String ID_AND_NAME_VALUE = "//tbody//a";
	
}
