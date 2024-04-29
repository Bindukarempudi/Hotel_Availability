package testScenario;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testObjectRepository.HomePage;



public class TestMethods {
	WebDriver driver;
	HomePage homePage;
//	HotelDetails hotelDetails;
	
	public TestMethods() {
		
	}
	
	public TestMethods(WebDriver driver) {
		this.driver = driver;
		homePage = new HomePage(driver);
	}
	public  void handleCookies() throws InterruptedException {
		Thread.sleep(5000);
		
		WebElement acceptButton = null;
		
		try {
			WebElement shadowHost = driver.findElement(By.xpath("//div[@id='usercentrics-root']"));
		    
			acceptButton = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot.querySelector(arguments[1]);",shadowHost,"[data-testid='uc-accept-all-button']");
			
		} catch (Exception e) {
			System.out.println("Accept button not found in the Shadow DOM");
		}
		
	    
	    if (acceptButton != null) {
	        acceptButton.click();
	    } 
	}
	
	
	 public  Map<String,String> getMonthMap(){
		 Map<String,String> monthMap=new HashMap<String,String>();
			monthMap.put("January","01");
			monthMap.put("February","02");
			monthMap.put("March","03");
			monthMap.put("April","04");
			monthMap.put("May","05");
			monthMap.put("June","06");
			monthMap.put("July","07");
			monthMap.put("August","08");
			monthMap.put("September","09");
			monthMap.put("October","10");
			monthMap.put("November","11");
			monthMap.put("December","12");
			return monthMap;
	 }
	 
	 public  void setDestination(String destination) {
			
		 homePage.getDestinationElement().click();
		 homePage.getDestinationElement().sendKeys(destination);
			List<WebElement> dropdowns = driver.findElements(By.xpath("//mark[@class='font-bold']"));
			try {
				for(WebElement result : dropdowns) {
					if(result.getText().equalsIgnoreCase(destination)) {
						result.click();
					}
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		public void setCheckIndate(String checkIn) {

			String[] details = checkIn.split("-");
			
			String checkInDay = details[0];
			String month = details[1];
			String checkInYear = details[2];
			String checkInMonth="";
			
			
			for(Map.Entry<String, String> entry:getMonthMap().entrySet()) {
				if(entry.getKey().contains(month)) {
					checkInMonth=entry.getKey();
				}
		    }
			
			
			
			String check=checkInMonth+" "+checkInYear;
			System.out.println("Checking for calender Page: -----> "+check);
			boolean checkInFlag=true;
			while(checkInFlag) {		
			List<WebElement> checkInMonthYear=homePage.checkMonthYear();
			for(int i=0;i<checkInMonthYear.size()-1;i++) {
				String value1=checkInMonthYear.get(i).getText();
				String value2=checkInMonthYear.get(i+1).getText();
				System.out.println("Current Calender Page(Check-In):"+value1+ "   "+ value2);
				if(value1.equals(check)|| value2.equals(check))
				{
					System.out.println("Calender Page Founded..... ");
					checkInFlag=false;
					break;		
				}
				homePage.getCalenderNextButtonElement().click();

				System.out.println("Check-In-Next button of calender page  cliked");			
			}
			
			}
			
			String monthIn="";
			for(Map.Entry<String, String> entry:getMonthMap().entrySet()) {
					if(entry.getKey().equals(checkInMonth)) {
						monthIn=entry.getValue();
				}
			}
			
			System.out.println("Check in month number "+monthIn);
			WebElement checkInDateClick= driver.findElement(By.cssSelector("button[data-testid=valid-calendar-day-"+checkInYear+"-"+monthIn+"-"+checkInDay+"]"));
			checkInDateClick.click();
			System.out.println("Check-In Value is  Enterd\n [Value is: "+checkInDay+"-"+monthIn+"-"+checkInYear+"]");
		}
		
		
		public  void setCheckOutdate(String checkOut) {
			String[] details = checkOut.split("-");
			
			String checkOutDay = details[0];
			String month = details[1];
			String checkOutYear = details[2];
			String checkOutMonth="";
			for(Map.Entry<String, String> e:getMonthMap().entrySet()) {
				if(e.getKey().contains(month)) {
					checkOutMonth=e.getKey();
			}
		}
			String ouut=checkOutMonth+" "+checkOutYear;
			System.out.println("Checking for calender Page: -----> "+ouut);
			boolean checkOutFlag=true;
			while(checkOutFlag) {		
			List<WebElement> checkOutnthYear=homePage.checkMonthYear();
			for(int i=0;i<checkOutnthYear.size()-1;i++) {
				String value1=checkOutnthYear.get(i).getText();
				String value2=checkOutnthYear.get(i+1).getText();
				System.out.println("Current Calender Page(Check-Out):"+value1+ "   "+ value2);
				if(value1.equals(ouut)|| value2.equals(ouut)){
					System.out.println("Calender Page Founded..... ");
					checkOutFlag=false;
					break;		
					}
				homePage.getCalenderNextButtonElement().click();
				System.out.println("Check-Out-Next button of calender page  cliked");			
				}	
			}
			String monthOut="";
			for(Map.Entry<String, String> entry:getMonthMap().entrySet()) {
					if(entry.getKey().equals(checkOutMonth)) {
						monthOut=entry.getValue();
				}
			}
			System.out.println("Check out month number "+monthOut);
			WebElement checkOutDateClick= driver.findElement(By.cssSelector("button[data-testid=valid-calendar-day-"+checkOutYear+"-"+monthOut+"-"+checkOutDay+"]"));
			checkOutDateClick.click();
			System.out.println("Check-In Value is  Enterd\n [Value is: "+checkOutDay+"-"+monthOut+"-"+checkOutYear+"]");
			System.out.println("========================================================");
		}
		
		
		public  void setAdults(String numOfAdults) throws InterruptedException {
			
			try {
				if(homePage.getAdultsCountIncreasingElement().isDisplayed()) {
					System.out.println("Adults-Count-Increase Displayed");
				}
			}
			catch (Exception e) {
				// TODO: handle exception
				homePage.getGuestsAndRoomsElement().click();
				
			}
			
			int actualAdults =(int)Double.parseDouble(numOfAdults);
			int currentAdults = homePage.getAdultsCount();
		
			
			while(true) {
			
				if(actualAdults==currentAdults) {
					break;
				}
				else {
					if(actualAdults>currentAdults) {
						homePage.getAdultsCountIncreasingElement().click();
						currentAdults = homePage.getAdultsCount();
					}
					else if(actualAdults<currentAdults) {
						
						homePage.getAdultsCountDecreasingElement().click();
						currentAdults = homePage.getAdultsCount();
					}
				}
				
			}
			
		}
		
		public  void setRooms(String numOfRooms) {
			
			int actualRooms =(int)Double.parseDouble(numOfRooms);
			int currentRooms = homePage.getAdultsCount();
			
			while(true) {
			
				if(actualRooms==currentRooms) {
					break;
				}
				else {
					if(actualRooms>currentRooms) {
						homePage.getChildrenCountIncreasingElement().click();
						currentRooms = homePage.getRoomCount();
					}
					else if(actualRooms<currentRooms) {
						homePage.getChildrenCountDecreasingElement().click();
						currentRooms = homePage.getRoomCount();
					}
				}	
			}	
		}
		
		public  void clickOnApplyButton() {
			homePage.getApplyButtonElement().click();
		}
		
		public  void setSortBy(String sortBy) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOf(homePage.getShortByElement()));
			
			try {
				
				Select sortByDropDown1 = new Select(homePage.getShortByElement());
				sortByDropDown1.selectByVisibleText(sortBy);
				
			}catch (Exception e) {
				
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//button[@name='sorting_selector']"))).perform();
				driver.findElement(By.xpath("//label[contains(text(),'Rating only')]//preceding-sibling::input")).click();
				driver.findElement(By.xpath("//button[@data-testid='filters-popover-apply-button']")).click();
				
			}
			
		}

}
