package week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {


	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main"); 
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		
	}

}


