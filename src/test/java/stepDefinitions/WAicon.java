package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WAicon {
	WebDriver driver;
	@Test
	@Given("url home page")
	public void url_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kirub\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 driver.get("https://www.bigsmall.in/");
	}
	@Test
	@When("user clicks view all")
	public void user_clicks_view_all() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");
		driver.findElement(By.xpath("//a[contains(text(),'View All')]")).click();
	}
	@Test
	@Then("view all page displayed")
	public void view_all_page_displayed() {
		System.out.println("page displayed");
	}
	@Test
	@And("user clicks on whatsapp icon")
	public void user_clicks_on_whatsapp_icon() {
		driver.findElement(By.xpath("//img[@class=\"wa-chat-btn-icon-image-only\"]")).click();
	}
	@Test
	@And("whatsapp page opnes")
	public void whatsapp_page_opnes() {
		System.out.println("Whatsapp opens");
	}
	@AfterTest
	public void afterTest()
	{
		driver.close();
	}
	
}
