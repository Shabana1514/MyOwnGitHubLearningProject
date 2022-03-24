package myStepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinitions {
	WebDriver driver;
	@Given("^User is already on login page$")
	public void User_is_already_on_login_page()
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
	@And("^when user enters valid \"(.*)\" and \"(.*)\" and clicks on Login button$")
	public void when_user_enters_valid_username_and_password_and_clicks_on_Login_button(String username, String password)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
	}
	
	@Then("User should be able to successfully login to the application.")
	public void user_should_be_able_to_successfully_login_to_the_application() {
	    String actualtitle=driver.getTitle();
	    System.out.println(actualtitle);
	    driver.close();
	}



	}


