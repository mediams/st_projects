package de.telran.bankapp.entity;

import de.telran.bankapp.entity.enums.CurrencyCode;
import de.telran.bankapp.entity.enums.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Product {
    private Long id;
    private String name;
    private CurrencyCode currencyCode;
    private Double interestRate;
    private BigDecimal limitAmount;
    private ProductStatus status;


    public void setName(String name) {
        this.name = name;
    }

    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void setLimitAmount(BigDecimal limitAmount) {
        this.limitAmount = limitAmount;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public BigDecimal getLimitAmount() {
        return limitAmount;
    }

    public ProductStatus getStatus() {
        return status;
    }
}
