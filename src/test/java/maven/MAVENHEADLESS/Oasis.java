
pacage maven.MAVENHEADLESS;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Oasis {
	WebDriver driver;
	String u = "https://k12oasis.pearson.com/ordering/oaLogin.aspx";
	
	
	  @Test (priority=1)
	  public void acorn1() {
		  Cookie name = new Cookie("LB", "acorn1");
			driver.manage().addCookie(name);
			driver.get(u);
			Assert.assertEquals(driver.getTitle(), "Login");
			 
		  
	  }
	  

	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  
		// Declaring and initialize  HtmlUnitWebDriver
			driver = new HtmlUnitDriver();
			driver.get(u);
			
	  }

	  @AfterMethod
	  public void afterMethod(ITestResult result) {
		  
		   
		  
			
			
		if (result.getStatus() == ITestResult.SUCCESS) {
				System.out.println("OASIS OK");
			   } 
			
			if (result.getStatus() == ITestResult.FAILURE) {
				System.out.println("OASIS >>> failed ");
			   } 
			
			if (result.getStatus() == ITestResult.SKIP) {
				System.out.println("OASIS >>> skipped ");
			   } 
			
		  driver.close();
	  }

	}
