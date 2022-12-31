package seleniumAdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithSelectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/selectable");
		driver.manage().window().maximize();
		
		//1. Total no of selectables 
		
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\"verticalListContainer\"]/li"));
		int size = selectable.size();
		System.out.println(size);
		
		Actions keyboard = new Actions(driver);
		keyboard.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).click(selectable.get(3)).build().perform();
		
	//	Actions keyboard1 = new Actions(driver);

		//	keyboard1.clickAndHold(selectable.get(0));
		//	keyboard1.clickAndHold(selectable.get(1));
		//keyboard1.clickAndHold(selectable.get(2));
		//keyboard1.clickAndHold(selectable.get(3));
		//keyboard1.build().perform();
		
		
		
		
		

	}

}
