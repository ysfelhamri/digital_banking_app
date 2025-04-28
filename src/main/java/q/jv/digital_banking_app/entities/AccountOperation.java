package q.jv.digital_banking_app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import q.jv.digital_banking_app.enums.OperationType;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountOperation {
    private Long id;
    private Date oprationDate;
    private Double amount;
    private OperationType type;
    private BankAccount bankAccount;
}
