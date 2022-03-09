package de.telekom.sea7.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import de.telekom.sea7.entity.TransactionEntity;
import de.telekom.sea7.entity.TransactionsEntity;
import de.telekom.sea7.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	public TransactionRepository transactionRepository;

	public Optional<TransactionEntity> findById(Long id) {
		return transactionRepository.findById(id);
	}

	public TransactionEntity save(TransactionEntity transactionBean) {
		return transactionRepository.save(transactionBean);
	}

}
