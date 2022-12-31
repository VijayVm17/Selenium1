package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
		checkBox.click();
		
		WebElement checkBox1 = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[5]/div/div[2]"));
		checkBox1.click();
		
		WebElement disabledBox = driver.findElement(By.id("j_idt87:j_idt102"));
		boolean disabled = disabledBox.isEnabled();
		System.out.println(disabled);
		
		

	}

}
