package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1.)Alert
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		WebElement Alert = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		Alert.click();
		
		Alert alertbutton = driver.switchTo().alert();
		Thread.sleep(3000);
		alertbutton.accept();
		
		//2.)confirm alert
		
		WebElement confirmAlert = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		confirmAlert.click();
		
		Alert AlertConfirm= driver.switchTo().alert();
		Thread.sleep(3000);
		AlertConfirm.dismiss();
		
		
		//3.)prompt alert
		
		WebElement promptAlert = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		promptAlert.click();
		
		Alert AlertPrompt = driver.switchTo().alert();
		AlertPrompt.sendKeys("Avengers");
		Thread.sleep(3000);
		AlertPrompt.accept();
		
		
		
		
		
		
		

	}

}
