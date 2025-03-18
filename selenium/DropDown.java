package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId")); 
		Select selectDD= new Select(sourceDD);
		selectDD.selectByVisibleText("Cold Call"); 

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("L");
		
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select selecIndus=new Select(industry);
		selecIndus.selectByValue("IND_AEROSPACE");

		driver.findElement(By.name("submitButton")).click();

	}

}
