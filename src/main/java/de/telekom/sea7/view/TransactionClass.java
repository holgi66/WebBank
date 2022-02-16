package de.telekom.sea7.view;

import org.springframework.stereotype.Service;

import de.telekom.sea7.viewinter.Transaction;




@Service
public class TransactionClass {
	private Transaction transaction;

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
}
