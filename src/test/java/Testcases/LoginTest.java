package Testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectrepository.PageObject.AshishTest;

public class LoginTest {

	
	@Test
	public void Login() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ashishkumarportfolio.netlify.app/");
		
		AshishTest ash = new AshishTest(driver);
		
		ash.name();
		ash.email().sendKeys("prerna@metlife.com");
		ash.text().sendKeys("Object Model");
		ash.id().click();

	}
	
	
}
