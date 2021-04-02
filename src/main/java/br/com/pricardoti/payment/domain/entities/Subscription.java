package br.com.pricardoti.payment.domain.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.unmodifiableList;

public class Subscription {

    private final LocalDate expireDate;
    private final List<Payment> payments = new ArrayList<>();
    private boolean active;

    private final LocalDate create;
    private LocalDate lastUpdate;

    public Subscription(LocalDate expireDate) {
        this.expireDate = expireDate;
        this.create = LocalDate.now();
        this.lastUpdate = LocalDate.now();
        this.active = Boolean.TRUE;
    }

    public LocalDate getCreate() {
        return create;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public List<Payment> getPayments() {
        return unmodifiableList(payments);
    }

    public boolean isActive() {
        return active;
    }

    public void activate() {
        this.active = Boolean.TRUE;
        this.lastUpdate = LocalDate.now();
    }

    public void deactivated() {
        this.active = Boolean.FALSE;
        this.lastUpdate = LocalDate.now();
    }
}
