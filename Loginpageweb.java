package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpageweb {
	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Explio");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("lokesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("babu");
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String text = driver.findElement(By.id("viewLead_statusId_sp")).getText();
		
		
		System.out.println(text);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
