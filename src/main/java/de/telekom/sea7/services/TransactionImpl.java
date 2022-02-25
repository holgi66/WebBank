package de.telekom.sea7.services;


import java.util.ArrayList;
import org.springframework.stereotype.Service;


@Service
public class TransactionImpl {
	
	private ArrayList<TransactionImpl> transaction = new ArrayList<>();
	
	
	public void getTransactionImpl() {
		return;
	}
	
	
	
	
	public void addTransactionImpl() {
		int tester =1;
		 {
			TransactionImpl testdata = new TransactionImpl();
			testdata.setReceiver("Receiver" + tester);
			testdata.setIban("IBAN" + tester);
			testdata.setBic("BIC" + tester);
			testdata.setAmount("Amount" + tester);
			testdata.setPurpose("Purpose" + tester);
			transaction.add(testdata);			
		}
	}
	

	private void setPurpose(String string) {
		this.setPurpose(string);
		
	}

	private void setAmount(String string) {
		this.setAmount(string);
		
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
