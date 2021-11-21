package stepDefinitions;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BacktoHomePage {
	WebDriver driver;

	@Test
	@Given("url landing page")
	public void url_landing_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kirub\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.bigsmall.in/");
	}

	@Test
	@When("and clicks view all")
	public void and_clicks_view_all() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");
		driver.findElement(By.xpath("//a[contains(text(),'View All')]")).click();
	}

	@Test
	@Then("page displays")
	public void page_displays() {
		System.out.println("page displayed");
	}

	@Test
	@And("clicks on top to go back to home page")
	public void clicks_on_top_to_go_back_to_home_page() {
		driver.findElement(By.xpath("//div[@class=\"h1 site-header__logo\"]")).click();
	}
}
