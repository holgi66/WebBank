package de.telekom.sea7.view;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import de.telekom.sea7.entity.TransactionsEntity;
import de.telekom.sea7.repository.TransactionsRepository;
import de.telekom.sea7.services.TransactionsService;



@RestController
public class TransactionsController {
	
	@Autowired
	private TransactionsService transactionsService;

	@GetMapping("/transactions/")
	public List<TransactionsEntity> getTransactions() {

		List<TransactionsEntity> optionalTransactions = optionalTransactions.findAll();
		if (optionalTransactions.add((TransactionsEntity) getTransactions())) {
			return optionalTransactions;
		}

		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "keine Einträge vorhanden!");
	}
	
}
