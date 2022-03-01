package de.telekom.sea7.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import de.telekom.sea7.services.TransactionsService;

@RestController
public class TransactionsController {

	@Autowired
	private TransactionsService transactionsService;

	@GetMapping("/transactions/{id}")
	public TransactionsService getTransactions(@PathVariable(name = "id") int id) {
		return transactionsService.getTransactionsImpl();
	}
	
}
