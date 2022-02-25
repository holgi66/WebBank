package de.telekom.sea7.services;



import org.springframework.stereotype.Service;
import de.telekom.sea7.model.Transactions;

@Service
public class TransactionsService {

	private Transactions transactions = new TransactionsImpl();

	public Transactions getTransactionsImpl() {
		return transactions;
	}
}
