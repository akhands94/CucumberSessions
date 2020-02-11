package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.PageClass;
import PageObjectModel.testcase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo3_stepdef {
	WebDriver driver =null;
	@Given("User has opened the application")
	public void user_has_opened_the_application() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.25\\Desktop\\browserdrivers\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize();
	}

	@When("user clicks to signin link")
	public void user_clicks_to_signin_link() {
		  driver.findElement(By.linkText("Log in")).click(); 
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		 driver.findElement(By.id("Email")).sendKeys(string);
		  driver.findElement(By.name("Password")).sendKeys(string2);
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}

	@Then("demo webshop hom page will display")
	public void demo_webshop_hom_page_will_display() {
	}
	
	}

