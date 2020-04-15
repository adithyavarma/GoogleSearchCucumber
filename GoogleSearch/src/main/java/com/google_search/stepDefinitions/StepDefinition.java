package com.google_search.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition {

	WebDriver driver;
	
	@Given("^User is in Google Home Page$")
	public void user_is_in_Google_Home_Page(){
	    System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/Eclipse Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
	}

	@When("^Title of page is Google$")
	public void title_of_page_is_Google(){
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
	    Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^Click on Im Feeling Lucky button$")
	public void click_on_Im_Feeling_Lucky_button(){
		WebElement btnI = driver.findElement(By.name("btnI"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btnI);
	}

	@When("^Title of page is Google Doodles$")
	public void title_of_page_is_Google_Doodles(){
	    String expectedTitle = "Google Doodles";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^Navigate back to the Google Home Page$")
	public void navigate_back_to_the_Google_Home_Page(){
	    driver.navigate().back();
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
	    Assert.assertEquals(expectedTitle, actualTitle);
	}
String data = "durga adithya varma bhupathiraju";
	@Then("^Enter data in the search text box$")
	public void enter_data_in_the_search_text_box(){
	    driver.findElement(By.name("q")).sendKeys(data);
	}

	@Then("^Click on Google Search button$")
	public void click_on_Google_Search_button(){
		WebElement btnK = driver.findElement(By.name("btnK"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btnK);
		//driver.findElement(By.name("btnK")).click();
	}

	@When("^Title of page is entered search data$")
	public void title_of_page_is_entered_search_data(){
	    String expectedTitle = data +" - Google Search";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^close the browser$")
	public void close_the_browser(){
		driver.quit();    
	}


}
