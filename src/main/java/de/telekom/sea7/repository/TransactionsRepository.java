package de.telekom.sea7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.telekom.sea7.entity.Transaction;

public interface TransactionsRepository extends JpaRepository<Transaction, Long> {

}
