package com.example.test.funcionario;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

class TestPage {

	/*
	 * Classe de teste da pagina inicial
	 */
	
	protected static WebDriver driver;
	
	@BeforeSuite
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dyeslen\\Desktop\\chromedriver.exe");
	
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.inmrobo.tk/accounts/login/");
	}
	
	@AfterSuite
	public void quit() {
		TestPage.driver.quit();
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
