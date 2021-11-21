package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewAllPage {
 WebDriver driver;
 @Test
 @Given("home page")
 public void home_page() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kirub\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	 driver.get("https://www.bigsmall.in/");
 }
 @Test
 @When("user clicks on view all")
 public void user_clicks_on_view_all() {
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");
		driver.findElement(By.xpath("//a[contains(text(),'View All')]")).click();
		
 }
 @Test
 @Then("page gets navigated and products displayed")
 public void page_gets_navigated_and_products_displayed() {
	 System.out.println("View all page displayed");
	 
 }
  
}
