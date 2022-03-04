package de.telekom.sea7.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.telekom.sea7.repository.TransactionRepository;

@Service
public class TransactionsService {

	@Autowired
	public TransactionRepository transactions;

	public TransactionRepository findAll() {
		return transactions;
	}

}
