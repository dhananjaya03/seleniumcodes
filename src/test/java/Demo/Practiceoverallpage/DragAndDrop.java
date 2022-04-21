package Demo.Practiceoverallpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		WebElement frame1 = driver.findElement(By.className("gallery"));

		driver.switchTo().frame(frame1);

		WebElement from = driver
				.findElement(By.className("ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle"));

		WebElement frame2 = driver.findElement(By.id("trash"));

		driver.switchTo().frame(frame2);

		WebElement to = driver.findElement(By.id("trash"));

		Actions act = new Actions(driver);

		act.dragAndDrop(from, to).build().perform();

	}

}
