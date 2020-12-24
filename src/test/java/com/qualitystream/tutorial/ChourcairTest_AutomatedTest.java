package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChourcairTest_AutomatedTest {
	
	private WebDriver driver;
	By registerLinkLocator =By.linkText("Empleos");
	By registerPagelocator = By.xpath("//img[@title='empleosazulMesa de trabajo 1']");
	By employmentinformation =By.linkText("//li[a[@href='https://www.choucairtesting.com/job/analista-de-pruebas-bogota/']]");
	By employmentPagelocator =By.xpath("//img[@src=\"https://www.choucairtesting.com/wp-content/uploads/2019/07/analista_pruebas.jpg\"]");
	By applyForJobBtn =By.xpath("//*[@id=\"post-7547\"]/div/div[2]/div[3]/input");
	By videoJob =By.id("//*[@id=\"movie_player\"]/div[4]/button");
	By ModeloCalidad =By.linkText("//a[@href='https://iso25000.com/index.php/normas-iso-25000/iso-25010']");
	By keywordsCity= By.id("search_location");
	By registerPagelocator2 = By.xpath("//img[@src=\"https://www.choucairtesting.com/wp-content/uploads/2020/11/Recurso-6-150x150.png\"]");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void registerUser() throws InterruptedException {
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);
		if(driver.findElement(registerPagelocator).isDisplayed()) {
			//Thread.sleep(2000);
			driver.findElement(registerPagelocator).click();
			//System.out.print("Error");
			Thread.sleep(2000);
			if (driver.findElement(registerPagelocator2).isDisplayed()) {
				driver.findElement(employmentinformation).click();
				Thread.sleep(2000);
			//driver.findElement(keywordsCity).sendKeys("Bogotá");
			//Thread.sleep(2000);
			/*if (driver.findElement(employmentPagelocator).isDisplayed()){
				driver.findElement(applyForJobBtn).click();
				
			}
			else {
				System.out.println("No se encontró el BTN");
			}*/
			}
			else {}
		}
		else {
			System.out.println("No se encontró el BTN");
		
		}
	}
}	