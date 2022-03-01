package de.telekom.sea7.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import de.telekom.sea7.repository.BankRepository;

@Service
public class TransactionService {
	
@Autowired
	public BankRepository transaction;

	public BankRepository findById(Id var1) {
		return transaction;
	}

	public BankRepository save() {
		return transaction;
	}

	
}
