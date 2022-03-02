package de.telekom.sea7.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.telekom.sea7.entity.Iban;
import de.telekom.sea7.entity.Receiver;

@Repository
public interface ReceiverRepository extends JpaRepository<Receiver, String> {

	static Optional<Receiver> findById(long l) {
	
		return null;
	}
	
}
