package careers;

import body.Body;
import footer.Footer;
import header.Header;

public class CareersScript extends Setup{
	
	public static void main(String[] args) throws Exception {

		//create setup class to invoke driver
		Setup initBrowser = new Setup();
		
		//Calls browseropen method
		initBrowser.BrowserOpen();			
		
		//Call Header class menu links method
		Header.MenuLinks();		
				
		//Call body class to verify body information
		Body.lifeAtIpro();
		
		//Call body class to verify benefits information
		Body.iproBenefits();
		
		//Call body class to verify current openings info
		Body.currentOpenings();
		
		//Call footer class to verify footer text in each of the 3 columns
		Footer.footer3columns();
		
		//Call footer class to verify footer links
		Footer.footerLinks();
		
		//api call to check for 200 response
		RequestHTTP.call_me();
		
		//Automation script complete console print
		System.out.println(".:COMPLETE:.");
		
	}

}
