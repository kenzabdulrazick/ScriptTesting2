package scriptTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


		//1.Lanuch the browser and Handle the Notification
		//2.Maximize the window and add wait
		//3.Load the Url(https://www.tatacliq.com/)
		//4.MouseHover on Brands
		//5.click Watches & Accessories
		//6.Choose the first option from the Brand dispaly
		//7.Select sort by-New Arrivals
		//8.Click Men check box
		//9.Print all price of watches(take only numbers)
		//10.Print the watch price
		//11.click the second loaded result
		//12.Handle the window and Print the price of the watch
		//13.Compare two price and print Both price are equal
		//14.Click Add to Bag
		//15.Check the bag count
		//16.Click the cart bag
		//17.Take snapshot of result 
		//18.Close the open window
		//19.Close the browser

	

	
public class Tatacliq {
	public static void main(String Args[]){
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		
		driver.findElement(By.xpath("//div[text()='Brands']")).click();
		
		driver.findElement(By.xpath("//div[text()='Watches & Accessories']")).click();
		
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		WebElement sortby = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		
		Select Dropdowm=new Select(sortby);
		
		Dropdowm.selectByVisibleText("New Arrivals");
		
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilName']")).click();
		
		driver.findElement(By.xpath("//div[@class='Accordion__filterAccHolder']")).click();
		
	
	}
}
