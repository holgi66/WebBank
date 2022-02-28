package de.telekom.sea7.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.springframework.stereotype.Repository;

@Repository
@Entity
public class BankDb {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private int receiver_ID;
	private int iban_ID;
	private BigDecimal amount;
	private String purpose;
	private Timestamp date;

	public BankDb(int ID, int receiver_ID, int iban_ID, BigDecimal amount, String purpose, Timestamp date) {
		this.ID = ID;
		this.receiver_ID = receiver_ID;
		this.iban_ID = iban_ID;
		this.amount = amount;
		this.purpose = purpose;
		this.date = date;

	}

}
