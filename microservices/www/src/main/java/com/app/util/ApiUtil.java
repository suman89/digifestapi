package com.app.util;

public class ApiUtil {
	
	
	

}





/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
 
import org.apache.log4j.Logger;
import org.json.simple.JSONValue;
 
public class Util {
 
       private static Logger log = Logger.getLogger(Util.class);
      
       public static Result getDataFromService(String url, String httpMethod, String apiKey) {
              Result res = new Result();
              StringBuffer response = null;
              try
              {
                     log.debug("Making API call to : "+url);
                    
                     System.setProperty("java.net.useSystemProxies", "true");
                    
                     URL obj = new URL(url);
                     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
           
            con.setRequestMethod(httpMethod); //GET, POST etc
           
            con.setRequestProperty("Accept", "application/json");
                     con.setRequestProperty("Content-Type", "application/json");
                     con.setRequestProperty("Authorization", "SSWS "+apiKey);
 
            //String USER_AGENT="Mozilla//5.0 (Windows NT 6.1) AppleWebKit//537.36 (KHTML, like Gecko) Chrome//41.0.2228.0 Safari//537.36";
            //con.setRequestProperty("User-Agent", USER_AGENT);
 
                     int responseCode = con.getResponseCode();
                     res.setResponseCode(responseCode);
                    
                     if(responseCode!=200)
                     {
                           log.debug("Error occured - Response code : "+res.getResponseCode());
                           return res;
                     }
                     //System.out.println("Response Code : " + responseCode);
                    
                     String linkHeaders = con.getHeaderField("Link");
                     if(linkHeaders!=null)
                     {
                           //<https://mhe.oktapreview.com/api/v1/users?after=00u5yxv1f4tjRv3kj0h7&limit=200&filter=status+eq+%22STAGED%22>; rel="next"
                           String[] headerArr = linkHeaders.split(",");
                           for(String header:headerArr)
                           {
                                  String[] tokens = header.split(";");
                                  if(tokens[1].contains("next"))
                                  {
                                         tokens[0] = tokens[0].trim();
                                         res.setNextPageLink(tokens[0].substring(1, tokens[0].length()-1));
                                         res.setHasNext(true);
                                  }
                            }
                     }
                    
                     BufferedReader in = new BufferedReader(new InputStreamReader(con
                                  .getInputStream()));
                     String inputLine;
                     response = new StringBuffer();
 
                     while ((inputLine = in.readLine()) != null) {
                           response.append(inputLine);
                     }
                     in.close();
                     //System.out.println(response.toString());
                     res.setJsonObj(JSONValue.parse(response.toString()));
              }
              catch (IOException e)
              {
                     log.debug("Could not fetch data from webservice : URL - "+url);
                     log.debug("Response code = "+res.getResponseCode());
                     //log.debug("Response = "+response.toString());
              }
              return res;
       }
}*/