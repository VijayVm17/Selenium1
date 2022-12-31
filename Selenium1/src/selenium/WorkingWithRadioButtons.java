package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		WebElement Radiobutton1= driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[2]/div/div[2]"));
		Radiobutton1.click();
		
		WebElement AgeButton = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[3]/div/div[2]"));
		AgeButton.click();
		
		WebElement chrome = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[1]/div/div[2]/span"));
		
		
		WebElement firefox = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[2]/div/div[2]/span"));
		
		
		WebElement safari = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/div/div[2]"));
		
		
		WebElement Edge = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[4]/div/div[2]"));
		
		
		boolean status1=chrome.isSelected();
		boolean status2=firefox.isSelected();
		boolean status3=safari.isSelected();
		boolean status4=Edge.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		System.out.println(status3);
		System.out.println(status4);
		

	}

}
