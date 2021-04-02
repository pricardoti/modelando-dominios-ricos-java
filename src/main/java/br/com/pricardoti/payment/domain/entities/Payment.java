package br.com.pricardoti.payment.domain.entities;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Payment {

    private UUID number;
    private LocalDate paidDate;
    private LocalDate expireDate;

    private Double total;
    private Double paidtotal;

    private String payer;
    private String document;
    private String address;

    protected Payment(
            LocalDate paidDate,
            LocalDate expireDate,
            Double total,
            Double paidtotal,
            String payer,
            String document,
            String address
    ) {
        this.number = UUID.randomUUID();
        this.paidDate = paidDate;
        this.expireDate = expireDate;
        this.total = total;
        this.paidtotal = paidtotal;
        this.payer = payer;
        this.document = document;
        this.address = address;
    }

    public UUID getNumber() {
        return number;
    }

    public LocalDate getPaidDate() {
        return paidDate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public Double getTotal() {
        return total;
    }

    public Double getPaidtotal() {
        return paidtotal;
    }

    public String getPayer() {
        return payer;
    }

    public String getDocument() {
        return document;
    }

    public String getAddress() {
        return address;
    }
}
