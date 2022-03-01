package de.telekom.sea7.view;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.entity.Transaction;
import de.telekom.sea7.repository.BankRepository;
import de.telekom.sea7.services.TransactionService;


@RestController
public class TransactionController {
	
	@Autowired
	private BankRepository repository;


	@GetMapping("/transaction")
	public String getTransaction (Model model, @RequestParam(required = false) Long id) {
		
		Transaction transaction = new Transaction();
		if (id != null) {
			Optional<Transaction> optionalTransaction = repository.findById(id);
			if (optionalTransaction.isPresent()) {
				transaction = optionalTransaction.get();
			}
		}
		model.addAttribute("transaction", transaction);
		return "transaction";
	}

	@PostMapping("/transaction/")
	public Class<TransactionService> save() {
		return TransactionService.class;
		
	}

}
