package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllProductPage {
WebDriver driver;
@Test
@Given("user on landing page in the url")
public void user_on_landing_page_in_the_url() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\kirub\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.get("https://www.bigsmall.in/");
}
@Test
@When("and clicks all of it")
public void and_clicks_all_of_it() {
    driver.findElement(By.xpath("//a[@data-dropdown-rel=\"all-of-it\"]")).click();
}
@Test
@Then("page displayed")
public void page_displayed()
{
	System.out.println("page displayed");
}
}
