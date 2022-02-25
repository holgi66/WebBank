package de.telekom.sea7.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import de.telekom.sea7.model.Iban;
import de.telekom.sea7.model.Receiver1;
import de.telekom.sea7.model.Transaction;
import de.telekom.sea7.model.Transactions;

@Service
public class TransactionsImpl implements Transactions {

	private ArrayList<Transactions<transactions>> transactions = new ArrayList<>();

	public void addTestData(int range) {
		int tester = 1;
		for (int i=0; i< range; i++) {
			Transaction testdata = new TransactionService();
			testdata.setReceiver("Receiver" + tester);
			testdata.setIban("IBAN" + tester);
			testdata.setBIC("BIC" + tester);
			testdata.setAmount(tester+tester+tester + 1.33);
			testdata.setCurrency("EURO");
			testdata.setPurpose("Purpose" + tester);
			transactions.add(testdata);
			tester++;
		}
	}

	
	
	
	
	
	
	
	public void add(Transactions transactions) {
transactions.add(transactions);
		
	}

	public Iterator iterator() {
		return TransactionsImpl.iterator();
	}

	public int getIndex(Transaction nr) {
		return this.transactions.indexOf(nr);

	}

	public Transaction getTransaction(int index) {
		return (Transaction) TransactionImpl.get(index);
	}

}
