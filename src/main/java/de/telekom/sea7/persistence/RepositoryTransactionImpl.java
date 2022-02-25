package de.telekom.sea7.persistence;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import de.telekom.sea7.impl.model.RepositoryIbanImpl;
import de.telekom.sea7.impl.model.RepositoryReceiverImpl;
import de.telekom.sea7.inter.model.Iban;
import de.telekom.sea7.inter.model.Receiver;
import de.telekom.sea7.inter.model.Repository;
import de.telekom.sea7.model.Transaction;


public class RepositoryTransactionImpl extends DbConnection  {
	
	private String sqlForGetAll = "SELECT * FROM transactions";
	private String sqlForGet = "SELECT * FROM transactions WHERE ID = ?";
	private String sqlForAdd = "INSERT INTO transactions (receiver_ID, iban_ID, amount, purpose, date) VALUES (?, ?, ? ,? ,?)";
	
	
	private Connection connection;
	
	private PreparedStatement psForGetAll = connection.prepareStatement(sqlForGetAll);
	private PreparedStatement psForGet = connection.prepareStatement(sqlForGet);
	

	public RepositoryTransactionImpl(Object parent) throws SQLException {
		
	}
	
	public List<Transaction> getAll() throws SQLException {
		List<Transaction> transactionList = new ArrayList<Transaction>();
		ResultSet rs = psForGetAll.executeQuery();
		while (rs.next()) {
			rs.getInt("ID");
			rs.getInt("receiver_ID");
			rs.getInt("iban_ID");
			rs.getBigDecimal("amount").setScale(2, RoundingMode.DOWN).floatValue();
			rs.getString("purpose");
			rs.getTimestamp("date").toLocalDateTime();
			
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
			
		}	
		
		return (Transaction) psForGet;

		}
	
	
public void add(Transaction transaction) {
	try {
				
		BigDecimal value = new BigDecimal(Float.toString(transaction.getAmount()));
		
		psForAdd.setInt(1, transaction.getReceiver().getId());
		psForAdd.setInt(2, transaction.getIban().getId());
		psForAdd.setBigDecimal(3, value);
		psForAdd.setString(4, transaction.getPurpose());
		psForAdd.setTimestamp(5, Timestamp.valueOf(transaction.getDate()));
		psForAdd.execute();
		ResultSet rs = psForAdd.getGeneratedKeys();
		
		if (rs.next()) {
			transaction.setId(rs.getInt(1));
		}
	}
	catch (SQLException e) {
		System.out.println(e.getMessage());
	}
}
}

	

