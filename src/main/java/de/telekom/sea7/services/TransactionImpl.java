package de.telekom.sea7.services;

import java.time.LocalDateTime;

import de.telekom.sea7.model.Iban;
import de.telekom.sea7.model.Receiver;
import de.telekom.sea7.model.Transaction;

public class TransactionImpl implements Transaction {

	private float amount;
	private int id;
	private Receiver receiver;
	private Iban iban;
	private String purpose;
	private LocalDateTime date;

	public TransactionImpl(Object parent, float amount, Receiver receiver, Iban iban, String purpose,
			LocalDateTime date) {
		super();
		this.amount = amount;
		this.receiver = receiver;
		this.iban = iban;
		this.purpose = purpose;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	public Iban getIban() {
		return iban;
	}

	public void setIban(Iban iban) {
		this.iban = iban;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}
