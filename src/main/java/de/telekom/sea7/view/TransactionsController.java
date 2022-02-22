package de.telekom.sea7.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.model.Transaction;
import de.telekom.sea7.services.TransactionService;

@RestController
public class TransactionsController {
	
	@Autowired
	private TransactionService transactionService;

	@GetMapping ("/transaction/")
	public Transaction getTransaction() {
		return transactionService.getTransaction() ;
		
	}
	
}
