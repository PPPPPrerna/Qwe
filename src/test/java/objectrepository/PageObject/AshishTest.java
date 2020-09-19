package objectrepository.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Testcases.LoginTest;

public class AshishTest {

	
		WebDriver dri ;

	
		public AshishTest(WebDriver driver){
			
			dri = driver;
			
			}
		
		By name=By.name("name");
		By email=By.name("email");
		By text=By.name("message");
		By id=By.id("submit");
		
		public void name() {
			
			 dri.findElement(name).sendKeys("Prerna");
		
		}
		
		public WebElement  email() {
			return dri.findElement(email);
		}
		
		public WebElement text() {
			return dri.findElement(text);
		}
		
		public WebElement id() {
			return dri.findElement(id);
		}
				



}

