package header;

import org.openqa.selenium.By;
import careers.Setup;

public class Header extends Setup{
	
		public static void MenuLinks() throws InterruptedException{
		HeaderXPaths CareersXPaths = new HeaderXPaths();
		
		System.out.println("Menu links method called");
		
		//Welcome to Ipro Logo/Link
		//driver.findElement(By.xpath(CareersXPaths.welcomeToIpro_logo)).click();
		//System.out.println("Clicked Ipro Logo link");
		
		//Click to expand hamburger menu
		driver.findElement(By.xpath(CareersXPaths.hamburgerMenu)).click();
		System.out.println("Clicked Ipro Menu to expand");
		
		//Captures URL text value and saves it to variable
		String iprodCloudText = driver.findElement(By.xpath(CareersXPaths.menu_iproCloudLink)).getAttribute("innerHTML");
		System.out.println(iprodCloudText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String iprodOnPremText = driver.findElement(By.xpath(CareersXPaths.menu_iproOnPremLink)).getAttribute("innerHTML");
		System.out.println(iprodOnPremText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String iproDesktopText = driver.findElement(By.xpath(CareersXPaths.menu_iproDesktopLink)).getAttribute("innerHTML");
		System.out.println(iproDesktopText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String trialDir360Text = driver.findElement(By.xpath(CareersXPaths.menu_trialDir360Link)).getAttribute("innerHTML");
		System.out.println(trialDir360Text + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String eCaptureText = driver.findElement(By.xpath(CareersXPaths.menu_eCaptureLink)).getAttribute("innerHTML");
		System.out.println(eCaptureText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String iproServicesText = driver.findElement(By.xpath(CareersXPaths.menu_iproServicesLink)).getAttribute("innerHTML");
		System.out.println(iproServicesText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String iproSupportText = driver.findElement(By.xpath(CareersXPaths.menu_iproSupportLink)).getAttribute("innerHTML");
		System.out.println(iproSupportText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String trainingText = driver.findElement(By.xpath(CareersXPaths.menu_trainingLink)).getAttribute("innerHTML");
		System.out.println(trainingText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String aboutIproText = driver.findElement(By.xpath(CareersXPaths.menu_aboutIproLink)).getAttribute("innerHTML");
		System.out.println(aboutIproText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String newsroomText = driver.findElement(By.xpath(CareersXPaths.menu_newsroomLink)).getAttribute("innerHTML");
		System.out.println(newsroomText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String otherSoftwareText = driver.findElement(By.xpath(CareersXPaths.menu_otherSoftwareLink)).getAttribute("innerHTML");
		System.out.println(otherSoftwareText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String helpCenterText = driver.findElement(By.xpath(CareersXPaths.menu_helpCenterLink)).getAttribute("innerHTML");
		System.out.println(helpCenterText + " link displayed in menu");
		
		//Click to collapse menu
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]")).click();
		Thread.sleep(3500);
		System.out.println("Header complete!");
		System.out.println(".");
		System.out.println(". .");
		System.out.println(". . .");
	}
}
