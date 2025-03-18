package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("((//h5[text()='Basic Checkbox'])//following::div)[5]")).click();
		driver.findElement(By.xpath("((//h5[text()='Notification'])//following::div)[5]")).click();
		
		Thread.sleep(3000);

		WebElement popUp = driver.findElement(By.xpath("//span[text()='Checked']"));
		String check = popUp.getText();
		if(check.equals("Checked")) {
			System.out.println("Success");
		}
	}

}
