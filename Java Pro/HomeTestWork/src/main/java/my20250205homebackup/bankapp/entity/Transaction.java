package de.telran.bankapp.entity;

import de.telran.bankapp.entity.enums.TransactionStatus;
import de.telran.bankapp.entity.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    private String id;
    private TransactionType type;
    private BigDecimal amount;
    private String description;
    private TransactionStatus status;
    private Long debitAccountId;// получатель
    private Long creditAccountId;// отправитель
}
