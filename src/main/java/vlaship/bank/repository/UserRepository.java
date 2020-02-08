package vlaship.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vlaship.bank.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
