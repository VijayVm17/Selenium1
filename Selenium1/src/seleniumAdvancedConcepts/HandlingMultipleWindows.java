package seleniumAdvancedConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		String oldWindow = driver.getWindowHandle();
		
		WebElement firstButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
		firstButton.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newWindow : handles) {
			
			driver.switchTo().window(newWindow);
			
		}
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
		element.click();
		
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"menuform:m_input\"]/a"));
		textBox.click();
		driver.close();
		
		//2.find the number of Windows 
		
		driver.switchTo().window(oldWindow);
		
		WebElement multipleWindows = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
		multipleWindows.click();
		
		int numberOfWindows = driver.getWindowHandles().size();
		System.out.println("No of windows opened : "  + numberOfWindows);
		
		//3.close all windows except parent window 
		
		WebElement openPrimaryWindows = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		openPrimaryWindows.click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for (String allWindows : windows) {
			if(!allWindows.equals(oldWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
			
			
		}
	driver.quit();
		

	}

}
