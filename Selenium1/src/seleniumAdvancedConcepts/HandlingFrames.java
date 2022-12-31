package seleniumAdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node015p66acnt1vsv148cgu2cthln9448660.node0");
		driver.manage().window().maximize();
		
		//1. click inside frame
		
		driver.switchTo().frame(0);
		WebElement clickButton = driver.findElement(By.id("Click"));
		clickButton.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		//2. click inside Nested frame
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		
		
		WebElement button2 = driver.findElement(By.id("Click"));
		button2.click();
		
		String text1 = driver.findElement(By.id("Click")).getText();
		System.out.println(text1);
		
		//3. Counting the frames
		
		driver.switchTo().defaultContent();
		
		List<WebElement> countFrames = driver.findElements(By.tagName("iframe"));
		int count = countFrames.size();
		System.out.println(count);
		
		
		
		
		
		
		
		

	}

}
