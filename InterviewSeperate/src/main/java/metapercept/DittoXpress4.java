package metapercept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DittoXpress4 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Launching the application/webpage
		driver.get("https://ditaxpresso.com/#/contactus");


		// Enter the 4th Invalid input exa- Abcdefghijk
		driver.findElement(By.xpath("//input[@name='First Name']")).sendKeys("Abcdefghijk");


		// Clicking on Submite Button.

		driver.findElement(By.xpath("//input[@id='formsubmit']")).click();

	}

}
