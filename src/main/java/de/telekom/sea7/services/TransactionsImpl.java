package de.telekom.sea7.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import org.springframework.stereotype.Service;

@Service
public class TransactionsImpl {

	private ArrayList<TransactionsImpl> transactions = new ArrayList<>();

	public void getTransactionsImpl {
		int tester = 1;
		for (int i=0; i<20 ; i++) {
			TransactionsImpl testdata = new TransactionsImpl();
			testdata.getReceiver("Receiver" + tester);
			testdata.getIban("IBAN" + tester);
			testdata.getBIC("BIC" + tester);
			testdata.getAmount(tester+tester+tester + 1.33);
			testdata.getCurrency("EURO");
			testdata.getPurpose("Purpose" + tester);
			tester++;
		}
	}
	private void getReceiver(String string) {
		// TODO Auto-generated method stub
		
	}
	private void getPurpose(String string) {
		// TODO Auto-generated method stub
		
	}
	private void getCurrency(String string) {
		// TODO Auto-generated method stub
		
	}
	private void getAmount(double d) {
		// TODO Auto-generated method stub
		
	}
	private void getBIC(String string) {
		// TODO Auto-generated method stub
		
	}
	private void getIban(String string) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	

		
	

	}


