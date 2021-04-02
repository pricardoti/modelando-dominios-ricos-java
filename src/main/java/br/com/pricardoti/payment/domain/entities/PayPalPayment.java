package br.com.pricardoti.payment.domain.entities;

import br.com.pricardoti.payment.domain.valueobjects.Address;
import br.com.pricardoti.payment.domain.valueobjects.Document;

import java.time.LocalDate;

public class PayPalPayment extends Payment {

    private final String transactionCode;

    private PayPalPayment(
            LocalDate paidDate,
            LocalDate expireDate,
            Double total,
            Double paidtotal,
            String payer,
            Document document,
            Address address,
            String transactionCode
    ) {
        super(paidDate, expireDate, total, paidtotal, payer, document, address);
        this.transactionCode = transactionCode;
    }

    public String getTransactionCode() {
        return transactionCode;
    }
}