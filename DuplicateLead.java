package week2.day1;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tech");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gaurii");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rane");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("G");
		
		driver.findElement(By.name("departmentName")).sendKeys("Computer");
		
		driver.findElement(By.name("description")).sendKeys("Computer course");
		
		driver.findElement(By.name("primaryEmail")).sendKeys("Gaurii@gmal.com");
		 
		WebElement ss = driver.findElement(By.name("generalStateProvinceGeoId"));
		
		Select dd = new Select(ss);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		
	String	Title = driver.getTitle();
	
	driver.findElement(By.linkText("Duplicate Lead")).click();
	
	
	
	driver.findElement(By.id("createLeadForm_companyName")).clear();	
	
	driver.findElement(By.name("submitButton")).click();
	
	
	String aa = driver.getTitle();
	
	System.out.println(aa);
	

			
	

	}}
