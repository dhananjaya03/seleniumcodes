package Demo.Practiceoverallpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.makemytrip.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		WebElement logo = driver.findElement(By.xpath("//*[@alt='Make My Trip']"));

		Thread.sleep(2000);

		Actions actions = new Actions(driver);

		actions.moveToElement(logo).click().build().perform();

		driver.findElement(By.id("fromCity")).click();

		driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys("del");

		int i = 0;

		while (i < 4) {

			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys(Keys.DOWN);

			i++;

		}
		driver.findElement(By.xpath("//*[@placeholder='From']")).sendKeys(Keys.ENTER);

	} 
  
}
