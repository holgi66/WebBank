package de.telekom.sea7.persistence;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import de.telekom.sea7.model.Iban;
import de.telekom.sea7.model.Receiver;
import de.telekom.sea7.model.Transaction;


public class RepositoryTransactionImpl extends DbConnection  {
	
	private String sqlForGetAll = "SELECT * FROM transactions";
	private String sqlForGet = "SELECT * FROM transactions WHERE ID = ?";
	
	
	private Connection connection;
	
	private PreparedStatement psForGetAll = connection.prepareStatement(sqlForGetAll);
	private PreparedStatement psForGet = connection.prepareStatement(sqlForGet);
	

	public RepositoryTransactionImpl(Object parent) throws SQLException {
		
	}
	
	public List<Transaction> getAll() throws SQLException {
		List<Transaction> transactionList = new ArrayList<Transaction>();
		ResultSet rs = psForGetAll.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("ID");
			int receiver_ID = rs.getInt("receiver_ID");
			int iban_ID = rs.getInt("iban_ID");
			Float amount = rs.getBigDecimal("amount").setScale(2, RoundingMode.DOWN).floatValue();
			String purpose = rs.getString("purpose");
			LocalDateTime date = rs.getTimestamp("date").toLocalDateTime();
			
			Repository receiverRepo = new RepositoryReceiverImpl(this);
			Receiver receiver = receiverRepo.get(receiver_ID);
			
			Repository ibanRepo = new RepositoryIbanImpl(this);
			Iban iban = ibanRepo.get(iban_ID);
			
			Transaction transactionObject = new Transaction(this, amount, receiver, iban, purpose, date);
			transactionObject.setId(id);
			transactionList.add(transactionObject);
		}
		return transactionList;
	}
	
	public Transaction get(int index) throws SQLException {
		psForGet.setInt(1, index);
		ResultSet rs = psForGet.executeQuery();
		if (rs.next()) {
			int id = rs.getInt("ID");
			int receiver_ID = rs.getInt("receiver_ID");
			int iban_ID = rs.getInt("iban_ID");
			Float amount = rs.getBigDecimal("amount").setScale(2, RoundingMode.DOWN).floatValue();
			String purpose = rs.getString("purpose");
			LocalDateTime date = rs.getTimestamp("date").toLocalDateTime();
			
			Repository receiverRepo = new RepositoryReceiverImpl(this);
			Receiver receiver = receiverRepo.get(receiver_ID);
			
			Repository ibanRepo;
			Iban iban = ibanRepo.get(iban_ID);
			
			Transaction transactionObject = new Transaction(this, amount, receiver, iban, purpose, date);
			transactionObject.setId(id);
			return transactionObject;
		}
		else {
			throw new SQLException();
		}
	}
	
	

	
}
