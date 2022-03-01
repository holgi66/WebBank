package de.telekom.sea7.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import de.telekom.sea7.services.TransactionService;

@RestController
public class TransactionController {


	@GetMapping("/transaction/{ID}")
	public Class<TransactionService> findById() {
		return TransactionService.class;
	}

	@PostMapping("/transaction/")
	public Class<TransactionService> save() {
		return TransactionService.class;
		
	}

}
