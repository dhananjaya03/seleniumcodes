package Demo.Practiceoverallpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Select dropProducts = new Select(driver.findElement(By.className("col-lg-3")));

		Thread.sleep(5000);

		dropProducts.selectByValue("Google");

		Select dropFoodMulty = new Select(driver.findElement(By.xpath("//select[@id='second']")));

		dropFoodMulty.selectByVisibleText("Burger");

		dropFoodMulty.selectByIndex(3);

	}

}
