package sample.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Browser_Launch {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SRC = ts.getScreenshotAs(OutputType.FILE);
		File DES = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Maven_TCF\\src\\main\\java\\sample\\com\\sample.png");
		FileUtils.copyFile(SRC, DES);
		
	}

}
