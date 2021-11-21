package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectItem {
	WebDriver driver = null;

	@Test
	@Given("user is on url")
	public void user_is_on_url() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kirub\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.bigsmall.in/");
	}

	@Test
	@When("product page displayed")
	public void product_page_displayed() {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("NewYear");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ARROW_DOWN.ENTER);
		System.out.println("Product page displayed");
		driver.findElement(By.xpath("//a[@class=\"snize-main-panel-controls-products active\"]")).click();
	}

	@Test
	@Then("user click on item")
	public void user_click_on_item() {
		driver.findElement(By.xpath("//span[@class=\"snize-title\"]")).click();
	}

	@Test
	@And("add item to wishlist")
	public void add_item_to_wishlist() {
		driver.findElement(By.xpath("//span[@class=\"swym-wishlist-cta\"]")).click();
	}

}
