package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\a07208trng_b4b.04.25\\Desktop\\browserdrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  PageClass Pobject = new PageClass(driver);
	  Pobject.click_Lnc();
	  Pobject.type_uname();
	  Pobject.type_pwd();
	  Pobject.click_login();
	}

}
