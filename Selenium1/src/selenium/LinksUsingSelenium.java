package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksUsingSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Home Page")).click();    //link (or) 
		                                                                //partiallinktext
		
		

	}

}
