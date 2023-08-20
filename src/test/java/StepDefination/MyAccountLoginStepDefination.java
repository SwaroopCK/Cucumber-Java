package StepDefination;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
	public void enter_the_url(String arg1) throws Throwable {
	    driver.get("https://practice.automationtesting.in/");
	}

	@And("^Click on My Account menu$")
	public void click_on_My_Account_menu() throws Throwable {
		driver.findElement(By.linkText("My Account")).click();
	}

	@When("^Enter registered username and password$")
	public void enter_registered_username_and_password() throws Throwable {
	    driver.findElement(By.name("username")).sendKeys("swaroopkorde24");
	    driver.findElement(By.id("password")).sendKeys("9767279102");
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
}
