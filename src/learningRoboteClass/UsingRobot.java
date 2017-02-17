package learningRoboteClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class UsingRobot {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Software\\geckodriver.exe");
		FirefoxProfile fp = new FirefoxProfile();
		//System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/download");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		//driver.findElement(By.xpath(".//*[@id='mainContent']/table[1]/tbody/tr[1]/td[4]/a")).click();
		
	}

}
