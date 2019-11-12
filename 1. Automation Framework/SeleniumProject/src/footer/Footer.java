package footer;

import org.openqa.selenium.By;

import careers.Setup;

public class Footer extends Setup{

	public static void footer3columns(){
	//invoke footerxpaths class for xpath references
	FooterXPaths FooterXPaths = new FooterXPaths();
	
	//capture and print ipro hq text
	String HQText = driver.findElement(By.xpath(FooterXPaths.iproHQText)).getText();
	System.out.println(HQText + " footer text displayed");
	
	//capture and print ipro hq text
	String HQAddressText = driver.findElement(By.xpath(FooterXPaths.iproHQAddressText)).getText();
	System.out.println(HQAddressText + " footer text displayed");
	
	//capture and print ipro simplifying text
	String simplifyingText = driver.findElement(By.xpath(FooterXPaths.iproSimplifyText)).getText();
	System.out.println(simplifyingText + " footer text displayed");
	
	//capture and print ipro newsletter text
	String newsletterText = driver.findElement(By.xpath(FooterXPaths.iproNewsletterText)).getText();
	System.out.println(newsletterText + " footer text displayed");
		
	}
	
	public static void footerLinks(){
	//invoke footerxpaths class for xpath references
	FooterXPaths FooterXPaths = new FooterXPaths();
	
	//capture and print support URL text
	String supportURLText = driver.findElement(By.xpath(FooterXPaths.supportURL)).getAttribute("innerHTML");
	System.out.println(supportURLText + " footer link displayed");
	
	//capture and print training URL text
	String trainingURLText = driver.findElement(By.xpath(FooterXPaths.trainingURL)).getAttribute("innerHTML");
	System.out.println(trainingURLText + " footer link displayed");
	
	//capture and print contact us URL text
	String contactUsURLText = driver.findElement(By.xpath(FooterXPaths.contactUsURL)).getAttribute("innerHTML");
	System.out.println(contactUsURLText + " footer link displayed");
	
	//capture and print careers URL text
	String careersURLText = driver.findElement(By.xpath(FooterXPaths.careersURL)).getAttribute("innerHTML");
	System.out.println(careersURLText + " footer link displayed");
	
	//capture and print other software URL text
	String otherSoftwareURLText = driver.findElement(By.xpath(FooterXPaths.otherSoftwareURL)).getAttribute("innerHTML");
	System.out.println(otherSoftwareURLText + " footer link displayed");
	
	//capture and print ECapture URL text
	String eCaptureURLText = driver.findElement(By.xpath(FooterXPaths.eCaptureURL)).getAttribute("innerHTML");
	System.out.println(eCaptureURLText + " footer link displayed");
	
	//capture and print other Trail Director 360 URL text
	String trialDir360URLText = driver.findElement(By.xpath(FooterXPaths.trialDir360URL)).getAttribute("innerHTML");
	System.out.println(trialDir360URLText + " footer link displayed");
	
	//capture and print other ipro tech show URL text
	String TechShowURLText = driver.findElement(By.xpath(FooterXPaths.iproTechShowURL)).getAttribute("innerHTML");
	System.out.println(TechShowURLText + " footer link displayed");
	
	//capture and print other privacy statement URL text
	String privacyStatementURLText = driver.findElement(By.xpath(FooterXPaths.privacyStatementURL)).getAttribute("innerHTML");
	System.out.println(privacyStatementURLText + " footer link displayed");
	
	//capture and print other ipro events URL text
	String eventsURLText = driver.findElement(By.xpath(FooterXPaths.iproEventsURL)).getAttribute("innerHTML");
	System.out.println(eventsURLText + " footer link displayed");
		
	//capture and print other ipro services URL text
	String servicesURLText = driver.findElement(By.xpath(FooterXPaths.iproServicesURL)).getAttribute("innerHTML");
	System.out.println(servicesURLText + " footer link displayed");
	
	//capture and print other ipro tech llc URL text
	String techLLCURLText = driver.findElement(By.xpath(FooterXPaths.iproTechLLCURL)).getAttribute("innerHTML");
	System.out.println(techLLCURLText + " footer link displayed");
	
	}
}
