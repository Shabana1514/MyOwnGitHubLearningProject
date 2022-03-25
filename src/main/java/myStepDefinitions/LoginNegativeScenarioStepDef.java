package myStepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginNegativeScenarioStepDef {
	WebDriver driver;

	@Given ("^User is already on login page$")
	public void Given_User_is_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		//driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@When("^User Clicks on My account menu$")
	public void When_User_Clicks_on_My_account_menu()
	{
		WebElement myaccount=driver.findElement(By.xpath("//ul[@id='main-nav']//li[2]//a"));
		myaccount.click();
	}
}
