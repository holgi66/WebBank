package de.telekom.sea7.services;

import org.springframework.stereotype.Service;

@Service
public class TransactionsService {

	private TransactionsService transactions = new TransactionsService();

	public TransactionsService getTransactionsImpl() {
		return transactions;
	}
	
	public TransactionsService addTransactionsImpl() {
		return transactions;
	}

	
}
