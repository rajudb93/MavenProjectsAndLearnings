import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "L:\\Automation\\Eclipse_Workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		
		//Setting the window size
		Dimension dimension=new Dimension(200,300);
		driver.manage().window().setSize(dimension);
		
		//Maximizing the window size
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("confirm")).click();
		//driver.findElement(By.linkText("Selenium143")).click();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='LinkList1']/div/ul/li/a"));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
			
		}
	}

}
