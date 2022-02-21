package de.telekom.sea7.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import de.telekom.sea7.model.Transaction;

@Service
public class TransactionClass {
	
	public Transaction transaction;
@Bean
	public Transaction getTransaction() {
		return transaction;
	}
	

}

