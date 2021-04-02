package br.com.pricardoti.payment.domain.entities;

import br.com.pricardoti.payment.domain.valueobjects.Address;
import br.com.pricardoti.payment.domain.valueobjects.Document;

import java.time.LocalDate;

public class CreditCardPayment extends Payment {

    private final String cardHolderName;
    private final String cardNumber;
    private final String lastTransactionNumber;

    private CreditCardPayment(
            LocalDate paidDate,
            LocalDate expireDate,
            Double total,
            Double paidtotal,
            String payer,
            Document document,
            Address address,
            String cardHolderName,
            String cardNumber,
            String lastTransactionNumber
    ) {
        super(paidDate, expireDate, total, paidtotal, payer, document, address);
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.lastTransactionNumber = lastTransactionNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getLastTransactionNumber() {
        return lastTransactionNumber;
    }
}