 package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {
	
	WebDriver driver =null;
	
By lnc = By.linkText("Log in");
By uname = By.name("Email");
By pwd = By.name("Password");
By lbtn = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");

public PageClass (WebDriver driver) {
this.driver = driver;

}


public void click_Lnc() {
	driver.findElement(lnc).click();
}

public void type_uname() {
	driver.findElement(uname).sendKeys("aravindguggilla57@gmail.com");
}

public void type_pwd() {
	driver.findElement(pwd).sendKeys("aravind");
	
}

public void click_login() {
	driver.findElement(lbtn).click();
}
}