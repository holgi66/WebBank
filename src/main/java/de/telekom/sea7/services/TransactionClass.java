package de.telekom.sea7.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import de.telekom.sea7.model.Transaction;

@Service
public class TransactionClass {
	@Autowired
	private Transaction transaction;

	public Transaction getTransaction() {
		return transaction;
	}
	

}
