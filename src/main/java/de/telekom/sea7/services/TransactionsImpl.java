package de.telekom.sea7.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class TransactionsImpl {

	private ArrayList<TransactionsImpl> transactions = new ArrayList<>();

	public void getTransactionsImpl() {
		TransactionsImpl testdata = new TransactionsImpl();
		testdata.getReceiver("Receiver");
		testdata.getIban("IBAN");
		testdata.getBic("BIC");
		testdata.getAmount("Amount");
		testdata.getPurpose("Purpose");
	}

	private void getReceiver(String string) {
		this.getReceiver(string);

	}

	private void getPurpose(String string) {
		this.getPurpose(string);

	}

	private void getAmount(String string) {
		this.getAmount(string);

	}

	private void getBic(String string) {
		this.getBic(string);

	}

	private void getIban(String string) {
		this.getIban(string);

	}

	public java.util.Iterator<TransactionsImpl> iterator() {
		return transactions.iterator();
	}

}
