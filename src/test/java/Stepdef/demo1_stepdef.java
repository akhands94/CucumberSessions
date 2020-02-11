package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo1_stepdef {
	
	WebDriver driver =null;
	@Given("the login page is opened")
	public void the_login_page_is_opened() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.25\\Desktop\\browserdrivers\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("Log in")).click();
	}

	@When("user enters aravind.guggilla57@gmail.com")
	public void user_enters_aravind_guggilla57_gmail_com() {
		  driver.findElement(By.id("Email")).sendKeys("aravind.guggilla57@gmail.com");
	 
	}

	@When("user enters aravind as password")
	public void user_enters_aravind_as_password() {
		  driver.findElement(By.name("Password")).sendKeys("aravind");
	 
	}

	@Then("user will click on login button")
	public void user_will_click_on_login_button() {
		 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();

	}

	@Then("demo webshop hom page appears")
	public void demo_webshop_hom_page_appears() {
		System.out.println("Title of the page is "+driver.getTitle());
		

	}

}
