package de.telekom.sea7.services;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class TransactionImpl {

	private ArrayList<TransactionImpl> transaction = new ArrayList<>();

	public void getTransactionImpl() {
		TransactionImpl testdata = new TransactionImpl();
		testdata.getReceiver("Receiver");
		testdata.getIban("IBAN");
		testdata.getBic("BIC");
		testdata.getAmount("Amount");
		testdata.getPurpose("Purpose");

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

	private void getReceiver(String string) {
		this.getReceiver(string);

	}

	public void addTransactionImpl() {
		int tester = 1;
		{
			TransactionImpl testdata = new TransactionImpl();
			testdata.setReceiver("Receiver" + tester);
			testdata.setIban("IBAN" + tester);
			testdata.setBic("BIC" + tester);
			testdata.setAmount(tester + tester + tester + 1.33);
			testdata.setPurpose("Purpose" + tester);
			transaction.add(testdata);
		}
	}

	private void setPurpose(String string) {
		this.setPurpose(string);

	}

	private void setAmount(double d) {
		this.setAmount(d);

	}

	private void setBic(String string) {
		this.setBic(string);

	}

	private void setIban(String string) {
		this.setIban(string);

	}

	private void setReceiver(String string) {
		this.setReceiver(string);

	}

	public java.util.Iterator<TransactionImpl> iterator() {
		return transaction.iterator();
	}

}
