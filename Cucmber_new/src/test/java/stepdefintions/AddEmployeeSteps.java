package stepdefintions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeSteps {
	WebDriver driver;
	String Expected="";
	String Actual="";
	@Given("^User Navigate Url \"([^\"]*)\" in a browser$")
	public void launchurl(String url) throws Throwable {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	}

	@When("^user Enter \"([^\"]*)\" in username$")
	public void enterusername(String username) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
	    
	    
	}

	@When("^user Enter \"([^\"]*)\" in password$")
	public void enterpassword(String password) throws Throwable {
	   driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^user clicks login button$")
	public void clicklogin() throws Throwable {
	    driver.findElement(By.name("Submit")).click();
	}

	@When("^user clicks pim button$")
	public void user_clicks_pim_button() throws Throwable {
	    driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	}

	@When("^user click Add button$")
	public void user_click_Add_button() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	}

	@When("^user Enter \"([^\"]*)\" in first name$")
	public void user_Enter_in_first_name(String Firstname) throws Throwable {
	    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(Firstname);
	}

	@When("^user Enter \"([^\"]*)\" in middle name$")
	public void user_Enter_in_middle_name(String Middlename) throws Throwable {
	   driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(Middlename);
	}

	@When("^user Enter \"([^\"]*)\" in last name$")
	public void user_Enter_in_last_name(String Lastname) throws Throwable {
	   driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(Lastname);
	}

	@When("^user Capture EID Before Adding Employee$")
	public void user_Capture_EID_Before_Adding_Employee() throws Throwable {
	   Expected=driver.findElement(By.name("employeeId")).getAttribute("value");
	}

	@When("^user clicks save button$")
	public void user_clicks_save_button() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	  
	}

	@When("^user Capture EID After Adding Employee$")
	public void user_Capture_EID_After_Adding_Employee() throws Throwable {
	  Actual=driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).getAttribute("value");
	}

	@Then("^user validates Eid$")
	public void user_validates_Eid() throws Throwable {
	  if(Expected.equals(Actual))
	  {
		  System.out.println("Add Employee success:"+Expected+"  "+Actual);
	  }
	  else
	  {
		  System.out.println("Add Employee unsuccess:"+Expected+"  "+Actual);
	  }
	}

	@Then("^user close Browser$")
	public void user_close_Browser() throws Throwable {
	   driver.quit();
	}



}
