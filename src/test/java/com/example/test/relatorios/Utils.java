package com.example.test.relatorios;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

class Utils {
	
	/*
	 * Classe responsavel pelos utlitarios para auxiliar a entender os testes
	 */

	public static void logPrintTela(String log) throws IOException {
		ExtentTest extentTest = RelatorioTestes.getExtentTest();
		extentTest.log(Status.INFO, log,MediaEntityBuilder.createScreenCaptureFromPath("screen").build());
	}
	
	private static void efetuarPrintTela(String log) throws IOException {
		File srcFile = ((TakesScreenshot) RelatorioTestes.getWebDriver())
					.getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(srcFile, 
				new File(System.getProperty("user.dir")+"\\src\\test\\resource\\"+log+".png"));
	}
	
	public static void logTela(String log) throws IOException {
		ExtentTest extentTest = RelatorioTestes.getExtentTest();
		efetuarPrintTela(log);
		extentTest.log(Status.INFO, log,MediaEntityBuilder.createScreenCaptureFromPath("screen").build());
	}
	
	

}
