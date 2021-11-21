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

public class SearchProd {
	WebDriver driver = null;

	@Test
	@Given("user is on the url")
	public void user_is_on_the_url() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kirub\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.bigsmall.in/");
	}

	@Test
	@When("user enters NewYear gifts in the searchbox")
	public void user_enters_new_year_gifts_in_the_searchbox() {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("NewYear");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ARROW_DOWN.ENTER);

	}

	@Test
	@Then("product page displays")
	public void product_page_displays() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Product page displayed");
	}

	@Test
	@And("user clicks on the products option")
	public void user_clicks_on_the_products_option() {
		driver.findElement(By.xpath("//a[@class=\"snize-main-panel-controls-products active\"]")).click();
	}

	@Test
	@And("clicks on dropdown to select price from low to high")
	public void clicks_on_dropdown_to_select_price_from_low_to_high() {
		driver.findElement(By.xpath("//a[@class=\"snize-main-panel-dropdown-button\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Price: Low to High')]"));
	}
}
