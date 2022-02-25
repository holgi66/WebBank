package de.telekom.sea7.services;



import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class TransactionsService {

	private TransactionsService transactions = new TransactionsService();

	public TransactionsService getTransactionsImpl() {
		return transactions;
	}
	
	public TransactionsService addTransactionsImpl() {
		return transactions;
	}

	public void getReceiver(String string) {
		// TODO Auto-generated method stub
		
	}
}
