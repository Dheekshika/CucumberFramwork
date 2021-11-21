package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninPage {
	WebDriver driver;
	@Test
	@Given("user is on home page of the url")
	public void user_is_on_home_page_of_the_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kirub\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 driver.get("https://www.bigsmall.in/");
	}
	@Test
	@When("user clicks on the signin link")
	public void user_clicks_on_the_signin_link() {
		driver.findElement(By.xpath("//a[@class=\"site-nav__link site-nav__link--icon signinlink\"]")).click();
	}
	@Test
	@Then("sign in page displays")
	public void sign_in_page_displays() {
		System.out.println("Sign-in page displayed");
	}
	@Test
	@And("user enter credentials")
	public void user_enter_credentials() {
	driver.findElement(By.xpath("//input[@name=\"customer[email]\"]")).sendKeys("m.dheekshika@gmail.com");
	driver.findElement(By.xpath("//input[@name=\"customer[password]\"]")).sendKeys("123456789");
	
	}
	@Test
	@And("user clicks on signin")
	public void user_clicks_on_signin() {
		driver.findElement(By.xpath("//input[@class=\"btn btn--full\"]")).click();
	}

}
