package maven.MAVENHEADLESS;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartHLess {

	
	WebDriver driver;
	
	String u = "https://www.pearsonschool.com/index.cfm?locator=PSZ3Dd&elementType=Cart&csURL=http%3A%2F%2Fwww%2Epearsonschool%2Ecom%2Findex%2Ecfm&csURLVars=csu_locator%3DPSZ13f";
	
	  @Test (priority=1)
	  public void acorn1() {
		  
		
		
		  
		  
		  
		  Cookie name = new Cookie("LB", "acorn1");
			driver.manage().addCookie(name);
			driver.get(u);
			
			 Assert.assertEquals(driver.getTitle(), "Shopping Cart - Pearson School");
			  
		  
		  
		  
	  }
	  
	  @Test (priority=2)
	  public void acorn2() {
		  
	
		  
		  Cookie name = new Cookie("LB", "acorn2");
			driver.manage().addCookie(name);
			driver.get(u);
			 Assert.assertEquals(driver.getTitle(), "Shopping Cart - Pearson School");
			  
			
		    
	  }
	  
	  
	  @Test (priority=3)
	  public void acorn3() {
		  
		  
		
		  
		  
		  Cookie name = new Cookie("LB", "acorn3");
			driver.manage().addCookie(name);
			driver.get(u);
			 Assert.assertEquals(driver.getTitle(), "Shopping Cart - Pearson School");
			  
			
		  
	  }
	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  driver = new HtmlUnitDriver();
			driver.get(u);
			
	  }

	  @AfterMethod
	  public void afterMethod(ITestResult result) {
		  
		 
		  
		  Set<Cookie> cookiesList =  driver.manage().getCookies();
			for(Cookie getcookies :cookiesList) {
				
				if (getcookies.getName().contains("LB")) {
			    System.out.print(getcookies.getName() +"  "+ getcookies.getValue() + " CART");
				}else {}
			}
			
			
			if (result.getStatus() == ITestResult.SUCCESS) {
				System.out.println("");
			   } 
			
			if (result.getStatus() == ITestResult.FAILURE) {
				System.out.println(" >>> failed ");
			   } 
			
			if (result.getStatus() == ITestResult.SKIP) {
				System.out.println(" >>> skipped ");
			   } 
		  driver.close();
	  }

	}
