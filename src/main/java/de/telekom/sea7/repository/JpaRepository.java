package de.telekom.sea7.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;



@Repository
public interface JpaRepository<T, ID> {
	//Create , Update entity
	<S extends T> S save(S var1);
	
	//Select one transaction
	Optional<T> findById(ID var1);
	
	//Select all transactions
	Iterable<T> findAll();
	
	//Delete one transaction by ID
	void deleteById(ID var1);

}
