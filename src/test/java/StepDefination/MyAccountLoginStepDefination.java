package StepDefination;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;

public class MyAccountLoginStepDefination {
	
	public WebDriver driver = null;
	
	@Given("^Open Browser$")
	public void open_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("D:\\Softwares\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
	}

	@When("^Enter the url \"([^\"]*)\"$")
	public void enter_the_url(String url) throws Throwable {
	    driver.get(url);
	}

	@And("^Click on My Account menu$")
	public void click_on_My_Account_menu() throws Throwable {
		driver.findElement(By.linkText("My Account")).click();
	}

//	@When("^Enter registered username and password$")
//	public void enter_registered_username_and_password() throws Throwable {
//	    driver.findElement(By.name("username")).sendKeys("abad@gmail.com");
//	    driver.findElement(By.id("password")).sendKeys("malanahimahit");
//	}
	
//	Use to pass parameters from feature file
//	@When("Enter registered username {string} and password {string}")
//	public void enter_registered_username_and_password(String string, String string2) {
//		driver.findElement(By.name("username")).sendKeys(string);
//	    driver.findElement(By.id("password")).sendKeys(string2);
//	    //throw new io.cucumber.java.PendingException();
//	}
	
//	//Use to pass multiple users which is also same as above method
//	@When("Enter registered username {string} and password {string}")
//	public void enter_registered_username_and_password(String string, String string2) throws Throwable {
//		driver.findElement(By.name("username")).sendKeys(string);
//	    driver.findElement(By.id("password")).sendKeys(string2);
//	    //throw new io.cucumber.java.PendingException();
//	}
	//Use to pass data tables values to step definition file
	@When("Enter registered username and password")
	public void enter_registered_username_and_password(io.cucumber.datatable.DataTable credentials) throws Throwable {
	    List <List<String>> data =  credentials.cells();		//internal list represents one value(uname and pname) and outerlist represents multiple combinations
	    driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));		
	    //You can add records accordingly
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
	   driver.findElement(By.name("login")).click();
	}

	@Then("^User must successfully login to the webpage$")
	public void user_must_successfully_login_to_the_webpage() throws Throwable {
	   String captext = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
	   Assert.assertEquals(true,captext.contains("swaroopkorde24"));
	}
	@Then("verify login")
	public void verify_login() throws Throwable {
		String captext = driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
		if(captext.contains("ERROR"))
		{
			Assert.assertTrue("Invalid input - Error Page", true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	    //throw new io.cucumber.java.PendingException();
	}
}
