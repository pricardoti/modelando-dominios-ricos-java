package br.com.pricardoti.payment.domain.entities;

import java.time.LocalDate;

public class CreditCardPayment extends Payment {

    private String cardHolderName;
    private String cardNumber;
    private String lastTransactionNumber;

    private CreditCardPayment(
            LocalDate paidDate,
            LocalDate expireDate,
            Double total,
            Double paidtotal,
            String payer,
            String document,
            String address
    ) {
        super(paidDate, expireDate, total, paidtotal, payer, document, address);
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getLastTransactionNumber() {
        return lastTransactionNumber;
    }

    public void setLastTransactionNumber(String lastTransactionNumber) {
        this.lastTransactionNumber = lastTransactionNumber;
    }
}