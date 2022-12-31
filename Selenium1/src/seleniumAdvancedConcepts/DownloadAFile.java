package seleniumAdvancedConcepts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadAFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		
		WebElement downloadFile = driver.findElement(By.id("downloadButton"));
		downloadFile.click();
		
		File fileName = new File("C:\\Users\\Chidambarm UFG\\Downloads\\Vijay");
		File[] totalFiles = fileName.listFiles();
		
		for (File file : totalFiles) {
		if	(file.getName().equals("samplefile.jpeg")) {
			System.out.println("file is downloaded");
			break;
		}
		}

	}

}
