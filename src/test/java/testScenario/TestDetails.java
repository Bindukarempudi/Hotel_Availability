package testScenario;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import userDefinedLibraries.DriverSetup;

import userDefinedLibraries.ScreenShot;
import testObjectRepository.HomePage;



public class TestDetails {
	public WebDriver driver;
	TestMethods testMethods;
	Validation validation;
	HomePage HomePage;
	ScreenShot screenShot;
	
	//public static String[] data;
	static String excelFilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\TestData.xlsx";
	
	public void setUp() {
		
		driver = DriverSetup.getWebDriver();
		
		testMethods = new TestMethods(driver);
		validation = new Validation(driver);
		screenShot = new ScreenShot(driver);
		HomePage=new HomePage(driver);
		
	}
  
	public  void test() throws IOException, InterruptedException {

		testMethods.handleCookies();
		
		testMethods.setDestination("Mumbai");
		System.out.println("==================================================================================================================");
		System.out.println("Destination input is cliked.In destination Feild Data is Entered\ninput Value :"+"Mumbai");
		
		HomePage.getCheckInElement().click();
		System.out.println("==================================================================================================================");
		System.out.println("Check In Date Element is Clicked");

		testMethods.setCheckIndate("04-Sep-2024");
		System.out.println("==================================================================================================================");
		System.out.println("For Check In Date,calender is navigated and date is selected\n selected date value :"+"04-Sep-2024");
		
		testMethods.setCheckOutdate("08-Sep-2024");
		System.out.println("==================================================================================================================");
		System.out.println("For Check Out Date,calender is navigated and date is selected\n selected date value :"+"08-Sep-2024");

		
		HomePage.getGuestsAndRoomsElement().click();
		HomePage.getGuestsAndRoomsElement().click();
		System.out.println("==================================================================================================================");
		System.out.println("Geuests And Room is selected(clicked)");
		
		testMethods.setAdults("1");
		System.out.println("==================================================================================================================");
		System.out.println("Adults value is :"+"1");
		
		testMethods.setRooms("1");
		System.out.println("==================================================================================================================");
		System.out.println("Room Count value is :"+"1");
		screenShot.screenShotTC(driver,"value_Entry");
		HomePage.getApplyButtonElement().click();
		System.out.println("==================================================================================================================");
		System.out.println("Guests and rooms Section Apply Button is Clicked.");
		Thread.sleep(5000);
		testMethods.setSortBy("Rating only");
		System.out.println("==================================================================================================================");
		System.out.println("From Sort By select box Rating Only is selected\n selected option :"+"Rating Only");
        Thread.sleep(8000);
		
		
		//printingHotelPrice
		System.out.println("============================================================================================");
		System.out.println("************************ printing Hotel Price*****************************");
		validation.printHotelPrice();
		
		System.out.println("============================================================================================");
		
		//printingAllTheHotelRatings
		System.out.println("============================================================================================");
		System.out.println("************************printing All TheHotel Ratings *****************************");
		validation.printHotelRatings();
		String ratingValidation = validation.ratingValidation();
		System.out.println(ratingValidation);
		if(ratingValidation.equalsIgnoreCase("Test Passed")) {
			System.out.println("Rating Validation:Test Passed:");
		}
		else {
			System.out.println("Rating Validation:Test Failed:");

		}
		
		System.out.println("============================================================================================");
		
		//takingScreenShotOfHotelDetailsPage
		screenShot.screenShotTC(driver,"AllhotelDetails");	
		System.out.println("ScreenShot Of HotelDetails Page is Taken");
		//validatingHotelsBelongToMumbaiCityOrNot
		System.out.println("=============================================================================================");
		
		System.out.println("Checking if the first 5 hotels belongs to the specific city searched for. Ex: Mumbai");
		try{
			String cityNameValidation = validation.cityNameValidation();
			System.out.println(cityNameValidation);
			if(cityNameValidation.equalsIgnoreCase("Test Passed")) {
				System.out.println("City Name Validation Passed:");	
			}
			else {
				System.out.println("City Name Validation Failed:");

			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("=============================================================================================");
			
	
	}
		
	public  void closeBrowser() {
		
		driver.quit();
	}
	public static  void main(String[] args) throws InterruptedException, IOException {
		TestDetails td=new TestDetails();
		td.setUp();
		td.test();
		td.closeBrowser();
		}

	
}
