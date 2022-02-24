package de.telekom.sea7.services;

import org.springframework.stereotype.Service;
import de.telekom.sea7.model.Transaction;

@Service
public class TransactionService {

	public Transaction transaction = new TransactionImpl();

	public Transaction getTransactionImpl() {
		return transaction;
	}

}
