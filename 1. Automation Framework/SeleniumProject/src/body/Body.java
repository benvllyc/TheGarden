package body;

import org.openqa.selenium.By;

import careers.Setup;

public class Body extends Setup{
	
	public static void lifeAtIpro(){
		//invoke benefitsxpaths class for xpath references
		BodyXPaths BenefitsXPaths = new BodyXPaths();
		
		//capture and print Life at Ipro text
		String lifeAtIproText = driver.findElement(By.xpath(BenefitsXPaths.iproTitleText)).getText();
		System.out.println(lifeAtIproText + " benefit text displayed");
		
		//capture and print Are you ready to join text
		String areYouReadyText = driver.findElement(By.xpath(BenefitsXPaths.questionText)).getText();
		System.out.println(areYouReadyText + " question text displayed");
		
		//capture and print scroll for openings text
		String currentOpeningsText = driver.findElement(By.xpath(BenefitsXPaths.boomingText)).getText();
		System.out.println(currentOpeningsText + " description text displayed");		
		
		//capture and print Ipro mission text
		String iproMissionText = driver.findElement(By.xpath(BenefitsXPaths.missionTitleText)).getText();
		System.out.println(iproMissionText + " title text displayed");
		
		//capture and print partnering text
		String iproMissionDescText = driver.findElement(By.xpath(BenefitsXPaths.missionDescText)).getText();
		System.out.println(iproMissionDescText + " description text displayed");		
	}
	
	
	public static void iproBenefits() {
		//invoke benefitsxpaths class for xpath references
		BodyXPaths BenefitsXPaths = new BodyXPaths();
		
		//capture and print healthcare title text
		String iproHealthcareTitleText = driver.findElement(By.xpath(BenefitsXPaths.healthcareTitleText)).getText();
		System.out.println(iproHealthcareTitleText + " title text displayed");
		
		//capture and print healthcare description text
		String iproHealthcareDescText = driver.findElement(By.xpath(BenefitsXPaths.healthcareDescText)).getText();
		System.out.println(iproHealthcareDescText + " description text displayed");
		
		//capture and print salary title text
		String iproSalaryTitleText = driver.findElement(By.xpath(BenefitsXPaths.salaryTitleText)).getText();
		System.out.println(iproSalaryTitleText + " title text displayed");
				
		//capture and print amazing office title text
		String iproOfficeTitleText = driver.findElement(By.xpath(BenefitsXPaths.officeTitleText)).getText();
		System.out.println(iproOfficeTitleText + " title text displayed");
		
		//capture and print amazing office description text
		String iproOfficeDescText = driver.findElement(By.xpath(BenefitsXPaths.officeDescText)).getText();
		System.out.println(iproOfficeDescText + " description text displayed");
		
		//capture and print culture title text
		String iproCultureTitleText = driver.findElement(By.xpath(BenefitsXPaths.cultureTitleText)).getText();
		System.out.println(iproCultureTitleText + " title text displayed");
		
		//capture and print culture description text
		String iproCultureDescText = driver.findElement(By.xpath(BenefitsXPaths.cultureDescText)).getText();
		System.out.println(iproCultureDescText + " description text displayed");
		
		//capture and print work/life balance title text
		String iproWorkLifeTitleText = driver.findElement(By.xpath(BenefitsXPaths.workLifeTitleText)).getText();
		System.out.println(iproWorkLifeTitleText + " title text displayed");
		
		//capture and print work/life description text
		String iproWorkLifeDescText = driver.findElement(By.xpath(BenefitsXPaths.workLifeDescText)).getText();
		System.out.println(iproWorkLifeDescText + " description text displayed");
		
		//capture and print team title text
		String iproTeamTitleText = driver.findElement(By.xpath(BenefitsXPaths.teamTitleText)).getText();
		System.out.println(iproTeamTitleText + " title text displayed");
		
		//capture and print team description text
		String iproTeamDescText = driver.findElement(By.xpath(BenefitsXPaths.teamDescText)).getText();
		System.out.println(iproTeamDescText + " title text displayed");
		
		System.out.println("Benefits complete!");
		System.out.println(".");
		System.out.println(". .");
		System.out.println(". . .");		
	}
	
public static void currentOpenings() {
		//invoke benefitsxpaths class for xpath references
		BodyXPaths BenefitsXPaths = new BodyXPaths();
		
		//capture and print current openings title text
		String iproOpeningsTitleText = driver.findElement(By.xpath(BenefitsXPaths.currentOpeningsText)).getText();
		System.out.println(iproOpeningsTitleText + " title text displayed");
		
		//capture and print job title text
		String iproJobTitleText = driver.findElement(By.xpath(BenefitsXPaths.jobTitleText)).getText();
		System.out.println(iproJobTitleText + " title text displayed");
		
		//location title text
		String iproLocationTitleText = driver.findElement(By.xpath(BenefitsXPaths.locationTitleText)).getText();
		System.out.println(iproLocationTitleText + " title text displayed");
		
		//location title text
		String iproClickJobTitleText = driver.findElement(By.xpath(BenefitsXPaths.clickJobTitleText)).getText();
		System.out.println(iproClickJobTitleText + " title text displayed");
		
		System.out.println("Current Openings complete!");
		System.out.println(".");
		System.out.println(". .");
		System.out.println(". . .");	
	}

}
