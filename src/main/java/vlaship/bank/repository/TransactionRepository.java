package vlaship.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vlaship.bank.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
