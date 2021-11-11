package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asgn2W2D1FindContact {
public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Enter UserName
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click Find Contacts
		driver.findElement(By.linkText("Find Contacts")).click();
		
		//Click Email Tab
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//Type email as babu@testleaf.com
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("babu@testleaf.com");
		
		//Click Find Contacts
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
				
		//Close Browser
		//driver.close();
	}
}
