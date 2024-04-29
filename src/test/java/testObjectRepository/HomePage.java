package testObjectRepository;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	
	public HomePage() {}
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
		//destinationElement
	public  WebElement getDestinationElement() {
		WebElement location=driver.findElement(By.id("input-auto-complete"));
		return location;
	}
	//checkInElement
	public  WebElement getCheckInElement() {
		WebElement checkin=	driver.findElement(By.cssSelector("button[data-testid=search-form-calendar-checkin"));
		return checkin;
	}
	//checkOutElemet
	public  WebElement getCheckOutElement() {
		
//		By checkOut_loc = By.xpath("//button[@data-testid='search-form-calendar-checkout']");
		WebElement checkOutElement = driver.findElement(By.cssSelector("button[data-testid=search-form-calendar-checkout"));
		return checkOutElement;
	}
	
	public  WebElement getCalenderNextButtonElement() {
		WebElement next= driver.findElement(By.cssSelector("button[data-testid=calendar-button-next"));
		return next;
	}
	//checkoutmonthYear 
	public  List<WebElement> checkMonthYear() {
		List<WebElement> checkoutmonthYear= driver.findElements(By.cssSelector("h3.Heading_heading__xct3h.Heading_h-s___YnjF.mx-3.pb-3.font-bold"));
		return checkoutmonthYear;
	}
	//guestsAndRoomsElement
	public  WebElement getGuestsAndRoomsElement() {
		WebElement guestsAndRoomsElement = driver.findElement(By.cssSelector("button[data-testid=search-form-guest-selector]"));
		return guestsAndRoomsElement;	
	}
	
	public  WebElement getGuestsAndRoomsDropDownElement() {
		
//		By guestsAndRoomsDropDown_loc = By.cssSelector("div[data-testid='guest-selector-popover']");
		WebElement guestsAndRoomsDropDownElement = driver.findElement(By.cssSelector("div[data-testid='guest-selector-popover']"));
		return guestsAndRoomsDropDownElement;
	}
	
	
	public  WebElement getAdultsCountIncreasingElement() {
		
		By adultsCountIncreasing_loc = By.xpath("//button[@data-testid='adults-amount-plus-button']");
		WebElement adultsCountIncreasingElement = driver.findElement(adultsCountIncreasing_loc);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(adultsCountIncreasingElement));
		
		return adultsCountIncreasingElement;
	}
	
	//adultsCountDecreaseingElement
	public  WebElement getAdultsCountDecreasingElement() {
		
		By adultsCountDecreasing_loc = By.xpath("//button[@data-testid='adults-amount-minus-button']");
		WebElement adultsCountDecreasingElement = driver.findElement(adultsCountDecreasing_loc);
		return adultsCountDecreasingElement;
	}
	
	
	//currentAdultCountElement
	public  int getAdultsCount() {
		By adultsCount_loc = By.xpath("//input[@data-testid='adults-amount']");
		String adultsCount = driver.findElement(adultsCount_loc).getAttribute("value");
		int count = Integer.parseInt(adultsCount);
		return count;
	}
	
	//childrenCountIncreasingElement
	public  WebElement getChildrenCountIncreasingElement() {
		
		By childrenCountIncreasingElementBy = By.xpath("//button[@data-testid='children-amount-plus-button']");
		WebElement childrenCountIncreasingElement = driver.findElement(childrenCountIncreasingElementBy);
		return childrenCountIncreasingElement;
	}
	
	//childrenCountDecreasingElemnet
	public  WebElement getChildrenCountDecreasingElement() {
		
		By childrenCountDecreasing_loc = By.xpath("//button[@data-testid='children-amount-minus-button']");
		WebElement childrenCountDecreasingElement = driver.findElement(childrenCountDecreasing_loc);
		return childrenCountDecreasingElement;
	}
	
	//currenRoomCountElement
	public  int getRoomCount() {
		
		By childrenCount_loc = By.xpath("//input[@data-testid='rooms-amount']");
		String roomsCount = driver.findElement(childrenCount_loc).getText();
		int count = Integer.parseInt(roomsCount);
		return count;
	}
	
	//roomsCountIncreasingElement
	public  WebElement getRoomsCountIncreasingElement() {
		
		By roomsCountIncreasing_loc = By.xpath("//button[@data-testid='rooms-amount-plus-button']");
		WebElement roomsCountIncreasingElement = driver.findElement(roomsCountIncreasing_loc);
		return roomsCountIncreasingElement;
	}
	
	
	//applyButtonElement
	public  WebElement getApplyButtonElement() {
		
		WebElement applyButtonElement = driver.findElement(By.cssSelector("button[data-testid='guest-selector-apply']"));
		return applyButtonElement;
	}
	
	public  List<WebElement> gethotelNames(){
		List<WebElement> hotelNames=driver.findElements(By.cssSelector("span[itemprop=name]"));
		return hotelNames;
	}
	
	public  List<WebElement> gethotelPrices(){
		List<WebElement> hotelPrice=driver.findElements(By.cssSelector("p[data-testid=recommended-price]"));
		return hotelPrice;
	}
	
	public  List<WebElement> gethotelRating(){
		List<WebElement> hotelRating=driver.findElements(By.cssSelector("span[itemprop=ratingValue]"));	
		return hotelRating;
	}
	public  WebElement getShortByElement() {
		WebElement sortByDropDownEle=driver.findElement(By.id("sorting-selector"));
		return sortByDropDownEle;
	}

}
