package careers;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RequestHTTP{
	public static void main(String[] args) {
	     try{
	    	 //makes GET request to api endpoint
	    	 RequestHTTP.call_me();
	        }
	     
	     catch (Exception e){
	    	 //request fails, stack trace is printed in console
	         e.printStackTrace();
	       }
	     }

public static void call_me() throws Exception{
	
	//api endpoint
	//String urlEndpoint = "https://www.paycomonline.net/v4/ats/web.php/jobs/ViewJobDetails?job=20074&clientkey=3A6124B3DD64B211C31C06C8E473BADD";
	String urlEndpoint = "https://www.paycomonline.net/v4/ats/web.php/jobs?clientkey=3A6124B3DD64B211C31C06C8E473BADD";	
	
	URL obj = new URL(urlEndpoint);
	  
	  //invoke connection
	  HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	  
	  // GET request
	  con.setRequestMethod("GET");
	  	  
	  //prints response code
	  int responseCode = con.getResponseCode();
	  System.out.println("Response Code: " + responseCode);
	  
	  //prints response message
	  String apiResponse = con.getResponseMessage();
	  System.out.println("API Response Message: " + apiResponse.toString());
	  
	  //prints response if code is 200
	  if(responseCode != 200)
		  throw new RuntimeException("HTTPResponseCode: " + responseCode);
	  else {
	     BufferedReader in = new BufferedReader(
	             new InputStreamReader(con.getInputStream()));
	     String inputLine;
	     StringBuffer response = new StringBuffer();
	     while ((inputLine = in.readLine()) != null) {
	     	response.append(inputLine);
	     }
	     in.close();	  
	     
	  //print response string
	  System.out.println(response.toString());
	  }
}

}
