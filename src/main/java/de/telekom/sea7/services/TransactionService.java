package de.telekom.sea7.services;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import de.telekom.sea7.model.Iban;
import de.telekom.sea7.model.Receiver;
import de.telekom.sea7.model.Transaction;

@Service
public class TransactionService {
	
	public Transaction transaction = new TransactionImpl();

	public Transaction getTransactionImpl() {
		return transaction;
	}
	

}

