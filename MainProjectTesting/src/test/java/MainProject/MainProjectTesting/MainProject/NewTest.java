package MainProject.MainProjectTesting.MainProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  private ChromeDriver driver;

@Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  Actions actions=new Actions(driver);

	  //Home page (Link)
	  driver.get("https://demo.wpeverest.com/user-registration/");
	  driver.manage().window().maximize();
	  
	  //conditional Registeration page
	  Thread.sleep(2000);
	  driver.get("https://demo.wpeverest.com/user-registration/conditional-registration-form/");
	  driver.manage().window().maximize();
	  
	  //01 Radio button 01 vendor
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[contains(@value,'Vendor')]")).click();
	 
	  //Company name
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[contains(@name,'input_box_1569481765')]")).sendKeys("ExperionTechnologies");
	 
	  //vat Number
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"input_box_1569481771\"]")).sendKeys("12345678");
	 
	  //Check box 01 Canon
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"check_box_1569482487_field\"]/ul/li[1]/label")).click();
	  
	  //Check box 02 Nikon
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"check_box_1569482487_field\"]/ul/li[2]/label")).click();
	 
	 
	  //Check box 03 BrotherSoft
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"check_box_1569482487_field\"]/ul/li[3]/label")).click();
	  
	  
	  //Check box 04 sony
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"check_box_1569482487_field\"]/ul/li[4]/label")).click();
	  
	  
	  // User Email
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("experionglobal1234@gmail.com");
	  
      //User Password
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("109876@ashin");
	  
	  
	  
	  //Drop-Down Country Name
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"country_1569483038\"]")).sendKeys("india");
	 
	  

	  //Leave a Note Check Box
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"check_box_1569483464_field\"]/ul/li/label")).click();
	 
	  
   	  //Please Try to be Specific
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"textarea_1569483045\"]")).sendKeys("Nill");
	 
	  
	  
	  
	  //Submit Button or Register Now
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user-registration-form-116\"]/form/div[5]/button")).click();
	  
	 
	  
	  //02 Radio Button 02 suppliers
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"radio_1569481639_field\"]/ul/li[2]/label")).click();
	  
	  
	  //phone
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"phone_1569482700\"]")).sendKeys("04985203084");
	  
	  
	  
	  //website
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"user_url\"]")).sendKeys("www.experionglobal.com");	  
	  
	  
	  
	  // User Email
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("experionglobal1234@gmail.com");
	  
	  
      //User Password
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("1098765@ashin");
	  
	  
	  
	  //Drop-Down Country Name
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"country_1569483038\"]")).sendKeys("Germany");
	 
	  

	  //Leave a Note Check Box
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"check_box_1569483464_field\"]/ul/li/label")).click();
	 
	  
   	  //Please Try to be Specific
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"textarea_1569483045\"]")).sendKeys("Nill");
	 
	  
	  
	  
	  //Submit Button or Register Now
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user-registration-form-116\"]/form/div[5]/button")).click();
	  
	  
	  
	  
	  
	 
	 
	  }

private void click() {
	// TODO Auto-generated method stub
	
}
}
