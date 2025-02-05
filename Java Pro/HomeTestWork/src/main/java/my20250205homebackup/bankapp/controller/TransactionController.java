package de.telran.bankapp.controller;

import de.telran.bankapp.entity.Transaction;
import de.telran.bankapp.entity.enums.TransactionStatus;
import de.telran.bankapp.entity.enums.TransactionType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    List<Transaction> transactions = new ArrayList<>();

    public TransactionController() {
        transactions.add(new Transaction(UUID.randomUUID().toString(), TransactionType.PAYMENT, new BigDecimal("12.0"), "description", TransactionStatus.APPROVED, 1L, 2L));
        transactions.add(new Transaction(UUID.randomUUID().toString(), TransactionType.PAYMENT, new BigDecimal("23.0"), "description", TransactionStatus.PENDING, 1L, 3L));
        transactions.add(new Transaction(UUID.randomUUID().toString(), TransactionType.PAYMENT, new BigDecimal("200.0"), "description", TransactionStatus.NEW, 2L, 3L));
    }

//    - REST запрос на вывод списка всех переводов
    @GetMapping("/all")
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }

//- REST запрос на вывод одного перевода по id
    @GetMapping("{id}")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable String id) {
        Optional<Transaction> optional = transactions.stream().filter(t -> t.getId().equals(id)).findAny();
        if (optional.isPresent()) {
            return new ResponseEntity<>(optional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


//- REST запрос на добавление переводов
    @PostMapping
    public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction) {
        transaction.setId(UUID.randomUUID().toString());
        transactions.add(transaction);
        return new ResponseEntity<>(transaction, HttpStatus.CREATED);
    }

//- REST запрос на обновление статуса перевода

    @PatchMapping
    public ResponseEntity<Transaction> changeStatus(@RequestParam String transactionId, @RequestParam TransactionStatus transactionStatus) {
        Optional<Transaction> optional = transactions.stream().filter(t -> t.getId().equals(transactionId)).findAny();
        if (optional.isPresent()) {
            Transaction transaction = optional.get();
            transaction.setStatus(transactionStatus);
            return new ResponseEntity<>(transaction, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

//- REST запрос на поиск перевода по типу и минимальной сумме

    @GetMapping("/search")
    public ResponseEntity<List<Transaction>> findTransactionsByTypeAndAmount(@RequestParam TransactionType type, @RequestParam BigDecimal minAmount) {
        List<Transaction> filteredTransactions = transactions.stream()
                .filter(t -> t.getType().equals(type) && t.getAmount().compareTo(minAmount) >= 0)
                .toList();
        return new ResponseEntity<>(filteredTransactions, HttpStatus.OK);
    }
//- REST запрос на удаление всех новых ('NEW') переводов

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteNewTransactions() {
        transactions.removeIf(t -> t.getStatus().equals(TransactionStatus.NEW));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
