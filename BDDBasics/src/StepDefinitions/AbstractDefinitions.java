package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class AbstractDefinitions {

	static WebDriver driver;
	@Given("^User has opened website in chrome$")
	public void openBrowser() {
		System.out.println("Hi");
		System.out.println("Bye");
		System.setProperty("webdriver.chrome.driver","D:\\EthansSelenium\\chromedriver_win32(1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");

	}
	
	@And("^User enters (.*) and (.*)$")
	public void enterDetails(String us, String ps) {
		
		driver.findElement(By.name("userName")).sendKeys(us);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.name("login")).click();

	}
}
