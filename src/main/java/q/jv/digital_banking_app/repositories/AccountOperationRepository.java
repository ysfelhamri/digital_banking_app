package q.jv.digital_banking_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import q.jv.digital_banking_app.entities.AccountOperation;
import q.jv.digital_banking_app.entities.BankAccount;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {
}
