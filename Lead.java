package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lead {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();

ChromeDriver driver= new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");


WebElement userName = driver.findElement(By.id("username"));
userName.sendKeys("DemoCSR");

driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhakti");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Pardikar");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("b");

//driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1")).sendKeys("Selenium course institute");

driver.findElement(By.id("createLeadForm_description")).sendKeys("selenium course");

driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("bhaktipardikar@gmail.com");


WebElement ss= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

Select dd = new Select(ss);
dd.selectByVisibleText("New York");
driver.findElement(By.name("submitButton")).click();





String title = driver.getTitle();

System.out.println(title);

	}

}
