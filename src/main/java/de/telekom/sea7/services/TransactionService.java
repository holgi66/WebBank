package de.telekom.sea7.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
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
