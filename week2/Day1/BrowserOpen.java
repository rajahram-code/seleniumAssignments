package week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("Title: "+title);

		driver.quit();
	}

}
