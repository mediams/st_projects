package de.telran.bankapp.entity;

import de.telran.bankapp.entity.enums.AgreementStatus;

import java.math.BigDecimal;

public class Agreement {

  private String id;
  private Double interestRate; // процентная ставка
  private AgreementStatus status;
  private BigDecimal sum;
  private Long accountId;
  private Long productId;

}
