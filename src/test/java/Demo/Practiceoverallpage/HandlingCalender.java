package Demo.Practiceoverallpage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCalender {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.get("https://www.path2usa.com/travel-companions");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(By.id("travel_date")).click();

		while (!driver.findElement(By.className("datepicker-switch")).getText().contains("December")) {

			driver.findElement(By.className("next")).click();

		}

		List<WebElement> days = driver.findElements(By.className("day"));

		for (int i = 0; i < days.size(); i++) {

			if (days.get(i).getText().equalsIgnoreCase("15")) {

				days.get(i).click();

				break;
			}
		}

	}

}
