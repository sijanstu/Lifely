/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sijan
 */
public class sendSms {
      sendSms(){
            try {
                HttpResponse<String> response = Unirest.get("https://google-search3.p.rapidapi.com/api/v1/search/q=elon+musk")
	.header("x-user-agent", "desktop")
	.header("x-rapidapi-host", "google-search3.p.rapidapi.com")
	.header("x-rapidapi-key", "4561f4bf73msh42f58920834eec3p194d9fjsnc3f752573d7e")
	.asString();
                        System.err.println(response.getBody());
                        response.toString().startsWith("description");
            } catch (UnirestException ex) {
                Logger.getLogger(sendSms.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
}
