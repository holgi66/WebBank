package de.telekom.sea7.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.telekom.sea7.repository.BankRepository;

@Service
public class TransactionsService {

	@Autowired
	public BankRepository transactions;

	public BankRepository getTransactionsImpl() {
		return transactions;
	}

}
