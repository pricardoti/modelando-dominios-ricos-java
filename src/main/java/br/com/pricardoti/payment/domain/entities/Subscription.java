package br.com.pricardoti.payment.domain.entities;

import br.com.pricardoti.payment.shared.Entity;
import br.com.pricardoti.payment.shared.notifications.Notifiable;
import br.com.pricardoti.payment.shared.notifications.Notification;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.util.Collections.unmodifiableList;

public class Subscription extends Notifiable<Notification> implements Entity<UUID> {

    private final LocalDate expireDate;
    private final List<Payment> payments = new ArrayList<>();
    private final LocalDate create;

    private UUID id;
    private boolean active;
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

    @Override
    public UUID getId() {
        return id;
    }
}
