package br.com.pricardoti.payment.shared;

import br.com.pricardoti.payment.shared.notifications.Notifiable;

public abstract class Entity<T> extends Notifiable {

    public abstract T getId();
}
