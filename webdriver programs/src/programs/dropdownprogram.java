package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownprogram {

	public static void main(String[] args)throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\Users\\tdgdh\\Downloads\\cdriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://jntuacea.ac.in/student/");
driver.findElement(By.xpath("//input[@name='adm']")).sendKeys("18001D5401");
driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Mounik@1997");
driver.findElement(By.id("loginbtn")).click();
driver.findElement(By.xpath("//a[@class='btn btn-warning btn-lg']")).click();
WebElement e=driver.findElement(By.xpath("//select[@name='selcaste']"));
Select s=new Select(e);
s.selectByVisibleText("OC");
WebElement ele=driver.findElement(By.xpath("//select[@name='sem']"));
Select sel=new Select(ele);
sel.selectByVisibleText("I");
Thread.sleep(4000);
	}

}
