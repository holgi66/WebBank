package de.telekom.sea7.impl.view;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Controller;

import de.telekom.sea7.impl.BaseObjectImpl;
import de.telekom.sea7.impl.model.BicImpl;
import de.telekom.sea7.impl.model.IbanImpl;
import de.telekom.sea7.impl.model.ReceiverImpl;
import de.telekom.sea7.impl.model.RepositoryBicImpl;
import de.telekom.sea7.impl.model.RepositoryIbanImpl;
import de.telekom.sea7.impl.model.RepositoryReceiverImpl;
import de.telekom.sea7.impl.model.TransactionClass;
import de.telekom.sea7.inter.model.Bic;
import de.telekom.sea7.inter.model.Iban;
import de.telekom.sea7.inter.model.Receiver;
import de.telekom.sea7.inter.model.Repository;
import de.telekom.sea7.inter.model.Transaction;
import de.telekom.sea7.inter.view.RepositoryTransactionView;

@Controller
public class RepositoryTransactionViewClass extends BaseObjectImpl implements RepositoryTransactionView {

	private Repository<Transaction> transactionRepo;
	private Scanner scanner;

	public RepositoryTransactionViewClass(Object parent, Scanner scanner, Repository<Transaction> transactionRepo) {
		super(parent);
		this.transactionRepo = transactionRepo;
		this.scanner = scanner;
	}

	// menu
	@Override
	public void menu() {
		String input = "";
		while (!input.equals("exit")) {
			System.out.println("Enter show, showAll, remove, add or exit to navigate.");
			System.out.println("Enter something:");
			input = this.scanner.next();
			this.scanner.nextLine();
			switch (input) {
			case "show":
				show();
				break;
			case "showAll":
				showAll();
				break;
			case "add":
				add();
				break;
			case "remove":
				remove();
				break;
			case "update":
				update();
				break;
			case "exit":
				break;
			default:
				System.out.println("Command unknown");
			}
		}
	}

	public void update() {
		System.out.println("Enter position number of transaction you want to update: ");
		int id = this.scanner.nextInt();
		this.scanner.nextLine();

		System.out.println("Enter receiver name: ");
		String name = this.scanner.nextLine();

		System.out.println("Enter IBAN: ");
		String iban = this.scanner.nextLine();

		System.out.println("Enter BIC: ");
		String bic = this.scanner.nextLine();

		System.out.println("Enter institute: ");
		String institute = this.scanner.nextLine();

		System.out.println("Enter purpose: ");
		String purpose = this.scanner.nextLine();

		System.out.println("Enter amount: ");
		while (!this.scanner.hasNextFloat()) {
			System.out.println("Your entered value");
			this.scanner.next();
		}
		Float amount = this.scanner.nextFloat();
		this.scanner.nextLine();

		try {
			Transaction transaction = transactionRepo.get(id);
			transaction.setAmount(amount);
			transaction.setPurpose(purpose);

			Repository<Receiver> receiverRepo = new RepositoryReceiverImpl(this);
			Receiver receiverObject = receiverRepo.get(transaction.getReceiver().getId());
			receiverObject.setName(name);

			Repository<Iban> ibanRepo = new RepositoryIbanImpl(this);
			Iban ibanObject = ibanRepo.get(transaction.getIban().getId());
			ibanObject.setIban(iban);

			Repository<Bic> bicRepo = new RepositoryBicImpl(this);
			Bic bicObject = bicRepo.get(ibanObject.getBic().getId());
			bicObject.setBic(bic);
			bicObject.setInstitute(institute);
			transactionRepo.update(transaction);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void remove() {
		System.out.println("Enter position number of transaction: ");
		int index = this.scanner.nextInt();

		transactionRepo.remove(index);
	}

	// show
	@Override
	public void showAll() {
		try {
			List<Transaction> transactionList = transactionRepo.getAll();
			for (Transaction transaction : transactionList) {
				System.out.println("ID: " + transaction.getId());
				System.out.println("Receiver: " + transaction.getReceiver().getName());
				System.out.println("IBAN: " + transaction.getIban().getIban());
				System.out.println("Amount: " + transaction.getAmount());
				System.out.println("Purpose: " + transaction.getPurpose());
				System.out.println("Date: " + transaction.getDate());
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	// showOne
	@Override
	public void show() {
		System.out.println("Enter position number of transaction: ");
		int index = this.scanner.nextInt();

		try {
			Transaction transaction = transactionRepo.get(index);
			TransactionClass transactionClass = new TransactionClass(this, this.scanner, transaction);
			transactionClass.menu();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void add() {
		System.out.println("Enter receiver name: ");
		String name = this.scanner.nextLine();

		System.out.println("Enter IBAN: ");
		String iban = this.scanner.nextLine();

		System.out.println("Enter BIC: ");
		String bic = this.scanner.nextLine();

		System.out.println("Enter institute: ");
		String institute = this.scanner.nextLine();

		System.out.println("Enter purpose: ");
		String purpose = this.scanner.nextLine();

		System.out.println("Enter amount: ");
		while (!this.scanner.hasNextFloat()) {
			System.out.println("Your entered value");
			this.scanner.next();
		}
		Float amount = this.scanner.nextFloat();
		this.scanner.nextLine();

		LocalDateTime date = LocalDateTime.now();

		Bic bicObject = new BicImpl(this, bic, institute);
		Iban ibanObject = new IbanImpl(this, iban, bicObject);
		Receiver receiverObject = new ReceiverImpl(this, name);
		Transaction transaction = new TransactionClass(this, amount, receiverObject, ibanObject, purpose, date, ibanObject, receiverObject);

		transactionRepo.add(transaction);
	}

}
