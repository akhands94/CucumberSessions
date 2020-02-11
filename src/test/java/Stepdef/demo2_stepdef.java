package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo2_stepdef {
	
	WebDriver driver =null;
	@Given("the Register page is opened")
	public void the_Register_page_is_opened() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.25\\Desktop\\browserdrivers\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//a[@href='/register']")).click();
	}

	@When("user selects the gender")
	public void user_selects_the_gender() {
	driver.findElement(By.id("gender-male")).click();
	}

	@When("user enters first name and last name")
	public void user_enters_first_name_and_last_name() {
    driver.findElement(By.id("FirstName")).sendKeys("Akhand");
    driver.findElement(By.id("LastName")).sendKeys("Singh");
	}

	@When("user enters email akhands0@gmail.com")
	public void user_enters_email_akhands0_gmail_com() {
    driver.findElement(By.id("Email")).sendKeys("akhands0@gmail.com");
	}

	@When("user enters password as password")
	public void user_enters_password_as_password() {
		 driver.findElement(By.id("Password")).sendKeys("Password");
	}

	@When("user confirms the password")
	public void user_confirms_the_password() {
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Password");
	  
	}

	@Then("user will click on Register button")
	public void user_will_click_on_Register_button() {
	  driver.findElement(By.id("register-button")).click();
	}

	@Then("demo webshop home page appears")
	public void demo_webshop_home_page_appears() {
		System.out.println("Title of the page is "+driver.getTitle());
	}


}
