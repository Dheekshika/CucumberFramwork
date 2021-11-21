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

public class PersonalizedGiftsPage {
	WebDriver driver = null;

	@Test
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kirub\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.bigsmall.in/");
	}

	@Test
	@When("user clicks on personalized gifts link")
	public void user_clicks_on_personalized_gifts_link() {
		driver.findElement(By.xpath("//a[@data-dropdown-rel=\"personalized-gifts\"]")).click();
	}

	@Test
	@Then("link opens,page navigated")
	public void link_opens_page_navigated() {
		System.out.println("Pgae got navigated");
	}

	@Test

	@And("user clicks on item")
	public void user_clicks_on_item() {
		driver.findElement(By.xpath("//div[contains(text(),'Personalized Wonder Woman Themed Nameplate | COD n')]"))
				.click();
	}

	@Test
	@And("adds the item to cart")
	public void adds_the_item_to_cart() {
		driver.findElement(By.xpath("//button[@class=\"btn btn--full add-to-cart spice-submit-button p_a_t_c\"]"))
				.click();
		driver.findElement(By.xpath("//input[@class=\"pplr_text pplr_monogram p_u_t cstmfy_c_required  \"]"))
				.sendKeys("dheekshi");
		driver.findElement(By.xpath("//button[@class=\"btn btn--full add-to-cart spice-submit-button p_a_t_c\"]"))
				.click();

	}

}
