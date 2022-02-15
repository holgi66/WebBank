package de.telekom.sea7.impl.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;

import de.telekom.sea7.impl.BaseObjectImpl;
import de.telekom.sea7.impl.view.RepositoryTransactionViewClass;
import de.telekom.sea7.inter.model.Iban;
import de.telekom.sea7.inter.model.Receiver;
import de.telekom.sea7.inter.model.Transaction;

@Controller
public class TransactionClass extends BaseObjectImpl implements Transaction{

	

	private float amount;

	private int id;

	private Receiver receiver; 

	private Iban iban;

	private String purpose;

	private LocalDateTime date;
	

	public TransactionClass(RepositoryTransactionViewClass parent, Float amount, Receiver receiverObject,
			Iban ibanObject, String purpose, LocalDateTime date, Iban iban, Receiver receiver) {
		// TODO Auto-generated constructor stub
		super(parent);
		this.amount = amount;
		this.receiver = receiver;
		this.iban = iban;
		this.purpose = purpose;
		this.date = date;
	}



	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public float getAmount() {
		return amount;
	}

	@Override
	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public Receiver getReceiver() {
		return receiver;
	}

	@Override
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public Iban getIban() {
		return iban;
	}

	@Override
	public void setIban(Iban iban) {
		this.iban = iban;
	}

	@Override
	public String getPurpose() {
		return purpose;
	}

	@Override
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Override
	public LocalDateTime getDate() {
		return date;
	}

	@Override
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	
}
