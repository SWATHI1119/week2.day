package week2.day2.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click(); 
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("razorfish");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("swathi");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("veeramreddy");
        driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("car and driver");
        driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Health care");
		
        driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("public corporation");
        driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
        driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
     
        driver.findElement(By.className("smallSubmit")).click();
       System.out.println(driver.getTitle());

	}

}
