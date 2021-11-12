package week2.day1;
	import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	
public class MultipleElement{
	
		 public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver= new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/checkbox.html");
			
			driver.manage().window().maximize();
			WebElement Links = driver.findElement(By.xpath("//input[@type='checkbox']"));
			Dimension size=Links.getSize();
			
			System.out.println(size);

}
}