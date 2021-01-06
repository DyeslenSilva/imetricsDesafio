package com.example.test.relatorios;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

class RelatorioTestes {

	/*
	 * Classe responsavel por gerar relatorio dos testes
	 */
	
	private static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extentReporter;
	private static ExtentTest extentTest;
	
	@cucumber.api.java.Before
	public void beforeScenario(cucumber.api.Scenario cenario) {
		if(extentReporter == null) {
			extentReporter = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/java/htmlTeste.html");
			extentReporter.attachReporter(htmlReporter);
		}
		
		extentTest = extentReporter.createTest(cenario.getStatus());
	}

	@cucumber.api.java.After
	public void afterScenario(cucumber.api.Scenario cenario) {
		extentTest.log(Status.PASS, "Cenario "+cenario+" executado com sucesso");
		extentReporter.flush();
		
	}
	
	public static WebDriver getWebDriver() {
		return driver;
	}
	
	public static ExtentTest getExtentTest() {
		return extentTest;
	}
}