package de.telekom.sea7.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.telekom.sea7.repository.BankRepository;

@RestController
public class TransactionsController {
	
	@Autowired
	private BankRepository repository;

	@GetMapping("/transactions")
	public String getTransactions(Model model) {
		model.addAttribute("transactions", repository.findAll());
		
		return "transactions";
	}
	
}
