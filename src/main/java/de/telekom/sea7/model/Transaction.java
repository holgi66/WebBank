package de.telekom.sea7.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;

@Controller

public interface Transaction {
	
	int getId();

	float getAmount();
	
	Receiver getReceiver();

	Iban getIban();
	
	String getPurpose();
	
	LocalDateTime getDate();
	
	void setId(int id);

}
