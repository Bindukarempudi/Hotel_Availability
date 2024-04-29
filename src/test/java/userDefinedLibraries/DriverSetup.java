package userDefinedLibraries;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class DriverSetup {
	
	static WebDriver driver;

	
	public static WebDriver getWebDriver() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Browser you want to test the website(1:chrome ,2:edge )");
		int choice = sc.nextInt();
		
		if(choice==1) {
			driver = new ChromeDriver();
		}
		else if(choice ==2) {
			
			driver = new EdgeDriver();
		}
		
	
		String baseUrl = "https://www.trivago.in/";
		
		driver.get(baseUrl);
		System.out.println("Browser is Launched and website is loading");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		sc.close();
		return driver;
	}

}
