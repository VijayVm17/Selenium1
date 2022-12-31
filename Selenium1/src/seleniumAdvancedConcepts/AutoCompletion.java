package seleniumAdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/auto-complete");
		driver.manage().window().maximize();

		WebElement keys = driver.findElement(By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]/div/div[1]"));
		keys.sendKeys("r");

		List<WebElement> optionsCheck = driver.findElements(By.xpath("//*[@id=\"autoCompleteSingle\"]/span/li"));

		System.out.println(optionsCheck.size());

		for (WebElement webElement : optionsCheck) {
			if(webElement.getText().equals("purple")) {
			webElement.click();
			System.out.println("1st part");
			break;
		} else {

			System.out.println("else part");
		}




	}

	}
}
