package de.telekom.sea7.view;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.entity.Transactions;
import de.telekom.sea7.repository.TransactionsRepository;
import de.telekom.sea7.services.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionsRepository repository;

	@GetMapping("/transaction/{id}")
	public Transactions getTransaction(@PathVariable("id") Long id) {

		Optional<Transactions> optionalTransaction = repository.findById(id);
		if (optionalTransaction.isPresent()) {
			return optionalTransaction.get();
		}

		return null;
	}

	@PostMapping("/transaction/")
	public Class<TransactionService> save() {
		return TransactionService.class;

	}

}
