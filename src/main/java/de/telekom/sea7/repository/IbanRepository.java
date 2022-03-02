package de.telekom.sea7.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.telekom.sea7.entity.Iban;

@Repository
public interface IbanRepository extends JpaRepository<Iban, String> {

	static Optional<Iban> findById(long l) {

		return null;
	}

}
