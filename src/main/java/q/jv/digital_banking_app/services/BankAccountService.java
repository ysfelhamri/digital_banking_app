package q.jv.digital_banking_app.services;

import q.jv.digital_banking_app.dtos.BankAccountDTO;
import q.jv.digital_banking_app.dtos.CurrentBankAccountDTO;
import q.jv.digital_banking_app.dtos.CustomerDTO;
import q.jv.digital_banking_app.dtos.SavingBankAccountDTO;
import q.jv.digital_banking_app.exceptions.BalanceNotSufficientException;
import q.jv.digital_banking_app.exceptions.BankAccountNotFoundException;
import q.jv.digital_banking_app.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);
}
