package sample_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Class {
	
	public static void main(String[] args) {
		
		// Set path to ChromeDriver executable (adjust path as needed)
		System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		// Open a website (optional test)
		driver.get("https://www.google.com");
		
	}
}