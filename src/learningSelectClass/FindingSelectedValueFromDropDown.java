package learningSelectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindingSelectedValueFromDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		Select select = new Select(driver.findElement(By.xpath(".//*[@id='lang-chooser']")));
		System.out.println(select.getFirstSelectedOption().getText());
	}

}
