package br.com.pricardoti.payment.domain.entities;

import br.com.pricardoti.payment.domain.valueobjects.Address;
import br.com.pricardoti.payment.domain.valueobjects.Document;
import br.com.pricardoti.payment.shared.Entity;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Payment extends Entity<UUID> {

    private final UUID id;
    private final LocalDate paidDate;
    private final LocalDate expireDate;

    private final Double total;
    private final Double paidtotal;

    private final String payer;
    private final Document document;
    private final Address address;

    protected Payment(
        LocalDate paidDate,
        LocalDate expireDate,
        Double total,
        Double paidtotal,
        String payer,
        Document document,
        Address address
    ) {
        this.id = UUID.randomUUID();
        this.paidDate = paidDate;
        this.expireDate = expireDate;
        this.total = total;
        this.paidtotal = paidtotal;
        this.payer = payer;
        this.document = document;
        this.address = address;
    }

    @Override
    public UUID getId() {
        return id;
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
