package seleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.drag and drop
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("form:drag_content"));
		WebElement to = driver.findElement(By.id("form:drop_header"));
		
		Actions perform = new Actions(driver);
		//perform.clickAndHold(from).moveToElement(to).release(to).build().perform();
		perform.dragAndDrop(from, to).build().perform();
		
		//2. drag me around
		
		WebElement from1 = driver.findElement(By.id("form:conpnl_header"));
		WebElement to2 = driver.findElement(By.xpath("//*[@id=\"form:restrictPanel\"]/div"));
		
		Actions perform1 = new Actions(driver);
		perform1.clickAndHold(from1).moveToElement(to2, 0, 0).build().perform();
		

	}

}
