package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	// Create constructor

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("/Users/vedant.jagani/Documents/Automation/CucumberPOM/"
					+ "src/main/java/com/qa/config/config.properties");

			prop.load(file);
		} catch (IOException e) {
			e.getMessage();

		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);
		}

		else if (browserName.equals("FF")) {

			System.setProperty("webdriver.chrome.driver",
					"/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));
	}

}
