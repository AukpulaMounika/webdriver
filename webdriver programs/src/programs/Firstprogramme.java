package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class Firstprogramme  {
public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\Users\\tdgdh\\Downloads\\cdriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
Thread.sleep(4000);
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
driver.findElement(By.name("Submit")).click();
Thread.sleep(4000);
System.out.println("login successful");
WebElement element=driver.findElement(By.linkText("Recruitment"));
Actions action=new Actions(driver);
action.moveToElement(element).perform();
Thread.sleep(4000);
driver.findElement(By.linkText("Candidates")).click();
driver.close();
}
}
