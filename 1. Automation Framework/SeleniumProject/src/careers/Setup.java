package careers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup{
	
	//initialize webdriver
	public static WebDriver driver = new ChromeDriver();
	
	public void BrowserOpen(){
		//Script starts from this URL landing page
		String careers_URL = "https://iprotech.com/careers/";		
		
		//maximize window dimensions
		driver.manage().window().maximize();
		System.out.println("Open Google Chrome browser");
		
		//Open URL in Chrome
		driver.get(careers_URL);
		System.out.println("Open Ipro Careers page");		
	}

}
