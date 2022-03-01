package de.telekom.sea7.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import de.telekom.sea7.repository.TransactionRepository;

@Service
public class TransactionService {
	
@Autowired
	public TransactionRepository transaction;

	public TransactionRepository findById(Id var1) {
		return transaction;
	}

	public TransactionRepository save() {
		return transaction;
	}

	
}
