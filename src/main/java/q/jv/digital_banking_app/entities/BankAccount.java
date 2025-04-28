package q.jv.digital_banking_app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import q.jv.digital_banking_app.enums.AccountStatus;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {
    private String id;
    private Double balance;
    private Date createdAt;
    private AccountStatus status;
    private Customer customer;
    private List<AccountOperation> accountOperations;
}
