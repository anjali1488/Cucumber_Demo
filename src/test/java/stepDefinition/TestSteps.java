package stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {

	WebDriver driver;
	String expectedTitle = "Adactin.com - Search Hotel";
	
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("Page opened");
	}

	@When("user enters user name, password")
	public void user_enters_user_name_password() {
		WebElement uName = driver.findElement(By.id("username"));
	    uName.sendKeys("santosh13");
	      
	      // Passing the password
	      
	    driver.findElement(By.id("password")).sendKeys("Snoopy1234");// Write code here that turns the phrase above into concrete actions
		//System.out.println("Username and password entered successfully");
	}

	@When("user enters \"(.*)\", \"(.*)\"$")
	public void user_enters_user_name_password(String username, String password) {
		WebElement uName = driver.findElement(By.id("username"));
	    uName.sendKeys(username);
	      
	      // Passing the password
	      
	    driver.findElement(By.id("password")).sendKeys(password);// Write code here that turns the phrase above into concrete actions
		//System.out.println("Username and password entered successfully");
	}
	    
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();
		// Write code here that turns the phrase above into concrete actions
		//System.out.println("Login button clicked");
	}

	@Then("Login is successful")
	public void login_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login successful");
		String actualText = driver.findElement(By.id("username_show")).getAttribute("value");
		
		String expectedText = "Hello santosh13!";
		assertEquals(actualText, expectedText);
	}

	@Then("search page is displayed")
	public void search_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		String actualTitle = driver.getTitle();
		//System.out.println(actualTitle);
		assertEquals(expectedTitle, actualTitle);
		System.out.println("Search page displayed post login");
		driver.quit();
	}


@When("user selects \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\"$")
public void user_selects(String location, String roomno, String chekin, String chekout, String adults) {

	//Drop down  to select LOCATION
			new Select(driver.findElement(By.className("search_combobox"))).selectByValue(location);
			
		
			//Drop down to select Number of Rooms
			 new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText(roomno);
			 
			 //Date picker-Enter check in date
			 WebElement checkinDate = driver.findElement(By.id("datepick_in"));
			 checkinDate.clear();
			 checkinDate.sendKeys(chekin);
			 
			 //Date picker-Enter checkout date
			 WebElement checkoutDate = driver.findElement(By.id("datepick_out"));
			 checkoutDate.clear();
			 checkoutDate.sendKeys(chekout);
	         
			 //Select Adults per room
			 new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText(adults);
			 
}

@When("user clicks on search button")
public void user_clicks_on_search_button() {
	//Click on Search
	driver.findElement(By.id("Submit")).click();
}

@Then("search results should be displayed")
public void search_results_should_be_displayed() {
System.out.println("Successful search page");
}

@Given("This is a blank test")
public void this_is_a_blank_test() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("This is a test message");
    //throw new io.cucumber.java.PendingException();
}
}
