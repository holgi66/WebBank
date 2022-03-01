package de.telekom.sea7.services;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {
	

	public TransactionService transaction = new TransactionService();

	public TransactionService getTransactionImpl() {
		return transaction;
	}

	public TransactionService addTransactionImpl() {
		return transaction;
	}

	
}
