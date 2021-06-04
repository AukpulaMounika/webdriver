package test2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Extestng2 {
WebDriver driver;
@BeforeClass
public void launchb() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\tdgdh\\Downloads\\cdriver\\chromedriver.exe");
driver=new ChromeDriver();
}
@AfterClass
public void over() {
driver.close();
}
@Test
public void Tc1() throws Exception{
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(2000);
	System.out.println("login successfull");
}

}
