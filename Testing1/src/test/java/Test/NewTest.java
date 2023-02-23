package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  Actions actions=new Actions(driver);
	  driver.get("https://demoqa.com/text-box");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("userName")).sendKeys("Ashin");
	  driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("ashin@gamil.com");
	 // try {
	//Thread.sleep(2000);
	//} catch (InterruptedException e) {
		//TODO Auto-generated catch block
		//e.printStackTrace();
	//}
	  driver.findElement(By.id("currenttAddress")).sendKeys("ashin damodaran payyanur kannur kerala INDIA");
	  driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("payyanur kannur kerala ");
	
	  driver.findElement(By.id("permanentAddress")).sendKeys("ashin damodaran payyanur kannur kerala INDIA");
	  driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("kannur india");
	  
  }
}
