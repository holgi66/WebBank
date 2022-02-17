package de.telekom.sea7.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TransactionsView {
	
	@GetMapping("/transactions.gettransactions")
	@ResponseBody
	public String gettransactions() {
		
		return	String.format(
		    "{ "
		    + "\"Name:\" : \"Horst\","
		    + "\"IBAN:\" : \"DE21123456234545\","
		    + "\"Betrag:\" : \"50\","
		    + "\"Zweck:\" : \"Steuer\"  "
		    + "}");
					
	
	}

}
