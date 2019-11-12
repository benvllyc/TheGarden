package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Steps{
	//initialize webdriver
	public static WebDriver driver = new ChromeDriver();
	
	@Given("^I open Chrome browser and open careers page$")
	public void i_open_Chrome_browser_and_open_careers_page() throws Throwable {
		//calls method to invoke browser and open url method
				invokeBrowserOpenURL();
	}
	

	@Then("^I check the header of the webpage$")
	public void i_check_the_header_of_the_webpage() throws Throwable{		
		//calls method to begin checking items in header
		checkCareersHeader();
	}

	@Then("^I check the body of the webpage$")
	public void i_check_the_body_of_the_webpage() throws Throwable{
	    //calls method to begin checking items in body
		checkCareersBody();
	}

	@Then("^I check the footer of the webpage$")
	public void i_check_the_footer_of_the_webpage() throws Throwable{
		//calls method to begin checking items in body
		checkCareersFooter();		
	}
	
	///////////////////////////////INTERNAL METHOD DECLARATIONS////////////////////
	
	//invokes new browser and navigates to URL
	void invokeBrowserOpenURL(){
		
		//Script starts from this URL landing page
		String careers_URL = "https://iprotech.com/careers/";		
		
		//maximize window dimensions
		driver.manage().window().maximize();
		System.out.println("Open Google Chrome browser");
		
		//Open URL in Chrome
		driver.get(careers_URL);
		System.out.println("Open Ipro Careers page");
    }
	
	//expands hamburger menu and captures link listed in hamburger menu
	void checkCareersHeader() throws InterruptedException{
		
		//hamburger menu xpath
		String hamburgerMenu = "/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/a[1]/i[1]";
		//Links nested in hamburger menu
		String menu_iproCloudLink = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/strong[1]/a[1]";
		String menu_iproOnPremLink = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/strong[1]/a[1]";
		String menu_iproDesktopLink = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/strong[1]/a[1]";
		String menu_trialDir360Link = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/strong[1]/a[1]";
		String menu_eCaptureLink = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/strong[1]/a[1]";
		String menu_iproServicesLink = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/strong[1]/a[1]";
		String menu_iproSupportLink = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/strong[1]/a[1]";
		String menu_trainingLink = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[10]/strong[1]/a[1]";
		String menu_aboutIproLink = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[11]/strong[1]/a[1]";
		String menu_newsroomLink = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[12]/strong[1]/a[1]";
		String menu_otherSoftwareLink = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[13]/strong[1]/a[1]";
		String menu_helpCenterLink = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[14]/strong[1]/a[1]";
		
		System.out.println("Checking header . . .");
		
		//Click to expand hamburger menu
		driver.findElement(By.xpath(hamburgerMenu)).click();
		System.out.println("Clicked Ipro Menu to expand");
		
		//Captures URL text value and saves it to variable
		String iprodCloudText = driver.findElement(By.xpath(menu_iproCloudLink)).getAttribute("innerHTML");
		System.out.println(iprodCloudText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String iprodOnPremText = driver.findElement(By.xpath(menu_iproOnPremLink)).getAttribute("innerHTML");
		System.out.println(iprodOnPremText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String iproDesktopText = driver.findElement(By.xpath(menu_iproDesktopLink)).getAttribute("innerHTML");
		System.out.println(iproDesktopText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String trialDir360Text = driver.findElement(By.xpath(menu_trialDir360Link)).getAttribute("innerHTML");
		System.out.println(trialDir360Text + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String eCaptureText = driver.findElement(By.xpath(menu_eCaptureLink)).getAttribute("innerHTML");
		System.out.println(eCaptureText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String iproServicesText = driver.findElement(By.xpath(menu_iproServicesLink)).getAttribute("innerHTML");
		System.out.println(iproServicesText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String iproSupportText = driver.findElement(By.xpath(menu_iproSupportLink)).getAttribute("innerHTML");
		System.out.println(iproSupportText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String trainingText = driver.findElement(By.xpath(menu_trainingLink)).getAttribute("innerHTML");
		System.out.println(trainingText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String aboutIproText = driver.findElement(By.xpath(menu_aboutIproLink)).getAttribute("innerHTML");
		System.out.println(aboutIproText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String newsroomText = driver.findElement(By.xpath(menu_newsroomLink)).getAttribute("innerHTML");
		System.out.println(newsroomText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String otherSoftwareText = driver.findElement(By.xpath(menu_otherSoftwareLink)).getAttribute("innerHTML");
		System.out.println(otherSoftwareText + " link displayed in menu");
		
		//Captures URL text value and saves it to variable
		String helpCenterText = driver.findElement(By.xpath(menu_helpCenterLink)).getAttribute("innerHTML");
		System.out.println(helpCenterText + " link displayed in menu");
		
		//Click to collapse menu
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]")).click();
		Thread.sleep(3500);
		System.out.println("Header check complete!");
		System.out.println(".");
		System.out.println(". .");
		System.out.println(". . .");
    }
	
	
	void checkCareersBody(){
		//Life at Ipro Title text
		String iproTitleText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/p[1]/span[1]/b[1]";
		//question text - are you ready?
		String questionText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/p[2]/span[1]/em[1]/strong[1]/span[1]";
		//booming industry text
		String boomingText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/p[3]/span[1]";
		//ipro mission title text
		String missionTitleText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/p[4]";
		//mission description text
		String missionDescText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/p[5]/span[1]";
		//health care title text
		String healthcareTitleText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/h3[1]/strong[1]/span[1]";
		//health care description text
		String healthcareDescText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/p[1]/span[1]";
		//salary and 401k plans title text
		String salaryTitleText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/h3[1]/strong[1]/span[1]";
		//amazing office title text
		String officeTitleText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/h3[1]/strong[1]/strong[1]/span[1]";
		//amazing office description text
		String officeDescText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/p[1]";
		//company culture title text
		String cultureTitleText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/h3[1]/strong[1]/strong[1]/span[1]";
		//company culture description text
		String cultureDescText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/p[1]/strong[1]/span[1]";
		//work life title text
		String workLifeTitleText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/h3[1]/strong[1]/strong[1]/span[1]";
		//work life description text
		String workLifeDescText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/p[1]";
		//team title text
		String teamTitleText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/h3[1]/strong[1]/strong[1]/span[1]";
		//team description text
		String teamDescText = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[2]/p[1]/strong[1]/span[1]";
		//current openings title text
		String currentOpeningsText = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/div[1]/h3[1]/strong[1]/span[1]";
		//job title text
		String jobTitleText = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]";
		//location title text
		String locationTitleText = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]";
		//click job title text
		String clickJobTitleText = "/html[1]/body[1]/div[1]/main[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/p[1]/strong[1]";
		
		//capture and print Life at Ipro text
		String lifeAtIproText = driver.findElement(By.xpath(iproTitleText)).getText();
		System.out.println(lifeAtIproText + " benefit text displayed");
				
		//capture and print Are you ready to join text
		String areYouReadyText = driver.findElement(By.xpath(questionText)).getText();
		System.out.println(areYouReadyText + " question text displayed");
				
		//capture and print scroll for openings text
		String currentOpenText = driver.findElement(By.xpath(boomingText)).getText();
		System.out.println(currentOpenText + " description text displayed");		
				
		//capture and print Ipro mission text
		String iproMissionText = driver.findElement(By.xpath(missionTitleText)).getText();
		System.out.println(iproMissionText + " title text displayed");
				
		//capture and print partnering text
		String iproMissionDescText = driver.findElement(By.xpath(missionDescText)).getText();
		System.out.println(iproMissionDescText + " description text displayed");
		
		//BENEFITS//
		//capture and print healthcare title text
		String iproHealthcareTitleText = driver.findElement(By.xpath(healthcareTitleText)).getText();
		System.out.println(iproHealthcareTitleText + " title text displayed");
		
		//capture and print healthcare description text
		String iproHealthcareDescText = driver.findElement(By.xpath(healthcareDescText)).getText();
		System.out.println(iproHealthcareDescText + " description text displayed");
		
		//capture and print salary title text
		String iproSalaryTitleText = driver.findElement(By.xpath(salaryTitleText)).getText();
		System.out.println(iproSalaryTitleText + " title text displayed");
				
		//capture and print amazing office title text
		String iproOfficeTitleText = driver.findElement(By.xpath(officeTitleText)).getText();
		System.out.println(iproOfficeTitleText + " title text displayed");
		
		//capture and print amazing office description text
		String iproOfficeDescText = driver.findElement(By.xpath(officeDescText)).getText();
		System.out.println(iproOfficeDescText + " description text displayed");
		
		//capture and print culture title text
		String iproCultureTitleText = driver.findElement(By.xpath(cultureTitleText)).getText();
		System.out.println(iproCultureTitleText + " title text displayed");
		
		//capture and print culture description text
		String iproCultureDescText = driver.findElement(By.xpath(cultureDescText)).getText();
		System.out.println(iproCultureDescText + " description text displayed");
		
		//capture and print work/life balance title text
		String iproWorkLifeTitleText = driver.findElement(By.xpath(workLifeTitleText)).getText();
		System.out.println(iproWorkLifeTitleText + " title text displayed");
		
		//capture and print work/life description text
		String iproWorkLifeDescText = driver.findElement(By.xpath(workLifeDescText)).getText();
		System.out.println(iproWorkLifeDescText + " description text displayed");
		
		//capture and print team title text
		String iproTeamTitleText = driver.findElement(By.xpath(teamTitleText)).getText();
		System.out.println(iproTeamTitleText + " title text displayed");
		
		//capture and print team description text
		String iproTeamDescText = driver.findElement(By.xpath(teamDescText)).getText();
		System.out.println(iproTeamDescText + " title text displayed");
		
		System.out.println("Benefits complete!");
		System.out.println(".");
		System.out.println(". .");
		System.out.println(". . .");
		
		//capture and print current openings title text
		String iproOpeningsTitleText = driver.findElement(By.xpath(currentOpeningsText)).getText();
		System.out.println(iproOpeningsTitleText + " title text displayed");
		
		//capture and print job title text
		String iproJobTitleText = driver.findElement(By.xpath(jobTitleText)).getText();
		System.out.println(iproJobTitleText + " title text displayed");
		
		//location title text
		String iproLocationTitleText = driver.findElement(By.xpath(locationTitleText)).getText();
		System.out.println(iproLocationTitleText + " title text displayed");
		
		//location title text
		String iproClickJobTitleText = driver.findElement(By.xpath(clickJobTitleText)).getText();
		System.out.println(iproClickJobTitleText + " title text displayed");
		
		System.out.println("Current Openings complete!");
		System.out.println(".");
		System.out.println(". .");
		System.out.println(". . .");	
		
    }
	
	void checkCareersFooter(){
		//Ipro headquarters
		String iproHQText = "/html[1]/body[1]/div[1]/footer[1]/div[1]/div[1]/div[1]/strong[1]/span[1]";
		//Ipro address hq
		String iproHQAddressText = "/html[1]/body[1]/div[1]/footer[1]/div[1]/div[1]/div[1]/strong[1]/div[2]/p[1]";
		//Ipro simplifying text
		String iproSimplifyText = "/html[1]/body[1]/div[1]/footer[1]/div[1]/div[1]/div[2]/strong[1]/span[1]";
		//Ipro newsletter text
		String iproNewsletterText = "/html[1]/body[1]/div[1]/footer[1]/div[1]/div[1]/div[3]/strong[1]/span[1]";

		//URL links in the footer//
		
		//Support URL
		String supportURL = "/html[1]/body[1]/div[1]/footer[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/strong[1]/a[1]";
		//training URL
		String trainingURL = "/html[1]/body[1]/div[1]/footer[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]/strong[1]/a[1]";
		//Contact Us URL
		String contactUsURL = "/html[1]/body[1]/div[1]/footer[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[3]/strong[1]/a[1]";
		//Careers URL
		String careersURL = "/html[1]/body[1]/div[1]/footer[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/strong[1]/a[1]";
		//Other software URL
		String otherSoftwareURL = "/html[1]/body[1]/div[1]/footer[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[5]/strong[1]/a[1]";
		//eCapture URL
		String eCaptureURL = "/html[1]/body[1]/div[1]/footer[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[6]/strong[1]/a[1]";
		//trial director 360 URL
		String trialDir360URL = "/html[1]/body[1]/div[1]/footer[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[7]/strong[1]/a[1]";
		//ipro tech show URL
		String iproTechShowURL = "/html[1]/body[1]/div[1]/footer[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[8]/strong[1]/a[1]";
		//privacy statement URL
		String privacyStatementURL = "/html[1]/body[1]/div[1]/footer[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[9]/strong[1]/a[1]";
		//ipro events URL
		String iproEventsURL = "/html[1]/body[1]/div[1]/footer[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[10]/strong[1]/a[1]";
		//ipro services URL
		String iproServicesURL = "/html[1]/body[1]/div[1]/footer[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[11]/strong[1]/a[1]";
		//ipro tech, llc URL
		String iproTechLLCURL = "/html[1]/body[1]/div[1]/footer[1]/div[2]/div[1]/div[1]/div[2]/strong[1]/strong[1]/a[1]";
		
		//capture and print ipro hq text
		String HQText = driver.findElement(By.xpath(iproHQText)).getText();
		System.out.println(HQText + " footer text displayed");
		
		//capture and print ipro hq text
		String HQAddressText = driver.findElement(By.xpath(iproHQAddressText)).getText();
		System.out.println(HQAddressText + " footer text displayed");
		
		//capture and print ipro simplifying text
		String simplifyingText = driver.findElement(By.xpath(iproSimplifyText)).getText();
		System.out.println(simplifyingText + " footer text displayed");
		
		//capture and print ipro newsletter text
		String newsletterText = driver.findElement(By.xpath(iproNewsletterText)).getText();
		System.out.println(newsletterText + " footer text displayed");
		
		//capture and print support URL text
		String supportURLText = driver.findElement(By.xpath(supportURL)).getAttribute("innerHTML");
		System.out.println(supportURLText + " footer link displayed");
		
		//capture and print training URL text
		String trainingURLText = driver.findElement(By.xpath(trainingURL)).getAttribute("innerHTML");
		System.out.println(trainingURLText + " footer link displayed");
		
		//capture and print contact us URL text
		String contactUsURLText = driver.findElement(By.xpath(contactUsURL)).getAttribute("innerHTML");
		System.out.println(contactUsURLText + " footer link displayed");
		
		//capture and print careers URL text
		String careersURLText = driver.findElement(By.xpath(careersURL)).getAttribute("innerHTML");
		System.out.println(careersURLText + " footer link displayed");
		
		//capture and print other software URL text
		String otherSoftwareURLText = driver.findElement(By.xpath(otherSoftwareURL)).getAttribute("innerHTML");
		System.out.println(otherSoftwareURLText + " footer link displayed");
		
		//capture and print ECapture URL text
		String eCaptureURLText = driver.findElement(By.xpath(eCaptureURL)).getAttribute("innerHTML");
		System.out.println(eCaptureURLText + " footer link displayed");
		
		//capture and print other Trail Director 360 URL text
		String trialDir360URLText = driver.findElement(By.xpath(trialDir360URL)).getAttribute("innerHTML");
		System.out.println(trialDir360URLText + " footer link displayed");
		
		//capture and print other ipro tech show URL text
		String TechShowURLText = driver.findElement(By.xpath(iproTechShowURL)).getAttribute("innerHTML");
		System.out.println(TechShowURLText + " footer link displayed");
		
		//capture and print other privacy statement URL text
		String privacyStatementURLText = driver.findElement(By.xpath(privacyStatementURL)).getAttribute("innerHTML");
		System.out.println(privacyStatementURLText + " footer link displayed");
		
		//capture and print other ipro events URL text
		String eventsURLText = driver.findElement(By.xpath(iproEventsURL)).getAttribute("innerHTML");
		System.out.println(eventsURLText + " footer link displayed");
			
		//capture and print other ipro services URL text
		String servicesURLText = driver.findElement(By.xpath(iproServicesURL)).getAttribute("innerHTML");
		System.out.println(servicesURLText + " footer link displayed");
		
		//capture and print other ipro tech llc URL text
		String techLLCURLText = driver.findElement(By.xpath(iproTechLLCURL)).getAttribute("innerHTML");
		System.out.println(techLLCURLText + " footer link displayed");
		
	}
	

}