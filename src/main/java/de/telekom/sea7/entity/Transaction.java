package de.telekom.sea7.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int receiver_ID;
	private int iban_ID;
	private BigDecimal amount;
	private String purpose;
	private Timestamp date;

	public Transaction() {
	}

}
