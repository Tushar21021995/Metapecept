package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPath
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//a[@class='close']/descendant::i[@class='wewidgeticon we_close']")).click();
		
		
		
		//div[text()='December 2022']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='13']
	}

}
