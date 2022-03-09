package de.telekom.sea7.view;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import de.telekom.sea7.entity.TransactionEntity;
import de.telekom.sea7.services.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@GetMapping("/transaction/{id}")
	public TransactionEntity getTransaction(@PathVariable("id") Long id) {

		Optional<TransactionEntity> optionalTransaction = transactionService.findById(id);
		if (optionalTransaction.isPresent()) {
			return optionalTransaction.get();
		}

		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ungültige ID!");
	}

	@PostMapping("/transaction/")
	public Class<TransactionService> save() {
		return TransactionService.class;

	}

}
