package Demo.Practiceoverallpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		Thread.sleep(2000);

		driver.findElement(By.name("userid")).sendKeys("hari@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.name("pswrd"));

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

}
