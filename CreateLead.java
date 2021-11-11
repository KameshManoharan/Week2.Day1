package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
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
		
		//Click Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Type Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SelTestCompany");
		
		//Type First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kamesh");
		
		//Type Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manoharan");
	
		//Click Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		
		//Verify Page Title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Verify Company Title
		String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		
		//Close Browser
		driver.close();
	}
}
