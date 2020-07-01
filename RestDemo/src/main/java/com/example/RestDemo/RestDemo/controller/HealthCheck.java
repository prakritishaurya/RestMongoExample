package com.example.RestDemo.RestDemo.controller;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthCheck implements HealthIndicator{

	@Override
	public Health health() {
	
	/*	StringBuilder result = new StringBuilder();
		try {
		
        URL url = new URL("http://localhost:8080/RestClient/actuator/health");        
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.getResponseCode();
        System.out.println(conn.getResponseCode());
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        System.out.println("789");
        while ((line = rd.readLine()) != null) {
           result.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println("Result: "+result.toString());
        JSONParser jsonObject = new JSONParser(result.toString()); 
        System.out.println("jsonObject: "+jsonObject.value());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}*/
            
      //  return "Status of Database is "+jsonObject.va("details").getJSONObject("db").get("status");
	//	 if (s != "up") {
	//	  return Health.down().withDetail("Error Code", s).build();
	//	 }
		 	return Health.up().withDetail("Status", "ok").build();
	}
}
