package de.telekom.sea7.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TransactionView {
	
	
	@GetMapping("/index.html")
	@ResponseBody
	public String getHtml() {
	String html =
	"<!doctype html>"
	  + "<html>"
	    + " <head>"
	      + " <title>Anzeigen einer Ansicht mit Html</title>"
	    + " </head>"
	      
	    + " <body>"
	      + " <p> Name: </p>"
	      + "</br>"
	      + " <p> Iban: </p>"
	      + "</br>"
	      + " <p> Betrag: </p>"
	      + "</br>"
	      + " <p> Zweck: </p>"
	      + "</br>"
	    + " </body>"
	  + "</html>";
	return html;
	}

//	@GetMapping("/transaction.json")
//	@ResponseBody
//	public String getJSON() {
//		
//			
//		        {"Name:" : "Horst"}
//		           {"IBAN:" : "DE21123456234545"},
//		           {"Betrag:" : "50"},
//		           {"Zweck" : "Steuer"}
//		        		
//		        		
//
//		        		
//					
//	return getJSON();
//	}
}
