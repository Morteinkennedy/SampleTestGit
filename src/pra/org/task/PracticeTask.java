package pra.org.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTask {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MORTEIN KENNEDY\\eclipse-workspace\\SampleRealTime\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("Hair Dryer");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		List<WebElement> Elements = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		
	int s=Elements.size();
	System.out.println(s);
	
	for(WebElement x: Elements) {
	System.out.println(x.getText());
	}
	
	WebElement m = Elements.get(0);
	m.click();
	System.out.println(m.getText());
	
	WebElement k = Elements.get(3);
	k.click();
	System.out.println(k.getText());
		
		

	}

}
