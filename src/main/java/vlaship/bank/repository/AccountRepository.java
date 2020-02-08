package vlaship.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vlaship.bank.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
