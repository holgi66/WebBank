package de.telekom.sea7.view;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import de.telekom.sea7.services.TransactionClass;

@Component
@Controller
public class TransactionView {
	
	@GetMapping("/transaction.getTransaction")
	
	@ResponseBody
	public String getHtml() {
		
		String html=
				"<!doctype html>"
				+"<html>"
				+ "<head>"
				+    "<title>  Web Bank </title>"
				+   "<meta charset=\"UTF-8\">"
				+ "</head>"
				+ "<body>"
				+     "<h1>BANCO del LOSTA</h1>"
				+     "<p>2022/02/15</p>"
				+     "<h2>Losta Monetas</h2>"
				+     "<p>Futschi Kato</p>"
				+     "<p> Olla </p>"
				+     "<p> bei Fragen bitte eine Mail an Niemanden: </p>"
				+ "</body>"
				+"</html>";
		return html;
	}
	
	@ResponseBody
	public TransactionClass getTransactionClass() {
		return getTransactionClass();
	}
	
}
