package seleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.id("toolTipTextField"));
		String toolTip = name.getAttribute("placeholder");
		System.out.println(toolTip);

	}

}
