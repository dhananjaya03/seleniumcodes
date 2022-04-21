
package Demo.Practiceoverallpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		System.out.println("woking");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		System.out.println("findfame1");

		driver.switchTo().frame(frame1);

		System.out.println("switch to frame 1");

		WebElement from = driver.findElement(By.xpath("//*[@class='ui-widget-header']"));

		System.out.println("from");

		WebElement to = driver.findElement(By.id("trash"));

		Actions act = new Actions(driver);

		act.dragAndDrop(from, to).build().perform();

		driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-zoomin']")).click();
		
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
