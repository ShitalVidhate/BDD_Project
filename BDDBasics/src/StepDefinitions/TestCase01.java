package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestCase01 {

	/*WebDriver driver;
	@Given("^User has opened website in chrome$")
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver","D:\\EthansSelenium\\chromedriver_win32(1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");

	}
	
	@And("^User enters username and password$")
	public void enterDetails() {
		
		driver.findElement(By.name("userName")).sendKeys("batman");
		driver.findElement(By.name("password")).sendKeys("batman");
		driver.findElement(By.name("login")).click();

	}*/
	@When("^user selcts oneway radio button$")
	public void selectRadios() {
		
		AbstractDefinitions.driver.findElement(By.xpath("//input[@value='oneway']")).click();		
		
	}
	
}
