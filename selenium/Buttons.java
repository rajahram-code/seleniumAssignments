package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String pageTitle = "Dashboard";
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		Thread.sleep(3000);
		String verifyTitle = driver.getTitle();
		if(pageTitle.equals(verifyTitle)) {
			System.out.println("Success");
		}

		driver.navigate(). back();

		WebElement verifyEnable = driver.findElement(By.xpath("(//h5[text()='Confirm if the button is disabled.']/following::button)[1]"));
		//boolean flag = verifyEnable.isEnabled();
				
		if(verifyEnable.isEnabled()) {
			System.out.println("Button is Enabled");
		}
		else System.out.println("Button is disabled");
		
		WebElement position = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		Rectangle rect = position.getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		
		WebElement widthHeight = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		rect=widthHeight.getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		
		WebElement bgv = driver.findElement(By.xpath("//span[text()='Save']"));
		String color=bgv.getCssValue("background");
		System.out.println(color);
	}
}
