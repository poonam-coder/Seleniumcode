package Locatorexample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locatorstest {
@Test
public void LDtest() {
		  
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\poonam\\Documents\\LeanFT\\MSI\\Micro Focus\\LeanFT\\bin\\WebDriver\\chromedriver.exe");  
	      
	       // Instantiate a ChromeDriver class.       
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("http://www.javatpoint.com/");
	    driver.manage().window().maximize();
	    JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");
        driver.findElement(By.linkText("Java")).click();
        driver.close();

	}

}
