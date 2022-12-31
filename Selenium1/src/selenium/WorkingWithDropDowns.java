package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(dropdown1);
		select.selectByIndex(4);
		
		WebElement multipleLanguage = driver.findElement(By.id("j_idt87:value_label"));
		Select select1 = new Select(multipleLanguage);
		select1.selectByIndex(0);
		select1.selectByIndex(1);
		select1.selectByIndex(2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		

	}

}
