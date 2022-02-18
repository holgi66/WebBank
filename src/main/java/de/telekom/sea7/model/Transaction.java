package de.telekom.sea7.model;

import java.time.LocalDateTime;

public interface Transaction {
	int getId();
	
	float getAmount();

	Receiver getReceiver();

	Iban getIban();

	String getPurpose();

	LocalDateTime getDate();

	void setId(int id);

}
