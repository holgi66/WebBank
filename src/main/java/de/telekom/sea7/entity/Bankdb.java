package de.telekom.sea7.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Entity
public class Bankdb {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private int receiver_ID;
	private int iban_ID;
	private BigDecimal amount;
	private String purpose;
	private Timestamp date;

	public Bankdb(int ID, int receiver_ID, int iban_ID, BigDecimal amount, String purpose, Timestamp date) {
		this.ID = ID;
		this.setReceiver_ID(receiver_ID);
		this.setIban_ID(iban_ID);
		this.setAmount(amount);
		this.setPurpose(purpose);
		this.setDate(date);

	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public int getIban_ID() {
		return iban_ID;
	}

	public void setIban_ID(int iban_ID) {
		this.iban_ID = iban_ID;
	}

	public int getReceiver_ID() {
		return receiver_ID;
	}

	public void setReceiver_ID(int receiver_ID) {
		this.receiver_ID = receiver_ID;
	}

}