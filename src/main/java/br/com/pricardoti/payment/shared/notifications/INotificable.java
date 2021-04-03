package br.com.pricardoti.payment.shared.notifications;

import java.util.Collection;

public interface INotificable {

    void addNotifications(Collection<Notification> notifications);
}
