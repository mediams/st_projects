package de.telran.bankapp.controller;

import de.telran.bankapp.entity.Account;
import de.telran.bankapp.entity.enums.AccountStatus;
import de.telran.bankapp.entity.enums.AccountType;
import de.telran.bankapp.entity.enums.CurrencyCode;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account")
public class AccountController {

    List<Account> accounts = new ArrayList<>();

    public AccountController() {

        accounts.add(new Account(1L, "John Doe", AccountType.CHECKING, AccountStatus.ACTIVE, new BigDecimal("1500.75"), CurrencyCode.USD));
        accounts.add(new Account(2L, "Alice Smith", AccountType.SAVINGS, AccountStatus.ACTIVE, new BigDecimal("10200.00"), CurrencyCode.EUR));
        accounts.add(new Account(3L, "Bob Johnson", AccountType.LOAN, AccountStatus.BLOCKED, new BigDecimal("-5000.50"), CurrencyCode.USD));
        accounts.add(new Account(4L, "Emma Brown", AccountType.DEBIT_CARD, AccountStatus.INACTIVE, new BigDecimal("200.00"), CurrencyCode.GBR));
        accounts.add(new Account(5L, "David Wilson", AccountType.CREDIT_CARD, AccountStatus.ACTIVE, new BigDecimal("-1200.00"), CurrencyCode.EUR));
        accounts.add(new Account(6L, "Sophia Martinez", AccountType.CHECKING, AccountStatus.BLOCKED, new BigDecimal("500.25"), CurrencyCode.USD));
        accounts.add(new Account(7L, "James Anderson", AccountType.SAVINGS, AccountStatus.INACTIVE, new BigDecimal("2500.00"), CurrencyCode.GBR));
        accounts.add(new Account(8L, "Olivia Taylor", AccountType.OTHER, AccountStatus.ACTIVE, new BigDecimal("75.90"), CurrencyCode.EUR));
        accounts.add(new Account(9L, "Michael White", AccountType.DEBIT_CARD, AccountStatus.BLOCKED, new BigDecimal("0.00"), CurrencyCode.USD));
        accounts.add(new Account(10L, "Emily Harris", AccountType.CREDIT_CARD, AccountStatus.ACTIVE, new BigDecimal("-300.40"), CurrencyCode.GBR));

    }

    @GetMapping("/all")
    public List<Account> getAll() {
        return accounts;
    }

    @GetMapping("{id}")
    public Optional<Account> getAccountById(@PathVariable Long id) {
        return accounts.stream().filter(account -> account.getId().equals(id)).findAny();
    }


    @GetMapping("/currencyCode/{currencyCode}")
    public List<Account> getAllAccountsByCurrencyCode(@PathVariable String currencyCode) {
        CurrencyCode currencyCode1 = CurrencyCode.valueOf(currencyCode.toUpperCase());
        return accounts.stream().filter(account -> account.getCurrencyCode() == currencyCode1).toList();
    }

    @GetMapping("/search")
    public List<Account> getAllAccountsByCurrencyCodeBalance(@RequestParam BigDecimal minValue, @RequestParam BigDecimal maxValue) {
        return accounts.stream()
                .filter(account -> account.getBalance().compareTo(minValue) >= 0 && account.getBalance().compareTo(maxValue) <= 0)
                .toList();
    }
}
