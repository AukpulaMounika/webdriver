package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {
WebDriver driver;
@BeforeClass
public void launch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\tdgdh\\Downloads\\cdriver\\chromedriver.exe");
	driver=new ChromeDriver();
}
@AfterClass
public void close(){
	driver.close();
	
}
@BeforeMethod
@Test
public void tc1() {
	driver.navigate().to("http://jntuacea.ac.in/student/");
	driver.findElement(By.xpath("//input[@name='adm']")).sendKeys("18001D5401");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Mounik@1997");
	driver.findElement(By.id("loginbtn")).click();
	
}
@Test
public void dropdown()throws Exception {
	driver.findElement(By.xpath("//a[@class='btn btn-warning btn-lg']")).click();
	WebElement e=driver.findElement(By.xpath("//select[@name='selcaste']"));
	Select s=new Select(e);
	s.selectByVisibleText("BC-A");
	WebElement ele=driver.findElement(By.xpath("//select[@name='sem']"));
	Select sel=new Select(ele);
	sel.selectByVisibleText("I");
	Thread.sleep(4000);
}

}
