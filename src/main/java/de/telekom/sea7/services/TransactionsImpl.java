package de.telekom.sea7.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class TransactionsImpl {

	private ArrayList<TransactionsImpl> transactions = new ArrayList<>();

	public void getTransactionsImpl()
	{
		int tester = 1;
		for (int i = 0; i < 20; i++) {
			TransactionsImpl testdata = new TransactionsImpl();
			testdata.getReceiver("Receiver" + tester);
			testdata.getIban("IBAN" + tester);
			testdata.getBIC("BIC" + tester);
			testdata.getAmount(tester + tester + tester + 1.33);
			testdata.getPurpose("Purpose" + tester);
			tester++;
		}
	}

	private void getReceiver(String string) {
		this.getReceiver(string);

	}

	private void getPurpose(String string) {
		this.getPurpose(string);

	}


	private void getAmount(double d) {
		this.getAmount(d);

	}

	private void getBIC(String string) {
		this.getBIC(string);

	}

	private void getIban(String string) {
		this.getIban(string);

	}
	
	public java.util.Iterator<TransactionsImpl> iterator() {
		return transactions.iterator();
	}

}
