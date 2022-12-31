package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//1.)Finding the position of the button
		
		WebElement getPosition = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]"));
		Point xypoint = getPosition.getLocation();
		int xvalue = xypoint.getX();
		int yvalue = xypoint.getY();
		System.out.println("x value is : " + xvalue + "  y value is : " + yvalue);
		
		//2.)Find the color of the button
		
		WebElement colorButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]/span"));
		String color = colorButton.getCssValue("background");
		System.out.println("color of the button is : " + color);
		
		//3.)Find the height and width of the button
		
		WebElement getSize = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
		int Height = getSize.getSize().getHeight();
		int Width  =getSize.getSize().getWidth();
		System.out.println("height is : " + Height + " Width is : " + Width);
		
		//4.)Go to Home page
		
		WebElement clickButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]/span"));
		clickButton.click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
