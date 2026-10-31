package org.example.ebankservice.services;

import org.example.ebankservice.entities.BankAccount;
import org.example.ebankservice.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbankService {
    private BankAccountRepository accountRepository;

    public EbankService(BankAccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public List<BankAccount> getAllBankAccounts(){
        return accountRepository.findAll();
    }

    public BankAccount getBankAccountById(String id){
        return accountRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Account not found"));
    }
    public BankAccount save(BankAccount bankAccount){
        return accountRepository.save(bankAccount);
    }
}
