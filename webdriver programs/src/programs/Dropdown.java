package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dropdown {
WebDriver driver;
@BeforeClass
public void launch(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\tdgdh\\Downloads\\cdriver\\chromedriver.exe");
driver=new ChromeDriver();
}
@AfterClass
public void close() {
driver.close();
}
@Test
public void testcase1()throws Exception{
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
Thread.sleep(4000);
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
System.out.println("login successful");
Thread.sleep(4000);
}
}
