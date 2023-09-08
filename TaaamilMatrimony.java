package scriptTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaaamilMatrimony {
public static void main(String Args[]) {

	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.tamilmatrimony.in/");
	WebElement profile = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
	Select set=new Select(profile);
	set.selectByVisibleText("Myself");
	driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Kenz");
	driver.findElement(By.xpath("//input[@id='gendermale']")).click();
	WebElement day = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
	Select days= new Select(day);
	days.selectByValue("10");
	
	WebElement month = driver.findElement(By.xpath("//select[@id='DOBMONTH']"));
	Select months= new Select(month);
	months.selectByVisibleText("June");
	WebElement year = driver.findElement(By.xpath("//select[@id='DOBYEAR']"));
	Select years= new Select(year);
	years.selectByValue("2000");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement religous = driver.findElement(By.xpath("//select[@id='RELIGION']"));
	Select relig = new Select(religous);
	relig.selectByVisibleText("Muslim - Others");
	
	WebElement mothertongue = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
	Select mother=new Select(mothertongue);
	mother.selectByVisibleText("Malayalam");
	
	
	WebElement country = driver.findElement(By.xpath("//select[@id='COUNTRY']"));
	Select coun=new Select(country);
	coun.selectByVisibleText("India");
	
	WebElement countrycode = driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
	Select code=new Select(countrycode);
	code.selectByValue("98");
	driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9633722424");

	

	driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("kenzie@gmail.com");
	
	driver.close();
}
}
