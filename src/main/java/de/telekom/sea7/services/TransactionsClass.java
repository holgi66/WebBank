package de.telekom.sea7.services;

import org.springframework.beans.factory.annotation.Autowired;

import de.telekom.sea7.model.Transactions;

public class TransactionsClass {
	@Autowired
	private Transactions transactions;

	public Transactions getTransactions() {
		return transactions;
	}
}
