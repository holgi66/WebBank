package de.telekom.sea7.view;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import de.telekom.sea7.entity.TransactionsBean;
import de.telekom.sea7.repository.TransactionsRepository;



@RestController
public class TransactionsController {
	
	@Autowired
	private TransactionsRepository transactionsRepository;

	@GetMapping("/transactions/")
	public List<TransactionsBean> getTransactions() {

		List<TransactionsBean> optionalTransactions = transactionsRepository.findAll();
		if (optionalTransactions.add((TransactionsBean) getTransactions())) {
			return optionalTransactions;
		}

		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "keine Einträge vorhanden!");
	}
	
}
