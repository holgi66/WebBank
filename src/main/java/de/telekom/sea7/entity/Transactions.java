package de.telekom.sea7.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import de.telekom.sea7.entity.Iban;
import de.telekom.sea7.entity.Receiver;
import de.telekom.sea7.repository.IbanRepository;
import de.telekom.sea7.repository.ReceiverRepository;

@Entity
public class Transactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private BigDecimal amount;
	private String purpose;
	private Timestamp date;

	@ManyToOne
	@JoinColumn(name = "iban_id")
	private String iban;
	@JoinColumn(name = "receiver_id")
    private String receiver;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getIban(String Long) {
		Iban restoration = IbanRepository.findById(Long).get();
		return iban;
	}
	
	public void setIban(String iban) {
		this.iban = iban;
	}
	
	public String getReceiver(Object Long) {
		Receiver restoration = ReceiverRepository.findById(Long).get();
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	public Transactions() {
	}



}
