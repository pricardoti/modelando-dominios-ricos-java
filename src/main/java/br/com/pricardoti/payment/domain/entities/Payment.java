package br.com.pricardoti.payment.domain.entities;

import br.com.pricardoti.payment.domain.valueobjects.Address;
import br.com.pricardoti.payment.domain.valueobjects.Document;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Payment {

    private UUID number;
    private LocalDate paidDate;
    private LocalDate expireDate;

    private Double total;
    private Double paidtotal;

    private String payer;
    private Document document;
    private Address address;

    protected Payment(
            LocalDate paidDate,
            LocalDate expireDate,
            Double total,
            Double paidtotal,
            String payer,
            Document document,
            Address address
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

    public Document getDocument() {
        return document;
    }

    public Address getAddress() {
        return address;
    }
}
