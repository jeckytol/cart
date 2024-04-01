package com.example.cartservice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RestServiceApplicationTests {

	@Test
	void contextLoads()
	{
		System.out.println(" first test running");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		//String title = driver.getTitle();
		//assertEquals("Web form", title);

		System.out.println(" first test end");
	}

}
