package de.telekom.sea7.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import de.telekom.sea7.services.TransactionsService;

@RestController
public class TransactionsController {

	@GetMapping("/transactions/")
	public Class<TransactionsService> findAll() {
		return TransactionsService.class;
	}
	
}
