package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asgn1W2D1CreateContact {
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
		
		//Click Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Type First Name
		driver.findElement(By.id("firstNameField")).sendKeys("Kamesh");
		
		//Type Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("Manoharan");
		
		//Type Email
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kamesh@testcompany.com");
		
		//Click Create Contact Button
		driver.findElement(By.name("submitButton")).click();
		
		//Print Browser Title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Print the First Name
		String text=driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(text);
		
		//Close Browser
		//driver.close();
	}
}
