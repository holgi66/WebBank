package de.telekom.sea7.impl;

import java.math.RoundingMode;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.Scanner;

import org.springframework.stereotype.Controller;

import de.telekom.sea7.impl.model.RepositoryTransactionClass;
import de.telekom.sea7.impl.view.RepositoryTransactionViewClass;
import de.telekom.sea7.inter.model.Repository;
import de.telekom.sea7.inter.model.Transaction;
import de.telekom.sea7.inter.view.RepositoryTransactionView;

@Controller
public class ApplicationImpl extends BaseObjectImpl implements Application {
	private static ApplicationImpl applicationImpl;
	public Connection connection;

	public ApplicationImpl(Object parent) {
		super(parent);
		applicationImpl = this;
	}

	public static ApplicationImpl getApplication() {
		return applicationImpl;
	}
	
	public Connection getConnection() {
		return connection;
	}

	@Override
	public void run() {
		try {
			initConnection();
			try (Scanner scanner = new Scanner(System.in)) {
				Repository<Transaction> transactionRepo = new RepositoryTransactionClass(this);
				RepositoryTransactionView transactionListView = new RepositoryTransactionViewClass(this, scanner, transactionRepo);
				transactionListView.menu();
			}
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void initConnection() throws SQLException {
		Properties connectionProps = new Properties();
		connectionProps.put("user", "admin");
		connectionProps.put("password", "toll");
		connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bank", connectionProps);
		System.out.println("Connected to database");
	}
}