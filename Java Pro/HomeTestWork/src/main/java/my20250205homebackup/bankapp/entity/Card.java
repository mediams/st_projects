package de.telran.bankapp.entity;

import de.telran.bankapp.entity.enums.CardType;

import java.time.LocalDateTime;

public class Card {

    private String id;
    private CardType cardType;
    private String cardNumber;
    private String cardHolder;
    private Integer cvv;
    private LocalDateTime expirationDate;
    private Long accountId;

}
