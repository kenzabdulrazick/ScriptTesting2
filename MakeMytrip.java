package scriptTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

// 1. Open the MakeMyTrip website. https://www.makemytrip.com/
//2. Close the Sweet Alert.
//3. Click on the website logo.
//4. Navigate to the "Holiday Packages" section.
//5. Input "Chennai" as the departure city.
//6. Select the first suggested city.
//7. Specify "Goa" as the destination city.
//8. Choose the first city suggestion.
//9. Pick a date from the calendar.
//10. Adjust the number of adults to the maximum allowed.
//11. Click on the apply button.
//12. Set the trip duration to 3-5 nights.
//13. Click on the apply button
//14. Click on the search button.
//15. Skip an automated assistance prompt.
//16. Capture a screenshot of the first vacation package.
//17. Print the current page title.
//18. Close the web browser.
public class MakeMytrip {
public static void main(String Args[]) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");

	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).clear();

	
	
	
}
}
