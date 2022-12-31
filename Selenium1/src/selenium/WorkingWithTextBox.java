package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WorkingWithTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		WebElement nameBox = driver.findElement(By.id("j_idt88:name"));
		nameBox.sendKeys("fifa");
		
		WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		appendBox.sendKeys(" america");
		
		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
		clearBox.clear();
		
		WebElement getText = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		String value = getText.getAttribute("value");
		System.out.println(value);
		
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);
		
		
		
		
		
		
		
		
		
		

	}

}
