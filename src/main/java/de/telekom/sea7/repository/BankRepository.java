package de.telekom.sea7.repository;

import org.springframework.stereotype.Repository;
import de.telekom.sea7.entity.Bankdb;

@Repository
public interface BankRepository extends CrudRepository<Bankdb, Long> {

}
