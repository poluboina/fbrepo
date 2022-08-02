package com.facebook;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
	@Test
	public void fbTest() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String str = driver.getCurrentUrl();
		
		System.out.println(str);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
