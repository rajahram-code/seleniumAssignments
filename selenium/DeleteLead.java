package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
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

		driver.findElement(By.name("description")).sendKeys("ABCDEFGH");

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Logu");


		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select selecIndus=new Select(industry);
		selecIndus.selectByValue("IND_AEROSPACE");
		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();

		if(title.contains("View Lead")) {
			System.out.println("New Lead Created");
		}

		
		String id ;
		id=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(id);
		id=id.replaceAll("\\D+", "");
		System.out.println(id);
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//label[text()='Lead ID:'])/following-sibling::div/input")).sendKeys(id);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String record = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(record.equals("No records to display")) {
			System.out.println("Record Deleted Successfully");
		}
	}

}
