package com.telecom.stepdefenetion;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class AddCustomersStep {
	
	
	static WebDriver driver;
	

	@Given("user launch demo telecom application")
	public void user_launch_demo_telecom_application() {
		
		WebDriverManager .chromedriver().setup();
		WebDriver driver = new chromedriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		driver.manage().window().maximize();
		driver.manage().timesout().implicitywait(10, TimeUnit.class SECONDS);
		
		
	   
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		
		driver.findElement(By.xpath("(//a[test()='AddCustomer'])[1]")).click();
		
	    
	}

	@When("user enter all the field")
	public void user_enter_all_the_field() {
		 driver.findElement(By.xpath("//label[@for='done']")).click();
		 driver.findElement(By.id("fname")).sendkeys("prathap");
		 driver.findElement(By.id("1name")).sendkeys("raj");
		 driver.findElement(By.id("email")).sendkeys("rajprathapraj008@gmail.com");
		 driver.findElement(By.id("addr")).sendkeys("ponneri");
		 driver.findElement(By.id("telephoneno")).sendkeys("8438113896 ");
		 
	   
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		
		driver.findElement(By.xpath("//input [@value='Submit']")).click();
		
	    
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {

		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		
	}

}
