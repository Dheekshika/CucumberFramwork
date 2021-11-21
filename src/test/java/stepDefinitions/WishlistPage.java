package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishlistPage {

	WebDriver driver = null;

	@Test
	@Given("user is on URL")
	public void user_is_on_url() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kirub\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.bigsmall.in/");
	}

	@Test
	@When("user click on wishlist")
	public void user_click_on_wishlist() {
		driver.findElement(By.xpath("//span[contains(text(),'wish list')]")).click();
	}

	@Test
	@Then("page gets navigated")
	public void page_gets_navigated() {
		System.out.println("Page got displayed");
	}

}
