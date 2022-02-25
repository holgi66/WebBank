package de.telekom.sea7.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import de.telekom.sea7.services.TransactionImpl;
import de.telekom.sea7.services.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@GetMapping("/transaction/{id}")
	public TransactionService getTransaction(@PathVariable(name = "id") int id) {
		return transactionService.getTransactionImpl();
	}

	@PostMapping("/transaction/")
	public String addTransaction(@RequestBody TransactionImpl transaction) {
		transaction.addTransactionImpl();
		return "add transaction are succesful";

	}

}
