package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class openUrlSteps {
	WebDriver driver = null;

	@Test
	@Given("user is on the browser")
	public void user_is_on_the_browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kirub\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	}

	@Test
	@When("user Enter the specific url in the search bar")
	public void user_enter_the_specific_url_in_the_search_bar() {
		driver.get("https://www.bigsmall.in/");

	}

	@Test
	@Then("the url must open")
	public void the_url_must_open1() {
		System.out.println("URL got opened");

	}

}
